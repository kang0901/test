package com.example.test.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.test.entity.Worker;
import com.example.test.mapper.WorkerMapper;
import com.example.test.service.IWorkerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author kk
 * @since 2020-08-13
 */
@Service
public class WorkerServiceImpl extends ServiceImpl<WorkerMapper, Worker> implements IWorkerService {

    @Autowired
    IWorkerService iWorkerService;

    @Override
    public List<Worker> queryWorker1(QueryWrapper<Worker> query) {
        List<Worker> list = iWorkerService.list(query);
        return list;
    }
}
