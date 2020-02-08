package com.company;

public class HitlerMatrix {
    public static void main(String[] args){
        char[][] hitler=new char[9][9];
        for(int i=0;i<hitler.length;i++){
            for(int j=0;j<hitler[i].length;j++){
                if(i==hitler.length/2||j==hitler.length/2||j==0&&i<hitler.length/2||
                i==hitler.length-1&&j<hitler.length/2||j== hitler.length-1&&i>hitler.length/2||i==0&&j>hitler.length/2){
                    hitler[i][j]='x';
                }else{ hitler[i][j]=' ';}
                System.out.print(hitler[i][j]+"  ");
            }
            System.out.println();
        }
        //***********************
        System.out.println();
        System.out.println("***************");
        System.out.println();
        //***********************
        char [][] sv=new char[10][10];
        for(int i=0;i<sv.length;i++){
            for(int j=0;j<sv[i].length;j++){
                if(j==sv.length/2||j==sv.length/2-1||i==sv.length/2||i==sv.length/2-1||j<=1&&i<sv.length/2||
                        i>=sv.length-2&&j<sv.length/2||j>=sv.length-2&&i>sv.length/2||i<=1&&j>sv.length/2){
                    sv[i][j]='x';
                }else{ sv[i][j]=' ';}
                System.out.print(sv[i][j]+"  ");
            }
            System.out.println();
        }
        //***********************
        System.out.println();
        System.out.println("***************");
        System.out.println();
        //***********************
        char[][] s=new char[9][9];
        for(int x=0;x<s.length;x++){
            for(int y=0;y<s[x].length;y++){
                if(x==y||x+y==s.length-1||x==0&&y<=s.length/2||y==0&&x>=s.length/2||x==s.length-1&&y>=s.length/2
                        ||y==s.length-1&&x<=s.length/2){
                    s[x][y]='x';
                }else{s[x][y]=' ';}
                System.out.print(s[x][y]+"  ");
            }
            System.out.println();
        }
    }
}
