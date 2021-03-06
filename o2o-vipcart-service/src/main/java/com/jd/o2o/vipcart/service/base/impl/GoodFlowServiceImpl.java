package com.jd.o2o.vipcart.service.base.impl;

import com.jd.o2o.vipcart.common.dao.BaseDao;
import com.jd.o2o.vipcart.common.service.AbstractBaseService;
import com.jd.o2o.vipcart.dao.GoodFlowDao;
import com.jd.o2o.vipcart.domain.entity.GoodFlowEntity;
import com.jd.o2o.vipcart.service.base.GoodFlowService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class GoodFlowServiceImpl extends AbstractBaseService<GoodFlowEntity,Long> implements GoodFlowService {
    private static final Logger LOGGER = LoggerFactory.getLogger(GoodFlowServiceImpl.class);
    @Resource
    private GoodFlowDao goodFlowDao;

    @Override
    protected BaseDao<GoodFlowEntity, Long> getBaseDao() {
        return goodFlowDao;
    }
}
