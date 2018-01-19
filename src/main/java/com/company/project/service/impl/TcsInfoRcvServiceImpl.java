package com.company.project.service.impl;

import com.company.project.dao.TcsInfoRcvMapper;
import com.company.project.model.TcsInfoRcv;
import com.company.project.service.TcsInfoRcvService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/19.
 */
@Service
@Transactional
public class TcsInfoRcvServiceImpl extends AbstractService<TcsInfoRcv> implements TcsInfoRcvService {
    @Resource
    private TcsInfoRcvMapper tcsInfoRcvMapper;

}
