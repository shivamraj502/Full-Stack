import java.util.Stack;

public class practice {
    public static int Leetcode35a(int target,int[]nums){
/**
35. Search Insert Position
Easy
Topics
premium lock icon
Companies
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
         */
        if(target>nums[nums.length-1]){return nums.length;}
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
            if(nums[i]>target){
                return i;
            }
        }
        return -1;
    }
    public static int Leetcode35b(int target,int[]nums){
/**
35. Search Insert Position 
Easy
Topics
premium lock icon
Companies
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
         */
        if(target>nums[nums.length-1]){return nums.length;}
        
        int low=0;
        int high=nums.length-1;
        while(low<=high){
        int mid=(low+high)/2;
            if(nums[mid]==target){return mid;}
            else if(nums[mid]>target){ high = mid-1;}
            else{ low = mid+1;}
        }
        
        return low;
    }
    public static int Leetcode11(int height[]){

/**
11. Container With Most Water
Medium
Topics
premium lock icon
Companies
Hint
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).Find two lines that together with the x-axis form a container, such that the container contains the most water.Return the maximum amount of water a container can store.Notice that you may not slant the container.

Example 1:
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

Example 2:
Input: height = [1,1]
Output: 1
         */
        
        int max=0;
        int left=0;
        int right=height.length-1;

        while(left < right){

            int min=Math.min(height[left],height[right]);
            int dis=right-left;
            int area=min*dis;
            if(max < area){max = area;}

            // System.out.println("right: "+right);
            // System.out.println("left: "+left);

            if(height[left]<height[right]){left++;}
            else{right--;}

            // System.out.println("right: "+right);
            // System.out.println("left: "+left);
            // System.out.println("min: "+min);
            // System.out.println("distance: "+dis);
            // System.out.println("area: "+area);
            // System.out.println();
            }

        return max;
    }
    public static double Leetcode643(int nums[],int k){

/**
643. Maximum Average Subarray I
Example 1:
Input: nums = [1,12,-5,-6,50,3], k = 4
               0  1  2  3  4 5
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75

Example 2:
Input: nums = [5], k = 1
Output: 5.00000
         */

        // if(nums.length==1)

        int sum=0;

        for(int i=0;i<k;i++){
            sum+=nums[i];
            // System.out.println("sum: "+sum);
        }System.out.println();
        
        double max=nums[0];
        for(int i=k;i<nums.length;i++){
            sum = sum + nums[i] - nums[i-k];
            if(max<sum){max =sum;}
            // System.out.println("nums[i]: "+nums[i]);
            // System.out.println("nums[i-k]: "+nums[i-k]);
            // System.out.println("sum: "+sum);
            // System.out.println("max: "+max);
        }

        return (max/k);
    }
    public static void bubblesort(int nums[]){

        for(int k=0;k<nums.length-1;k++){
        for(int i=0;i<nums.length-1-k;i++){
            if(nums[i+1]<nums[i]){
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }
        }}System.out.println();

        System.out.println("sorted: ");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }System.out.println();
    }
    public static void selectionSort(int nums[]){

        for(int k=0;k<nums.length-1;k++){
            int min=k;
        for(int i=k+1;i<nums.length;i++){
            if(nums[i]<nums[min]){
                min = i;
            }
        }       int temp =nums[k];
                nums[k] = nums[min];
                nums[min] = temp;

        
        }System.out.println();

        System.out.println("sorted: ");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }System.out.println();
    }
    public static void insertionSort(int nums[]){   // 5, 3, 4, 1

        for(int i=0;i<nums.length-1;i++){
        for(int j=i+1;j>0;j--){
            if(nums[j] < nums[j-1]){
                int temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = temp;
            }else{ break;}
        }System.out.println();   

        }System.out.println();

        System.out.println("sorted: ");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }System.out.println();
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node Leetcode206(Node head){  
        // null -> 1 -> 2 -> 3 -> 4 -> 5 -> null
        /* null <- 1 <- 2 <- 3 <- 4 <- 5
         */
        
        Node pre = null;      // null ,1,2,3,4,5
        Node curr = head;     //   1  ,2,3,4,5,null
        Node nxt=null;        // null ,3,4,5,null

        while(curr != null){
            nxt=curr.next;     // 2
            curr.next=pre;     // null
            pre=curr;          // 1
            curr=nxt;          // 2
        }head=pre;

        System.out.println("check"+head.data);

        return head;

        /*
        public static void main(String[] args) {
        Node head = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node tail = new Node(5);

        head.next=a;
        a.next=b;
        b.next=c;
        c.next=tail;

        head = Leetcode206(head);
        // Leetcode206(head);               // not working because head not changed in method

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }System.out.println();

        } */
    }
    public static boolean Leetcode20(String s){
        boolean istrue=true;
        Stack<Character> st = new Stack<>();

                                        // STRING HANDLING METHOD
        // for(int i=0;i<s.length();i++){
        //     if(s.contains("()")){
        //         s=s.replace("()", "");  //don't use replaceAll
        //     }else if(s.contains("{}")){
        //         s=s.replace("{}", "");
        //     }else if(s.contains("[]")){
        //         s=s.replace("[]", "");
        //     }
        // }return s.isEmpty();

                                        // STACK METHOD
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(')');
            }else if(s.charAt(i)=='{'){
                st.push('}');
            }else if(s.charAt(i)=='['){
                st.push(']');
            }else if(s.charAt(i)==')'){
                if(st.pop()==')'){
                    continue;
                }else{return !istrue;}
            }else if(s.charAt(i)=='}'){
                if(st.pop()=='}'){
                    continue;
                }else{return !istrue;}
            }else if(s.charAt(i)==']'){
                if(st.pop()==']'){
                    continue;
                }else{return !istrue;}
                
            }
        }

        return istrue;
    }
    public static void coinChange(int arr[] ,int target){

    }
    
    public static void main(String[] args) {
        String s= "([]])";
        System.out.println("isValid: "+Leetcode20(s));
    }
}
