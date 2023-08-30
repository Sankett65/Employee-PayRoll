package com.brigdgelabz;

public class Employee {
    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage PayRoll");
        int empCheck = 1;
        int wagePerHr=20;
        int full_time = 0;
        int part_time=2;
        int wage;
        double val = Math.floor(Math.random()*10) % 3;
       switch ((int) val){
           case 1:full_time :
               System.out.println("\nEmployee is Present For Full time");
               full_time=16;
               break;
           case 2:part_time :
               System.out.println("\nEmployee is present for Part Time");
               full_time=8;
               break;
           default:
               System.out.println("\nEmployee is Abesnt");
               break;
       }
        wage= full_time * wagePerHr;
        System.out.println("The Wage of the Employee is: "+wage);
    }
}
