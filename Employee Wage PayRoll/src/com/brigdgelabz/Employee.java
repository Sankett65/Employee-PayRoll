package com.brigdgelabz;



public class Employee {
    public static int empCheck = 1;
    public static int full_time = 0;
    public static int part_time=2;
    public static int totalWorkingHr;
    public static String companyName;


    public void wage(String commpanyName,int wagePerHr,int totalWorkingHr) {

        int wage =0;          // To calculate Wage per day
        int count =0;int  count1=0;int  count2=0;
        int emphr=0;
        int totalWage=0;// To count how much Days the employee is absent

        System.out.println("\n!!!----------For "+commpanyName+"----------!!!\n");
        System.out.println("____________________________________________________________________");
        System.out.println("|  Day   |  Wage Per Day   |  Working Hour  |  Total Working Hours |");
        System.out.println("--------------------------------------------------------------------");
        for (int day =1;day<=20;day++) {
            double val = Math.floor(Math.random() * 10) % 3;
            switch ((int) val) {
                case 1:
                    full_time:
                    full_time = 7;
                    wage = full_time * wagePerHr;
                    count++;
                    break;
                case 2:
                    part_time:
                    full_time = 4;
                    wage = full_time * wagePerHr;
                    count1++;
                    break;
                default:
                    full_time = 0;
                    wage = 0;
                    count2++;
                    break;
            }
            emphr=emphr+full_time;
            totalWage=totalWage+wage;
            System.out.println();
            System.out.printf("%5d     %9d     %12d     %14d",day,wage,full_time,emphr);
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
       obj.wage("Tata Company",30,60);
        obj.wage("Google Company",20,90);
    }
}
