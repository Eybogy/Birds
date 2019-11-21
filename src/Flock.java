import java.awt.*;      // Для создание Графического интерфейса
import java.util.ArrayList;     // Для создание динамического массива
import java.util.Scanner;

public class Flock{
    private ArrayList<Bird> fl = new ArrayList<>();
    public static int flag = 0;

    public void Flock() { // Метод Flock
        for (int i = 0; ; i++) {
            System.out.println("Какую птичку хотите добавить?" + '\n' + " 1 - Попугай" + '\n' + " 2 - Пингвин" + '\n' + " 3 - Воробей");
            System.out.println("Любой друго символ, если добавление завершилось");
            Scanner n = new Scanner(System.in);
            String TheBird = n.next();
            if (TheBird.equals("1")) {
                fl.add(new Macaw());
            } else if (TheBird.equals("2")) {
                fl.add(new Penguin());
            } else if (TheBird.equals("3")) {
                fl.add(new Sparrow());
            } else { break; }}}

    public void fly(){
        for (int i = 0; i < fl.size(); i++) {
            fl.get(i).fly();
    }}
    public void sit(){
        for (int i = 0; i < fl.size(); i++) {
            fl.get(i).sit();
    }}

    public void DrawCycle(Graphics g) {
        g.translate(Window.width/2, Window.height/2);       // Перемещает начало координат(Х и У) в центр
        for (int v = 0; v < fl.size(); v++) {
            fl.get(v).MainDraw(g);
            fl.get(v).Frame(g, Bird.SecureX.get(v), Bird.SecureY.get(v));       // Вызов функции Frame в Bird для проверки координат каждой птицы
        }
        FrameAroundBirds Frame = new FrameAroundBirds();
        Frame.MixingAndDraw(g);
    }
}