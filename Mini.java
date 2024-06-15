package banking.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Mini extends JFrame implements ActionListener {

    String pin;

    JButton button;
    void initElements() {
        JLabel label1 = new JLabel();
        label1.setBounds(20, 140, 400, 250);
        add(label1);

        JLabel label2 = new JLabel("INDIAN BANK");
        setFont(new Font("System", Font.BOLD, 15));
        label2.setBounds(150, 20, 200, 30);
        add(label2);

        JLabel label3 = new JLabel();
        label3.setBounds(20, 80, 300, 30);
        add(label3);

        JLabel label4 = new JLabel();
        label4.setBounds(20, 400, 300, 30);
        add(label4);

        try {
            Con c = new Con();
            String q1 = "SELECT * FROM login WHERE pin='" + pin + "'";
            ResultSet resultSet = c.statement.executeQuery(q1);
            while (resultSet.next()) {
                label3.setText("Card Number: " + resultSet.getString("card_no").substring(0, 4) + "XXXXXXXXXXXX" + resultSet.getString("card_no").substring(12));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            int balance = 0;
            Con c1 = new Con();
            String q1 = "SELECT * FROM bank WHERE pin='" + pin + "' ORDER BY date DESC LIMIT 10;";
            ResultSet resultSet = c1.statement.executeQuery(q1);
            while (resultSet.next()) {
                label1.setText(label1.getText()+"<html>"+resultSet.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("amount")+"<br><br><html>");
                if (resultSet.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
            label4.setText("Your Total Balance is Rs "+balance);
        } catch (Exception e) {
            e.printStackTrace();
        }

        button=new JButton("Exit");
        button.setBounds(20,500,100,25);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.addActionListener(this);
        add(button);


    }


        Mini(String pin){
        this.pin=pin;
        initElements();
        getContentPane().setBackground(new Color(255,204,204));
        setLocation(20,20);
        setSize(400,600);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
                setVisible(false);
                new main_class(pin);
        }catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Mini("");
    }
}
