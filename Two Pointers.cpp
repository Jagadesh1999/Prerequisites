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
        while (head+1 < n && (arr[head+1]==1 || cntzero<k)
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
