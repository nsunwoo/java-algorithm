// https://www.acmicpc.net/problem/10430

package io_and_4ao;

import java.util.Scanner;

public class Modulo {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int a, b, c;
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    
    System.out.println((a + b) % c);
    System.out.println(((a % c) + (b % c)) % c);
    System.out.println((a * b) % c);
    System.out.println(((a % c) * (b % c)) % c);
    
    sc.close();

  }

}
