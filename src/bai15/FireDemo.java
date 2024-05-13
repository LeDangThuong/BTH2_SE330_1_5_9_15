package bai15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class FireDemo extends JFrame {
    private JPanel firePanel;
    private JLabel[] fireLabels;
    private JButton startButton;
    private JTextField numberOfFiresField;

    public FireDemo() {
        setTitle("Fire Simulation");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        firePanel = new JPanel();
        firePanel.setLayout(null);

        startButton = new JButton("Start");
        startButton.setBounds(10, 10, 80, 25);
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startFire();
            }
        });
        firePanel.add(startButton);

        JLabel label = new JLabel("Number of fires (1-10):");
        label.setBounds(100, 10, 150, 25);
        firePanel.add(label);

        numberOfFiresField = new JTextField("1");
        numberOfFiresField.setBounds(250, 10, 50, 25);
        firePanel.add(numberOfFiresField);

        add(firePanel);
    }

    private void startFire() {
        firePanel.removeAll();
        int numberOfFires = 1;
        try {
            numberOfFires = Integer.parseInt(numberOfFiresField.getText());
            if (numberOfFires < 1 || numberOfFires > 10) {
                numberOfFires = 1;
                JOptionPane.showMessageDialog(this, "Please enter a number between 1 and 10.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }

        fireLabels = new JLabel[numberOfFires];
        ImageIcon fireIcon = new ImageIcon("E:\\SE330\\21522654_LeDangThuong_BTH2\\src\\bai15\\Sprite.png"); // Replace "fire.png" with your image file
        int panelWidth = firePanel.getWidth();
        int panelHeight = firePanel.getHeight();

        Random random = new Random();
        for (int i = 0; i < numberOfFires; i++) {
            JLabel fireLabel = new JLabel(fireIcon);
            int x = random.nextInt(panelWidth - fireIcon.getIconWidth());
            int y = random.nextInt(panelHeight - fireIcon.getIconHeight());
            fireLabel.setBounds(x, y, fireIcon.getIconWidth(), fireIcon.getIconHeight());
            firePanel.add(fireLabel);
            fireLabels[i] = fireLabel;
        }

        firePanel.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FireDemo().setVisible(true);
            }
        });
    }
}
