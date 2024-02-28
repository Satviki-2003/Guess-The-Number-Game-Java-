import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class Game {
    JTextArea Screen2Area;
    JTextField user;
    JPanel continueButtonPanel;
    JFrame window;
    JTextArea mainTextArea;
    JTextArea getMainTextArea2;
    JButton submit;
    JPanel submitPanel;
    Font start;
    JPanel tileNamePanel;
    Container con;
    JLabel titleNameLabel;
    JButton startButton;
    JPanel startButtonPanel;
    JLabel startButtonLabel;
    TitleScreenHandler tshandler;
    TitleScreenHandler1 tshandler1;
    JButton continues;
    int num,noOfGuesses;
    String nums;
    JPanel finalScreenArea1Panel1;
    JPanel finalScreenArea1Panel2;
    JLabel finalScreenArea1Label;
    JButton getContinues;
    JTextArea finalScreen2Area1;
    public static void main(String[] args) {
        Game g=new Game();
        g.starters();
    }
    public void starters(){
        Random ran = new Random();
        num = 1 + ran.nextInt(100);
        nums=String.valueOf(num);
        noOfGuesses=0;
        System.out.println(num);
    }
    public Game() {

        tshandler = new TitleScreenHandler();
        //Creating a new window
        window = new JFrame();
        window.setSize(1520, 800);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);

        //Creating a title name panel
        tileNamePanel = new JPanel();
        tileNamePanel.setBounds(460, 100, 600, 200);
        tileNamePanel.setBackground(Color.black);

        //Creating a container to add components
        con = new Container();
        con = window.getContentPane();

        //Creating a title name label
        titleNameLabel = new JLabel("NUMBUZZ");
        titleNameLabel.setForeground(Color.white);
        Font titleFont = new Font("Algerian", Font.PLAIN, 100);
        titleNameLabel.setFont(titleFont);

        //Adding title name label to title name panel
        tileNamePanel.add(titleNameLabel);
        //Adding title name panel to amin screen
        con.add(tileNamePanel);

        //Creating a start button panel
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(660, 600, 200, 100);
        startButtonPanel.setBackground(Color.black);

        //Creating a start button
        startButton = new JButton();
        startButton.setBackground(Color.black);
        startButton.addActionListener(tshandler);

        //Creating a start button label
        start = new Font("Times New Roman", Font.PLAIN, 40);
        startButtonLabel = new JLabel("PLAY");
        startButtonLabel.setFont(start);
        startButtonLabel.setForeground(Color.white);

        //Adding components on main game Screen
        startButton.add(startButtonLabel);
        startButtonPanel.add(startButton);
        con.add(startButtonPanel);
        window.setVisible(true);

    }
    public void createGameScreen1()
    {   tshandler1 = new TitleScreenHandler1();
        startButtonPanel.setVisible(false);
        tileNamePanel.setVisible(false);
        //Creating a main Heading area
        mainTextArea = new JTextArea();
        mainTextArea.setEditable(false);
        mainTextArea.setLineWrap(true);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setBounds(620,100,900,200);
        mainTextArea.setText("INSTRUCTIONS");
        Font title = new Font("Times New Roman",Font.PLAIN,45);
        mainTextArea.setFont(title);

        //Creating the main body
        getMainTextArea2=new JTextArea();
        getMainTextArea2.setBounds(500,300,1200,300);
        getMainTextArea2.setBackground(Color.black);
        getMainTextArea2.setForeground(Color.white);
        getMainTextArea2.setEditable(false);
        getMainTextArea2.setText("  * Guess the number between 1 \n       to 100.");
        getMainTextArea2.setLineWrap(true);
        getMainTextArea2.setFont(start);

        //Creating a continue button
        continueButtonPanel=new JPanel();
        continueButtonPanel.setBounds(640, 600, 250, 100);
        continueButtonPanel.setBackground(Color.black);
        continues =new JButton("CONTINUE");
        continues.setForeground(Color.white);
        continues.setBackground(Color.BLACK);
        continues.setFont(start);
        continues.setFocusPainted(false);
        continueButtonPanel.add(continues);
        con.add(continueButtonPanel);
        con.add(mainTextArea);
        con.add(getMainTextArea2);
        continues.addActionListener(tshandler1);
    }

    public void createFinalScreen1(){
        Screen2Area.setVisible(false);
        submitPanel.setVisible(false);
        user.setVisible(false);
        window.setVisible(true);
        if(nums.equals(user.getText())){
                createFinalScreen2();
        }
        else{
            FinalScreen2 fs=new FinalScreen2();
            int num1=Integer.parseInt(user.getText());
            finalScreenArea1Panel1 =new JPanel();
            finalScreenArea1Panel1.setBounds(190,100,1200,500);
            finalScreenArea1Panel1.setBackground(Color.BLACK);
            finalScreenArea1Label=new JLabel(" ");
            finalScreenArea1Label.setBounds(190,100,1200,500);
            finalScreenArea1Label.setForeground(Color.white);
            finalScreenArea1Label.setBackground(Color.BLACK);
            finalScreenArea1Label.setFont(start);
            finalScreenArea1Panel1.add(finalScreenArea1Label);
            finalScreenArea1Panel2=new JPanel();
            finalScreenArea1Panel2.setBounds(640,550,250,200);
            finalScreenArea1Panel2.setBackground(Color.BLACK);
            getContinues=new JButton("CONTINUE");
            getContinues.setBackground(Color.BLACK);
            getContinues.setForeground(Color.white);
            getContinues.setFont(start);
            getContinues.setFocusPainted(false);
            getContinues.addActionListener(fs);
            finalScreenArea1Panel2.add(getContinues);
            noOfGuesses++;
            if(num1<num){
                finalScreenArea1Label.setText("Increase the number !!!");
            }
            else if(num1>num){
                finalScreenArea1Label.setText("Decrease the number !!!");
            }
            else {
                finalScreenArea1Label.setText("Please enter a valid number between 1 to 100");
            }
            con.add(finalScreenArea1Panel2);
            con.add(finalScreenArea1Panel1);
        }
    }
    //Screen after winning
    public void createFinalScreen2() {
        noOfGuesses++;
        Screen2Area.setVisible(false);
        submitPanel.setVisible(false);
        user.setVisible(false);
        int score;
        if(noOfGuesses==1){
            score=1000;
        } else if (noOfGuesses<=5) {
            score=1000-noOfGuesses*10;
        }
        else{
            score=1000-noOfGuesses*50;
        }
        finalScreen2Area1=new JTextArea("YOU  WIN  !!!\n\nChances  :  "+noOfGuesses+"\n\nScore  :  "+score);
        finalScreen2Area1.setFont(start);
        finalScreen2Area1.setForeground(Color.white);
        finalScreen2Area1.setBackground(Color.black);
        finalScreen2Area1.setBounds(640,200,1200,600);
        finalScreen2Area1.setEditable(false);
        finalScreen2Area1.setVisible(true);
        con.add(finalScreen2Area1);
    }
    public void createGameScreen2() {
        FinalScreen1 fs=new FinalScreen1();
        Screen2Area = new JTextArea("     Enter a number :");
        Screen2Area.setBounds(600, 100, 500, 100);
        Screen2Area.setBackground(Color.BLACK);
        Screen2Area.setForeground(Color.white);
        Screen2Area.setFont(start);
        con.add(Screen2Area);
        Screen2Area.setEditable(false);
        continueButtonPanel.setVisible(false);
        mainTextArea.setVisible(false);
        getMainTextArea2.setVisible(false);
        user = new JTextField();
        user.setBounds(675,300,200,50);
        user.setForeground(Color.white);
        user.setBackground(Color.BLACK);
        user.setFont(start);
        con.add(user);
        submitPanel=new JPanel();
        submitPanel.setBounds(675,550,200,200);
        submitPanel.setBackground(Color.BLACK);
        submit=new JButton("SUBMIT");
        submit.setForeground(Color.white);
        submit.setBackground(Color.black);
        submit.setFont(start);
        submit.addActionListener(fs);
        submit.setFocusPainted(false);
        submitPanel.add(submit);
        con.add(submitPanel);
    }
    public void createGameScreenAgain(){
        finalScreenArea1Panel1.setVisible(false);
        finalScreenArea1Panel2.setVisible(false);
        createGameScreen2();
    }

    public class TitleScreenHandler1 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            createGameScreen2();
        }
    }
    public class TitleScreenHandler implements ActionListener {
        public void actionPerformed(ActionEvent event){
            createGameScreen1();
        }
    }
    public class FinalScreen1 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            createFinalScreen1();
        }
    }
    public class FinalScreen2 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            createGameScreenAgain();
        }
    }
}
