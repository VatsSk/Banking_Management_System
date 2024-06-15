package banking.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

    JTextField textName,textFname,textEmail,textAdd,textCity,textPc,textState;

    JDateChooser dateChooser=new JDateChooser();
    JRadioButton rb1,rb2,rb3,rbMs1,rbMs2,rbMs3;

    JButton nextbtn;
    public static int generateRandom(int n) {

        int num;
        Random ran = new Random();
        num=ran.nextInt(n);
        return num;
    }
    int first;


    public void initElements(){
        setSize(850,800);
        setLocation(360,40);

        //Setting Image

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image1=new JLabel(i3);
        image1.setBounds(25,10,100,100);
        add(image1);

        first=generateRandom(9999);
        JLabel label1=new JLabel("APPLICATION FORM NO:"+first);
        label1.setFont(new Font("Raleway", Font.BOLD,38));
        label1.setBounds(160,40,600,40);
        add(label1);

        JLabel label2=new JLabel("Page 1");
        label2.setFont(new Font("Raleway", Font.BOLD,20));
        label2.setBounds(160,5,90,30);
        add(label2);

        JLabel label3=new JLabel("Personal Deatils..");
        label3.setFont(new Font("Raleway", Font.BOLD,20));
        label3.setBounds(230,85,200,30);
        add(label3);

        JLabel labelName=new JLabel("Name:");
        labelName.setFont(new Font("Raleway", Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textName=new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);

        JLabel fName=new JLabel("Father's Name:");
        fName.setFont(new Font("Raleway",Font.BOLD,20));
        fName.setBounds(100,240,200,30);
        add(fName);

        textFname=new JTextField();
        textFname.setFont(new Font("Raleway", Font.BOLD,14));
        textFname.setBounds(300,240,400,30);
        add(textFname);

        JLabel DOB=new JLabel("Date of Birth:");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,340,200,30);
        add(DOB);

        dateChooser=new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);

        JLabel lgender=new JLabel("Gender:");
        lgender.setBounds(100,290,200,30);
        lgender.setFont(new Font("Raleway",Font.BOLD,20));
        add(lgender);

        rb1=new JRadioButton("Male");
        rb1.setFont(new Font("Raleway", Font.BOLD,14));
        rb1.setBounds(300,290,60,30);
        rb1.setBackground(new Color(222,255,228));
        add(rb1);

        rb2=new JRadioButton("Female");
        rb2.setFont(new Font("Raleway",Font.BOLD,14));
        rb2.setBounds(450,290,90,30);
        rb2.setBackground(new Color(222,255,228));
        add(rb2);

        rb3=new JRadioButton("Others");
        rb3.setFont(new Font("Raleway",Font.BOLD,14));
        rb3.setBounds(600,290,90,30);
        rb3.setBackground(new Color(222,255,228));
        add(rb3);


        ButtonGroup grpBtn=new ButtonGroup();
        grpBtn.add(rb1);
        grpBtn.add(rb2);

        JLabel  lEmail=new JLabel("Email address:");
        lEmail.setFont(new Font("Raleway",Font.BOLD,20));
        lEmail.setBounds(100,390,200,30);
        add(lEmail);

        textEmail=new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);

        JLabel  lMs=new JLabel("Marital Status:");
        lMs.setFont(new Font("Raleway",Font.BOLD,20));
        lMs.setBounds(100,440,200,30);
        add(lMs);

        rbMs1=new JRadioButton("Married");
        rbMs1.setFont(new Font("Raleway",Font.BOLD,14));
        rbMs1.setBounds(300,440,100,30);
        rbMs1.setBackground(new Color(222,255,228));
        add(rbMs1);

        rbMs2=new JRadioButton("Single");
        rbMs2.setFont(new Font("Raleway",Font.BOLD,14));
        rbMs2.setBounds(450,440,100,30);
        rbMs2.setBackground(new Color(222,255,228));
        add(rbMs2);

        rbMs3=new JRadioButton("Others");
        rbMs3.setFont(new Font("Raleway",Font.BOLD,14));
        rbMs3.setBounds(600,440,100,30);
        rbMs3.setBackground(new Color(222,255,228));
        add(rbMs3);

         ButtonGroup bgMs=new ButtonGroup();
         bgMs.add(rbMs1);
         bgMs.add(rbMs2);
         bgMs.add(rbMs3);


        JLabel  lAdd=new JLabel("Address:");
        lAdd.setFont(new Font("Raleway",Font.BOLD,20));
        lAdd.setBounds(100,490,200,30);
        add(lAdd);

        textAdd=new JTextField();
        textAdd.setFont(new Font("Raleway",Font.BOLD,14));
        textAdd.setBounds(300,490,400,30);
        add(textAdd);

        JLabel  lCity=new JLabel("City:");
        lCity.setFont(new Font("Raleway",Font.BOLD,20));
        lCity.setBounds(100,540,200,30);
        add(lCity);

        textCity=new JTextField();
        textCity.setFont(new Font("Raleway",Font.BOLD,14));
        textCity.setBounds(300,540,400,30);
        add(textCity);

        JLabel  lPc=new JLabel("PIN Code:");
        lPc.setFont(new Font("Raleway",Font.BOLD,20));
        lPc.setBounds(100,590,200,30);
        add(lPc);

        textPc=new JTextField();
        textPc.setFont(new Font("Raleway",Font.BOLD,14));
        textPc.setBounds(300,590,400,30);
        add(textPc);

        JLabel  lState=new JLabel("State:");
        lState.setFont(new Font("Raleway",Font.BOLD,20));
        lState.setBounds(100,640,200,30);
        add(lState);

        textState=new JTextField();
        textState.setFont(new Font("Raleway",Font.BOLD,14));
        textState.setBounds(300,640,400,30);
        add(textState);

        nextbtn=new JButton("Next");
        nextbtn.setFont(new Font("Raleway",Font.BOLD,14));
        nextbtn.setBounds(620,710,80,30);
        nextbtn.setForeground(Color.WHITE);
        nextbtn.setBackground(Color.BLACK);
        nextbtn.addActionListener(this);
        add(nextbtn);

    }
    public  Signup(){
        super("APPLICATION FORM");
        initElements();
         getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
          setVisible(true);
          setDefaultCloseOperation(EXIT_ON_CLOSE);
     }

    @Override
    public void actionPerformed(ActionEvent e) {

         int formno= first;
        String name= textName.getText();
        String fname=textFname.getText();
        String dob= ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(rb1.isSelected()){
            gender="Male";
        }else if(rb2.isSelected()){
            gender="Female";
        }else if(rb3.isSelected()){
            gender="Others";
        }
        String email=textEmail.getText();
        String marital=null;
        if(rbMs1.isSelected()){
            marital="Married";
        } else if (rbMs2.isSelected()) {
            marital="Single";
        } else if (rbMs3.isSelected()) {
            marital="Others";
        }
        String address=textAdd.getText();
        String city=textCity.getText();

        String pincode=textPc.getText();
        String state=textState.getText();


        try{
            if(textName.getText().equals(""))
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            else{
                Con con1=new Con();
                String q="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new Singup2(formno);
                setVisible(false);
            }
        }catch(Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
          new Signup();
    }
}
