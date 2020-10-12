package com.example.test.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.test.entity.Worker;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author kk
 * @since 2020-08-13
 */
public interface IWorkerService extends IService<Worker> {
    List<Worker> queryWorker1(QueryWrapper<Worker> query);
}
