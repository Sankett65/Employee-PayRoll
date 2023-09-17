package com.brigdgelabz;



 class CompanyEmpWage {

    public  int totalWorkingHr;
    public  String companyName;
    public  int totalWorkingDays;
    public  int totalWageperday;


     public CompanyEmpWage(int totalWorkingHr, String companyName, int totalWorkingDays, int totalWageperday) {
         this.totalWorkingHr = totalWorkingHr;
         this.companyName = companyName;
         this.totalWorkingDays = totalWorkingDays;
         this.totalWageperday = totalWageperday;
     }

     @Override
     public String toString() {
         return "CompanyEmpWage{" +
                 "totalWorkingHr=" + totalWorkingHr +
                 ", companyName='" + companyName + '\'' +
                 ", totalWorkingDays=" + totalWorkingDays +
                 ", totalWageperday=" + totalWageperday +
                 '}';
     }
 }
   public  class Employee{

       public static int empCheck = 1;
       public static int full_time = 0;
       public static int part_time = 2;


       private CompanyEmpWage [] company;

      private int number=0;
       public Employee() {
           company= new CompanyEmpWage[5];
       }

       private void addCompany(int totalWorkingHr, String companyName, int totalWorkingDays, int totalWageperday){
           company[number]=new CompanyEmpWage(totalWorkingHr,companyName,totalWorkingDays,totalWageperday);
            //System.out.println(no);
           number++;
       }

       private void wage(){
           for (int i =0;i<number;i++){
               int totalEmpWage=this.wage(company[i]);
               System.out.println("Total Employee Wage for company "+company[i].companyName+" is "+totalEmpWage);
           }
       }



       private int wage(CompanyEmpWage commpanyEmpWage) {
        int wage =0;
        int count =0;int  count1=0;int  count2=0;
        int emphr=0;
        int totalWage=0;

        System.out.println("\n!!!----------For "+commpanyEmpWage.companyName+"----------!!!\n");
        System.out.println("____________________________________________________________________");
        System.out.println("|  Day   |  Wage Per Day   |  Working Hour  |  Total Working Hours |");
        System.out.println("--------------------------------------------------------------------");
        for (int day =1;day<=20;day++) {
            double val = Math.floor(Math.random() * 10) % 3;
            switch ((int) val) {
                case 1:
                    full_time:
                    full_time = 7;
                    wage = full_time * commpanyEmpWage.totalWorkingDays;
                    count++;
                    break;
                case 2:
                    part_time:
                    full_time = 4;
                    wage = full_time * commpanyEmpWage.totalWageperday;
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

        if (emphr >=commpanyEmpWage.totalWorkingHr){
            System.out.println("\nEmployee Must be Working for More than 100 hr in month" +
                    "\nAnd Employee is work for "+emphr+" hr in month");
            System.out.println("The Wage of the Employee  for a month is: "+totalWage);
        }else{
            System.out.println("The employee is not Work for "+commpanyEmpWage.totalWorkingHr+ "hrs in Month");
        }
           return totalWage;
       }


    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage PayRoll");
        Employee obj = new Employee();
//       obj.wage("Tata Company",30,60);
//        obj.wage("Google Company",20,90);
        obj.addCompany(90,"Tata",20,30);
        obj.addCompany(100,"Google",25,40);
        obj.addCompany(80,"Tesla",30,45);
        obj.wage();

    }
}
