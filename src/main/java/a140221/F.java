package a140221;

import java.util.ArrayList;
import java.util.List;

public class F {

    /*Напишите функцию, которая разбивает строку на пары из двух символов.
    Если строка содержит нечетное количество символов,
    то вторым символом последний пары будет символ подчеркивания: _

На входе:

s - строка
На выходе:  - массив строк

Пример:

getResult( "asdzx" ) -> ["as", "dz", "x_"]*/


    public static void main(String[] args) {
        System.out.println(getResult("asdzxq"));
        System.out.println(getResult("asdzx"));

    }

    public static List<String> getResult(String s) {
        char[] chars = s.toCharArray();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars.length % 2 == 0) {
                if (i + 1 < chars.length) {
                    list.add(String.valueOf(chars[i]) + String.valueOf(chars[i + 1]));
                    i += 1;

                }
            } else {
                if (i + 1 < chars.length) {
                    list.add(String.valueOf(chars[i]) + String.valueOf(chars[i + 1]));
                    i += 1;
                }
                if (i == chars.length-1) {
                    list.add(String.valueOf(chars[i]) + "_");

                }
            }


        }


        return list;


    }

}
