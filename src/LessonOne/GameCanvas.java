package LessonOne;

import javax.swing.*;
import java.awt.*;

public class GameCanvas extends JPanel { // игровая панель где будут летать шарики

    private MainCircles controler;
    private static final int FpsSleepTime = 17; //магическое число
    long lastFrameTime;

    GameCanvas(MainCircles controler){
        this.controler = controler;

        lastFrameTime = System.nanoTime();// начальное время

    };
    @Override
    protected void paintComponent(Graphics g){ //метод для рисования
        super.paintComponent(g);

        long currentTime = System.nanoTime(); // конечное время
        float deltaTime = (currentTime - lastFrameTime)*0.000000001f; //дельта времени
        controler.onDrawFrame(this,g,deltaTime); // передаем дельту времени в метод онДроу который в Мэйне
        lastFrameTime = currentTime;
        try {     //Маческая конструкция которая будет понятна на 5 уроке. делает 60фпс
            Thread.sleep(FpsSleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        repaint(); //создали бесконечный цикл (перерисока)
    }
    public int getLeft() { return 0; }
    public int getRight() { return getWidth() - 1; }
    public int getTop() { return 0; }
    public int getBottom() { return getHeight() - 1; }
}
