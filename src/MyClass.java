import java.util.ArrayList;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Date;
import javax.swing.*;
import java.awt.*;
import static java.lang.Integer.valueOf;

// Сделать Х и У в классе Point

public class MyClass {

    public static void getTime() {
        Date dateNow = new Date();
        SimpleDateFormat data1 = new SimpleDateFormat("u");     // день недели
        String str1 = data1.format(dateNow);                            // преобразуем в строчный тип
        Integer i1 = valueOf(str1);                                     // преобразует в нужный тип данный
        SimpleDateFormat data2 = new SimpleDateFormat("H");     // часы
        String str2 = data2.format(dateNow);
        Integer i2 = valueOf(str2);
        SimpleDateFormat data3 = new SimpleDateFormat("m");     // минуты
        String str3 = data3.format(dateNow);
        Integer i3 = valueOf(str3);
        if ((i1 == 7) || ((i2 == 17) && (i3 >= 40)) || (i2>=18) || (i2 < 9)) {
            System.out.println("У вас в данный момент нет пар");
        } else {
            Integer time = i2 * 60 + i3;  // все время в минутах
            Integer time1A = 9 * 60;      // начало 1 пары
            Integer time1Z = time1A + 90; // конец 1 пары
            Integer time2A = time1Z + 10; // начало 2 пары
            Integer time2Z = time2A + 90; // конец 2 пары
            Integer time3A = time2Z + 10; // начало 3 пары
            Integer time3Z = time3A + 90; // конец 3 пары
            Integer time4A = time3Z + 40; // начало 4 пары
            Integer time4Z = time4A + 90; // конец 4 пары
            Integer time5A = time4Z + 10; // начало 5 пары
            Integer time5Z = time5A + 90; // конец 5 пары
            if ((time>time1Z && time<time2A) || (time>time2Z && time<time3A) || (time>time3Z && time<time4A) || (time>time4Z && time<time5A)){
                System.out.println("Сейчас перерыв");
            } else if (time < time1Z) {
                System.out.println("Осталось " + (time1Z - time) + "(мин)");
            } else if (time < time2Z) {
                    System.out.println("Осталось " + (time2Z - time) + "(мин)");
            } else if (time < time3Z) {
                System.out.println("Осталось " + (time3Z - time) + "(мин)");
            } else if (time < time4Z) {
                System.out.println("Осталось " + (time4Z - time) + "(мин)");
            } else if (time < time5Z) {
                System.out.println("Осталось " + (time5Z - time) + "(мин)");
            }}}


    public static void main(String[] args) {
        Flock F = new Flock();      // Вызов конструктора без параметров, оператор new выделяет память для объекта f1
        Scanner n = new Scanner(System.in);
        boolean flag = true;
        while (flag == true){
        System.out.println(" 1 - Создать стаю" + '\n' + " 2 - Управлять птицами по отдельности" + "\n" + " 3 - Показать время до концаа пары");
        int choice = n.nextInt();
        if (choice==1) {
            F.Flock();
            flag = false;
        } else if(choice==2){
            System.out.println();
        } else if (choice==3){
            getTime();
        }}

        for (int j = 0; ; j++) {
            System.out.println("1 - заставить стаю лететь" + '\n' + "2 - усадить стаю на веточки" + '\n' + "3 - Нарисовать стаю");
            int choice2 = n.nextInt();
            if (choice2 == 1) {
                F.fly();
            } else if (choice2 == 2){
                F.sit();
            } else if(choice2 == 3) {
                Window w = new Window(F);       // Создание экземпляра
            } else { break; }
        }}}










// Параграф 1 и 2 по ккнижке, класс Xterm




// UML универсальный язык моделирования , для описания программного решения, условный язык
// дз найти приложение похожее на UMLet , доделать все дз про птиц
// диаграмма классов - для этого проджекта , позволяет описать структуру кода, автор языка Гради Буч