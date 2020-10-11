package LessonOne;

import java.awt.*;

public class BackGround extends Sprite{
    private final Color colorCanvas;
    private float timeSetColor;

    BackGround(){

        colorCanvas = new Color(
                (int)(Math.random()*256),
                (int)(Math.random()*256),
                (int)(Math.random()*256)
        );
        timeSetColor = (float)(100f + (Math.random()*200f));

    }
    @Override
    void update(GameCanvas canvas, float deltaTime){
            timeSetColor = timeSetColor*deltaTime;
    }

    @Override
    void render(GameCanvas canvas, Graphics g){
        //g.setColor(colorCanvas);
        canvas.setBackground(colorCanvas);
    }

}
