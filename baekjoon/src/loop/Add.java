//https://www.acmicpc.net/problem/10950

package loop;

import java.util.Scanner;

public class Add {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t;
    t = sc.nextInt();

    for (int i = 0; i < t; i++) {
      int a, b;
      a = sc.nextInt();
      b = sc.nextInt();
      System.out.println(a + b);
    }

    sc.close();
  }
}
