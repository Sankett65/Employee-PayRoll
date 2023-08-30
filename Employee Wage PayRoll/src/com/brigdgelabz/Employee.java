package com.brigdgelabz;

public class Employee {
    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage PayRoll");
        int empCheck = 1;
        int wagePerHr=20;
        int full_time = 0;
        int wage;
        double val = Math.floor(Math.random()*10 % 2);
        if (empCheck==val){
            System.out.println("The Employee is Present");
           full_time=8;
        }else {
            System.out.println("The Emlployee is Absent");
        }
        wage= full_time * wagePerHr;
        System.out.println("The Wage of the Employee is: "+wage);
    }
}
