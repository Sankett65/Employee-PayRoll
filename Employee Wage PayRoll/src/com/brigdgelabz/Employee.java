package com.brigdgelabz;

public class Employee {
    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage PayRoll");
        int empCheck = 1;
        double val = Math.floor(Math.random()*10 % 2);
        if (empCheck==val){
            System.out.println("The Employee is Present");
        }else {
            System.out.println("The Emlployee is Absent");
        }

    }
}
