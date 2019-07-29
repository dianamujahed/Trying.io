package app;
import javax.swing. * ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//this class is for making a thread for timer
class Counter extends Thread {
    public Counter() {}
    public void run() {
		/*
			1000 milliseconds = 1 second
			60 seconds = 1 minute
			60  * 1000  = 60,000 milliseconds
			Reduce the thousands place, and you get 300 increments of 1000 milliseconds
		  */

            Practice Time = new Practice();
            for (int i = 59; i >= 0; i -= 1) {
                if (i == 0) {
                    Result result = new Result();
                    result.showResultFrame();
                }
                ;

                try {
                    Thread.sleep(1000);
                    System.out.println(i);
                    Time.getTimeField().setText(" sec"); //after each second until 60 sec, this code will execute
                } catch (InterruptedException e) {
                    System.out.println(e.getStackTrace());
                }
            }

    }
}

/*this class is for the practice GUI form */
public class Practice {
    private JTextArea OriginalCodeField;
    private JButton EndButton;
    private JPanel MainPanel;
    private JPanel PracticePanel;
    private JPanel TimePanel;
    private JPanel InputCodePanel;
    private JPanel EndPanel;
    private JPanel OriginalCodePanel;
    private JLabel LanguageField;
    private JLabel LanguageLabel;
    private JLabel TimeLabel;
    private JLabel TimeField;
    private JLabel PracticeLabel;
    private JTextArea UserInputArea;
    private String Language;
    private static JFrame Frame;
    private Counter counter;

    /*this method  shows the pracice form*/
    public void showPracticeFrame() {
        counter = new Counter();
        counter.start();
        Frame = new JFrame("practice");
        Frame.setContentPane(new Practice().MainPanel);
        Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Frame.setSize(500, 500);
        Frame.setVisible(true);
        Frame.setLocationRelativeTo(null);
    }

    public Practice() {
        OriginalCodeField.setLineWrap(true);
        OriginalCodeField.setEditable(false);
        OriginalCodeField.setCaretPosition(0);
        UserInputArea.setLineWrap(true);

        Upload UploadObject = new Upload();
        Language = UploadObject.languageName();
        if (Language == null) Language = "java";
        LanguageField.setText(Language); //this code used to show the Language name in the practice form.
        String FileName = Language + ".txt";
        try {
            FileReader fr = new FileReader(FileName);
            BufferedReader br = new BufferedReader(fr);
            String str;
            while ((str = br.readLine()) != null)
                OriginalCodeField.append(str + "\n"); //this code is for setting the original code of the language file  in the original code field
            br.close();
        }
        catch(IOException e) {
            System.out.println("file not found");
        }

        // when end button is clicked , the practice frame will be closed
        EndButton.addActionListener(new ActionListener() {@Override
        public void actionPerformed(ActionEvent e) {
            Frame.dispose();
        }
        });
    }

    //this method will return the TimeField variable
    public JLabel getTimeField() {
        return TimeField;
    }

}