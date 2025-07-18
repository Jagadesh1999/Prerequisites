import java.io.*;
import java.util.*;

// 1. Triangle Pattern
public class Main {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                if(i >= j) System.out.print("* ");
            }
            System.out.println();
        }
    } // TC : O(n * n)

    public static void main(String[] args) {
        solve();
    }
} 

// 2. Floyd Pattern - 1
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

// 3. Rectangle Pattern
public class Main {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 0; i < num; i++) {
            int temp = num;
            for(int j = 0; j < num; j++) {
                if(i + j == num - 1) {
                    System.out.print("*");
                    temp --; 
                }
                else {
                   System.out.print(temp);
                   temp --; 
                }
            }
            System.out.println();
        }
    } // TC : O(n * n)

    public static void main(String[] args) {
        solve();
    }
} 
