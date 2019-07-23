package app;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

 class Counter extends Thread{
    public Counter(){}

    public void run(){
		  /*
			1000 milliseconds = 1 second
			60 seconds = 1 minute
			60  * 1000 * 5 = 60,000 milliseconds
			Reduce the thousands place, and you get 300 increments of 1000 milliseconds
		  */
		  Practice Time=new Practice();
        for(int i = 59; i >= 0; i -= 1){
            if(i == 0) System.exit(0);
            try{Thread.sleep(1000);
                System.out.println(i);
                Time.getTimeField().setText(i+" sec");
            }
            catch(InterruptedException e){}
        }

    }
}

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
    private JLabel LanguageLabel;
    private JLabel TimeLabel;
    private JLabel TimeField;
    private JLabel practiceLabel;
    private String Language;
    private String OriginalCodeText="";
    private  static JFrame Frame;
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
         Frame= new JFrame("practice");
        Frame.setContentPane(new Practice().mainPanel);
        Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Frame.pack();
        Frame.setVisible(true);
        Counter counter=new Counter();
        counter.start();



    }



public Practice()
{
    EndButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Frame.dispose();

        }
    });


}
public JLabel getTimeField(){
    return TimeField;
}

}