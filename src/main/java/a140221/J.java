package a140221;

public class J {
        /*Вам дано начало start и конец end промежутка (включая концы). Напишите функцию,
    которая возвращает количество чисел в этом промежутке, в которых нет цифры 4.

На входе:

start - целое число
end - целое число
На выходе: число

Пример:

getResult( 3, 7 )--> 4
3, 5, 6, 7*/


    public static void main(String[] args) {
//        System.out.println(getResult(3, 7));
//        System.out.println(getResult(7, 18));
//        System.out.println(getResult(3, 14));
        System.out.println(getResult(-10, 0));


//        System.out.println((0 + "").contains("4"));

//        System.out.println(54 % 10);

    }

    public static int getResult(int start, int end) {
        int result = 0;
        if (end < start) return 0;
        if(start <= 4 || end <= 4) {
            for (int i = start; i <= end; i++) {
                if (!((i + "").contains("4"))) {
                    result++;
                }
            }

            return result;
            // Write your code here...
        } else {

            for (int i = start; i <= end; i++) {
                result++;
            }

            return result-1;
        }
    }




}
