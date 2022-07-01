package com.example.emperortest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class AllDataService {

    @Autowired
    AllDataRepository allDataRepository;

    public Map<Home, BillDetails> allData(){
        return allDataRepository.allData();
    }
}
