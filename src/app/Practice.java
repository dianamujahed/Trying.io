package app;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*this class is for the practice GUI form */
public class Practice   {
    private JTextArea OriginalCodeField;
    private JButton EndButton;
    private JTextField InputCodeField;
    private JPanel mainPanel;
    private JPanel practicePanel;
    private JPanel TimePanel;
    private JPanel InputCodePanel;
    private JPanel EndPanel;
    private JPanel OriginalCodePanel;
    private JLabel LanguageField;
    private JLabel TimeField;
    private JLabel LanguageLabel;
    private JLabel TimeLabel;
    private JLabel practiceLabel;
    private   String Language;

    /*this method  shows the pracice form*/
    public void showPracticeFrame()
    {
        JFrame Frame= new JFrame("practice");
        Frame.setContentPane(new Practice().mainPanel);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.pack();
        Frame.setVisible(true);
    }



public Practice()
{
    //the codde used to show the Language name in the practice form
    Upload UploadObject=new Upload();
  Language=UploadObject.languageName();
    LanguageField.setText(Language);



    /* this action listener will end the application when the button is clicked*/
    EndButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    });

}


}