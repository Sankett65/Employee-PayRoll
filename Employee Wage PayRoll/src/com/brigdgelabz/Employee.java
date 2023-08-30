package com.brigdgelabz;

public class Employee {
    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage PayRoll");
        int empCheck = 1;
        int wagePerHr=20;
        int full_time = 0;
        int part_time=2;
        int wage=0;
        int totalWage=0;

        for (int i =0;i<20;i++) {
            double val = Math.floor(Math.random()*10) % 3;
            switch ((int) val) {
                case 1:
                    full_time:
                    System.out.println("\nEmployee is Present For Full time");
                    full_time = 8;
                    wage = full_time * wagePerHr;
                    break;
                case 2:
                    part_time:
                    System.out.println("\nEmployee is present for Part Time");
                    full_time = 4;
                    wage = full_time * wagePerHr;
                    break;
                default:
                    System.out.println("\nEmployee is Abesnt");
                    wage=0;
                    break;
            }
            totalWage=totalWage+wage;
        }

        System.out.println("\nThe Wage of the Employee  for a month is: "+totalWage);
    }
}
