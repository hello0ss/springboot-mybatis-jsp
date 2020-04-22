package com.ss.springbootmybatisjsp.controller;

import com.ss.springbootmybatisjsp.entity.Person;
import com.ss.springbootmybatisjsp.entity.Section;
import com.ss.springbootmybatisjsp.service.PersonService;
import com.ss.springbootmybatisjsp.service.SectionService;
import com.ss.springbootmybatisjsp.util.Md5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;


@Controller
@RequestMapping("person")
public class PersonAction {

    @Autowired
    PersonService personService;
    @Autowired
    SectionService sectionService;

    @Autowired
    HttpServletRequest request;

    @RequestMapping("insertPersonMethod")
    public String insertPersonMethod(MultipartFile image, String username, String salary, String age, String seid) {
        System.out.println("-------------------添加员工信息--------------------");

        System.out.println(image + "---" + username + "---" + salary + "---" + age + "---" + seid);

        FileString(image);

        personService.insertPerson(new Person(Md5Utils.getNumber(6), "/image/" + image.getOriginalFilename(), username, salary, age, seid, null));

        return "redirect:/section/ShowAllSectionMethod";
    }

    @RequestMapping("showPersonMethod")
    public String showPersonMethod(String seid) {
        System.out.println("--------------------展示指定部门的员工信息-------------------");

        System.out.println(seid);
        List<Person> lis = personService.showAllPerson(seid);
        System.out.println(lis);
        request.setAttribute("lis", lis);

        return "emplist";
    }

    @RequestMapping("deletePersonMethod")
    public String deletePersonMethod(String id, String seid) {
        System.out.println("--------------------删除指定员工的员工信息------------------");

        personService.deletePerson(id);

        return "forward:/person/showPersonMethod";
    }

    @RequestMapping("showPerson")
    public String showPerson(String id) {
        System.out.println("-------------------展示指定员工的相关信息-------------------");

        //展示所有部门
        List<Section> listSection = sectionService.showAllSection();
        request.setAttribute("listSection", listSection);
        //根据id展示员工
        Person person = personService.showPerson(id);
        request.setAttribute("person", person);

        return "updateEmp";
    }

    @RequestMapping("updatePersonMethod")
    public String updatePersonMethod(String id, MultipartFile image, String username, String salary, String age, String seid) {
        System.out.println("-------------------修改指定员工的员工信息------------------");

        System.out.println(id + "---" + image + "---" + username + "---" + salary + "---" + age + "---" + seid);

        Person person = new Person();
        if (image != null) {
            FileString(image);
            person.setImage("/image/" + image.getOriginalFilename());
        }
        person.setId(id).setUsername(username).setSalary(salary).setAge(age).setSeid(seid);
        personService.updatePerson(person);

        return "forward:/person/showPersonMethod";
    }


    public void FileString(MultipartFile image) {
        try {
            //设置文件的存储位置
            String realPath = request.getSession().getServletContext().getRealPath("/image");
            File file = new File(realPath);
            //判断是否存在  存储文件的指定文件夹
            if (!file.exists()) {
                //创建文件夹
                file.mkdir();
            }
            //将文件夹放入指定位置
            image.transferTo(new File(realPath + "/" + image.getOriginalFilename()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}