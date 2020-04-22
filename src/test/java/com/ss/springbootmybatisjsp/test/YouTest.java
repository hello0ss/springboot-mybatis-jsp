package com.ss.springbootmybatisjsp.test;


import com.ss.springbootmybatisjsp.SpringbootMybatisJspApplication;
import com.ss.springbootmybatisjsp.dao.SectionDAO;
import com.ss.springbootmybatisjsp.entity.Section;
import com.ss.springbootmybatisjsp.service.SectionService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest(classes = SpringbootMybatisJspApplication.class)
@RunWith(value = SpringRunner.class)
@Slf4j
public class YouTest {

    @Resource
    SectionService sectionService;

    @Resource
    SectionDAO sectionDAO;

    @Test
    public void contextLoads() {
        List<Section> list = sectionService.showAllSection();
        for (Section ss : list) {
            System.out.println(ss);
        }
        /*sectionDAO.updateSection(new Section("1","101000","阶级部"));*/
    }

    @Test
    public void m1() {
        List<Section> list = sectionService.showAllSection();
        for (Section ss : list) {
            System.out.println(ss);
        }
    }
}
