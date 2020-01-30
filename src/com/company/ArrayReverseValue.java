package com.company;

public class ArrayReverseValue {
    public static void main(String[] args) {
        int[]rev=new int[10];
        int j=rev.length-1;
        for(int i=0;i<rev.length;i++){
            do{ rev[i]=j;
                System.out.println("rev["+i+"]:"+j);
                j--;}
            while (i+j==rev.length-1);
        }
    }
}
