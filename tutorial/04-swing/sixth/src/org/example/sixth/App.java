package org.example.sixth;

import javax.swing.*;

public class App implements Runnable {

    long startTime = System.nanoTime();

    @Override
    public void run() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }
        System.out.println("Hello, World!");
        var s = "Atari";
        JFrame f = new JFrame("Button Example");
        JButton b = new JButton("Click Here");
        b.setBounds(50, 100, 95, 30);
        f.add(b);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
