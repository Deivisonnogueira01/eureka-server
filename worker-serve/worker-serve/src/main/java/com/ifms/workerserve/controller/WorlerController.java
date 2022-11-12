package com.ifms.workerserve.controller;

import com.ifms.workerserve.model.WorkerModel;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/worker")
public class WorlerController {
    

    @GetMapping
    public ResponseEntity<WorkerModel> getWorker(){

        WorkerModel worker = new  WorkerModel("o miranha", 100);
       return ResponseEntity.ok(worker);
    }


}
