class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int n = arr.length;
        ArrayList<Integer>ans=new ArrayList<>();
        int mx=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
         for(int i=0;i<n;i++){
        mx=Math.max(mx,arr[i]);
        min=Math.min(min,arr[i]);
    }
    ans.add(min);
    ans.add(mx);
    return ans;
    }
}
