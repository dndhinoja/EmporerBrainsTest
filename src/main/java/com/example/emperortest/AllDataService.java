package com.example.emperortest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AllDataService {

    @Autowired
    AllDataRepository allDataRepository;

    public Map<Home, List<BillDetails>> allData(){
        return allDataRepository.allData();
    }
}
