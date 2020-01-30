package com.company;

public class ArrayDoubleValue {
    public static void main(String[] args) {
        int[]rev=new int[10];
        for(int i=0;i<rev.length;i++){
          int j = i * 2;
          rev[i] = j;
            System.out.println("rev["+i+"]:"+j);
        }
    }
}
