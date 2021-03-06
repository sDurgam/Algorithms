public class MoveZeros{

public void moveZeroes(int[] nums) {
        if(nums == null || nums.length == 0) return;
        int q = -1;
        int temp;
        for(int i = 0; i < nums.length && q < nums.length; i++){
            if(nums[i] == 0){
                 if(q == -1){
                     q = i;
                 }
            }
            else if(q != -1 && nums[i] != 0){
                temp = nums[i];
                nums[i] = nums[q];
                nums[q] = temp;
                q++;
            }
        }
    }
  }
