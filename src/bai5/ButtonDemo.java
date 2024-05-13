package bai5;

import bai1.bai1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonDemo extends JFrame implements ActionListener {
    private JButton leftButton, rightButton, topButton, bottomButton, centerButton;

    public ButtonDemo() {
        setTitle("Button Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tạo các nút
        leftButton = new JButton("Left");
        rightButton = new JButton("Right");
        topButton = new JButton("Top");
        bottomButton = new JButton("Bottom");
        centerButton = new JButton("Center");

        // Thiết lập layout của cửa sổ
        setLayout(new BorderLayout());

        // Đặt nút vào vị trí cố định của BorderLayout
        add(leftButton, BorderLayout.WEST);
        add(rightButton, BorderLayout.EAST);
        add(topButton, BorderLayout.NORTH);
        add(bottomButton, BorderLayout.SOUTH);
        add(centerButton, BorderLayout.CENTER);

        // Thêm ActionListener cho các nút
        leftButton.addActionListener(this);
        rightButton.addActionListener(this);
        topButton.addActionListener(this);
        bottomButton.addActionListener(this);
        centerButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        // Xác định nút đã được nhấn
        JButton source = (JButton) e.getSource();

        // Ẩn nút đã được nhấn
        source.setVisible(false);

        // Hiển thị lại các nút còn lại
        if (source == leftButton) {
            rightButton.setVisible(true);
            topButton.setVisible(true);
            bottomButton.setVisible(true);
            centerButton.setVisible(true);
        } else if (source == rightButton) {
            leftButton.setVisible(true);
            topButton.setVisible(true);
            bottomButton.setVisible(true);
            centerButton.setVisible(true);
        } else if (source == topButton) {
            leftButton.setVisible(true);
            rightButton.setVisible(true);
            bottomButton.setVisible(true);
            centerButton.setVisible(true);
        } else if (source == bottomButton) {
            leftButton.setVisible(true);
            rightButton.setVisible(true);
            topButton.setVisible(true);
            centerButton.setVisible(true);
        } else if (source == centerButton) {
            leftButton.setVisible(true);
            rightButton.setVisible(true);
            topButton.setVisible(true);
            centerButton.setVisible(true);
        }

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ButtonDemo().setVisible(true);
            }
        });
    }
}
