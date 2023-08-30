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
        if (empCheck==val){
            System.out.println("\nThe Employee is Present for Full day");
           full_time=16;
        }else if (part_time==val){
            System.out.println("\nEmployee is Presnt for Part time");
            full_time=8;
        }else {
            System.out.println("\nThe Emlployee is Absent");

        }
        wage= full_time * wagePerHr;
        System.out.println("The Wage of the Employee is: "+wage);
    }
}
