package bai1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class bai1 extends JFrame{
    private JTextField nameField;
    private JButton enterButton;
    private JLabel greetingLabel;

    public bai1() {
        // Thiết lập JFrame
        setTitle("Greeting Application");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Tạo các thành phần
        nameField = new JTextField(15);
        enterButton = new JButton("Enter");
        greetingLabel = new JLabel("Enter your name and press Enter");

        // Thêm các thành phần vào frame
        add(greetingLabel);
        add(nameField);
        add(enterButton);

        // Thêm hành động khi nhấn nút
        enterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                JOptionPane.showMessageDialog(bai1.this, "Xin chào " + name);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new bai1().setVisible(true);
            }
        });
    }
}
