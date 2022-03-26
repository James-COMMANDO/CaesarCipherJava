package GitVersion.CaesarCipherJava.GUI_Version;

import java.awt.*;
import javax.swing.*;

public class bruteForceGUI extends JFrame {
    private JTextArea area;

    public bruteForceGUI() {

        area = new JTextArea(5, 5);

        setPreferredSize(new Dimension(776, 525));
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        pack();


        add(area);

        area.setBounds(70, 35, 625, 435);
    }

    /**
     * Gets the JTextArea
     * @return JTextArea
     */
    JTextArea getJTextArea()
    {
        return area;
    }

}