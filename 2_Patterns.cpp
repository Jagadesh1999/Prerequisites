#include<iostream>
#include<vector>
using namespace std;

// 1. Triangle Pattern
void solve() {
    int num;
    cin >> num;
    for(int i = 0; i < num; i++) {
        for(int j = 0; j < num; j++) {
            if(i >= j) cout << "* ";
        }
        cout << endl;
    }
} // TC : O(n * n)

int main() {
    solve();
    return 0;
}

/*
// 2. Floyd Pattern - 1
void solve() {
    int num;
    cin >> num;
    int count = 0;
    for(int i = 0; i < num; i++) {
        for(int j = 0; j < num; j++) {
            if(i >= j) {
                count ++;
                cout << count << " ";
            }
        }
        cout << endl;
    }
} // TC : O(n * n)

int main() {
    solve();
    return 0;
}
*/

// 3. Rectangle Pattern
void solve() {
    int num;
    cin >> num;
    for(int i = 0; i < num; i++) {
        int temp = num;
        for(int j = 0; j < num; j++) {
            if(i + j == num - 1) {
                cout << "*";
                temp --; 
            }
            else {
               cout << temp;
               temp --; 
            }
        }
        cout << endl;
    }
} // TC : O(n * n)

int main() {
    solve();
    return 0;
}

