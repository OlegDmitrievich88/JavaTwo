package LessonOne;

import java.awt.*;

public class Ball extends Sprite{
    private final Color color; //цвет шара
    //скорость по х и у шара
    private float vX;
    private float vY;

    Ball() {
        halfHeight = 20 +(float)(Math.random()*50f);// рандомные размеры шаров
         halfWidth = halfHeight;
        color = new Color(  //рандомные цвета шаров
                (int)(Math.random()*255),
                (int)(Math.random()*255),
                (int)(Math.random()*255)
        );
        //рандомная скорость шаров по оси х и у
        vX = (float)(100f + (Math.random()*200f));
        vY = (float)(100f + (Math.random()*200f));
    }
    @Override // переопределяет метод из спрайта и заставляет двигаться шары меняя их координаты
    void update(GameCanvas canvas, float deltaTime) {
        x += vX * deltaTime;//S = vt; к текущим координатам прибавляем скорость по х на дельту времени
        y += vY * deltaTime;//к текущим координатам прибавляем скорость по у на дельту времени

        //останавливаем и изменяем направление шарика
        if (getLeft() < canvas.getLeft()) {
            setLeft(canvas.getLeft());
            vX = -vX;
        }
        if (getRight() > canvas.getRight()) {
            setRight(canvas.getRight());
            vX = -vX;
        }
        if (getTop() < canvas.getTop()) {
            setTop(canvas.getTop());
            vY = -vY;
        }
        if (getBottom() > canvas.getBottom()) {
            setBottom(canvas.getBottom());
            vY = -vY;
        }
    }
    //отрисовываем шары полсе апдейта
    @Override
    void render(GameCanvas canvas, Graphics g){
        g.setColor(color); //цвет шара
        g.fillOval((int)getLeft(),(int)getTop(), //отрисовываем шар
                (int)getWidth(),(int)getHeight());
    }

}
