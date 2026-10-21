class Solution {
    public void rotate(int[] nums, int k) {
        int size=nums.length;
         k=k%size;
        int n[]=new int[size];
        for(int i=0;i<size;i++)
        {
            n[(i+k)%size]=nums[i];
        }
        for(int i=0;i<size;i++)
        {
            nums[i]=n[i];
        }
        
    }
}