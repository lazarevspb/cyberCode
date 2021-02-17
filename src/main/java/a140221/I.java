package a140221;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class I {
  /*
Напишите функцию, которая переводит сообщения на зашифрованный язык,
 в котором слова образуются путем переноса первой буквы слова в конец и добавлением в конец слова букв "оп".

На входе: строка, состоящая минимум из одного слова;
все слова состоят из букв русского алфавита в нижнем регистре. Знаки пунктуации отделены пробелом.
На выходе: зашифрованная фраза с сохранением пунктуации.

Пример:

encode("эй , какая крутая фича !") --> "йэоп , акаякоп рутаякоп ичафоп !"*/

    public static void main(String[] args) {
        System.out.println(encode("эй , какая крутая фича !"));
//        System.out.println(Arrays.toString("эй , какая крутая фича !".split(" ")));

    }

    public static String encode(String text) {


        return Arrays.stream(text.split(" "))
//              .filter(s -> s.length() > 1)
                .map(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        if (s.length() > 1) {

                            return s.substring(1) + s.charAt(0);
                        }
                        return s;
                    }
                })
                .map(s -> {
                    if (s.length() > 1) {

                        return s + "оп";
                    }
                    return s;
                })
                .collect(Collectors.joining(" "));

        // Напишите ваш код здесь...
    }
}
