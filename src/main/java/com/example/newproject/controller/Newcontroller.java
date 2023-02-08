package com.example.newproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.newproject.model.Newmodel;
import com.example.newproject.service.Newservice;
@RestController
@RequestMapping("/api/vist")
public class Newcontroller {
    @Autowired
    Newservice service;


    @GetMapping("/username/{username}/count")
    public Newmodel getCount(@PathVariable String username){
        return service.getVisits(username);
    }
    
    
    @GetMapping("/count")
    public Newmodel getcount(){
        return service.getvisits();
    }
}
