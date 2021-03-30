package com.microsoft.demo;

import own.Employee;

public class Demo {
    public void DoSomething(boolean flag){
        Employee obj = new Employee();
        obj.Test();

        if(flag){
            System.out.println("I am covered");
            return;
        }

        System.out.println("I am not covered");
    }
}