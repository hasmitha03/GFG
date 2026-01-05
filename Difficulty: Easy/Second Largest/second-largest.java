class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n = arr.length;
 if(arr.length<2)return -1;
 Arrays.sort(arr);

 for(int i =n-2;i>=0;i--){
if(arr[i]!=arr[n-1]) return arr[i];
 }
return -1;
    }
}