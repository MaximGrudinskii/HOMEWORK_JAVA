package HW2;
// 2. Дана строка (получение через обычный текстовый файл!!!)
// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"
// Написать метод(ы), который распарсит строку и, используя StringBuilder, 
// создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода в консоль:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

// import java.io.*;

// public class Zadanie2 {
//     public static void main(String[] args) throws Exception {
//         String [] arrayData =  lib.ReadLineFromFile("Zadanie2.txt");
//         for(int i = 0; i < arrayData.length; i++) {
//             System.out.println(PrintLine(arrayData[i]));
//         }
//     }
//     public static StringBuilder PrintLine(String line) {
//         String line1 = line.replace("{", "");
//         String line2 = line1.replace("}", "");
//         String line3 = line2.replaceAll("\"", "");
//         String line4 = line3.replace("[", "");
//         String line5 = line4.replace("]", "");
//         StringBuilder result = new StringBuilder("");
//         String [] arrayData = line5.split(",");
//         String [] listName = {"Студент ", " получил ", " по предмету "};
//         for (int i =0; i < arrayData.length; i++) {
//             String[] arrData = arrayData[i].split(":");
//             result.append(listName[i]);
//             result.append(arrData[1]);
//             }
//         return result;
//     }
// }

import java.io.File;

import java.io.FileNotFoundException;

import java.util.Scanner;



public class Zadanie2 {

    public static void main(String[] args) {

        File file = new File("Zadanie2.txt");

        Scanner scanner = null;

        try {

            scanner = new Scanner(file);

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        }

        while (scanner.hasNextLine()) {

            String line = scanner.nextLine();

            String[] fields = line.split(",");

            String surname = fields[0].replaceAll("", "").substring(9);

            String grade = fields[1].replaceAll("", "").substring(8);

            String subject = fields[2].replaceAll("", "").substring(10);

            StringBuilder sb = new StringBuilder();

            sb.append("Студент ").append(surname).append(" получил ").append(grade).append(" по предмету ").append(subject).append(".");

            String result = sb.toString();

            System.out.println(result);

        }

        scanner.close();

    }

}
