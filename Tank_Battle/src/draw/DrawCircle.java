package draw;

import javax.swing.*;
import java.awt.*;

/**
 * @author ZhouHeng
 **/
public class DrawCircle extends JFrame{

    private MyPanel mp = null;
    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle(){//构造器
        mp = new MyPanel();//初始化面板
        this.add(mp);//把面板放在窗口内

        //设置窗口大小
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);//可以显示
    }
}

@SuppressWarnings({"all"})
//1.定以一个MyPanel，继承JPanel类
class MyPanel extends JPanel{

    @Override
    //1.Graphics对象是一个画板
    //2.Graphics g理解成一支画笔
    public void paint(Graphics g){
        super.paint(g);

//        g.drawOval(10,10,100,100);//画一个
//        g.drawLine(10,10,100,100);//画直线
//        g.setColor(Color.blue);//填充颜色
//        g.fillRect(10, 10, 10, 100);

        //获取图片
//        Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/sasuke.jpeg"));
//        g.drawImage(image, 10, 10, 400, 225, this);
        g.setColor(Color.red);
        g.setFont(new Font("隶书", Font.BOLD, 50));
        g.drawString("你好", 150, 150);
    }
}
