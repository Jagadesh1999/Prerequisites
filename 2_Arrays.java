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

        int max = arr[0];
        for(int i = 0; i < size; i++) {
            if(arr[i] > max) max = arr[i];
        }

        System.out.println(max);
    }

    public static void main(String[] args) {
        solve();
    }
}
