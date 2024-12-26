import java.sql.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class checkUsers extends JFrame implements ActionListener{
    
    
    JFrame f=new JFrame("checkusers");
    JButton login=new JButton("Login");
    JButton reset=new JButton("Reset");
    JTextField id=new JTextField();
    JPasswordField password= new JPasswordField();
    JLabel idlabel=new JLabel("user name");
    JLabel pwlabel=new JLabel("password");
    JLabel msglabel=new JLabel();
    checkUsers(){
        idlabel.setBounds(50,100, 175, 25);
        pwlabel.setBounds(50, 150, 75, 25);
        msglabel.setBounds(120,250,200,40);
        id.setBounds(125,100,150,25);
        password.setBounds(125,150,150,25);
        login.setBounds(125,200,100,25);
        login.addActionListener(this);
        login.setFocusable(false);
        reset.setBounds(225,200,100,25);
        reset.addActionListener(this);
        reset.setFocusable(false);
        f.add(id);
        f.add(password);
        f.add(login);
        f.add(reset);
        f.add(idlabel);
        f.add(pwlabel);
        f.add(msglabel);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(420,420);
        f.setLayout(null);
        f.setVisible(true);

    }
    
   
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==reset){
            id.setText("");
            password.setText("");
        }
        if(e.getSource()==login){
            String idd=id.getText();
            String wp=String.valueOf(password.getPassword());
            if(idd.equals("blabla")){
                if(wp.equals("1234")){
                    f.dispose();
                    new choiceadmin();

                }else{
                    msglabel.setText("wrong password");
                }
            }else{
                msglabel.setText("wrong username");
            }
        }
    }
    
}
