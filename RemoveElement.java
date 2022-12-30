package LeetCodeProblems;
import java.util.ArrayList;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {

        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int  i=0;i<nums.length;i++){
            if(nums[i]!=val){
                arr.add(nums[i]);
            }
        }

        for(int j=0;j<nums.length;j++){
            if(j<arr.size())
                nums[j]=arr.get(j);
            else
                nums[j]=0;
        }

        return arr.size();
    }
}
