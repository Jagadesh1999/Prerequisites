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

// 5. Sum of multiples of 3 from 1 to n
public class Main
{
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int sum = 0;
        for(int i = 0; i <= num; i++) {
            if(i % 3 == 0) {
                sum = sum + i;
            }
        }
        
        System.out.println(sum);
    }
    
	public static void main(String[] args) {
		solve();
	}
}

// 6. Nth Fibonacci number
public class Main {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num < 2) {
            System.out.print(num);
            return;
        }

        int a = 0; 
        int b = 1;
        int sum = 0;

        for(int i = 2; i <= num; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        System.out.print(sum);
    }

    public static void main(String[] args) {
        solve();
    }
}

// 7. Armstrong number
// Approach : 
// -- Count the total number of digits.
// -- For each digit, find the digit ^ count and add it to the sum value.
// -- Check if the final sum is equal to the input number.
public class Main {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        
        int count = 0; int temp_1, temp_2; temp_1 = temp_2 = num;
	    
        while(temp_1 != 0) {
            temp_1 /= 10;
            count ++;
        } // int count = String.valueOf(num).length();
        
        int sum = 0;
        while(num != 0) {
            int digit = num % 10;
            int prod = 1;
            for(int i = 1; i <= count; i++) {
                prod = prod * digit;
            } // int prod = Math.pow(digit, count); 
            sum = sum + prod;
            num /= 10;
        }
       
       if(sum == temp_2) {
           System.out.println("Yes");
           return;
       }
       System.out.println("No");
    } // TC : O(digits * digits)

    public static void main(String[] args) {
	   solve();
    }
}
