package a140221;

public class C {
       /*
Вы участвуете в разработке нового HTML редактора.
Ваша задача — добавить в редактор автодополнение тэгов.
Напишите функцию, принимающую на вход открывающий HTML тэг
и возвращающую соответствующий закрывающий.
На входе: tag - строка, открывающий тэг
На выходе: строка — закрывающий тэг
Пример:
1.
<div class='container'> --> </div>
2.
<b> --> </b>*/

    public static void main(String[] args) {
        System.out.println(getClosingTag("<div class='container'>"));
        System.out.println(getClosingTag("<p class=\"primary-text\" id=\"content\">"));
        System.out.println(getClosingTag("<b>"));

    }

    public static String getClosingTag(String tag) {
        String s = tag.split(" ")[0];
        StringBuilder sb = new StringBuilder(s);
        sb.insert(1, "/");
//        System.out.println(sb.toString());

//        s = sb.toString();
//        System.out.println(sb.length());
        if (sb.length() > 4){
            sb.insert(sb.length(), ">");

        } else if ( sb.length() >2  && sb.charAt(sb.length()-1) != '>'){
            sb.insert(sb.length(), ">");

        }
        return  sb.toString();
        // Write your code here...
    }




}
