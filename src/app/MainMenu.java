package app;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;
import java.io.*;
import java.nio.file.*;

/*this class for the main menu GUI form */
public class MainMenu  {
    private JPanel MainPanel;
    private JButton UploadButton;
    private JButton PracticeButton;
    private JButton ExitButton;

public static void main(String [] args)
{
    //this code is for showing the main menu form
    JFrame Frame = new JFrame("MainMenu");
    Frame.setContentPane(new MainMenu().MainPanel);
    Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    Frame.setSize(500, 500);
    Frame.setVisible(true);
    Frame.setLocationRelativeTo(null);


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
    /* this action listener will open the upload frame when the button is clicked*/
    UploadButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Upload frame =new Upload();
            frame.showUploadFrame();
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
