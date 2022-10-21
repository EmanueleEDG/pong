package com.edggroup.pong;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author tirocinio3
 */
public class Paddle extends Rectangle{
	
	int id;
	int yVelocity;
	int speed =100;

	public Paddle(int x,int y, int PADDLE_WIDTH, int PADDLE_HEIGHT,int id) {
		super(x,y, PADDLE_WIDTH,PADDLE_HEIGHT);
		this.id=id;
	}
	
	public void KeyPressed(KeyEvent e){
		switch (id) {
			case 1:
				if(e.getKeyCode()==KeyEvent.VK_W){
					System.out.println("Pressed W");
					setYDirection(-speed);
					move();
				}
				if(e.getKeyCode()==KeyEvent.VK_S){
					System.out.println("Pressed S");
					setYDirection(speed);
					move();
				}
				break;
				case 2:
				if(e.getKeyCode()==KeyEvent.VK_UP){
					System.out.println("Pressed UP");
					setYDirection(-speed);
					move();
				}
				if(e.getKeyCode()==KeyEvent.VK_DOWN){
					System.out.println("Pressed DOWN");
					setYDirection(speed);
					move();
				}
				break;
		}
	}
	
	public void KeyReleased(KeyEvent e){
		switch (id) {
			case 1:
				if(e.getKeyCode()==KeyEvent.VK_W){
					System.out.println("Released W");
					setYDirection(0);
					move();
				}
				if(e.getKeyCode()==KeyEvent.VK_S){
					System.out.println("Released S");
					setYDirection(0);
					move();
				}
				break;
				case 2:
				if(e.getKeyCode()==KeyEvent.VK_UP){
					System.out.println("Released UP");
					setYDirection(0);
					move();
				}
				if(e.getKeyCode()==KeyEvent.VK_DOWN){
					System.out.println("Released DOWN");
					setYDirection(0);
					move();
				}
				break;
		}
	}
	public void setYDirection(int yDirection){
		yVelocity = yDirection;
	}
	public void move(){
		y+=yVelocity;
	}
	
	public void draw(Graphics g){
		if(id==1){
			g.setColor(Color.blue);
		}
		else {
			g.setColor(Color.red);
		}
		g.fillRect(x, y, width, height);
	}
}
