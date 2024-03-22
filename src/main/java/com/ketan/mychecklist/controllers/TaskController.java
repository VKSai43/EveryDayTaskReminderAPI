package com.ketan.mychecklist.controllers;

import com.ketan.mychecklist.entity.Task;
import com.ketan.mychecklist.repo.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    TaskService taskService;


    @PostMapping("/create")
    private void createTask(@RequestBody Task task){
        task.setTaskId(UUID.randomUUID().toString());

        Date currentdate = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try{
            task.setDateCreated(simpleDateFormat.parse(simpleDateFormat.format(currentdate)));
        }catch (ParseException e){
            System.out.println("parseException");
        }


        taskService.createTask(task);

    }
}
