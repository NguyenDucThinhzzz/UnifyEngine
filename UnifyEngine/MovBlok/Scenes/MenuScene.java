package MovBlok.Scenes;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

import MovBlok.Scripts.MovBlokApp;
import UnifyEngine.Scene;

public class MenuScene extends Scene{
	public MenuScene() {
		super();
	}

	@Override
	protected void Start() {
		setBackground(Color.gray);
	}

	@Override
	protected void Update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void LateUpdate() {
		// TODO Auto-generated method stub
		
	}
	
	//testing
	int WIDTH = 1, HEIGHT = 100;
	@Override
	protected void doDrawing(Graphics g) {
		int wd = MovBlokApp.GetWindow().getWidth()/2;
		int hd = MovBlokApp.GetWindow().getHeight()/2;
		g.setColor(Color.green);
		for(int i=-100;i<10000;i++) {
			g.drawOval(i+wd*0,hd-HEIGHT/2, WIDTH, HEIGHT);
		}
		WIDTH = WIDTH%100+1;
		HEIGHT = HEIGHT%100+1;
	}
	
}
