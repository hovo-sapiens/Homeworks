package com.company;

public class DiagonalMatrix {
    public static void main(String[] args){
        String[][] diagonal=new String[6][6];
        for(int i=0;i<diagonal.length;i++){
            for(int j=0;j<diagonal[i].length;j++){
                if(i==j||(i+j)==diagonal.length-1){diagonal[i][j]="x"; }
                else{diagonal[i][j]="o"; }
                System.out.print(diagonal[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
