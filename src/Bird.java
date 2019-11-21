import java.awt.*;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Bird {
    Scanner n = new Scanner(System.in);
    private static int num = 0;
    Random rnd = new Random(System.currentTimeMillis());
    protected Color ourcolor;
    public static int x;
    public static int y;
    public static ArrayList<Integer> SecureX = new ArrayList<>();
    public static ArrayList<Integer> SecureY = new ArrayList<>();

    public Bird() { // Конструктор, выделяет память
        num += 1;
        System.out.println("Я птица №" + num);
    }
    public void fly() { // это метод экземпляра класса , чтобы вызвать нужно схватить
        System.out.println("Я лечу!"); }
    public void sit() { System.out.println("Я сижу на веточке!"); }


    public void MainDraw(Graphics g) {
        x = rnd.nextInt(Window.width - 2*Window.D - Window.D/2) - Window.width/2 + Window.D + Window.D/2;
        y = rnd.nextInt(Window.height - 2*Window.D - Window.D/2) - Window.height/2 + Window.D + Window.D/2;
        boolean flag = false;
        if (SecureX.size() > 0) {
            while (flag == false) {
                for (int i = 0; i < SecureX.size(); i++) {
                    if ((Math.abs(x - SecureX.get(i)) < Window.D) && (Math.abs(y - SecureY.get(i)) < Window.D)) {
                        x = rnd.nextInt(Window.width - 2*Window.D - Window.D/2) - Window.width/2 + Window.D + Window.D/2;
                        y = rnd.nextInt(Window.height - 2*Window.D - Window.D/2) - Window.height/2 + Window.D + Window.D/2;
                        i = 0; }
                    flag = true;
                } } }
        SecureX.add(x);
        SecureY.add(y);

        g.setColor(ourcolor);
        g.fillOval(x , y , Window.D, Window.D);
        if (ourcolor == Color.blue) {      // Делает пятно пенгвину
            g.setColor(Color.black);    // Не забыть, что у пингвинов цвет менятется на чёрный
            g.fillOval(x + 4, y + 4, Window.D/2, Window.D/2);
        } }

        public void Frame(Graphics g, int x, int y){
            g.setColor(ourcolor);
            FrameAroundBirds Frame = new FrameAroundBirds();
            Frame.FrameAroundBirds(x, y, ourcolor);
        }
}