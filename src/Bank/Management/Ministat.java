package Bank.Management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;


public class Ministat extends JFrame implements ActionListener {
    String pin;
    JButton b1;
    Ministat(String pin){
        this.pin=pin;
        setTitle("Mini Statement");
        setSize(400,600);
        setLocation(50,30);
        setVisible(true);
        setLayout(null);
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("Icons/bank.png"));
        Image set=img1.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
        ImageIcon img2=new ImageIcon(set);
        JLabel label=new JLabel(img2);
        label.setBounds(170,35,30,30);
        add(label);
//        Title
        JLabel bName=new JLabel("Form | Wall | Bank");
        bName.setFont(new Font("serif",Font.BOLD,14));
        bName.setBounds(126,65,130,30);
        add(bName);
        try{
            Connect c=new Connect();
            ResultSet rs=c.s.executeQuery("select * from login where Pin='"+pin+"'" );

        }
        catch (Exception e){
            System.out.println(e);
        }





        b1=new JButton("Back");
        b1.setBounds(135,500,100,30);
        b1.setFont(new Font("SanSerif",Font.BOLD,17));
        b1.addActionListener(this);
        b1.setBackground(Color.pink);
        b1.setForeground(Color.BLACK);
        add(b1);




    }

    public static void main(String[] args) {
        new Ministat("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            setVisible(false);
            new Transactions(pin).setVisible(true);

        }

    }
}
