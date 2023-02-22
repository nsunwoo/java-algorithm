//https://www.acmicpc.net/problem/8393

package loop;

import java.util.Scanner;

public class Sum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, sum;
    n = sc.nextInt();
    sum = 0;
    for (int i = 1; i < n + 1; i++) {
      sum += i;
    }
    System.out.println(sum);
    sc.close();
  }
}
