//https://www.acmicpc.net/problem/2884

package conditional;

import java.util.Scanner;

public class AlarmClock {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h, m;
    h = sc.nextInt();
    m = sc.nextInt();
    if ( m >= 45 ) {
      m -= 45;
    } else {
      if ( h != 0 ) {
        h -= 1;
      } else {
        h = 23;
      }
      m = 60 - (45 - m);
    }
    System.out.println(h + " " + m);
    sc.close();
  }
}
