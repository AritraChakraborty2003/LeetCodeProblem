package LeetCodeProblems;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        Set<Integer> set=new TreeSet<Integer>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        Object arr[]=set.toArray();
        for(int i=0;i<nums.length;i++){
            if(i<arr.length){
                nums[i]=(int) arr[i];
            }
            else{
                nums[i]=0;
            }
        }
        return arr.length;
    }

}
