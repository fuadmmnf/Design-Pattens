package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Duration;
import java.time.Instant;

public class FlyweightTest {
    Graphics2D g2d;
    Color [] colors = {Color.red, Color.cyan, Color.DARK_GRAY, Color.YELLOW, Color.white};


    public void withoutFlyweight()
    {
        JFrame frame1 = new JFrame("JFrame Rectangle Example");
        frame1.setBounds(100, 100, 542, 440);
        frame1.getContentPane().setLayout(null);


        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setForeground(Color.black);
        panel.setBounds(10,11, 368, 345);
        frame1.getContentPane().add(panel);

        JButton startButton = new JButton("Without Flyweight");

        startButton.setBounds(380, 11, 150, 20);
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                g2d = (Graphics2D) panel.getGraphics();

                Instant start = Instant.now();

                for(int i=0; i<10000; i++) {
                    Rectangle rect = new Rectangle(i%500, i%500);
                    rect.setColor(colors[i%colors.length]);
                    rect.draw(g2d);
                }


                Instant end = Instant.now();

                System.out.println("Without FlyWeight time: "+ Duration.between(start, end).toMillis()+" Milliseconds");
            }
        });
        frame1.getContentPane().add(startButton);
        frame1.setVisible(true);




    }
    public void withFlyweight()
    {
        JFrame frame2 = new JFrame("JFrame Flyweight Example");
        frame2.setBounds(600, 100, 542, 440);
        frame2.getContentPane().setLayout(null);


        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.WHITE);
        panel2.setForeground(Color.black);
        panel2.setBounds(10,11, 368, 345);
        frame2.getContentPane().add(panel2);

        JButton startButton2 = new JButton("With Flyweight");

        startButton2.setBounds(380, 11, 150, 20);
        startButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                g2d = (Graphics2D) panel2.getGraphics();
                FlyWeightFactory flyWeightFactory = new FlyWeightFactory(500, 500);
                Instant start = Instant.now();

                for (int i = 0; i < 10000; i++) {
                    Rectangle rect = flyWeightFactory.getRectangle(i % 500, i % 500, colors[i % colors.length]);
                    rect.draw(g2d);
                }


                Instant end = Instant.now();
                System.out.println("With FlyWeight time: " + Duration.between(start, end).toMillis() + " Milliseconds");
            }
        }
        );
        frame2.getContentPane().add(startButton2);
        frame2.setVisible(true);
    }
}
