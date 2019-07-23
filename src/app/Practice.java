package app;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

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
    private String OriginalCodeText="";
    /**
     * Open and read a file, and return the lines in the file as a list
     * of Strings.
     * (Demonstrates Java FileReader, BufferedReader, and Java5.)
     */
    private List<String> readFile(String filename)
    {
        List<String> records = new ArrayList<String>();
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null)
            {
                records.add(line);
            }
            reader.close();
            return records;
        }
        catch (Exception e)
        {
            System.err.format("Exception occurred trying to read '%s'.", filename);
            e.printStackTrace();
            return null;
        }
    }
    public void setOriginalCode(){

        List<String> OriginalCode = new ArrayList<String>();
        OriginalCode=this.readFile("java.txt");
        for (int i = 0; i < OriginalCode.size(); i++) {
            OriginalCodeText=(OriginalCode.get(i))+OriginalCodeText;
        }
        System.out.println(OriginalCodeText);
        OriginalCodeField.setText(OriginalCodeText);

    }


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