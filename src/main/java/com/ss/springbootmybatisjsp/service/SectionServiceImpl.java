package com.ss.springbootmybatisjsp.service;

import com.ss.springbootmybatisjsp.dao.SectionDAO;
import com.ss.springbootmybatisjsp.entity.Section;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
@Service
public class SectionServiceImpl implements SectionService {

    @Autowired
    SectionDAO sectionDAO;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<Section> showAllSection() {
        return sectionDAO.showAll();
    }

    @Override
    public void insertSection(Section section) {
        sectionDAO.insertSection(section);
    }

    @Override
    public void updateSection(Section section) {
        sectionDAO.updateSection(section);
    }
}
