package com.company;

public class ChessBoardMatrix {
    public static void main(String[] args){
        String[][] chessboard=new String[8][8];
        for(int i=0;i<chessboard.length;i++){
            for(int j=0;j<chessboard[i].length;j++){
                if((i+j)%2==0){chessboard[i][j]="x"; }
                else{chessboard[i][j]="o"; }
                System.out.print(chessboard[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
