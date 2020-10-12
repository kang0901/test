package com.example.test.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.test.commom.RetMsgData;
import com.example.test.commom.State;
import com.example.test.service.IWorkerService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.test.entity.Worker;

import javax.management.ValueExp;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author kk
 * @since 2020-08-13
 */
@RestController
@RequestMapping("/worker")
public class WorkerController {
    @Autowired IWorkerService iWorkerService;
    @RequestMapping(value="/queryWrapper",method = RequestMethod.GET)
    public List<Worker> queryWorker(@RequestParam(value="name",required = false) String names,@RequestParam(value="sex",required = false) String sex,@RequestParam(value="company",required = false) String company){
        QueryWrapper<Worker> workerQueryWrapper = new QueryWrapper<Worker>();
        if((null!=names)&&(!"".equals(names))){
            workerQueryWrapper.eq("name",names);
        }
        if((null!=sex)&&(!"".equals(sex))){
            workerQueryWrapper.eq("sex",sex);
        }
        if((null!=company)&&(!"".equals(company))){
            workerQueryWrapper.eq("company",company);
        }
//        List<Worker> list = iWorkerService.list(workerQueryWrapper);
        List<Worker> list = iWorkerService.queryWorker1(workerQueryWrapper);
        return list;
    }

    @RequestMapping(value="/saveWorker",method = RequestMethod.POST)
    public RetMsgData<Object> saveWorkerByJson(@RequestBody Worker worker){
        RetMsgData<Object> msg = new RetMsgData<>();
        try{
            iWorkerService.save(worker);
            msg.getAddOrDeleteObjectLog(worker);
        }catch(Exception e){
            System.out.println("新增worker接口异常"+e.getMessage());
            msg.setState(State.RET_STATE_PARAM_ERROR);
        }
        return msg;
    }

    @RequestMapping(value = "/deleteWorker",method = RequestMethod.DELETE)
    public RetMsgData<Object> deleteWorker(@RequestParam (value="id",required = false) int id){
        RetMsgData<Object> msg = new RetMsgData<>();
        try{
            iWorkerService.removeById(id);
        }catch (Exception e){
            msg.setState(State.RET_STATE_PARAM_ERROR);
        }
        return msg;
    }

    @RequestMapping(value="/updateWorker",method = RequestMethod.PUT)
    public RetMsgData<Object> editWorker(@RequestBody Worker worker){
        RetMsgData<Object> msg = new RetMsgData<>();
        try {
            iWorkerService.updateById(worker);
        }catch (Exception e){
            msg.setState(State.RET_STATE_PARAM_ERROR);
        }
        return msg;
    }
}

