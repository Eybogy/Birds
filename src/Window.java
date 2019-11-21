import org.w3c.dom.ls.LSOutput;
import javax.swing.*;   // Библиотека для создания графического интерфейса
import java.awt.*;
import java.awt.print.PageFormat;
import java.util.Scanner;

public class Window extends JFrame {    // JFrame - специальный класс для графики
    private Flock f;
    Scanner n = new Scanner(System.in);
    static int height;
    static int width;
    static int D;       // Длина для птиц

    public Window(Flock f) {
        System.out.println("Введите высоту и ширину окна");
        height = n.nextInt();
        width = n.nextInt();
        System.out.println("Введите длину птицы");
        D = n.nextInt();
        this.f = f;
        this.setSize(width, height);        // устанавливает размер окна
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // Закрыте формочки
        this.setVisible(true);              // делает окошко видимым
        this.setTitle("Birds");
        this.setResizable(false);           // Нельзя менять размер окна
        this.setLocation(200,20);   // Где будет расположено окно на экране//
        }

    //@Override
    public void paint(Graphics g){
        f.DrawCycle(g);
    }}