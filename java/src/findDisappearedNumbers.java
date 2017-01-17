import java.util.ArrayList;
import java.util.List;

//Find All Numbers Disappeared in an Array
public class findDisappearedNumbers {

  public List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> result = new ArrayList<Integer>();
    if (nums == null || nums.length == 0) return result;
    int p = 0;
    int i = 0;
    while (i < nums.length) {
      if (nums[i] != i + 1 && nums[nums[i] - 1] != nums[i]) {
        p = nums[nums[i] - 1];
        nums[nums[i] - 1] = nums[i];
        nums[i] = p;
        // System.out.println(" " + (nums[i]-1) + "," + nums[nums[i]-1]);
      } else {
        i++;
      }
    }
    for (i = 0; i < nums.length; i++) {
      if (nums[i] != i + 1) {
        result.add(i + 1);
      }
    }
    return result;
  }
}
