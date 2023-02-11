//https://www.acmicpc.net/problem/2739

package loop;

import java.util.Scanner;

public class TimesTable {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 1; i < 10; i++) {
      System.out.println(n + " * " + i + " = " + n*i);
    }
    sc.close();
  }
}
