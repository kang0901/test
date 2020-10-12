package com.example.test.controller;

import com.example.test.entity.Worker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class WorkerControllerTest {

    @Autowired
    private WorkerController workerController;
    @Test
    public void testQueryWorker() {
        List<Worker> list = workerController.queryWorker("张三","男","");
        for (Worker w:list) {
            System.out.println(w.getName()+w.getCompany());
        }
    }
}
