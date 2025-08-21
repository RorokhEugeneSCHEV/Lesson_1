public class Main {
    public static void main(String[] args) {
        printThreeWords();//задание 1
        checkSumSign();//Задание 2
        printColor();//Задание 3
        compareNumbers();//Задание 4
        System.out.println(checkSumInRange(5, 5));   //Задание 5
        System.out.println(checkSumInRange(10, 10)); //Задание 5
        System.out.println(checkSumInRange(5, 6));   //Задание 5
        System.out.println(checkSumInRange(0, 0));    //Задание 5
        System.out.println(checkSumInRange(10, 11)); //Задание 5
        System.out.println(check(5));//Задание 6
        System.out.println(goodLuck (5));   //Задание 7
        System.out.println(goodLuck (-50));   //Задание 7
        System.out.println(repeated("Приветики", 5));  //Задание 8
        System.out.println(leapYear(400));    //Задание 9
        
        //ЗАДАЧИ 10,11,12,13,14 в отдельных JAVA файлах



    }
    //Задание 1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    //Задание 2
    public static void checkSumSign() {
        System.out.println("");
        int a = 77;
        int b = -206;
        int sum = a + b;
        
        if (sum >= 0) {
            System.out.print("Сумма положительная");
        } else { 
            System.out.print("Сумма отрицательная");
        }
    }

    //Задание 3
    public static void printColor() {
        System.out.println("");
        int value = 77;
        if (value <= 0) {
            System.out.print("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.print("Желтый");
        } else if (value > 100) { 
            System.out.print("Зеленый");
        }
    }
    //Задание 4
    public static void compareNumbers() {
        System.out.println("");
        int a = 77;
        int b = -206;
        
        if (a >= b) {
            System.out.print("a >= b ");
        } else {
            System.out.print("a < b ");
        }
    }
    //Задание 5
    public static boolean checkSumInRange(int a, int b) {
        System.out.println("");
        int sum = a + b;
        if (sum >= 10 && sum <= 20){
            return true;
        }
         else return false;
}
    //Задание 6
    public static String check(int num) {
        System.out.println("");
              if (num >= 0){
                 return "Положительное число";
              }
              else {          
            return "Отрицательное число";
        }
}
    //Задание 7
    public static boolean goodLuck(int num) {
        System.out.println("");
              if (num >= 0){
                 return true ;
              }
              else return false;
      }    

    //Задание 8
    public static String repeated(String a, int b) {
    System.out.println("");
    String result = ""; // Инициализируем пустую строку
    for(int i = 0; i < b; i++) {
        result += a + " "; // Добавляем исходную строку a столько раз, сколько указано числом b
    }
    return result;
}
    //Задание 9
    public static boolean leapYear(int num) {
    System.out.println("");
        if (num % 4 == 0) {      
            if (num % 100 != 0 || num % 400 == 0) {   
                return true;  
            }
        }
        return false;           
    }


}
