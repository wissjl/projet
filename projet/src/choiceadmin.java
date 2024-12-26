import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class choiceadmin extends JFrame implements ActionListener{
    JFrame f=new JFrame("admin's choice");
    JLabel l=new JLabel("choice of function");
    JButton b1=new JButton("add cars");
    JButton b2=new JButton("check users");
    JButton b3=new JButton("check cars");
    choiceadmin(){
        l.setBounds(170, 100, 80, 25);
        b1.setBounds(25, 150, 100, 25);
        b2.setBounds(150,150,100,25);
        b3.setBounds(275,150,100,25);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        f.add(l);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(420,420);
        f.setLayout(null);
        f.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==b2){
            f.dispose();
            new checkUsers();
        }else{
            if(e.getSource()==b1){
                f.dispose();
                new addcar();
            }else{
                f.dispose();
                new checkcar();
            }
        }
    }

}
