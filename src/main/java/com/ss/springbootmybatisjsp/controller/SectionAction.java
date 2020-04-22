package com.ss.springbootmybatisjsp.controller;

import com.ss.springbootmybatisjsp.entity.Section;
import com.ss.springbootmybatisjsp.service.SectionService;
import com.ss.springbootmybatisjsp.util.Md5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("section")
public class SectionAction {

    @Autowired
    SectionService sectionService;
    @Autowired
    HttpServletRequest request;

    @RequestMapping("ShowAllSectionMethod")
    public String ShowAllSectionMethod() {
        System.out.println("------------------展示所有岗位信息------------------");

        List<Section> list = sectionService.showAllSection();
        request.setAttribute("list", list);
        return "departments";
    }

    @RequestMapping("ShowSectionMethod")
    public String ShowSectionMethod() {
        System.out.println("------------------展示所有岗位信息------------------");

        List<Section> list = sectionService.showAllSection();
        request.setAttribute("list", list);
        return "addEmp";
    }

    @RequestMapping("insertSectionMethod")
    public String insertSectionMethod(String seid, String name) {
        System.out.println("------------------添加部门信息--------------------");

        sectionService.insertSection(new Section(Md5Utils.getNumber(6), seid, name));

        return "redirect:/section/ShowAllSectionMethod";
    }

    @RequestMapping("updateSectionMethod")
    public String updateSectionMethod(String id, String seid, String name) {
        System.out.println("------------------修改部门信息-------------------");

        sectionService.updateSection(new Section(id, seid, name));

        return "redirect:/section/ShowAllSectionMethod";
    }

}