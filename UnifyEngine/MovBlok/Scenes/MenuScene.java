package MovBlok.Scenes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import MovBlok.Scripts.ApplicationStates;
import MovBlok.Scripts.MovBlokApp;
import UnifyEngine.Scene;

public class MenuScene extends Scene{
	protected int width = MovBlokApp.GetWindow().getWidth()/2;
	protected int height = MovBlokApp.GetWindow().getHeight()/2;
	private JButton startBut = null;
	private int buttonWidth = 100;
	private int buttonHeight = 40;
	private Font mainFont = (new Font("TimesRoman",Font.BOLD,100));
	
	public MenuScene() {
		super();
	}

	@Override
	protected void Start() {

		setBackground(Color.gray);
		startBut = new JButton("Start Game");
        startBut.setFocusable(false);
		startBut.setBounds(width-buttonWidth/2, height+30, buttonWidth, buttonHeight);
		this.add(startBut);
		startBut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MovBlokApp.GetWindow().SetCurrentState(ApplicationStates.Game);
                exitScene();
            }
        });
		
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
		g.setColor(Color.RED);
		g.setFont(mainFont);
		g.drawString("MovBlok", width/2+110, height-100);
	}
	
}
