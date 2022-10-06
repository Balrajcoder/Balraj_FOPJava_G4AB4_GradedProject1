package com.learning;


public class Main {

    public static void main(String[] args) {

        AdminDepartment admin = new AdminDepartment();
        HrDepartment hr = new HrDepartment();
        TechDepartment tech = new TechDepartment();

        System.out.println("Welcome to "+admin.departmentName());
        System.out.println(admin.getTodaysWork()+"\n"+admin.getWorkDeadline()+"\n"+admin.isTodayAHoliday()+"\n");


        System.out.println("Welcome to "+hr.departmentName());
        System.out.println(hr.doActivity()+"\n"+hr.getTodaysWork()+"\n"+hr.getWorkDeadline()+"\n"+hr.isTodayAHoliday()+"\n");

        System.out.println("Welcome to "+tech.departmentName());
        System.out.println(tech.getTodaysWork()+"\n"+tech.getWorkDeadline()+"\n"+tech.getTechStackInformation()+"\n"+tech.isTodayAHoliday()+"\n");
    }
}


