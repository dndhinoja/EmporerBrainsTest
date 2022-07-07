package com.example.emperortest;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class AllDataRepository {

    public Map<Home,List<BillDetails>> allData(){
        List<Home> homeList = new ArrayList<>();
        Home home1 = new Home(1,"Nilkanth");
        Home home2 = new Home(2,"Devkant");
        homeList.add(home1);
        homeList.add(home2);

        List<Bill> billList = new ArrayList<>();
        billList.add(new Bill(1,3000L,Month.JAN,1));
        billList.add(new Bill(2 ,1000L,Month.JAN,1));
        billList.add(new Bill(3 ,1000L,Month.JAN,2));
        billList.add(new Bill(4,2000L, Month.FEB, 1));
        billList.add(new Bill(5,10000L, Month.JAN, 2));
        billList.add(new Bill(6,10000L, Month.FEB, 2));

        Map<Home, List<BillDetails>> detailsMap = new HashMap<>();
        
        for(int i = 0; i<homeList.size(); i++){
            Home homeTemp = homeList.get(i);
            Long totalAmountJan = 0L;
            Long totalAmountFeb = 0L;
            Month month = null;
            List<BillDetails> billDetailsList = new ArrayList<>(); //BillDetails for each Home monthwise

            for (int j = 0; j< billList.size(); j++){

                Bill billTemp = billList.get(j);

                if(billTemp.homeId==homeTemp.homeId){
                    month = billTemp.getMonth();

                    //Calculate Monthwise total
                    if(month.equals(Month.JAN)){
                        totalAmountJan = totalAmountJan + billTemp.getAmount();
                    }
                    else if(month.equals(Month.FEB)){
                        totalAmountFeb = totalAmountFeb + billTemp.getAmount();
                    }
                }
            }
            BillDetails billDetailsJan = new BillDetails(Month.JAN,totalAmountJan);
            BillDetails billDetailsFeb = new BillDetails(Month.FEB,totalAmountFeb);

            billDetailsList.add(billDetailsJan);
            billDetailsList.add(billDetailsFeb);

            detailsMap.put(homeTemp, billDetailsList);
        }
        return detailsMap;
    }
}
