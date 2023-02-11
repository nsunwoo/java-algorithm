//https://www.acmicpc.net/problem/2525

package conditional;

import java.util.Scanner;

public class OvenClock {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h, m, cookMin;
    h = sc.nextInt();
    m = sc.nextInt();
    cookMin = sc.nextInt();
    if ( m + cookMin < 60 ) {
      m += cookMin;
    } else {
      h += cookMin / 60;
      m += cookMin % 60;
      if ( m >= 60 ) {
        h += 1;
        m -= 60;
      }
      if ( h >= 24 ) {
        h -= 24;
      }
    }
    System.out.println(h + " " + m);
  }
}
