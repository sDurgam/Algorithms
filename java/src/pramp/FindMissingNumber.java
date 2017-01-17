package pramp;

/**
 * Created by root on 1/17/17.
 */
public class FindMissingNumber {

    public static void main(String[] args){
        int[] nums = {1,2,3,4,8,6};
        System.out.println(FindMissingNumber(nums));
    }

    public static Integer FindMissingNumber(int[] nums){
        if(nums == null || nums.length == 0) return null;
        Integer missingNum =  -1;
        int min = nums[0];
        int max = nums[0];
        for(int i =1; i < nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }
            if(nums[i] > max){
                max = nums[i];
            }
        }
        if(max - min < nums.length){
            return min-1;
        }
        int n = max-min+1;
        long sum1 = (n * (n + 1))/2;
        min = min-1;
        long sum2 = 0l;
        for(int i =0; i < nums.length; i++){
            sum2 += (nums[i] - min);
        }
        missingNum = (int)(sum1-sum2);
        if(missingNum > max + 1) {
            missingNum = 0;
        }
        return missingNum;
    }
}
