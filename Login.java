package banking.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

       JLabel label1,label2,label3;
       JTextField jtext1;
       JPasswordField jtext2;
       JButton button1,button2,button3;
   public Login(){
       super("Bank Management System");
       setLayout(null);
       setSize(850,480);
       setLocation(450,200);

       // Adding Bank logo
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
       Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       JLabel image=new JLabel(i3);
       image.setBounds(350,10,100,100);
       add(image);

       // Adding Card Icon
       ImageIcon ii1=new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
       Image ii2=ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
       ImageIcon ii3=new ImageIcon(ii2);
       JLabel iimage=new JLabel(ii3);
       iimage.setBounds(630,350,100,100);
       add(iimage);

       // creating labels and textfields
       label1=new JLabel("WELCOME TO ATM");
       label1.setBounds(200,125,450,40);
       label1.setForeground(Color.WHITE);
       Font headFont=new Font("AvantGarde",Font.BOLD,38);
       label1.setFont(headFont);
       add(label1);

       //Card details
       label2=new JLabel("Enter Card No:");
       label2.setBounds(130,200,200,30);
       label2.setFont(new Font("Ralway",Font.BOLD,20));
       add(label2);

       //pin details
       label3=new JLabel("Enter PIN:");
       label3.setBounds(130,250,200,30);
       label3.setFont(new Font("Ralway",Font.BOLD,20));
       add(label3);

       //TextField 1
       jtext1=new JTextField();
       jtext1.setBounds(280,204,250,35);
       jtext1.setFont(new Font("Arial",Font.BOLD,20));
       add(jtext1);

       //TextField2
       jtext2=new JPasswordField();
       jtext2.setBounds(280,250,250,35);
       jtext2.setFont(new Font("Arial",Font.BOLD,20));
       add(jtext2);

       //SignIn button
       button1=new JButton("SIGN IN");
       button1.setBounds(290,300,100,30);
       button1.setFont(new Font("Arial",Font.BOLD,14));
       button1.setForeground(Color.WHITE);
       button1.setBackground(Color.BLACK);
       button1.addActionListener(this);
       add(button1);

       //Signup button
       button2=new JButton("SIGN UP");
       button2.setBounds(290,350,230,30);
       button2.setFont(new Font("Arial",Font.BOLD,14));
       button2.setForeground(Color.WHITE);
       button2.setBackground(Color.BLACK);
       button2.addActionListener(this);
       add(button2);

       //Clear Button

       button3=new JButton("CLEAR");
       button3.setBounds(420,300,100,32);
       button3.setFont(new Font("Arial",Font.BOLD,14));
       button3.setForeground(Color.WHITE);
       button3.setBackground(Color.BLACK);
       button3.addActionListener(this);
       add(button3);

       // Adding Background
       ImageIcon iii1=new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
       Image iii2=iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
       ImageIcon iii3=new ImageIcon(iii2);
       JLabel iiimage=new JLabel(iii3);
       iiimage.setBounds(0,0,850,480);
       add(iiimage);



       setVisible(true);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()==button1){
                Con c=new Con();
                String cardNo=jtext1.getText();
                String pin=jtext2.getText();
                String q="SELECT * FROM login WHERE card_no='"+cardNo+"' and pin='"+pin+"'";
                ResultSet resultSet=c.statement.executeQuery(q);
                if(resultSet.next()){
                    setVisible(false);
                    new main_class(pin);
                }else{
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or PIN");
                }

            }
            else if(e.getSource()==button2){
                       new Signup();
                       setVisible(false);
            }else if(e.getSource()==button3){
                jtext1.setText("");
                jtext2.setText("");
            }
        }catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {

       new Login();
    }
}
