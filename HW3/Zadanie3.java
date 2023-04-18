package HW3;

import java.util.ArrayList;

import java.util.Collections;


public class Zadanie3 {
 public static void main(String[] args) {

 ArrayList<Integer> nums= new ArrayList<>();


 for(int i = 0; i < 10; i++){
 nums.add((int)(Math.random()*100));
        }

 System.out.println(nums);

 int min = Collections.min(nums);
 int max = Collections.max(nums);
 int average = nums.get(nums.size()/2);
    
 System.out.println("min = " + min);
 System.out.println("max = " + max);
 System.out.println("average = " + average);
}
}