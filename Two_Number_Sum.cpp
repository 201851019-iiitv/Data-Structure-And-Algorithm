// Created by  Ambesh kumar
#include "bits/stdc++.h"

//I already compile this file in my computer system to save the time
//if get the compiler error thhen you should change this header to
// #include "bits/stdc++.h"  ---> #include <bits/stdc++.h>

#define  ll  long long
# define  loop(x,n)  for(int x = 0; x < n; ++x)
#define   constloop(x,a,n) for(int x = a; x < n; ++x)
#define  revloop(x,a,n)  for(int x = a; x > n; x--)

// ------- above define macros---------------------//


using namespace std;




// Time complexity O(n^2) and Space complexity O(1);



void two_number_sum(int arr[], int n, int target)
{

	for (int  i = 0; i < n; i++)     //O(n)
	{

		for (int j = i + 1; j < n; j++)   // O(n);
		{

			if (arr[i] + arr[j] == target)
			{

				cout << "[ " << arr[i] << " , " << arr[j] << " ]" << '\n' ;

			}


		}



	}






}




// Time complexity O(n) and Space complexity O(n)



void Two_number_sum(int arr[], int n, int target)
{


	unordered_map<int, bool>m;  //O(n) store value in map.
	int x;

	for (int i = 0; i < n; i++)  //O(n)
	{

		x = target - arr[i];

		if (m[x])    //O(1) fot finding element in map.
		{

			cout << "[ " << x << " , " << arr[i] << " ]" << '\n' ;

		}
		else
			m[arr[i]] = true;




	}






}




// Time complexity O(nlogn) and Space complexity O(1)


void Two_number_Sum(int arr[], int n, int target)
{

	sort(arr, arr + n); //O(nlogn)


	int left_idx = 0;
	int right_idx = n - 1;

	while (left_idx < right_idx)   //O(n)
	{

		if (arr[left_idx] + arr[right_idx] == target)
		{
			cout << "[ " << arr[left_idx] << " , " << arr[right_idx] << " ]" << '\n' ;

			left_idx++;
			right_idx--;
		}
		else if (arr[left_idx] + arr[right_idx] < target)
		{

			left_idx++;

		}
		else
			right_idx--;




	}



}






// ------------------------------ Driver Code --------------------------------------------------//




int main()
{

	ios::sync_with_stdio(0);
	cin.tie(0);

	int t;
	cin >> t;
	while (t--) {
		int n;
		cin >> n;

		int arr[n];

		for (int i = 0; i < n; i++)
		{

			cin >> arr[i];

		}

		int target;

		cin >> target;

// Time complexity O(n^2) and Space complexity O(1);
		two_number_sum(arr, n, target);
// Time complexity O(n) and Space complexity O(n);
		Two_number_sum(arr, n, target);

// Time complexity O(nlogn) and Space complexity O(1);
		Two_number_Sum(arr, n, target);









	}
	return 0;
}