package com.company;

import java.awt.*;
import java.time.Duration;
import java.time.Instant;
import javax.swing.*;

public class Main {

    public static void main(String[] arguments) {

        Color [] colors = {Color.red, Color.black, Color.cyan, Color.DARK_GRAY, Color.YELLOW, Color.white};

        // create a basic JFrame
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame1 = new JFrame("JFrame Rectangle Example");
        frame1.setSize(300,200);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add panel to main frame1
        Instant start = Instant.now();

        for(int i=0; i<1000; i++) {
            Rectangle panel = new Rectangle((int)Math.random()%500, (int)Math.random()%500);
            frame1.add(panel);
        }


        Instant end = Instant.now();

        System.out.println("Without FlyWeight time: "+ Duration.between(start, end).toMillis()+" Milliseconds");



        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame2 = new JFrame("JFrame Rectangle Example");
        frame1.setSize(500,500);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add panel to main frame1


        FlyWeightFactory flyWeightFactory = new FlyWeightFactory(500,500);
        start = Instant.now();

        for(int i=0; i<1000; i++) {
            Rectangle panel = flyWeightFactory.getRectangle((int)Math.random()%4*100, (int)Math.random()%4*100, colors[(int)Math.random()%colors.length]);
            frame2.add(panel);
        }


        end = Instant.now();

        System.out.println("With FlyWeight time: "+ Duration.between(start, end).toMillis()+" Milliseconds");

        frame2.setVisible(true);

    }
}

