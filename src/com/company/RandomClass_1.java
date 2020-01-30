package com.company;
import java.util.Scanner;
import java.util.Random;

public class RandomClass_1 {
    public static void main(String[] args){
        //*****Scanner part of syntax*****
        Scanner s=new Scanner(System.in);
        System.out.print("Enter minimal number :");
        int min=s.nextInt();
        if(min<=0){
            System.out.println("ERROR.You must enter positive number.");
            return;
        }
        System.out.print("Enter maximal number :");
        int max =s.nextInt();
        if(max<min){
            System.out.println("ERROR.You must enter number greater than minimal.");
            return;
        }

        //*****Random number part of syntax*****
        Random r=new Random();
        int x=r.nextInt(max-min+1)+min;
        System.out.println("Random number is :"+x);

        //*****Random string part of syntax*****
        String letters="abcdefghijklmnopqrstuvwxyz";
        String random="";
        char[] text=new char[x];
        for(int i=0;i<x;i++){
            text[i]=letters.charAt(r.nextInt(letters.length()));
        }
        for(int i=0;i<text.length;i++){
            random+=text[i];
        }
        System.out.println(random);
    }
}


/*public void setData(String name,int age,String profession,int salary){
        this.name=name;this.profession=profession;
        if(age<minAge||age>maxAge){
            System.out.println("This age is inappropriate");
        }else{this.age=age;}
        if(salary<minSalary){
            System.out.println("You can't hire people with salary lower than minimal salary");
        }else{this.salary=salary;}
    }*/