import java.util.Scanner;

public class numssum53 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));

    }
    public static int maxSubArray(int[] nums){
//        int ans=Integer.MIN_VALUE;
//        int sum=0;
//        for(int i=0;i<nums.length;i++){
//            sum+=nums[i];
//            ans=Math.max(ans,sum);
//            if(sum<0){
//                sum=0;
//            }
//        }
//        return ans;
        int presum=0;
        int ans=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            presum=Math.max(nums[i],presum+nums[i]);
            ans=Math.max(ans,presum);
        }
        return ans;
    }
}
