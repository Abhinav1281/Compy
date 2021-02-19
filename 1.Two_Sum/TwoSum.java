class TwoSum {
    public static int[] Sum(int[] nums, int target) {
        int f=0;int ans[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(j==i)
                    continue;
                if((nums[i]+nums[j])==target)
                {
                    f=1;
                    ans[0]=i;
                    ans[1]=j;
                    break;
                }
            }
            if(f==1)
                break;
        }
        
        return ans;
    }

    public static void main(String[] args) {
        int var[]={3,2,4};
        int tar=6;
       int ans[]=Sum(var,tar);
       System.out.println(ans[0]+","+ans[1]); 
    }
}