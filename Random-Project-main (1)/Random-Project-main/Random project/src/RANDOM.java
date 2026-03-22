import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RANDOM {
    private JPanel filed;
    private JLabel Question;
    private JTextField textField1;
    private JButton okButton;
    private JButton exitButton;
    private JFrame jFrame;

    RANDOM() {
        jFrame = new JFrame("Tum_RAI_DEE");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(600, 400);
        jFrame.setLocationRelativeTo(null);
        Question.setText("How many things are on your mind? (enter number only!!!)");
        Question.setFont(new Font("Arial", Font.BOLD, 16));

        jFrame.setTitle("TUM ARAI DEE");

        jFrame.setContentPane(filed);

        filed.setBackground(new Color(45, 45, 45));
        Question.setForeground(Color.WHITE);

        okButton.setBackground(new Color(70, 70, 70));
        okButton.setForeground(Color.WHITE);

        exitButton.setBackground(new Color(70, 70, 70));
        exitButton.setForeground(Color.WHITE);


        jFrame.setVisible(true);

        exitButton.addActionListener(e -> System.exit(0));

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                        try {
                            int num = Integer.parseInt(textField1.getText().trim());
                            if (num <= 0) throw new NumberFormatException();
                            String[] things = new String[num];
                            jFrame.dispose();
                            new DO_something(num, things, 0);
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(jFrame, "Please enter a valid number!!!",
                                    "Error", JOptionPane.ERROR_MESSAGE);
                            textField1.setText("");
                        }
                    }
                });

        }

    static void main() {
        new RANDOM();
    }
}