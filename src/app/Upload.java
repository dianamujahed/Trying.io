package app;

import javax.swing. * ;
import java.io. * ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class Upload {
    private JPanel MainPanel;
    private JTextField LanguageField;
    private JButton SaveButton;
    private JPanel CodePanel;
    private JPanel LanguagePanel;
    private JPanel SavePanel;
    private JLabel CodeLabel;
    private JLabel UploadLabel;
    private JPanel CodeFieldPanel;
    private JTextArea CodeArea;
    private JLabel LanguageLabel;
    private String Language;
    public static String LanguageName;
    private static JFrame Frame;

    public Upload() {
        CodeArea.setLineWrap(true);

        // when save button is clicked, new file will be created and named same name as the LanguageField variable
        SaveButton.addActionListener(new ActionListener() {@Override
        public void actionPerformed(ActionEvent e) {
            LanguageName = LanguageField.getText();
            /*test the file name and file content values
             *so if they are empty a message will appeare
             *and tell the user to enter values for language name and code.
             */
            if (!LanguageName.equals("") && !(CodeArea.getText().equals(""))) {

                Language = LanguageName + ".txt";

                try {
                    //create new txt file with the same name of the entered language name.
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
                    if (CreateFile) {
                        System.out.println("File has been created successfully");

                    } else {
                        System.out.println("File already present at the specified location");
                    }

                } catch(IOException Exception1) {
                    System.out.println("Exception Occurred:");
                    Exception1.printStackTrace();
                }
                Frame.dispose();
              //a message will show if the content of language name or code filed are empty
            } else {
                JFrame frame = new JFrame("language name and code are required ");

                // show a joptionpane dialog using showMessageDialog
                JOptionPane.showMessageDialog(frame, "language name and code are required ");

            }

        }
        });

    }
    //This method used to show the upload form.
    public void showUploadFrame() {
        Frame = new JFrame("Upload");
        Frame.setContentPane(new Upload().MainPanel);
        Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Frame.setSize(500, 500);
        Frame.setVisible(true);
        Frame.setLocationRelativeTo(null);
    }

    //this method will return the name of language that we uploded  in the file.
    public String languageName() {

        return LanguageName;

    }

}