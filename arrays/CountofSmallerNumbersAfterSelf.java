import java.util.ArrayList;
import java.util.List;

/*

315. Count of Smaller Numbers After Self
Hard

https://leetcode.com/problems/count-of-smaller-numbers-after-self/

You are given an integer array nums and you have to return a new counts array. The counts array has the property where counts[i] is the number of smaller elements to the right of nums[i].

Example:

Input: [5,2,6,1]
Output: [2,1,1,0] 
Explanation:
To the right of 5 there are 2 smaller elements (2 and 1).
To the right of 2 there is only 1 smaller element (1).
To the right of 6 there is 1 smaller element (1).
To the right of 1 there is 0 smaller element.

Accepted
110,642
Submissions
271,629
*/

class CountofSmallerNumbersAfterSelf {
    public List<Integer> countSmaller(int[] nums) {
        
        List<Integer> counts = new ArrayList<>();
        int count;
        for(int i = 0; i < nums.length; i++){
            count = 0;
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] < nums[i])
                    count++;
            }
            counts.add(count);
        }
        
        return counts;
    }
}