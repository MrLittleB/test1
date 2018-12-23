package B1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class PlaneGame extends JFrame {
//Image img =GameUtil.getImage("image/Background.png"); //GameUtil是我写的一个工具类，用来导入图片
ImageIcon pic1;
public PlaneGame(){
super("图片移动");
setLocation(400,100);
setSize(600,600);
setBackground(Color.black);
setVisible(true);
new GameThread().start();
setDefaultCloseOperation(EXIT_ON_CLOSE);
}


public int  x=100,y=100;
@Override
public void paint(Graphics g) {
//g.drawImage(img, x, y, null);
g.drawString("Bird", x, y);
x+=10;
}

class GameThread extends Thread{
public void run(){
while(true){
repaint();
try {
Thread.sleep(400);
} catch (InterruptedException e) {
e.printStackTrace();
			}
		}
	} 
}


public static void main(String[] args) {
new PlaneGame();
}

}
