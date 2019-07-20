package app;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

public class MainMenu  {
    private JPanel panel1;
    private JButton UploadBtn;
    private JButton PracticeBtn;
    private JButton ExitBtn;
public static void main(String [] args)
{
    JFrame MainMenu = new JFrame("MainMenu");
    MainMenu.setContentPane(new MainMenu().panel1);
    MainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    MainMenu.pack();
    MainMenu.setVisible(true);

}
public MainMenu(){



    PracticeBtn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           practice frame =new practice();
           frame.showPracticeFrame();
        }
    });

}

}
