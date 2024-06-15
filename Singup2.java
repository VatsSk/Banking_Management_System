package banking.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Singup2 extends JFrame implements ActionListener {

    int formNo;
    JComboBox cb1,cb2,cb3,cb4,cb5;
    JTextField textPan,textAad;

    JRadioButton rb1,rb2,rb3,rb4;
    JButton nextBtn;
    public void initElements(){

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2= i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        JLabel l1=new JLabel("Page 2");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(300,10,600,30);
        add(l1);

        JLabel l2=new JLabel("Additional Details");
        l2.setFont(new Font("Raleway",Font.BOLD,30));
        l2.setBounds(300,60,600,60);
        add(l2);

        JLabel l3=new JLabel("Religion :");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,120,100,30);
        add(l3);

        String rel[]={"Hindu","Muslim","Shikh","Christan","Others"};
        cb1=new JComboBox(rel);
        cb1.setBounds(350,120,320,30);
        cb1.setFont(new Font("Raleway",Font.BOLD,14));
        cb1.setBackground(new Color(252,208,76));
        add(cb1);

        JLabel l4=new JLabel("Category :");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,170,100,30);
        add(l4);

        String cat[]={"General","EWS","OBC","SC","ST","Others"};
        cb2=new JComboBox<>(cat);
        cb2.setBounds(350,170,320,30);
        cb2.setFont(new Font("Raleway",Font.BOLD,14));
        cb2.setBackground(new Color(252,208,76));
        add(cb2);

        JLabel l5=new JLabel("Income :");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        l5.setBounds(100,220,100,30);
        add(l5);

        String inc[]={"Null","<1,50,000","2,50,000","5,00,000","upto 10,00,000","Above 10,00,000"};
        cb3=new JComboBox<>(inc);
        cb3.setBounds(350,220,320,30);
        cb3.setFont(new Font("Raleway",Font.BOLD,14));
        cb3.setBackground(new Color(252,208,76));
        add(cb3);

        JLabel l6=new JLabel("Educational :");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(100,270,200,30);
        add(l6);

        String edu[]={"Non-Graduate","Graduate","Post-Graduate","Doctorate","Others"};
        cb4=new JComboBox<>(edu);
        cb4.setBounds(350,270,320,30);
        cb4.setFont(new Font("Raleway",Font.BOLD,14));
        cb4.setBackground(new Color(252,208,76));
        add(cb4);

        JLabel l7=new JLabel("Occupation :");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        l7.setBounds(100,340,150,30);
        add(l7);

        String occ[]={"Salaried","Self-Employed","Business","Student","Retired","Others"};
        cb5=new JComboBox<>(occ);
        cb5.setBounds(350,340,320,30);
        cb5.setFont(new Font("Raleway",Font.BOLD,14));
        cb5.setBackground(new Color(252,208,76));
        add(cb5);

        JLabel l8=new JLabel("PAN Number :");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,390,150,30);
        add(l8);

        textPan=new JTextField();
        textPan.setFont(new Font("Raleway",Font.BOLD,18));
        textPan.setBounds(350,390,320,30);
        add(textPan);

        JLabel l9=new JLabel("Aadhar Number :");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(100,440,200,30);
        add(l9);

        textAad=new JTextField();
        textAad.setFont(new Font("Raleway",Font.BOLD,18));
        textAad.setBounds(350,440,320,30);
        add(textAad);

        JLabel l10=new JLabel("Senior Citizen :");
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        l10.setBounds(100,490,200,30);
        add(l10);

        rb1=new JRadioButton("Yes");
        rb1.setFont(new Font("Raleway",Font.BOLD,18));
        rb1.setBounds(350,490,150,30);
        rb1.setBackground(new Color(252,208,76));
        add(rb1);

        rb2=new JRadioButton("No");
        rb2.setFont(new Font("Raleway",Font.BOLD,18));
        rb2.setBounds(500,490,150,30);
        rb2.setBackground(new Color(252,208,76));
        add(rb2);

        ButtonGroup bg1=new ButtonGroup();
        bg1.add(rb1);
        bg1.add(rb2);

        JLabel l11=new JLabel("Existing Account :");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,540,200,30);
        add(l11);

        rb3=new JRadioButton("Yes");
        rb3.setFont(new Font("Raleway",Font.BOLD,18));
        rb3.setBounds(350,540,150,30);
        rb3.setBackground(new Color(252,208,76));
        add(rb3);

        rb4=new JRadioButton("No");
        rb4.setFont(new Font("Raleway",Font.BOLD,18));
        rb4.setBounds(500,540,150,30);
        rb4.setBackground(new Color(252,208,76));
        add(rb4);

        ButtonGroup bg2=new ButtonGroup();
        bg2.add(rb3);
        bg2.add(rb4);

        JLabel l12=new JLabel("Form No :");
        l12.setFont(new Font("Raleway",Font.BOLD,18));
        l12.setBounds(600,10,100,30);
        add(l12);

        JLabel l13=new JLabel(String.valueOf(formNo));
        l13.setFont(new Font("Raleway",Font.BOLD,18));
        l13.setBounds(690,10,100,30);
        add(l13);

        nextBtn=new JButton("Next");
        nextBtn.setBackground(Color.BLACK);
        nextBtn.setForeground(Color.WHITE);
        nextBtn.setBounds(700,640,100,30);
        nextBtn.setFont(new Font("Raleway",Font.BOLD,18));
        nextBtn.addActionListener(this);
        add(nextBtn);
    }
     public Singup2(int formNo){
         super("APPLICATION FORM");
         this.formNo=formNo;
         initElements();
         setLayout(null);
         setSize(850,750);
         setLocation(450,40);
         getContentPane().setBackground(new Color(252,208,76));
         setVisible(true);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int formno=formNo;
        String religion=null;
        if(cb1.getSelectedItem().equals("Hindu")){
            religion="Hindu";
        } else if (cb1.getSelectedItem().equals("Muslim")) {
            religion="Muslim";
        } else if (cb1.getSelectedItem().equals("Shikh")) {
            religion="Shikh";
        } else if (cb1.getSelectedItem().equals("Christan")) {
            religion="Christan";
        }else if (cb1.getSelectedItem().equals("Others")) {
            religion = "Others";
        }

        String category=null;
        if(cb2.getSelectedItem().equals("General")){
            category="General";
        } else if (cb2.getSelectedItem().equals("EWS")) {
            category="EWS";
        } else if (cb2.getSelectedItem().equals("OBC")) {
            category="OBC";
        } else if (cb2.getSelectedItem().equals("SC")) {
            category="SC";
        }else if (cb2.getSelectedItem().equals("ST")) {
            category = "ST";
        }else if (cb2.getSelectedItem().equals("Others")) {
            category = "Others";
        }

        String income=null;
        if(cb3.getSelectedItem().equals("Null")){
            income="Null";
        } else if (cb3.getSelectedItem().equals("<1,50,000")) {
            income="1,50,000";
        } else if (cb3.getSelectedItem().equals("2,50,000")) {
            income="2,50,000";
        } else if (cb3.getSelectedItem().equals("5,00,000")) {
            income="5,00,000";
        }else if (cb3.getSelectedItem().equals("upto 10,00,000")) {
            income= "upto 10,00,000";
        }else if (cb3.getSelectedItem().equals("Above 10,00,000")) {
            income= "Above 10,00,000";
        }

        String educational=null;
        if(cb4.getSelectedItem().equals("Non-Graduate")){
            educational="Non-Graduate";
        } else if (cb4.getSelectedItem().equals("Graduate")) {
            educational="Graduate";
        } else if (cb4.getSelectedItem().equals("Post-Graduate")) {
            educational="Post-Graduate";
        } else if (cb4.getSelectedItem().equals("Doctorate")) {
            educational="Doctorate";
        }else if (cb4.getSelectedItem().equals("Others")) {
            educational= "Others";
        }

        String occupation=null;
        if(cb5.getSelectedItem().equals("Salaried")){
            occupation="Salaried";
        } else if (cb5.getSelectedItem().equals("Student")) {
           occupation="Student";
        } else if (cb5.getSelectedItem().equals("Self-Employed")) {
            occupation="Self-Employed";
        } else if (cb5.getSelectedItem().equals("Business")) {
            occupation="Business";
        }else if (cb5.getSelectedItem().equals("Retired")) {
            occupation= "Retired";
        }else if (cb5.getSelectedItem().equals("Others")) {
            occupation= "Others";
        }

        String pan=textPan.getText();
        String aadharno=textAad.getText();
        String issenCitizen=null;
        if(rb1.isSelected())
            issenCitizen="Yes";
        else if(rb2.isSelected())
            issenCitizen="No";

        String exAc=null;
        if(rb3.isSelected())
            exAc="Yes";
        else if (rb4.isSelected()) {
            exAc="No";

        }

        try{
             if(textPan.getText().equals(""))
                 JOptionPane.showMessageDialog(null,"Fill all the fields");
             else{
                 Con con2=new Con();
                 String q="insert into signup2 values('"+formno+"','"+religion+"','"+category+"','"+income+"','"+educational+"','"+occupation+"','"+pan+"','"+aadharno+"','"+issenCitizen+"','"+exAc+"')";
                 con2.statement.executeUpdate(q);
                 new Signup3(formno);
                 setVisible(false);
             }
         }catch(Exception E){
             E.printStackTrace();
         }
    }

    //    public static void main(String[] args) {
//        new Singup2(0);
//    }
}
