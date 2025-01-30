import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setTitle("Basic GUI");
        window.setSize(800, 600);
        JTextField numberOne = new JTextField(10);
        JTextField numberTwo = new JTextField(10);
        window.setLayout(new FlowLayout());
        window.add(numberOne);
        window.add(numberTwo);
        JButton pressMeButton = new JButton("Add");
        window.add(pressMeButton);
        JLabel label = new JLabel("     ");
        window.add(label);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pressMeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(numberOne.getText());
                int num2 = Integer.parseInt(numberTwo.getText());
                int sum = num + num2;
                label.setText("   " + sum);
            }
        });
    }
}