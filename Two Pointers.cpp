// Problem Statement: Identify the longest subarray composed exclusively of 1's in a binary array, while allowing for 
// the option to flip at most k 0's to 1's.

// To address this problem, we will devise a general template and explore its application for solving similar problems of 
// this nature.

// Template : 
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
        while (// there is a next element to eat && we can eat)
        {
            head++;
            
            // include elemenet at head in the data structure
        }
       
        
        // update the answer for current start
        
        
        // move start one step forward.
        if (tail > head)    // keep it same for all question, it basically help to handle empty subarray
        {
            tail++;
            head = tail - 1;
        }
        else
        {
            // change data  structure because removing tail element
            
            tail++;
        }
    }

    cout << ans << endl;
}

// Code for the above problem using the template 
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
            if(arr[tail]==0)cntzero--;

            
            tail++;
        }
    }

    cout << ans << endl;
}

Template Based Approach : 

Initialise the 4 essential markers. 
(tail = 0, head = -1, counter = 0, ans = 0)


while(tail < arr.length) : // 0 < 9 - True 
	while(-1 + 1 = 0 < 9 and (1==1 || 0 < 2)) : //  True
		head = 0;
		if(1 == 0) // False 
			so counter stays 0;

	while(0 + 1 = 1 < 9 and (0==1 || 0 < 2)) : //  True
		head = 1;
		if(0 == 0) // True
			so counter becomes 1;

	while(1 + 1 = 2 < 9 and (0==1 || 1 < 2)) : //  True
		head = 2;
		if(0 == 0) // True
			so counter becomes 2;

	while(2 + 1 = 3 < 9 and (1==1 || 2 < 2)) : //  True
		head = 3; 
		if(1 == 0) // False
			So counter stays 2;

	while(3 + 1 = 4 < 9 and (1==1 || 2 < 2)) : //  True
		head = 4; 
		if(1 == 0) // False
			So counter stays 2;
	
	while(4 + 1 =  5 < 9 and (0==1 || 2 < 2) : // False
	
// Update ans : 
ans = max(ans, head - tail + 1); // max(0, 5) = 5

if(0 > 4 ) // False
else : 
	if(1 == 0 ) : // False 
	tail = 1
