// https://www.acmicpc.net/problem/3003

package io_and_4ao;

import java.util.Scanner;

public class ChessPiece {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int[] numPiece = new int[6];
    
    numPiece[0] = sc.nextInt();
    numPiece[1] = sc.nextInt();
    numPiece[2] = sc.nextInt();
    numPiece[3] = sc.nextInt();
    numPiece[4] = sc.nextInt();
    numPiece[5] = sc.nextInt();
    
    numPiece[0] = 1 - numPiece[0];
    numPiece[1] = 1 - numPiece[1];
    numPiece[2] = 2 - numPiece[2];
    numPiece[3] = 2 - numPiece[3];
    numPiece[4] = 2 - numPiece[4];
    numPiece[5] = 8 - numPiece[5];
    
    System.out.println(numPiece[0] + " "
        + numPiece[1] + " "
        + numPiece[2] + " "
        + numPiece[3] + " "
        + numPiece[4] + " "
        + numPiece[5]);
    
    sc.close();

  }

}
