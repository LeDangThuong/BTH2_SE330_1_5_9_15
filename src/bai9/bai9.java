package bai9;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class bai9 extends JFrame implements ActionListener{
    private JTextField textField;
    private JRadioButton radioButtonNormal, radioButtonBold, radioButtonItalic, radioButtonBoldItalic;

    public bai9() {
        super("Lập trình giao diện với Swing");
        // Khởi tạo các thành phần giao diện
        textField = new JTextField(20);
        radioButtonNormal = new JRadioButton("Thường");
        radioButtonBold = new JRadioButton("Bôi đậm");
        radioButtonItalic = new JRadioButton("In nghiêng");
        radioButtonBoldItalic = new JRadioButton("Bôi đậm và in nghiêng");

        // Thêm ActionListener cho các radio button
        radioButtonNormal.addActionListener(this);
        radioButtonBold.addActionListener(this);
        radioButtonItalic.addActionListener(this);
        radioButtonBoldItalic.addActionListener(this);

        // Tạo nhóm radio button
        ButtonGroup group = new ButtonGroup();
        group.add(radioButtonNormal);
        group.add(radioButtonBold);
        group.add(radioButtonItalic);
        group.add(radioButtonBoldItalic);

        // Tạo panel chứa các radio button
        JPanel radioPanel = new JPanel();
        radioPanel.add(radioButtonNormal);
        radioPanel.add(radioButtonBold);
        radioPanel.add(radioButtonItalic);
        radioPanel.add(radioButtonBoldItalic);

        // Tạo layout cho panel
        radioPanel.setLayout(new FlowLayout());

        // Thêm các thành phần vào frame
        getContentPane().add(textField, BorderLayout.NORTH);
        getContentPane().add(radioPanel, BorderLayout.CENTER);

        // Chọn radio button mặc định
        radioButtonNormal.setSelected(true);

        // Hiển thị frame
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Lấy radio button được chọn
        JRadioButton selectedButton = (JRadioButton) e.getSource();

        // Thay đổi style textfield theo radio button được chọn
        if (selectedButton == radioButtonNormal) {
            textField.setFont(new Font("Arial", Font.PLAIN, 12));
        } else if (selectedButton == radioButtonBold) {
            textField.setFont(new Font("Arial", Font.BOLD, 12));
        } else if (selectedButton == radioButtonItalic) {
            textField.setFont(new Font("Arial", Font.ITALIC, 12));
        } else if (selectedButton == radioButtonBoldItalic) {
            textField.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 12));
        }
    }

    public static void main(String[] args) {
        new bai9();
    }
}

