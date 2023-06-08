import java.awt.*;
import java.net.*;
import javax.swing.*;
import java.awt.event.*;

public class LinkButton {
    public static void main(String[] args) throws Exception {
        final URI uri = new URI("https://kandkeprajwal2.wixsite.com/my-site-2/home");
        JFrame frame = new JFrame("Link");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        Container container = frame.getContentPane();
        container.setLayout(new GridBagLayout());

        JButton button = new JButton();
        button.setText("prajwal web");
        button.setHorizontalAlignment(SwingConstants.LEFT);
        button.setBorderPainted(false);
        button.setOpaque(false);
        button.setBackground(Color.orange);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Desktop.isDesktopSupported()) {
                    Desktop desktop = Desktop.getDesktop();
                    try {
                        desktop.browse(uri);
                    } catch (Exception ex) {
                    }
                } else {
                }
            }
        });
        container.add(button);
        frame.setVisible(true);
    }
}
