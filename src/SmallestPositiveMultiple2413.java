public class SmallestPositiveMultiple2413 {
    public int smallestEvenMultiple(int n) {
        if(n%2==0){
            return n;
        }
        else return n*2;

    }


    public int[] runningSum(int[] nums) {
        int [] temp = new int[nums.length];
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum =sum+nums[i];
            temp[i]=sum;

        }
        return  temp;
    }
}
