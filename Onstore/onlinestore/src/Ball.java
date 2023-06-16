import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ball extends JPanel {
    private int x = 50;  // Initial x-coordinate of the ball
    private int y = 50;  // Initial y-coordinate of the ball
    private int speedX = 2;  // Speed of the ball along the x-axis
    private int speedY = 2;  // Speed of the ball along the y-axis

    public Ball() {
        JFrame frame = new JFrame("Ball Example");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.setVisible(true);

        // Start a thread to update the ball's position
        Thread updateThread = new Thread(() -> {
            while (true) {
                update();
                repaint();  // Trigger repaint to update the ball's position
                try {
                    Thread.sleep(10);  // Delay between each update (adjust as needed)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        updateThread.start();
    }

    private void update() {
        // Update the ball's position based on the speed
        x += speedX;
        y += speedY;

        // Reverse the direction if the ball reaches the screen boundaries
        if (x <= 0 || x >= getWidth()) {
            speedX *= -1;
        }
        if (y <= 0 || y >= getHeight()) {
            speedY *= -1;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.RED);
        g2.fillOval(x, y, 50, 50);  // Draw the ball at its current position
    }

    public static void main(String[] args) {
        new Ball();
    }
}
