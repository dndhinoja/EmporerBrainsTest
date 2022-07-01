package com.example.emperortest;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class AllDataRepository {

    public Map<Home,BillDetails> allData(){
        List<Home> homeList = new ArrayList<>();
        Home home1 = new Home(1,"Nilkanth");
        Home home2 = new Home(2,"Devkant");
        homeList.add(home1);
        homeList.add(home2);

        List<Bill> billList = new ArrayList<>();
        billList.add(new Bill(1,1000L,Month.JAN,1));
        billList.add(new Bill(2 ,1000L,Month.JAN,1));
        billList.add(new Bill(3 ,1000L,Month.JAN,2));

        Map<Home, BillDetails> detailsMap = new HashMap<>();
        for(int i = 0; i<homeList.size(); i++){
            Home homeTemp = homeList.get(i);
            Long totalAmount = 0L;
            Month month = null;
            for (int j = 0; j< billList.size(); j++){

                Bill billTemp = billList.get(j);
                if(billTemp.homeId==homeTemp.homeId){
                       totalAmount = totalAmount + billTemp.getAmount();
                       month = billTemp.getMonth();
                }
            }
            detailsMap.put(homeTemp, new BillDetails(month,totalAmount));
        }
        return detailsMap;
    }
}
