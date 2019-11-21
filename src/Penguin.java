import java.awt.*;

public class Penguin extends Bird {
    public Penguin() {
        ourcolor = Color.blue;
    }


    @Override                // Подсказка, что мы собираемся переопределять метод базового класса.
    public void fly() {      // Полеморфизм
        System.out.println("Я не умею летать, потому что я пингвин!");
    }}