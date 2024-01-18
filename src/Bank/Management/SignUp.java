package Bank.Management;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SignUp extends JFrame{
    SignUp(){
        getContentPane().setBackground(Color.pink);
        setLayout(null);
        setTitle("Page No.1");
        setSize(700,700);
        setVisible(true);
        setLocation(450,100);
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("Icons/bank.png"));
        Image set=img1.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
        ImageIcon img2=new ImageIcon(set);
        JLabel label=new JLabel(img2);
        label.setBounds(15,10,30,30);
        add(label);
//        Title
        JLabel bName=new JLabel("Form |Wall| Bank");
        bName.setFont(new Font("serif",Font.BOLD,13));
        bName.setBounds(50,12,130,30);
        add(bName);
//        Form No
        Random random=new Random();
        long rNo=Math.abs((random.nextLong()%9999L)+1000L);
        System.out.println(rNo);
        JLabel fNo=new JLabel("Form No:"+rNo);
        fNo.setBounds(590,7,150,30);
        add(fNo);
//        Personal Details
        JLabel pDetails=new JLabel("Personal Details:-");
        pDetails.setFont(new Font("sanserif",Font.BOLD,30));
        pDetails.setBounds(60,80,450,40);
        add(pDetails);

        JLabel name=new JLabel("Name:");
        name.setFont(new Font("sanserif",Font.BOLD,20));
        name.setBounds(70,130,450,40);
        add(name);
        JLabel fname=new JLabel("Fathers Name:");
        fname.setFont(new Font("sanserif",Font.BOLD,20));
        fname.setBounds(70,180,450,40);
        add(fname);
        JLabel mname=new JLabel("Mothers Name:");
        mname.setFont(new Font("sanserif",Font.BOLD,20));
        mname.setBounds(70,230,450,40);
        add(mname);
        JLabel dob=new JLabel("DOB:");
        dob.setFont(new Font("sanserif",Font.BOLD,20));
        dob.setBounds(70,280,450,40);
        add(dob);


    }

    public static void main(String[] args) {
        new SignUp();
    }
}
