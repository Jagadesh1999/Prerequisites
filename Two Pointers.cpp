Template - Two Pointers (Form 2)

In simpler terms, this variation can be termed as a variable-sized sliding window. Lets try to understand this 
particular template using one problem.

Problem Statement : 
Identify the longest subarray containing only 1s in the binary array while allowing the option to flip almost k 0s to 
1s.

Input : 
k = 2
arr = [1, 0, 0, 1, 1, 0, 1, 1] 

Output : 
6

Brute Force Approach : 
For every possible start (the outer loop, from i = 0 to i < arr.length), try to run the inner loop 
(from j = i to j < arr.length ) and count the number of elements. The inner loop should stop incase we encounter the 
k+1th zero.

The maximum value obtained among all the possible starts is the answer. 

TC : O(n ^ 2)

Template Based Approach : 
-------------------------

Initialise the 4 essential markers.  
(tail = 0, head = -1, counter = 0, ans = 0)

Iteration 1 (tail = 0) : 
------------------------
while(tail < arr.length) : // 0 < 8 - True 
	while(-1 + 1 = 0 < 8 and (1==1 || 0 < 2)) : //  True
		head = 0;
		if(1 == 0) // False 
			so counter stays 0;

	while(0 + 1 = 1 < 8 and (0==1 || 0 < 2)) : //  True
		head = 1;
		if(0 == 0) // True
			so counter becomes 1;

	while(1 + 1 = 2 < 8 and (0==1 || 1 < 2)) : //  True
		head = 2;
		if(0 == 0) // True
			so counter becomes 2;

	while(2 + 1 = 3 < 8 and (1==1 || 2 < 2)) : //  True
		head = 3; 
		if(1 == 0) // False
			So counter stays 2;
	
	while(3 + 1 = 4 < 8 and (1==1 || 2 < 2)) : //  True
		head = 4; 
		if(1 == 0) // False
			So counter stays 2;

	while(4 + 1 = 5 < 8 and (0==1 || 2 < 2)) : // False
	
// Update ans : 
ans = max(ans, head - tail + 1); // max(0, 5) = 5

if(0 > 4 ) // False
else : 
	if(1 == 0 ) : // False 
	tail = 1


Iteration 2 (tail = 1) : 
------------------------
while(tail < arr.length) : // 1 < 8 - True
	while(4 + 1 = 5 < 8 and (0==1 || 2 < 2)) : // False

// Update ans : 
ans = max(ans, head - tail + 1); // max(5, 4) = 5

if(1 > 4 ) // False
else : 
	if(0 == 0 ) : // True 
		so counter becomes 1
	tail = 2


Iteration 3 (tail = 2) :  
------------------------
while(tail < arr.length) : // 2 < 8 - True
	while(4 + 1 = 5 < 8 and (0==1 || 1 < 2)) : // True
		head = 5;
		if(0 == 0) // True 
			so counter becomes 2;

	while(5 + 1 = 6 < 8 and (1==1 || 2 < 2)) : // True
		head = 6;
		if(1 == 0) // False 
			so counter stays 2;

	while(6 + 1 = 7 < 8 and (1==1 || 2 < 2)) : // True
		head = 7;
		if(1 == 0) // False 
			so counter stays 2;

	while(7 + 1 = 8 < 8 and (...) // False

// Update ans : 
ans = max(ans, head - tail + 1); // max(5, 6) = 6

if(2 > 7 ) // False
else : 
	if(0 == 0 ) : // True 
		so counter becomes 1
	tail = 3



Iteration 4 (tail = 3) : 
------------------------
while(tail < arr.length) : // 3 < 8 - True
	while(7 + 1 = 8 < 8 and (...) // False

// Update ans : 
ans = max(ans, head - tail + 1); // max(6, 5) = 6

if(3 > 7 ) // False
else : 
	if(1 == 0 ) : // False
	tail = 4

Iteration 5 (tail = 4) : 
------------------------
while(tail < arr.length) : // 4 < 8 - True
	while(7 + 1 = 8 < 8 and (...) // False

// Update ans : 
ans = max(ans, head - tail + 1); // max(6, 4) = 6

if(4 > 7 ) // False
else : 
	if(1 == 0 ) : // False
	tail = 5


Iteration 6 (tail = 5) : 
------------------------
while(tail < arr.length) : // 5 < 8 - True
	while(7 + 1 = 8 < 8 and (...) // False


// Update ans : 
ans = max(ans, head - tail + 1); // max(6, 3) = 6

if(5 > 7 ) // False
else : 
	if(0 == 0 ) : // True 
		so counter becomes 0
	tail = 6


Iteration 7 (tail = 6) : 
------------------------
while(tail < arr.length) : // 6 < 8 - True
	while(7 + 1 = 8 < 8 and (...) // False

// Update ans : 
ans = max(ans, head - tail + 1); // max(6, 2) = 6

if(6 > 7 ) // False
else : 
	if(1 == 0 ) : // False 
	tail = 7


Iteration 8 (tail = 7) : 
------------------------
while(tail < arr.length) : // 7 < 8 - True
	while(7 + 1 = 8 < 8 and (...) // False

// Update ans : 
ans = max(ans, head - tail + 1); // max(6, 1) = 6

if(7 > 7 ) // False
else : 
	if(1 == 0 ) : // False 
	tail = 8


Iteration 9 (tail = 8) : 
-------------------------
while(tail < arr.length) : // 8 < 8 - False → exit

Hence, ans = 6	

Code :
------
#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n, k;
    cin >> n >> k;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    // head and tail
    int tail = 0, head = -1;

    // datastructure for the window
	int cntzero = 0;
	
    // answer maintain
    int ans = 0;

    while (tail < n)
    {
        while (head+1 < n && (arr[head+1]==1 || cntzero<k))
        {
            head++;
            if(arr[head]==0)cntzero++;
        }
       
        ans = max(ans, head-tail+1);    
        
        // move start one step forward.
        if (tail > head)    // keep it same for all question, it basically help to handle empty subarray
        {
            tail++;
            head = tail - 1;
        }
        else
        {
            // change data  structure because removing tail element
            if(arr[tail]==0)cntzero--;
            tail++;
        }
    }

    cout << ans << endl;
}




			




