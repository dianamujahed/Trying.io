package app;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;
/*this class for the main menu GUI form */
public class MainMenu  {
    private JPanel MainPanel;
    private JButton UploadButton;
    private JButton PracticeButton;
    private JButton ExitButton;

public static void main(String [] args)
{
    //this code is for showing the main menu form
    JFrame MainMenu = new JFrame("MainMenu");
    MainMenu.setContentPane(new MainMenu().MainPanel);
    MainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    MainMenu.pack();
    MainMenu.setVisible(true);

}
public MainMenu(){
    /* this action listener will open the practice frame when the button is clicked*/
    PracticeButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           Practice frame =new Practice();
           frame.showPracticeFrame();
        }
    });
    /* this action listener will exit the application when the button is clicked*/
    ExitButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    });
}

}
