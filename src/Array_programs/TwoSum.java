package Array_programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int target = 23;

        int[]arr = {10,2,3,13,4,34};

         System.out.println(Arrays.toString(twosum(arr,target)));
    }


    public static int[] twosum(int[]arr, int target){

        HashMap<Integer,Integer>map= new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int compliment = target-arr[i];

            if(map.containsKey(compliment)){
                return new int[]{map.get(compliment),i};
            }
            else{
                map.put(arr[i],i);
            }
        }
        return new int[]{};
    }
}
