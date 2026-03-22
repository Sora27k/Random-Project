import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DO_something {
    private JPanel Do_something_filed;
    private JLabel Question_to_do;
    private JTextField textField1;
    private JButton NEXTButton;

    public DO_something(int num, String[] things, int index) {


        JFrame frame = new JFrame("Tum_RAI_DEE_THING_TO_DO");
        frame.setContentPane(Do_something_filed);

        Do_something_filed.setBackground(new Color(45, 45, 45));
        Question_to_do.setForeground(Color.WHITE);

        NEXTButton.setBackground(new Color(70, 70, 70));
        NEXTButton.setForeground(Color.WHITE);

        Question_to_do.setFont(new Font("Arial", Font.BOLD, 16));
        frame.setTitle("TUM ARAI DEE");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);

        Question_to_do.setText("Enter your option (English or number) ( " + (index + 1) + " of " + num + " )");
        NEXTButton.setText(index + 1 < num ? "Next" : "Random!");

        frame.setVisible(true);

        NEXTButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String input = textField1.getText().trim();
                    if (input.isEmpty()) {
                        JOptionPane.showMessageDialog(frame, "Please enter an option!!!", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    things[index] = input;
                    frame.dispose();
                    if (index + 1 < num) {
                        new DO_something(num, things, index + 1);
                    } else {
                        TaskRandomizer rd = new TaskRandomizer(num, things);
                        String result = rd.randomming(things);
                        new OUTPUT(num, things, result);
                    }
                }
        });
    }
}