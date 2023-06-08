import javax.swing.*;
import java.net.URI;

public class Swing {
    public static void main(String[]args){
        JFrame f=new JFrame();


        JButton b =new JButton("prajwal");

        b.setBounds(130,100,100,40);

        f.add(b);//adding button in JFrame

        f.setSize(400,500);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);

        JButton a =new JButton("kandke");
        f.add(a);//adding button in JFrame
        a.setBounds(110,70,130,40);

        f.setSize(400,500);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);

        }

    }
