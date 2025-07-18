import java.io.*;
import java.util.*;

// 1. Floyd Pattern - 1
public class Main {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count = 0;
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                if(i >= j) {
                    count ++;
                    System.out.print(count + " ");
                }
            }
            System.out.println();
        }
    } // TC : O(n * n)

    public static void main(String[] args) {
        solve();
    }
}
