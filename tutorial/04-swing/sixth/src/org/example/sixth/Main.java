package org.example.sixth;

public class Main {
    public static void main(String[] args) {
        App app = new App();
        try {
            app.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
        var finishTime = System.nanoTime();
        var duration = (finishTime - app.startTime) / 1e6;
        System.out.println("Duration: " + String.format("%.3f", duration));
    }
}
