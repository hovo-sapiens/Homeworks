package com.company;

public class Employees {
   private String company;
   private String position;
   private String name;
   private String surname;
   private String date;
   private int salary;
   private int percent;
   private int percentage;


    public Employees(String name,String surname,String date,String company,String position,int salary,int percent) {
        this.name=name;this.surname=surname; this.date=date;this.company=company;
        this.salary=salary;this.percent=percent;this.position=position;
    }
    public void speak(){
        System.out.println("My name is "+name+" "+surname+".I was born in "+date+".");
        System.out.print("I'm working at "+company+"(Caribbean Pirates Corporation) as a "+position+", and I get a salary of "+salary+" gold coins");
        System.out.println(" per month plus "+percent+"% from every pillage.");
        System.out.println();
    }
    public int salaryIncrease(int percentage){
        int newSalary=salary*percentage/100+salary;
        System.out.println(newSalary);
        salary=newSalary;
        return salary;


    }


}
