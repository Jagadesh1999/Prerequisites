#include <bits/stc++.h>
using namespace.std;

// 1. Triangle Validator
void solve1() {
    int num_1, num_2, num_3;
    cin >> num_1 >> num_2 >> num_3;
    if((num_1 + num_2 > num_3) && (num_2 + num_3 > num_1) && (num_1 + num_3 > num_2)) {
        cout << "Yes" << endl;
    } else cout << "No" << endl;
}

// 2. Area of the rectangle
void solve2() {
    long long length, breadth;
    cin >> length >> breadth;
    long long area = length * breadth;
    cout << area << endl;
}

// 3. Factorial Problem
void factorial() {
    int num;
    cin >> num;
    if(num == 0) {
        cout << "1" << endl;
        return;
    }
    int fact = 1;
    for(int i = 1; i <= num; i++) {
        fact = fact * i;
    }
    cout << fact << endl;
}

// 4. Number of multiples of 3 and 5 between 1 and n
void solve4() {
    long long num;
    cin >> num;
    // Inclusion Exclusion Principle
    long long count_3 = num / 3;
    long long count_5 = num / 5;
    long long count_15 = num / 15; // LCM of (3, 5)  = 15
    cout << count_3 + count_5 - count_15 << endl;
}

// 5. Sum of multiples of 3 from 1 to n
void solve5() {
    int num;
    cin >> num;
    
    int sum = 0;
    for(int i = 0; i <= num; i++) {
        if(i % 3 == 0) {
            sum = sum + i;
        }
    }
    
    cout << sum << endl;
}

// 6. Nth Fibonacci number
void solve6() {
    int num;
    cin >> num;
    if(num < 2) {
        cout << num;
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
    cout << sum;
}

// 7. Armstrong number
// Approach : 
// -- Count the total number of digits.
// -- For each digit, find the digit ^ count and add it to the sum value.
// -- Check if the final sum is equal to the input number.
void solve7() {
    int num;
    cin >> num;
    
    // int count = 0;
    int temp_1, temp_2; temp_1 = temp_2 = num;
    
    // while(temp_1 != 0) {
    //     temp_1 /= 10;
    //     count ++;
    // }
    int count = to_string(num).length();
    
    int sum = 0;
    while(num != 0) {
        int digit = num % 10;
        // int prod = 1;
        // for(int i = 1; i <= count; i++) {
        //     prod = prod * digit;
        // }
        int prod = (int) pow(digit, count);
        sum = sum + prod;
        num /= 10;
    }
   
   if(sum == temp_2) {
       cout << "Yes" << endl;
       return;
   }
   cout << "No" << endl;
} // TC : O(digits * digits)

int main() {
    // Uncomment the function you want to test
    // solve1();
    // solve2();
    // factorial();
    // solve4();
    // solve5();
    // solve6();
    solve7();
    return 0;
}
