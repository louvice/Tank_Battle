package tankgame;

import javax.swing.*;
import java.awt.*;

/**
 * @author ZhouHeng
 **/
public class MyPanel extends JPanel {
    Hero hero = null;
    public MyPanel(){
        hero = new Hero(100, 100);
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.fillRect(0,0, 1000, 750);

        drawTank(hero.getX(), hero.getY(), g, 0, 0);
        drawTank(hero.getX() + 600, hero.getY() + 60, g, 0, 1);
    }

    public void drawTank(int x, int y, Graphics g, int direct, int type){

        //设置坦克颜色
        switch (type){
            case 0:
                g.setColor(Color.cyan);
                break;
            case 1:
                g.setColor(Color.yellow);
                break;
        }

        switch (direct){
            case 0:
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y ,10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y);
                break;
            default:
                System.out.println("暂时没有处理");
        }



    }
}
