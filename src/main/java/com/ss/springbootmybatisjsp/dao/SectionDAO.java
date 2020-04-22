package com.ss.springbootmybatisjsp.dao;

import com.ss.springbootmybatisjsp.entity.Section;

import java.util.List;

public interface SectionDAO {

    List<Section> showAll();//展示所有部门

    void insertSection(Section section);//添加部门

    void updateSection(Section section);//修改部门
}
