//https://www.acmicpc.net/problem/2480

package conditional;

import java.util.Scanner;

public class ThreeDice {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int d1, d2, d3;
    d1 = sc.nextInt();
    d2 = sc.nextInt();
    d3 = sc.nextInt();

    if ( d1 == d2 && d2 == d3 ) {
      System.out.println(10000 + 1000 * d1);
    } else if ( d1 == d2 || d1 == d3 ) {
      System.out.println(1000 + 100 * d1);
    } else if ( d2 == d3 ) {
      System.out.println(1000 + 100 * d2);
    } else {
      if ( d1 > d2 && d1 > d3 ) {
        System.out.println(100 * d1);
      } else if ( d2 > d1 && d2 > d3 ) {
        System.out.println(100 * d2);
      } else {
        System.out.println(100 * d3);
      }
    }

    sc.close();
  }
}
