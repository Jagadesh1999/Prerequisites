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
    } // TC : O(n)

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
    } // TC : O(n)

    public static void main(String[] args) {
        solve();
    }
}

// 3. Oddsum and Evensum in the array
public class Main {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] nums = new int[size];
        for(int i = 0; i < size; i++) nums[i] = sc.nextInt();

        int oddSum = 0; int evenSum = 0;
        for(int i = 0; i < size; i++) {
            if(nums[i] % 2 != 0) oddSum += nums[i];
            else evenSum += nums[i];
        }

        System.out.print(oddSum + " " + evenSum);
    } // TC : O(n)

    public static void main(String[] args) {
        solve();
    }
}

// 4. Count the occurences of zeroes, positives and negatives in the array.
public class Main {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] nums = new int[size];
        for(int i = 0; i < size; i++) nums[i] = sc.nextInt();

        int countPositive, countNegative, countZeroes;
        countPositive = countNegative = countZeroes = 0;

        for(int i = 0; i < size; i++) {
            if(nums[i]==0) countZeroes ++;
            else if(nums[i]>0) countPositive ++;
            else if(nums[i]<0) countNegative ++;
        }

        System.out.print(countZeroes + " " + countPositive + " " + countNegative);
    } // TC : O(n)

    public static void main(String[] args) {
        solve();
    }
} 

// 5. Mean, median and mode

// 6. The Missing Number
public class Main {
    public static void solve() {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[99];
        for(int i = 0; i < 99; i++) {
            nums[i] = sc.nextInt();
        }

        int[] freq_nums = new int[101];
        for(int i = 0; i < 99; i++) {
            freq_nums[nums[i]]++;
        }

        for(int i = 1; i <= 100; i++) {
            if(freq_nums[i] == 0) {
                System.out.print(i);
                return;
            }
        }
    } // TC : O(n)

    public static void main(String[] args) {
        solve();
    }
}

// 7. Max contiguous 1's in the array
public class Main
{
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        int[] nums = new int[size];
        for(int i = 0; i < size; i++) nums[i] = sc.nextInt();
        
        int maxCount = 0; int currCount = 0;
        for(int i = 0; i < size; i++) {
            if(nums[i] == 1) {
                currCount ++;
                maxCount = Math.max(currCount, maxCount);
            } else {
                currCount = 0;
            }
        }
        System.out.print(maxCount);
    }
    
	public static void main(String[] args) {
		solve();
	}
} // TC : O(n)

// 8. Max Altitude
public class Main {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] nums = new int[size];
        for(int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        int maxAltitude = Integer.MIN_VALUE; int currAltitude = 0;
        for(int i = 0; i < size; i++) {
            currAltitude += nums[i];
            maxAltitude = Math.max(currAltitude, maxAltitude);
        }

        System.out.print(maxAltitude);
    } // TC : O(n)

    public static void main(String[] args) {
        solve();
    }
} 
