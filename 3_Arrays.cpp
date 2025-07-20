#include <bits/stdc++.h>
using namespace std;

// 1. Max element in the array
void solve() {
    int size;
    cin >> size;

    int arr[size];
    for(int i = 0; i < size; i++) {
        cin >> arr[i];
    }

    int sol = arr[0];
    for(int i = 0; i < size; i++) {
        sol = max(arr[i], sol);
    }

    cout << sol << endl;
} // TC : O(n)

int main() {
    solve();
    return 0;
}

// 2. Reverse the Array
void solve() {
    int size;
    cin >> size;

    int arr[size];
    for(int i = 0; i < size; i++) cin >> arr[i];

    int start = 0; int end = size-1;

    while(start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start ++;
        end --;
    }

   for(int i = 0; i < size; i++) cout << arr[i] << " "; 
} // TC : O(n)

int main() {
    solve();
    return 0;
}

// 3. Oddsum and Evensum in the array
void solve() {
    int size;
    cin >> size;

    int nums[size];
    for(int i = 0; i < size; i++) cin >> nums[i];

    int oddSum = 0; int evenSum = 0;
    for(int i = 0; i < size; i++) {
        if(nums[i] % 2 != 0) oddSum += nums[i];
        else evenSum += nums[i];
    }

    cout << oddSum << " " << evenSum;
} // TC : O(n)

int main() {
    solve();
    return 0;
}


// 4. Count the occurences of zeroes, positives and negatives in the array.
void solve() {
    int size;
    cin >> size;

    int nums[size];
    for(int i = 0; i < size; i++) cin >> nums[i];

    int countPositive, countNegative, countZeroes;
    countPositive = countNegative = countZeroes = 0;

    for(int i = 0; i < size; i++) {
        if(nums[i]==0) countZeroes ++;
        else if(nums[i]>0) countPositive ++;
        else if(nums[i]<0) countNegative ++;
    }

    cout << countZeroes << " " << countPositive << " " << countNegative;
} // TC : O(n)

int main() {
    solve();
    return 0;
}

// 5. Mean, median and mode

// 6. The Missing Number
void solve() {
    int nums[99];
    for(int i = 0; i < 99; i++) {
        cin >> nums[i];
    }

    int freq_nums[101] = {0};
    for(int i = 0; i < 99; i++) {
        freq_nums[nums[i]]++;
    }

    for(int i = 1; i <= 100; i++) {
        if(freq_nums[i] == 0) {
            cout << i;
            return;
        }
    }
} // TC : O(n)

int main() {
    solve();
    return 0;
}

// 7. Max contiguous 1's in the array
void solve() {
    int size;
    cin >> size;
    
    int nums[size];
    for(int i = 0; i < size; i++) cin >> nums[i];
    
    int maxCount = 0; int currCount = 0;
    for(int i = 0; i < size; i++) {
        if(nums[i] == 1) {
            currCount ++;
            maxCount = max(currCount, maxCount);
        } else {
            currCount = 0;
        }
    }
    cout << maxCount;
} // TC : O(n)

int main() {
    solve();
    return 0;
}

// 8. Max Altitude
void solve() {
    int size;
    cin >> size;

    int nums[size];
    for(int i = 0; i < size; i++) {
        cin >> nums[i];
    }

    int maxAltitude = INT_MIN; int currAltitude = 0;
    for(int i = 0; i < size; i++) {
        currAltitude += nums[i];
        maxAltitude = max(currAltitude, maxAltitude);
    }

    cout << maxAltitude;
} // TC : O(n)

int main() {
    solve();
    return 0;
}
