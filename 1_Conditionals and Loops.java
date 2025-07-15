import java.io.*;
import java.util.*;

// 1. Triangle Validator
public class Main {
    public static void solve() {
        int num_1, num_2, num_3;

        Scanner sc = new Scanner(System.in);
        num_1 = sc.nextInt();
        num_2 = sc.nextInt();
        num_3 = sc.nextInt();

        if((num_1 + num_2 > num_3) && (num_2 + num_3 > num_1) &&(num_1 + num_3 > num_2)) {
            System.out.println("Yes");
        } else System.out.println("No");
    }

    public static void main(String[] args) {
        solve();
    }
}

// 2. Area of the rectangle
public class Main {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        long length = sc.nextLong();
        long breadth = sc.nextLong();

        long area = length * breadth;

        System.out.println(area);
    }

    public static void main(String[] args) {
        solve();
    }
}

// 3. Factorial Problem
public class Main {
    public static void factorial() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num == 0) {
            System.out.println("1");
            return;
        }

        int fact = 1;
        for(int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println(fact);
    }

    public static void main(String[] args) {
        factorial();
    }
}

// 4. Number of multiples of 3 and 5 between 1 and n
public class Main {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        // Inclusion Exclusion Principle
        long count_3 = num / 3;
        long count_5 = num / 5;
        long count_15 = num / 15; // LCM of (3, 5)  = 15

        System.out.println(count_3 + count_5 - count_15);
    }

    public static void main(String[] args) {
        solve();
    }
}
