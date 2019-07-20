package app;

import javax.swing.*;

public class MainMenu {
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

}
