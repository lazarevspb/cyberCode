package a140221;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class A {
     /*Напишите функцию strangeCase, которая принимает строку и
    возвращает ту же самую строку с буквами на четных позициях в каждом слове в
    верхнем регистре, а на нечетных - в нижнем. Индексы букв начинаются 0 (0 - четная позиция).

На входе:

s - строка, состоящая из букв и пробелов, слова разделены одним пробелом
На выходе: преобразованная строка

Пример:
strangeCase( "People are strange when you are a stranger" )
--> "PeOpLe ArE StRaNgE WhEn YoU ArE a140221.A StRaNgEr"
*/


    public static void main(String[] args) {
        System.out.println(strangeCase("People are strange when you are a stranger"));

    }

    public static String strangeCase(String s) {
        String result = "";
        StringBuilder stringBuilder = new StringBuilder();
        String[] s1 = s.split(" ");

        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s1[i].length(); j++) {
                if (j % 2 == 0) {
                    stringBuilder.append(Character.toUpperCase(s1[i].charAt(j)));
                } else {
                    stringBuilder.append(s1[i].charAt(j));
                }
            }
            stringBuilder.append(" ");
        }
        return stringBuilder.toString().trim();
    }


    @Test
    void test() {
        assertEquals("PeOpLe ArE StRaNgE WhEn YoU ArE A StRaNgEr",
                strangeCase("People are strange when you are a stranger"));

    }
}
