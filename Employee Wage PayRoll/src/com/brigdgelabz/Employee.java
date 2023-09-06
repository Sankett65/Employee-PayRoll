package com.brigdgelabz;

import java.util.Random;

public class Employee {
    int empCheck = 1;
    int wagePerHr=20;
    int full_time = 0;
    int part_time=2;
    int wage=0;
    int totalWage=0;
    int totalWorkingHr=100;
    int emphr=0;
    //   int totalWorkingDays=10;
    int count =0;
    int count1=0;
    int count2=0;


    public void wage() {
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

        if (emphr >=100){
            System.out.println("\nEmployee Must be Working for More than 100 hr in month" +
                    "\nAnd Employee is work for "+emphr+" hr in month");
            System.out.println("The Wage of the Employee  for a month is: "+totalWage);
        }else{
            System.out.println("The employee is not Work for 100 hrs in Month");
        }
    }


    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage PayRoll");

        Employee obj = new Employee();
        obj.wage();
    }
}
