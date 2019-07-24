package app;

import javax.swing.*;

public class Result {
    private JButton FinishButton;
    private JLabel TypingSpeedLabel;
    private JLabel NoOfErrorsLabel;
    private JLabel ListErrorsLabel;
    private JLabel ResultLabel;
    private JPanel ResultPanel;
    private JPanel MainPanel;
    private JPanel FinishButtonPanel;
    private JFrame Frame;
    /*this method  shows the pracice form*/
    public void showResultFrame()
    {
        Frame= new JFrame("result");
        Frame.setContentPane(new Result().ResultPanel);
        Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Frame.pack();
        Frame.setVisible(true);
    }



}
