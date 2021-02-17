package a140221;

public class B {
/*Изограмма - это слово, которое не имеет повторяющихся букв. Напишите функцию, которая определяет,
является ли строка, содержащая только буквы, изограммой.
Примечание:
будем считать, что пустая строка является изограммой.
регистр букв не должен учитываться
На входе:
s - строка
На выходе: true или false

Пример:

isIsogram( "AbCd" ) --> true
isIsogram( "AabCd" ) --> false*/


    public static void main(String[] args) {
        System.out.println(isIsogram("AbCd"));
        System.out.println(isIsogram("AabCd"));
    }

    public static boolean isIsogram(String s) {
        s = s.toLowerCase();

        int i = (int) s.chars()
                .distinct().count();

        if (s.length() == i) return true;



        return false;

        // Write your code here...
    }


}


