package app;

import javax.swing.*;

public class practice {
    private JTextArea OriginalCodeField;
    private JButton EndButton;
    private JTextField InputCodeField;
    private JPanel mainPanel;
    private JPanel practicePanel;
    private JPanel TimePanel;
    private JPanel InputCodePanel;
    private JPanel EndPanel;
    private JPanel OriginalCodePanel;



    public void showPracticeFrame()
    {
        JFrame peactice= new JFrame("practice");
        peactice.setContentPane(new practice().mainPanel);
        peactice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        peactice.pack();
        peactice.setVisible(true);
    }
}
