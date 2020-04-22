package com.ss.springbootmybatisjsp.service;

import com.ss.springbootmybatisjsp.entity.Section;

import java.util.List;

public interface SectionService {

    List<Section> showAllSection();//展示所有部门

    void insertSection(Section section);//添加部门

    void updateSection(Section section);//修改部门
}
