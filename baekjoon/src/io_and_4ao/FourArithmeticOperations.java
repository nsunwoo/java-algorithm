// https://www.acmicpc.net/problem/10869

package io_and_4ao;

import java.util.Scanner;

public class FourArithmeticOperations {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int a, b;
    a = sc.nextInt();
    b = sc.nextInt();
    
    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b);
    System.out.println(a % b);
    
    sc.close();

  }

}
