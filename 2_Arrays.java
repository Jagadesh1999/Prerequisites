import java.io.*;
import java.util.*;

// 1. Max element in the array
public class Main {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int sol = arr[0];
        for(int i = 0; i < size; i++) {
            sol = Math.max(arr[i], sol);
        }

        System.out.println(sol);
    }

    public static void main(String[] args) {
        solve();
    }
}

// 2. Reverse the Array
public class Main {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];
        for(int i = 0; i < size; i++) arr[i] = sc.nextInt();

        int start = 0; int end = size-1;

        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }

       for(int i = 0; i < size; i++) System.out.print(arr[i] + " "); 
    }

    public static void main(String[] args) {
        solve();
    }
}
