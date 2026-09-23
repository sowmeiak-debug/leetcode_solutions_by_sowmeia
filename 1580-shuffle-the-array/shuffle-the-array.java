class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=nums[i];
        }
        int k=0,l=0,p=0;
        for(int i=n;i<n*2;i++){
            arr2[k++]=nums[i];
        }
        int arr[]=new int[n*2];
        for(int i=0;i<n*2;i++){
            if(i%2==0)
            arr[i]=arr1[l++];
            else
            arr[i]=arr2[p++];
        }
        return arr;
    }
}