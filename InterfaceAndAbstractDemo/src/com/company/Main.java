package com.company;

import Abstract.BaseCustomerManager;
import Adepter.MernisServiceAdepter;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.sql.Time;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
    BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdepter());
    customerManager.save(new Customer(1,"Mustafa Sina","Sarıkaya", LocalDate.of(1997,03,20),"1111111111"));





    }
}
