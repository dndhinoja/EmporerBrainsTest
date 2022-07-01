package com.example.emperortest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class AllDataController {

    @Autowired
    AllDataService allDataService;

    @GetMapping("/")
    public Map<Home,BillDetails> allData(){
        return allDataService.allData();
    }
}
