// https://www.acmicpc.net/problem/2588

package io_and_4ao;

import java.util.Scanner;

public class Multiply_2 {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    int a, b;
    a = scanner.nextInt();
    b = scanner.nextInt();
    
    int b1 = b / 100;
    int b_m1 = b % 100;
    int b2 = b_m1 / 10;
    int b3 = b_m1 % 10;
    
    System.out.println(a * b3);
    System.out.println(a * b2);
    System.out.println(a * b1);
    System.out.println(a * b);
    
    scanner.close();

  }

}
