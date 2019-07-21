import javax.security.auth.callback.LanguageCallback;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
//this class for Upload form
public class Upload {
    private JPanel   MainPanel;
    private JTextField LanguageField;
    private JButton SaveButton;
    private JPanel  CodePanel;
    private JPanel  LanguagePanel;
    private JPanel  SavePanel;
    private JLabel  CodeLabel;
    private JLabel  LanguageLabel;
    private JLabel  UploadLabel;
    private JPanel  CodeFieldPanel;
    private JTextArea CodeArea;
    public String Language;


    public Upload()
{
    // when save button is clicked, new file will be created and named same name as the LanguageField variable

   SaveButton.addActionListener(new ActionListener()
   {
        @Override
        public void actionPerformed(ActionEvent e) {
            Language = LanguageField.getText().toString();


             Language = Language+".txt";
             try {
                      //create new file  named(Language name)
                      File file = new File(Language);
                      //This code load the content of the CodeArea in the created file
                      FileWriter writeFile = new FileWriter(file.getAbsoluteFile());
                      BufferedWriter WriteBuffer = new BufferedWriter(writeFile);
                      WriteBuffer.write(CodeArea.getText().toString());
                      WriteBuffer.close();


                      /*If file gets created then the createNewFile()
                      * method would return true or if the file is
                      * already present it would return false
                     */

                    boolean CreateFile = file.createNewFile();
                     if (CreateFile)
                     {
                      System.out.println("File has been created successfully");
                     }

                     else{
                           System.out.println("File already present at the specified location");
                         }
                }
             catch (IOException Exception1)
             {
                System.out.println("Exception Occurred:");
                Exception1.printStackTrace();
             }




        }

   });

}


    public static void main(String [] args)
    {
        //the main class used to show Upload form.
        JFrame upload = new JFrame("Update");
        upload.setContentPane(new Upload().MainPanel);
        upload.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        upload.pack();
        upload.setVisible(true);




    }






}
