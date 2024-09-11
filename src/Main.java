import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        ImageIcon icon = new ImageIcon("D:\\Codes\\Java\\Swing\\Projects\\Caclulator\\resources\\icon.png");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350,550);
        frame.setIconImage(icon.getImage());
        frame.setVisible(true);
    }
}