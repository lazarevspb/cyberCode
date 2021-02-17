package a140221;

public class E {
    /*Дан треугольник последовательных нечетных чисел:

       1
      3 5
    7 9 11
  13 15 17 19
21 23 25 27 29
  ...
Напишите функцию, которая для заданного индекса строки (индекс начинается с 1)
возвращает сумму чисел в это строке.

На входе:
n - индекс строки, n > 0
На выходе: число - сумма чисел строки
Пример:
getResult( 2 ) --> 8*/




    public static void main(String[] args) {
//        System.out.println(getResult(2));
        System.out.println(getResult(3));
    }

    public static int getResult(int n) {

        int first_number_of_the_previous_line = (n - 1) * n / 2;
        int first_target_line_number = first_number_of_the_previous_line * 2 + 1;
        int last_target_line_number = first_target_line_number + 2 * (n - 1);

        // sum of arithmetic sequence again...
        return n * (first_target_line_number + last_target_line_number) / 2;


        // Write your code here...
    }

}



