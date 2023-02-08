package com.example.newproject.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.newproject.model.Newmodel;
@Service
public class Newservice {
    static int count=1;
    public Newmodel getvisits(){
        Newmodel model = new Newmodel(++count);
        return model;
    }

    static Map<String,Integer> map = new HashMap<>();

    public Newmodel getVisits(String username){
        int count=map.getOrDefault(username,0)+1;
        map.put(username,count);
        Newmodel model = new Newmodel(username,count);
        return model;


    }
}
