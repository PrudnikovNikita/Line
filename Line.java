package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Line {


    Scanner in = new Scanner(System.in);



  private String line;


    void main (){


        System.out.print(
                "1. Ввести/обновить строку(press 1)\n" +
                "2. Узнать длину строки\n"+
                "3. Получить символ строки по его индексу\n" +
                "4. Изменить символ строки по заданному индексу\n" +
                "5. Выделить подстроку из строки\n" +
                "6. Проверить, является ли строка палиндромом\n" +
                "7. Найти, сколько разных символов латинского алфавита содержится в строке.\n");


        int point = in.nextInt();
        Operations(point);

    }

    void Palindrom(String Point){


        int y = Point.length() - 1;
        int x = 0;


        while (x < y){

            if (Point.charAt(x) != Point.charAt(y)) {
                System.out.print("Строка не является палиндромом");
                break;
            }

            x++; y--;

            if (x >= y)
                System.out.print("Строка является палиндромом");
        }
    }

    void Unique(String line){
        String[] wordsArray = line.split("");
        Arrays.sort(wordsArray);

        int k = 0;
        String newLine = "";


        for (int i = 0; i < line.length(); i++)
            newLine += wordsArray[i];


        for (int i = 0; i < line.length(); i++)
            if (i + 1 < line.length()) {
                if (i == 0)
                    k = 1;
                if (newLine.charAt(i) != newLine.charAt(i + 1))
                    k++;
            }


        System.out.print("Уникальных букв в слове: " + k);
    }

    void Operations (int point){


        switch (point){

            case 1:
                System.out.println("Введите строку: ");
                line = in.next();
                break;

            case 2:
                System.out.print("Длина строки: " + this.line.length() + "\n");
                break;
                
            case 3:
                System.out.print("Введите индекс: " );
                int index = in.nextInt();
                System.out.print("\nПод индексом " + index + " находится символ: " + this.line.charAt(index) + "\n");
                break;
                
            case 4:
                System.out.print("Введите индекс: " );
                index = in.nextInt();
                System.out.print("\nВведите символ: " );
                char simvol = in.next().charAt(0);
                this.line.replace(this.line.charAt(index), simvol);
                break;
                
            case 5:
                System.out.println("Потом добавлю метод :)");
                
            case 6:
                Palindrom(line);
                break;
                
            case 7:
                Unique(line);
                
            main();
              
        }
    }
}
