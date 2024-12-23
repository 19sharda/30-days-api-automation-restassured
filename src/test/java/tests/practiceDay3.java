package tests;

import javax.swing.*;
import java.awt.*;

public class practiceDay3 extends JPanel {
    private String[] methods = {"GET", "POST", "PUT", "PATCH", "DELETE"};
    private String[] explanations = {
            "GET: Customer asks waiter for the menu (data).",
            "POST: Customer places a new order (creates new data).",
            "PUT: Customer asks to update their existing order.",
            "PATCH: Customer requests a minor change to their order.",
            "DELETE: Customer cancels their order."
    };
    private int step = 0;

    public practiceDay3() {
        Timer timer = new Timer(3000, e -> {
            step = (step + 1) % methods.length; // Move to next HTTP method
            repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        // Background
        g2.setColor(new Color(240, 240, 240));
        g2.fillRect(0, 0, getWidth(), getHeight());

        // Title
        g2.setColor(Color.BLACK);
        g2.setFont(new Font("Arial", Font.BOLD, 15));
        g2.drawString("HTTP Requests in a Restaurant Analogy", 50, 30);

        // Labels: Customer, Waiter, Chef
        g2.setFont(new Font("Arial", Font.BOLD, 12));
        g2.setColor(Color.BLUE);
        g2.drawString("Customer", 100, 120);
        g2.setColor(Color.ORANGE);
        g2.drawString("Waiter", 280, 120);
        g2.setColor(Color.GREEN);
        g2.drawString("Chef", 450, 120);

        // Draw Customer
        g2.setColor(Color.BLUE);
        g2.fillOval(100, 140, 50, 50); // Customer's head
        g2.drawString("🙂", 115, 175);

        // Draw Waiter
        g2.setColor(Color.ORANGE);
        g2.fillOval(280, 140, 50, 50); // Waiter's head
        g2.drawString("🤵", 295, 175);

        // Draw Chef
        g2.setColor(Color.GREEN);
        g2.fillOval(450, 140, 50, 50); // Chef's head
        g2.drawString("👨‍🍳", 465, 175);

        // Highlight arrows based on current HTTP method
        g2.setStroke(new BasicStroke(2)); // Set thicker lines for arrows
        switch (methods[step]) {
            case "GET":
                drawArrow(g2, 150, 160, 280, 160, Color.BLUE, "Request");
                drawArrow(g2, 280, 180, 150, 180, Color.RED, "Deliver Response");
                break;
            case "POST":
                drawArrow(g2, 150, 160, 280, 160, Color.BLUE, "Request");
                drawArrow(g2, 330, 160, 450, 160, Color.BLUE, "Forward Request");
                drawArrow(g2, 450, 180, 330, 180, Color.RED, "Response");
                break;
            case "PUT":
                drawArrow(g2, 150, 160, 280, 160, Color.BLUE, "Request");
                drawArrow(g2, 330, 160, 450, 160, Color.ORANGE, "Forward Request");
                drawArrow(g2, 450, 180, 330, 180, Color.RED, "Response");
                drawArrow(g2, 280, 180, 150, 180, Color.RED, "Deliver Response");
                break;
            case "PATCH":
                drawArrow(g2, 150, 160, 280, 160, Color.MAGENTA, "Request");
                drawArrow(g2, 330, 160, 450, 160, Color.MAGENTA, "Forward Request");
                drawArrow(g2, 450, 180, 330, 180, Color.RED, "Response");
                break;
            case "DELETE":
                drawArrow(g2, 150, 160, 280, 160, Color.RED, "Cancel Request");
                break;
        }

        // Current Method
        g2.setFont(new Font("Arial", Font.BOLD, 18));
        g2.setColor(Color.BLACK);
        g2.drawString("Current Method: " + methods[step], 50, 250);

        // Explanation
        g2.setFont(new Font("Arial", Font.PLAIN, 16));
        g2.setColor(Color.DARK_GRAY);
        g2.drawString(explanations[step], 50, 300);
    }

    private void drawArrow(Graphics2D g2, int x1, int y1, int x2, int y2, Color color, String label) {
        g2.setColor(color);
        g2.drawLine(x1, y1, x2, y2); // Draw line
        g2.drawString(label, (x1 + x2) / 2 - 20, (y1 + y2) / 2 - 10); // Draw label
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("HTTP Request Restaurant Animation");
        practiceDay3 animation = new practiceDay3();

        // Configure the frame
        frame.add(animation);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
