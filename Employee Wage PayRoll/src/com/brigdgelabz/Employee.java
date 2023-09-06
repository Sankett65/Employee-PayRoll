package com.brigdgelabz;

import java.util.Random;

public class Employee {
    public static int empCheck = 1;
    public static int full_time = 0;
    public static int part_time=2;

    int emphr=0;     //To count the how much Hour employee is work in month


    public void wage(int wagePerHr,int totalWorkingHr) {
        int wage =0;          // To calculate Wage per day
        int totalWage=0;      // To calculate Total Wage For a month
        int count =0;         // To count how much Days the employee is present for full day
        int count1=0;         // To count how much Days the employee is present for part day
        int count2=0;         // To count how much Days the employee is absent
        for (int day =1;day<=20;day++) {
            double val = Math.floor(Math.random() * 10) % 3;
            switch ((int) val) {
                case 1:
                    full_time:
                    System.out.println("Employee is Present For Full time for Day "+day);
                    full_time = 7;
                    wage = full_time * wagePerHr;
                    count++;
                    break;
                case 2:
                    part_time:
                    System.out.println("Employee is present for Part Time for Day "+day);
                    full_time = 4;
                    wage = full_time * wagePerHr;
                    count1++;
                    break;
                default:
                    System.out.println("Employee is Abesnt for Day "+day);
                    wage = 0;
                    count2++;
                    break;
            }
            emphr=emphr+full_time;
            totalWage=totalWage+wage;
        }

        System.out.println("\nEmployee is Present for full time for "+count+ " day");
        System.out.println("Employee is Present for part time for "+count1+ " day");
        System.out.println("Employee is Absent for "+count2+ " day");

        if (emphr >=totalWorkingHr){
            System.out.println("\nEmployee Must be Working for More than 100 hr in month" +
                    "\nAnd Employee is work for "+emphr+" hr in month");
            System.out.println("The Wage of the Employee  for a month is: "+totalWage);
        }else{
            System.out.println("The employee is not Work for "+totalWorkingHr+ "hrs in Month");
        }
    }


    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage PayRoll");
        Employee obj = new Employee();
        System.out.println("\n!!! For Tata Company !!!");
       obj.wage(30,150);
        System.out.println("\n!!! For Google Company !!!");
        obj.wage(20,100);
        System.out.println("\n!!! For Apple Company !!!");
        obj.wage(10,120);
    }
}
