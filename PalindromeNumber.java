package LeetCodeProblems;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {

        int size=countOfDigits(x);
        int x_res=x;
        int val=0;
        while(x_res>0){
            int rem=x_res%10;
            val+=rem*(int) Math.pow(10,size-1);
            size--;
            x_res=x_res/10;
        }

        if(val==x)
            return true;
        return false;
    }

    public static int countOfDigits(int n){

        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }
}
