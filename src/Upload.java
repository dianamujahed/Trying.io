import javax.security.auth.callback.LanguageCallback;
import javax.swing.*;
import java.io.FileWriter;
import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

import java.io.*;

import java.util.logging.Level;

import java.util.logging.Logger;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
public class Upload {
    private JPanel mainpanel;
    private JTextField languageField;
    private JButton saveButton;
    private JPanel codePanel;
    private JPanel languagePanel;
    private JPanel savePanel;
    private JLabel codeLabel;
    private JLabel languageLabel;
    private JLabel uploadLabel;
    private JPanel codeFieldPanel;
    private JTextArea CodeArea;
    public String language;


    public Upload()
{


   saveButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            language = languageField.getText().toString();


    language ="/Users/macbookpro/IdeaProjects/"+ language+".txt";
    try {
        File file = new File(language);
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(CodeArea.getText().toString());
        bw.close();


        /*If file gets created then the createNewFile()
         * method would return true or if the file is
         * already present it would return false
         */
        boolean fvar = file.createNewFile();
        if (fvar){
            System.out.println("File has been created successfully");
        }
        else{
            System.out.println("File already present at the specified location");
        }
    } catch (IOException E1) {
        System.out.println("Exception Occurred:");
        E1.printStackTrace();
    }




        }

});

}


    public static void main(String [] args)
    {
        JFrame upload = new JFrame("Update");
        upload.setContentPane(new Upload().mainpanel);
        upload.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        upload.pack();
        upload.setVisible(true);




    }






}
