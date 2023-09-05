class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int a=nums[i];
            int req=target-a;
            if(!map.containsKey(req))
            {
                map.put(a,i);
            }
            else
            {
                arr[0]=map.get(req);
                arr[1]=i;
            }
        }
        return arr;
    }
}