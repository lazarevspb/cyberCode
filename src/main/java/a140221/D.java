package a140221;

import java.util.stream.Collectors;

import static java.lang.System.out;

public class D {
 /*Даны 2 строки s1 и s2, состоящие только из букв a..z. Напишите функцию,
    которая возвращает отсортированную по алфавиту строку максимальной длины,
    содержащую неповторяющиеся буквы из s1 и s2,

            На входе:

            s1 - строка
            s2 - строка
            На выходе: строка

            Пример:

            s1 = 'abcd'
            s2 = 'cde'
            getResult( s1, s2 ) --> 'abcde'*/


    public static void main(String[] args) {
        String  s1 = "abcd";
        String  s2 = "cde";
        out.println(getResult(s1, s2));


    }

    public static String getResult(String s1, String s2) {
        String tmp = s1 + s2;


        return   tmp.chars()
                .distinct()
                .sorted()
                .mapToObj(c -> (char) c)
                .map(Object::toString)
                .collect(Collectors.joining());
    }

}
