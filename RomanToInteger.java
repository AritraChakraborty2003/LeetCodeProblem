package LeetCodeProblems;

import java.util.HashMap;

public class RomanToInteger {
    public static int romanToInt(String x){
        HashMap<Character, Integer> value_map = new HashMap<>();
        value_map.put('I', 1);
        value_map.put('V', 5);
        value_map.put('X', 10);
        value_map.put('L', 50);
        value_map.put('C', 100);
        value_map.put('D', 500);
        value_map.put('M', 1000);

        int length = x.length();
        int sum = 0;

        for(int i=0;i<x.length();i++){

            if(i<length-1 && value_map.get(x.charAt(i))<value_map.get(x.charAt(i+1))){

                sum+=value_map.get(x.charAt(i+1))-value_map.get(x.charAt(i));
                i++;


            }

            else{
                sum+=value_map.get(x.charAt(i));


            }
        }
        return sum;
    }
}
