package app;

import javax.swing.*;

public class Result {
    private JButton finishButton;
    private JPanel resultPanel;
    private JFrame Frame;
    /*this method  shows the pracice form*/
    public void showResultFrame()
    {
        Frame= new JFrame("result");
        Frame.setContentPane(new Result().resultPanel);
        Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Frame.pack();
        Frame.setVisible(true);
    }
}
