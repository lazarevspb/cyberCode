package a140221;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class H {
    /*
    Компания из N дворфов решила сплавиться по реке в бочках из-под вина до ближайшей таверны.
    i-й дворф имеет массу dwarfs[i]. Бочки могут выдержать массу не более limit.
Каждая бочка вмещает не более 2 дворфов при условии что их суммарная масса не превышает limit.
Напишите функцию, определяющую минимальное количество бочек, которое потребуется опустошить,
чтобы дворфы смогли продолжить веселье в таверне.

На входе:

dwarfs - массив дворфов, каждое значение определяет массу дворфа
limit - максимальная масса, которую выдержит бочка
Примечание: масса каждого дворфа меньше или равна limit
На выходе: целое число - минимальное количество бочек
Примечание: 1 <= dwarfs[i] <= limit  */

    public static void main(String[] args) {
        System.out.println(getNumberOfBoats(Arrays.asList(3, 2, 2, 1), 3));
        System.out.println(getNumberOfBoats(Arrays.asList(1, 2), 3));

    }


    public static int getNumberOfBoats(List<Integer> dwarfs, int limit) {
        int result = 0;

        List<Integer> dwarfsCopy = new ArrayList<>(dwarfs);
//        while (!(dwarfsCopy.size() == 1))    {
        for (int i = 0; i < dwarfsCopy.size(); i++) {

            if (dwarfsCopy.get(i) == limit) {
                int dwarfi = dwarfsCopy.get(i);
                dwarfsCopy.set(i, 0);
                result++;
            } else {

                for (int j = i; j < dwarfsCopy.size(); j++) {
                    if(i != j) {
                        int dwarfi = dwarfsCopy.get(i);
                        int dwarfj = dwarfsCopy.get(j);
                        if (dwarfi + dwarfj <= limit) {
                            dwarfsCopy.set(i, 0);
                            dwarfsCopy.set(j, 0);

                            result++;
                        }
                    }
                }
//                    }

            }

        }
//        }
//        System.out.println(dwarfsCopy);
        return result;


        // Напишите ваш код здесь...
    }
}
