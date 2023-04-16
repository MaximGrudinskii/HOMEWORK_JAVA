package HW2;

// 3*дополнительно. К калькулятору из предыдущего дз добавить логирование.
// 1 + 3 = 4
// 4 + 3 = 7

import java.io.FileWriter;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int number_1 = sc.nextInt();

        System.out.print("Введите операцию действия калькулятора(+, -, *, /): ");
        String operator = sc.next();

        System.out.print("Введите второе число: ");
        int number_2 = sc.nextInt();
        sc.close();
        int result = 0;
        switch (operator) {
            case "+":
                result = number_1 + number_2;
                System.out.printf("%d + %d = %d", number_1, number_2, result);
                break;
            case "-":
                result = number_1 - number_2;
                System.out.printf("%d - %d = %d", number_1, number_2, result);
                break;
            case "/":
                result = number_1 / number_2;
                System.out.printf("%d / %d = %d", number_1, number_2, result);
                break;
            case "*":
                result = number_1 * number_2;
                System.out.printf("%d * %d = %d", number_1, number_2, result);
                break;
            default:
                System.out.println("Что - то ввели неправильное!)");
                break;
        }
        
        StringBuilder newTask = new StringBuilder();
        newTask.append(number_1).append(operator).append(number_2).append("=").append(result).append("\n");

        try {
            FileWriter fw = new FileWriter("log_task3.txt", true);
            fw.write(newTask.toString());
            fw.close();
        } catch (Exception e) {
            System.out.println("ERROR!");
        }  
    }
}