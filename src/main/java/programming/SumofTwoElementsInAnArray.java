package programming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Check if there exist two elements in an array whose sum is equal to the sum of rest of the array
 */

public class SumofTwoElementsInAnArray {
    public static void main(String[] args) {
        int [] arr ={2, 11, 5, 1, 4, 7};
        int targetSum = 9;
        getIndexOfArray(arr,targetSum);
    }
    public static void getIndexOfArray(int [] arr,int targetSum){
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int count =0;
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
            if(count >0) {
                if (map.containsKey(targetSum-arr[i])) {
                    System.out.println("Element :: "+arr[i]+" added with index :: "+i);
                    //return;
                }
            }
            list.add(i);
            count=count+1;
            System.out.println("value of count is :: "+count);

        }
        System.out.println("Map values :: "+map);
        System.out.println("list = " + list);
    }
}
