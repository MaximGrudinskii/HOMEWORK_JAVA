package HW3;

// 2. Пусть дан произвольный список целых чисел, удалить из него чётные числа.


import java.util.ArrayList;


public class Zadanie2 {
 public static void main(String[] args) {

 ArrayList<Integer> nums= new ArrayList<>();


 for(int i = 0; i < 10; i++){
 nums.add((int)(Math.random()*100));
        }
 System.out.println(nums);

 for(int i = nums.size()-1; i >= 0; i--){
 if (i%2 != 0){
 nums.remove(i);
        }
    }
    System.out.println(nums);
}
}