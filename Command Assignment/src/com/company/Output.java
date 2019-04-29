package com.company;

import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Output {
	int i;
	JFrame frame;
	JPanel panel;
	Graphics2D g2d;
	int x,y,x1,y1,r;
	double r1;
	Command command= new Command();
	Rectangle rectangle;


	Color [] colors = {Color.blue, Color.yellow, Color.red, Color.CYAN, Color.DARK_GRAY, Color.GREEN, Color.MAGENTA, Color.pink};



	public Output() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 542, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setForeground(Color.BLACK);
		panel.setBounds(10, 11, 386, 345);
		frame.getContentPane().add(panel);
		int cordinates[][]=new int[2][2];
		i=0;
		

		panel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if(i<1) {
					cordinates[i][0]=e.getX();
					cordinates[i][1]=e.getY();
					i=i+1;
					System.out.println(e.getX() + "," + e.getY());
				}
				else {
					i=0;
				}

			}
		});

		
		
		JButton btnDraw = new JButton("Draw");
		btnDraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				g2d=(Graphics2D)panel.getGraphics();
				rectangle = new Rectangle(cordinates[0][0],cordinates[0][1],10, 10, colors[(int)(Math.random()*100)%colors.length]);
				rectangle.draw(g2d);
				command.addCommand(new Draw(rectangle,g2d));
			}
		});
		btnDraw.setBounds(414, 30, 89, 23);
		frame.getContentPane().add(btnDraw);
		
		JButton btnVanish = new JButton("Vanish");
		btnVanish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rectangle.vanish(g2d);
				command.addCommand(new Vanish(rectangle,g2d));
			}
		});
		btnVanish.setBounds(414, 64, 89, 23);
		frame.getContentPane().add(btnVanish);
		
		JButton btnExpand = new JButton("Expand");
		btnExpand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rectangle.expand(g2d);
				command.addCommand(new Expand(rectangle,g2d));
			}
		});
		btnExpand.setBounds(414, 101, 89, 23);
		frame.getContentPane().add(btnExpand);
		
		JButton btnShrink = new JButton("Shrink");
		btnShrink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rectangle.shrink(g2d);
				command.addCommand(new Shrink(rectangle,g2d));
			}
		});
		btnShrink.setBounds(414, 135, 89, 23);
		frame.getContentPane().add(btnShrink);
		
		JButton btnUndo = new JButton("Undo");
		btnUndo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				command.undo();
			}
		});
		btnUndo.setBounds(414, 169, 89, 23);
		frame.getContentPane().add(btnUndo);
		
		JButton btnRedo = new JButton("Redo");
		btnRedo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				command.redo();
			}
		});
		btnRedo.setBounds(414, 203, 89, 23);
		frame.getContentPane().add(btnRedo);


		JButton btnColor = new JButton("Change Color");
		btnColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Color tempColor;
				while(rectangle.getColor() == (tempColor = colors[(int)(Math.random()*100)%colors.length]));
				rectangle.changeColor(g2d, tempColor);
				command.addCommand(new ChangeColor(rectangle,g2d, tempColor));
			}
		});
		btnColor.setBounds(414, 235, 89, 23);
		frame.getContentPane().add(btnColor);


		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.repaint();
				i=0;
			}
		});
		btnClear.setBounds(414, 275, 89, 23);
		frame.getContentPane().add(btnClear);
	}
}
