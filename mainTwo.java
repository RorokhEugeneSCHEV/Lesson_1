package Lesson_1;

package Lesson_1;
import java.util.Scanner;
/*
1. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple
         */
public class Aston   {
   public static void main (String[] args)    {
      printThreeWords()    {
         System.out.print("Orange");
         System.out.print("Banana ");
         System.out.print("Apple ");
      }
   }
}

        /*
2. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, 
оторыми захотите. Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0, 
то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
         */
public class Aston   {
   public static void main (String[] args)    {
     checkSumSign(){
      int a = 77;
      int b = - 206;
      int sum = a+b;
        if (sum >= 0){
            System.out.print("Сумма положительная");
        }
        else{ 
            System.out.print("Сумма отрицательная");
        }
     }
  }
}

        /*
3. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением. 
Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”, если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;
         */
public class Aston   {
   public static void main (String[] args)    {
     printColor(){
       int value = 77;
         if (value <= 0){
             System.out.print("Красный");
         }
         else if (value > 0 || value <= 0){
             System.out.print("Желтый");
         }
         else if (value > 100){ 
             System.out.print("Зеленый");
         }
     }
  }
}

        /*
4. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями,
 которыми захотите. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
         */    
public class Aston   {
   public static void main (String[] args)    {
     compareNumbers(){
         int a = 77;
         int b = - 206;
         if (a >= b){
             System.out.print("a >= b ");
         }
         else if (value > 0 || value <= 0){
             System.out.print("Желтый");
         }
         else { 
             System.out.print("a < b ");
         }
     }
  }
}

        /*
5. Напишите метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
 если да – вернуть true, в противном случае – false.
         */
public class Aston {
    public static void main(String[] args) {
        System.out.println(checkSumInRange(5, 5));   
        System.out.println(checkSumInRange(10, 10)); 
        System.out.println(checkSumInRange(5, 6));   
        System.out.println(checkSumInRange(0, 0));    
        System.out.println(checkSumInRange(10, 11)); 
    }

    public static String checkSumInRange(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20){
            return “true”;
        }
         else return “false”;
}
//ВТОРОЙ ВАРИАНТ НИЖЕ//


public class Aston {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        String result = checkSumInRange(num1, num2);
        System.out.println(result);

        scanner.close();
    }

    public static String checkSumInRange(int num1, int num2) {
        int sum = num1 + num2;
              if (sum >= 10 && sum <= 20){
                 return “true”;
              }
              else return “false”;
      }    
}

        /*
6. Напишите метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное 
ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
         */
public class Aston {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int num = scanner.nextInt();

        String result = check (num);
        System.out.println(result);

        scanner.close();
    }

    public static String check (int num) {
              if (num >= 0){
                 return “Положительное число”;
              }
              else return “Отрицательное число”;
      }    
}

        /*
7. Напишите метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, 
и вернуть false если положительное. Замечание: ноль считаем положительным числом.
         */
public class Aston {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        String result = goodLuck (num);
        System.out.println(result);

        scanner.close();
    }

    public static String goodLuck(int num) {
              if (num >= 0){
                 return “ true ”;
              }
              else return “false”;
      }    
}

        /*
8. Напишите метод, которому в качестве аргументов передается строка и число, метод должен отпечатать 
в консоль указанную строку, указанное количество раз;
         */
public class Aston {
    public static void main(String[] args) {
        System.out.println(funny(“Приветики”, 5));   
    }

    public static String funny(String a, int b) {
        for (int i =0; i<= b; i++){
        return a
	}
}

        /*
9. Напишите метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false).
 Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
         */
public class Aston {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите какой-то год (любой): ");
        int num = scanner.nextInt();

        boolean result = leapYear (num);
        System.out.println(result);

        scanner.close();
    }
    public static boolean leapYear(int num) {
              if (num %4 ||  num %400){
	if (num %100){
	break
                   }
                 return  true ;
              }
              else return false;
      }    
}

        /*
10. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
 С помощью цикла и условия заменить 0 на 1, 1 на 0;
         */      
public class ArrayExample {
    public static void main(String[] args) {
        int[]number = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i=0; i< number.length; i++){
              if(number[i]=0){
                 number[i]=1
              }
              else number[i]=0        
    }
}

        /*
11. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100;
         */
public class ArrayExample {
    public static void main(String[] args) {
        int[]number = new int[100];
        for (int i=1; i<= number.length; i++){
              number[i-1]=i) 
        }
    }
}




        /*
12. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
         */     
public class ArrayExample {
    public static void main(String[] args) {
        int[]number = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i=0; i< number.length; i++){
              if(number[i]<6){
                 number[i]= i*2
              }
        }
    }
}

        /*
13. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) 
заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы одной из 
диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], ..., [n][n];
         */
public class ArrayExample {
    public static void main(String[] args) {
        int[]number = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < 10; i++) {
              for (int j = 0; j < 10; j++) {
	        twoDimArray[i][j]=i
              }
        }
    }
}
        
        /*
14. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, 
каждая ячейка которого равна initialValue.
         */                             