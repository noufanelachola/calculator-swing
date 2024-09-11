import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        ImageIcon icon = new ImageIcon("D:\\Codes\\Java\\Swing\\Projects\\Caclulator\\resources\\icon.png");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350,550);
        frame.setLayout(new BorderLayout());
        frame.setIconImage(icon.getImage());

        JPanel inputPanel = new JPanel();
        //inputPanel.setBounds(0,0,350,300);
        inputPanel.setPreferredSize(new Dimension(350, 100));
        inputPanel.setBackground(new Color(0x909090));

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBounds(0,100,350,450);
        buttonPanel.setPreferredSize(new Dimension(350, frame.getHeight()));
        buttonPanel.setBackground(new Color(0x909090));
        buttonPanel.setLayout(new GridLayout(4,4,2,2));

        //Buttons
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");
        JButton btnClear = new JButton("Clear");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btnMult = new JButton("*");
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btnDivide = new JButton("/");
        JButton btn0 = new JButton("0");
        JButton btnAdd = new JButton("+");
        JButton btnSub = new JButton("-");
        JButton btnEqual = new JButton("=");

        buttonPanel.add(btn7);
        buttonPanel.add(btn8);
        buttonPanel.add(btn9);
        buttonPanel.add(btnClear);
        buttonPanel.add(btn4);
        buttonPanel.add(btn5);
        buttonPanel.add(btn6);
        buttonPanel.add(btnMult);
        buttonPanel.add(btn1);
        buttonPanel.add(btn2);
        buttonPanel.add(btn3);
        buttonPanel.add(btnDivide);
        buttonPanel.add(btn0);
        buttonPanel.add(btnAdd);
        buttonPanel.add(btnSub);
        buttonPanel.add(btnEqual);


        frame.add(inputPanel,BorderLayout.NORTH);
        frame.add(buttonPanel,BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}