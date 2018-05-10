package javaapplication2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JavaApplication2 extends JFrame implements ActionListener {

    private JTextField start, end, result;
    private JButton button;

    public static void main(String[] args) {
        JavaApplication2 demo = new JavaApplication2();
        demo.setSize(400,150);
        demo.createGUI();
        demo.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        window.add(new JLabel("Range start:"));
        
        start = new JTextField(5);
        window.add(start);
        
        window.add(new JLabel("Range end:"));
        
        end = new JTextField(5);
        window.add(end);
        
        button = new JButton("Calculate");
        window.add(button);
        button.addActionListener(this);
        
        window.add(new JLabel("Sum:"));
        
        result = new JTextField(5);
        window.add(result);
    }

    public void actionPerformed(ActionEvent event) {
        int rangeStart = Integer.parseInt(start.getText());
        int rangeEnd = Integer.parseInt(end.getText());
        int total = 0;
        for (int count = rangeStart; count<=rangeEnd; count++) {
            total = total+count;                                   
        }
        result.setText(Integer.toString(total));
    }
}