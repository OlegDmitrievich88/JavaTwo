package LessonOne;

import javax.swing.*;
import java.awt.*;

public class MainCircles extends JFrame { //Всем управляет
    private static final int posX = 400;
    private static final int posY = 200;
    private static final int sizeX = 800;
    private static final int sizeY = 600;

    Sprite sprite[] = new Sprite[10]; //массив из шариков

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() { //правильно вызывает конструктор окна
            @Override
            public void run() {
                new MainCircles();
            }
        });
    }

    private MainCircles(){ //конструктор окна
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// закрывает окно
        setBounds(posX,posY,sizeX,sizeY); //координаты и размеры поля
        GameCanvas canvas = new GameCanvas(this); // ссылка на ГеймКонву
        add(canvas);
        BackGround backGround = new BackGround();
        initAplication();
        setTitle("Circle"); //название окна
        setVisible(true); //видимость окна
    }







    private void initAplication(){
        for (int i = 0;i<sprite.length; i++){
            sprite[i] = new Ball();
        }
    }

    public void onDrawFrame(GameCanvas canvas,Graphics g,float deltaTime){ // метод который реагирует на отрисовку поля(контроль)

        update(canvas,deltaTime);//обновление
        render(canvas, g);//отрисовка
    }

    private void update(GameCanvas canvas, float deltaTime){
        for (int i = 0; i<sprite.length; i++){
            sprite[i].update(canvas,deltaTime);
        }
    }

    private void render(GameCanvas canvas, Graphics g){
        for (int i = 0; i<sprite.length; i++){
            sprite[i].render(canvas, g);
        }
    }

}
