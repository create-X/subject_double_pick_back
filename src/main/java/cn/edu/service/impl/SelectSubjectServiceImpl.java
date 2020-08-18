package cn.edu.service.impl;

import cn.edu.dao.SelectSubjectMapper;
import cn.edu.service.SelectSubjectService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@Transactional
public class SelectSubjectServiceImpl implements SelectSubjectService {
    @Autowired
    private SelectSubjectMapper selectSubjectMapper;
}
