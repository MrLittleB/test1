package B1;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.*;

	class Birdpaint extends JPanel{

	int x=-1000;
	int y=150;
	double time = 0;
	int ran1=0;
	Image Background= GameUtil.getImage("image/Background.png");
	Image niao1= GameUtil.getImage("image/niao1.png");
	
	public void paint(Graphics g) {
		//g.drawString("Bird",x ,y );
		g.drawImage(Background, 0, 0, null);
		g.drawImage(niao1, x, y, null);
	}

	public void run() {
		while(true) {	
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(time==0) {
			ran1 = ( int ) ( Math.random() * 100 ); 
		}
		time++;
		time = time % 1150;
		if(time>0&&time<=1150) {
	    x=(int)(time-150);
	    System.out.println(y);
		y= 150 + (int)(ran1 *  Math.sin(time/40));
		
		}
		this.repaint();
	}
  }
}
	public class Move{

	Move(){	
		
		Birdpaint move=new Birdpaint();
		JFrame jf=new JFrame("Bird");
		jf.add(move);
		jf.setLocation(200,200);
		jf.setSize(1000, 562);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		move.run();
	}

	public static void main(String[] args) {
		Move m=new Move();
	}
}
