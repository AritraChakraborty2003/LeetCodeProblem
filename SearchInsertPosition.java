package LeetCodeProblems;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {

        int res=BinSearch(nums,0,nums.length-1,target);
        return res;

    }
    public static int BinSearch(int[] arr,int l,int h,int target)
    {

        if(h>=l){

            int mid=(l+h)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                return BinSearch(arr,l,mid-1,target);
            }
            else if(arr[mid]<target){

                return BinSearch(arr,mid+1,h,target);
            }
        }

        return h+1;
    }
}
