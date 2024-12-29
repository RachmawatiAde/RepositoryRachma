import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow extends JFrame {

    private JPanel drawPanel;

    public MainWindow() {
        setTitle("Main Window");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel for buttons
        JPanel buttonPanel = new JPanel();
        JButton openButton = new JButton("Open");
        JButton closeButton = new JButton("Close");
        JButton moveButton = new JButton("Move");
        JButton displayButton = new JButton("Display");
        JButton circleButton = new JButton("Draw Circle");
        JButton rectangleButton = new JButton("Draw Rectangle");
        JButton ovalButton = new JButton("Draw Oval");

        // Add ActionListeners for buttons
        openButton.addActionListener(e -> open());
        closeButton.addActionListener(e -> close());
        moveButton.addActionListener(e -> moveWindow());
        displayButton.addActionListener(e -> display());
        circleButton.addActionListener(e -> drawCircle());
        rectangleButton.addActionListener(e -> drawRectangle());
        ovalButton.addActionListener(e -> drawOval());

        // Add buttons to the panel
        buttonPanel.add(openButton);
        buttonPanel.add(closeButton);
        buttonPanel.add(moveButton);
        buttonPanel.add(displayButton);
        buttonPanel.add(circleButton);
        buttonPanel.add(rectangleButton);
        buttonPanel.add(ovalButton);

        // Ensure buttonPanel's layout allows proper button visibility
        buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT)); // FlowLayout for better spacing

        // Panel for drawing shapes
        drawPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Custom drawing logic can be added here
            }
        };
        drawPanel.setBackground(Color.WHITE);

        // Add panels to the frame
        add(buttonPanel, BorderLayout.NORTH);
        add(drawPanel, BorderLayout.CENTER);
    }

    public void open() {
        System.out.println("Opening window...");
        setVisible(true);
    }

    public void close() {
        System.out.println("Closing window...");
        dispose();
    }

    public void moveWindow() {
        System.out.println("Moving window...");
        setLocation(100, 100); // Example of moving the window
    }

    public void display() {
        System.out.println("Displaying window...");
        // You can add custom display logic here
    }

    public void drawCircle() {
        Graphics g = drawPanel.getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(100, 100, 100, 100); // Draw a circle at (100, 100) with diameter 100
        System.out.println("Drawing Circle...");
    }

    public void drawRectangle() {
        Graphics g = drawPanel.getGraphics();
        g.setColor(Color.RED);
        g.fillRect(200, 100, 150, 100); // Draw a rectangle at (200, 100) with width 150 and height 100
        System.out.println("Drawing Rectangle...");
    }

    public void drawOval() {
        Graphics g = drawPanel.getGraphics();
        g.setColor(Color.GREEN);
        g.fillOval(300, 150, 150, 100); // Draw an oval at (300, 150) with width 150 and height 100
        System.out.println("Drawing Oval...");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainWindow mainWindow = new MainWindow();
            mainWindow.open();
        });
    }
}
