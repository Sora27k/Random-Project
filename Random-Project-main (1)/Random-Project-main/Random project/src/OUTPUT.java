import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OUTPUT {
    private JPanel Output_form;
    private JButton button1;
    private JButton button2;
    private JLabel Output;
    private JLabel Output_LABEL;

    public OUTPUT(int num, String[] things, String result) {

        JFrame frame = new JFrame("Tum_RAI_DEE_OUTPUT");
        frame.setContentPane(Output_form);

        Output_form.setBackground(new Color(45, 45, 45));
        Output.setForeground(Color.WHITE);

        Output_LABEL.setForeground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        frame.setTitle("TUM ARAI DEE");

        button1.setBackground(new Color(70, 70, 70));
        button1.setForeground(Color.WHITE);

        button2.setBackground(new Color(70, 70, 70));
        button2.setForeground(Color.WHITE);

        frame.setLocationRelativeTo(null);

        Output.setText("! " + result + " !");
        Output_LABEL.setText("Congratulation!!!");

        Output_LABEL.setFont(new Font("Arial", Font.BOLD, 36));
        Output.setFont(new Font("Arial", Font.BOLD, 50));


        frame.setVisible(true);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                TaskRandomizer rd = new TaskRandomizer(num, things);
                String newResult = rd.randomming(things);
                new OUTPUT(num, things, newResult);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
