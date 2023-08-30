package com.codedecode.docker.controller;


import com.codedecode.docker.entity.DemoEntity;
import com.codedecode.docker.repo.DemoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/docker")
public class DockerDemoController {
    @Autowired
    DemoRepo demoRepo;


    @GetMapping("testAPI")
    public String testMethod(){return "I am working fine";}

    @PostMapping(path = "/add")
    public ResponseEntity<DemoEntity> add(@RequestBody DemoEntity entity){
        DemoEntity resultEntity= demoRepo.saveAndFlush(entity);
        return  new ResponseEntity<>(resultEntity, HttpStatus.OK);
    }

/*
 @GetMapping(path = "/all")
    public ResponseEntity<List<DemoEntity>> getAll(){
        List<DemoEntity> demoEntityList = demoRepo.findAll() ;
        return new ResponseEntity<>(demoEntityList,HttpStatus.OK);
    }
 */

}
