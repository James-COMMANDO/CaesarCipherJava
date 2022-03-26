package GitVersion.CaesarCipherJava.GUI_Version;


import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUI extends JFrame implements ActionListener {

    private JLabel mainLabel;
    private JTextField inputField;
    private JTextField outputField;
    private JLabel inputLabel;
    private JLabel outputLabel;
    private JTextField shiftBox;
    private JLabel shiftLabel;
    private JToggleButton bruteForceButton;
    private JButton encryptButton;
    private JButton decryptButton;
    private JButton copyButton;


    public GUI() {


        inputField = new JTextField(5);
        outputField = new JTextField(5);

        mainLabel = new JLabel("CaesarCipher_Java");
        inputLabel = new JLabel("Input");
        outputLabel = new JLabel("Output");
        shiftLabel = new JLabel("Shift");

        shiftBox = new JTextField(5);

        bruteForceButton = new JToggleButton("BruteForce", false);
        encryptButton = new JButton("Encrypt");
        decryptButton = new JButton("Decrypt");
        copyButton = new JButton ("Copy");

        bruteForceButton.addActionListener(this);
        bruteForceButton.setActionCommand("bruteForce_click");

        encryptButton.addActionListener(this);
        encryptButton.setActionCommand("encrypt_click");

        decryptButton.addActionListener(this);
        decryptButton.setActionCommand("decrypt_click");

        copyButton.addActionListener(this);
        copyButton.setActionCommand("copy_click");



        inputField.setToolTipText("Input Text here");
        outputField.setEnabled(false);
        outputField.setToolTipText("Outputs Encrypted/Decrypted/BruteForced Text here");
        bruteForceButton.setToolTipText("BruteForces inputted Text");
        encryptButton.setToolTipText("Encrypt inputted Text");
        decryptButton.setToolTipText("Decrypt inputted Text");
        copyButton.setToolTipText ("Copies the Output");


        setPreferredSize(new Dimension(672, 360));
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);


        add(mainLabel);
        add(inputField);
        add(outputField);
        add(inputLabel);
        add(outputLabel);
        add(shiftBox);
        add(shiftLabel);
        add(bruteForceButton);
        add(encryptButton);
        add(decryptButton);
        add(copyButton);


        mainLabel.setBounds(260, -10, 145, 85);
        inputField.setBounds(5, 145, 315, 20);
        outputField.setBounds(5, 175, 315, 20);
        inputLabel.setBounds(140, 120, 100, 25);
        outputLabel.setBounds(335, 175, 100, 25);
        shiftBox.setBounds(325, 140, 100, 25);
        shiftLabel.setBounds(340, 110, 100, 25);
        bruteForceButton.setBounds(430, 200, 100, 25);
        encryptButton.setBounds(430, 110, 100, 25);
        decryptButton.setBounds(430, 155, 100, 25);
        copyButton.setBounds(100, 220, 100, 25);
    }




    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {
            case "encrypt_click" -> {
                String encryptedText = encrypt(inputField.getText(), Integer.parseInt(shiftBox.getText()));
                outputField.setText(encryptedText);
            }

            case "decrypt_click" -> {
                String decryptedText = decrypt(inputField.getText(), Integer.parseInt(shiftBox.getText()));
                outputField.setText(decryptedText);
            }

            case "bruteForce_click" -> {
                if (bruteForceButton.isSelected()) {
                    encryptButton.setEnabled(false);
                    decryptButton.setEnabled(false);
                } else {
                    encryptButton.setEnabled(true);
                    decryptButton.setEnabled(true);
                }
                bruteForceGUI bruteForceGUI = new bruteForceGUI();
                JTextArea JtextArea = bruteForceGUI.getJTextArea();
                JtextArea.setText(bruteForce(inputField.getText()));
            }

            case "copy_click" -> {
                StringSelection stringSelection = new StringSelection(outputField.getText());
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(stringSelection, null);
            }
        }
    }


    public String encrypt(String text, int shift)
    {
        char[] chars = text.toCharArray();
        StringBuilder encryptedText = new StringBuilder();
        for (char characters : chars)
        {
            characters += shift;
            encryptedText.append(characters);
        }
        return encryptedText.toString();
    }

    public String decrypt(String text, int shift)
    {
        char[] chars = text.toCharArray();
        StringBuilder decryptedText = new StringBuilder();
        for (char characters : chars)
        {
            characters -= shift;
            decryptedText.append(characters);
        }
        return decryptedText.toString();
    }

    public String bruteForce(String text)
    {
        int letters = 26;
        StringBuilder decryptedText = new StringBuilder();

        for(int i = 1; i <= letters; i++)
        {
            String a = decrypt(text, i);
            decryptedText.append(a).append("\n");
        }
        return decryptedText.toString();
    }
}
