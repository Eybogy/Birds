import java.awt.*;

public class FrameAroundBirds {
    int M, P, S = 0;
    static int[] Macaw = new int[4];       // Чётные - х, не чётные - у. Начало отчёта идёт с части 1 (где и Х, и У положительные)
    static int[] Penguin = new int[8];
    static int[] Sparrow = new int[8];

    public void FrameAroundBirds(int x, int y, Color ourcolor){
        if (ourcolor == Color.green) {
            if (x > Macaw[0]) {                // Максимальный Х
                Macaw[0] = x;
            } else if (x < Macaw[2]) {         // Минимальный Х
                Macaw[2] = x; }
            if (y > Macaw[1]) {                // Максимальный У
                Macaw[1] = y;
            }  else if (y < Macaw[3]) {        // Минимальный У
                Macaw[3] = y; }
        } else if (ourcolor == Color.blue) {
            if (x > Penguin[0]) {                // Максимальный Х
                Penguin[0] = x;
            } else if (x < Penguin[2]) {         // Минимальный Х
                Penguin[2] = x; }
            if (y > Penguin[1]) {                // Максимальный У
                Penguin[1] = y;
            }  else if (y < Penguin[3]) {        // Минимальный У
                Penguin[3] = y; }
        } else if (ourcolor == Color.red) {
            if (x > Sparrow[0]) {                // Максимальный Х
                Sparrow[0] = x;
            } else if (x < Sparrow[2]) {         // Минимальный Х
                Sparrow[2] = x; }
            if (y > Sparrow[1]) {                // Максимальный У
                Sparrow[1] = y;
            }  else if (y < Sparrow[3]) {        // Минимальный У
                Sparrow[3] = y; }
        }
    }

    public void MixingAndDraw(Graphics g){
        for (int i = 0; i < 4; i++) {
            if (Macaw[i] != 0){
                M++; }
            if (Penguin[i] != 0){
                P++; }
            if (Sparrow[i] != 0){
                S++; }}


        if (M>0) {
            g.setColor(Color.green);
            g.drawLine(Macaw[0] + Window.D, Macaw[1] + Window.D, Macaw[2], Macaw[1] + Window.D);
            g.drawLine(Macaw[2], Macaw[1] + Window.D, Macaw[2], Macaw[3]);
            g.drawLine(Macaw[2], Macaw[3], Macaw[0] + Window.D, Macaw[3]);
            g.drawLine(Macaw[0] + Window.D, Macaw[3], Macaw[0] + Window.D, Macaw[1] + Window.D);
        }

        if (P>0) {
            g.setColor(Color.blue);
            g.drawLine(Penguin[0] + Window.D, Penguin[1] + Window.D, Penguin[2], Penguin[1] + Window.D);
            g.drawLine(Penguin[2], Penguin[1] + Window.D, Penguin[2], Penguin[3]);
            g.drawLine(Penguin[2], Penguin[3], Penguin[0] + Window.D, Penguin[3]);
            g.drawLine(Penguin[0] + Window.D, Penguin[3], Penguin[0] + Window.D, Penguin[1] + Window.D);
        }

        if (S>0) {
            g.setColor(Color.red);
            g.drawLine(Sparrow[0] + Window.D, Sparrow[1] + Window.D, Sparrow[2], Sparrow[1] + Window.D);
            g.drawLine(Sparrow[2], Sparrow[1] + Window.D, Sparrow[2], Sparrow[3]);
            g.drawLine(Sparrow[2], Sparrow[3], Sparrow[0] + Window.D, Sparrow[3]);
            g.drawLine(Sparrow[0] + Window.D, Sparrow[3], Sparrow[0] + Window.D, Sparrow[1] + Window.D);
        }
    }
}