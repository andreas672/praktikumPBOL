import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class App extends JFrame {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Login & Regsiter");
        frame.setSize(350, 450);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        CardLayout card = new CardLayout();
        // frame.setLayout(card);

        JPanel mainFrame = new JPanel();
        mainFrame.setLayout(card);

        loginPanel login = new loginPanel(card, mainFrame);
        registerPanel register = new registerPanel(card, mainFrame);

        mainFrame.add(login, "loginPanel");
        mainFrame.add(register, "registerPanel");



        frame.add(mainFrame);
        frame.setVisible(true);

    }
}


    class loginPanel extends JPanel {

        loginPanel(CardLayout card, JPanel mainFrame) {

            
            setLayout(new GridBagLayout());
            setBackground(Color.DARK_GRAY);
            GridBagConstraints gbc = new GridBagConstraints();

            // label LOGIN
            JLabel login = new JLabel("LOGIN");
            login.setFont(new Font("SansSerif", Font.BOLD, 24));
            login.setForeground(Color.WHITE);
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.insets = new Insets(20, 0, 20, 0); 
            gbc.anchor = GridBagConstraints.CENTER;
            add(login, gbc);

            //  label email
            JLabel email = new JLabel("Email");
            email.setForeground(Color.WHITE);
            gbc.gridy = 1;
            gbc.insets = new Insets(5, 0, 5, 0); 
            gbc.anchor = GridBagConstraints.WEST;
            add(email, gbc);

            // TextField Email
            JTextField textField1 = new JTextField(15);
            gbc.gridx = 0;
            gbc.gridy = 2;
            gbc.insets = new Insets(0, 0, 10, 0); 
            gbc.fill = GridBagConstraints.HORIZONTAL;
            add(textField1, gbc);

            // Label Password
            JLabel password = new JLabel("Password");
            password.setForeground(Color.WHITE);
            gbc.gridx = 0;
            gbc.gridy = 3;
            gbc.insets = new Insets(5, 0, 5, 0); 
            gbc.anchor = GridBagConstraints.WEST;
            add(password, gbc);

            // TextField Password
            JTextField textField2 = new JTextField(15);
            gbc.gridx = 0;
            gbc.gridy = 4;
            gbc.insets = new Insets(0, 0, 20, 0); 
            gbc.fill = GridBagConstraints.HORIZONTAL;
            add(textField2, gbc);

            // Tombol Login
            JButton loginB = new JButton("LOGIN");
            loginB.setBackground(Color.GRAY);
            loginB.setForeground(Color.WHITE);
            loginB.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Menampilkan dialog saat tombol login ditekan
                    JOptionPane.showMessageDialog(loginB, "Mungkin berhasil, database belum terhubung, jadi ngak tau", "Login", JOptionPane.INFORMATION_MESSAGE);
                }
            });
            gbc.gridx = 0;
            gbc.gridy = 5;
            gbc.insets = new Insets(10, 0, 10, 0); 
            gbc.fill = GridBagConstraints.NONE;
            gbc.anchor = GridBagConstraints.WEST;
            add(loginB, gbc);

            // Label "Don't Have Account"
            JLabel prom = new JLabel("Don't Have an Account?");
            prom.setForeground(Color.WHITE);
            gbc.gridx = 0;
            gbc.gridy = 6;
            gbc.insets = new Insets(10, 0, 5, 0); 
            gbc.anchor = GridBagConstraints.WEST;
            add(prom, gbc);

            // Tombol Register
            JButton regisB = new JButton("Register");
            regisB.setBackground(Color.gray);
            regisB.setForeground(Color.WHITE);
            gbc.gridx = 1;
            gbc.gridy = 6;
            gbc.insets = new Insets(0, -30, 0, 0); 
            gbc.fill = GridBagConstraints.NONE;
            gbc.anchor = GridBagConstraints.WEST;
            regisB.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    card.show(mainFrame, "registerPanel");
                }
            });
            add(regisB, gbc);

        }
    }

    class registerPanel extends JPanel {

        registerPanel(CardLayout card, JPanel mainFrame) {

            setLayout(new GridBagLayout());
            setBackground(Color.DARK_GRAY);
            GridBagConstraints gbc = new GridBagConstraints();

            // Mengatur label "register"
            JLabel register = new JLabel("REGISTER");
            register.setFont(new Font("SansSerif", Font.BOLD, 24));
            register.setForeground(Color.WHITE);
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.insets = new Insets(20, 0, 20, 0); 
            gbc.anchor = GridBagConstraints.CENTER;
            add(register, gbc);

            // Label NAME
            JLabel labelName = new JLabel("Name");
            labelName.setForeground(Color.white);
            gbc.gridx = 0;
            gbc.gridy = 1;
            gbc.insets = new Insets(5, 0, 5, 0); 
            gbc.anchor = GridBagConstraints.WEST;
            add(labelName, gbc);

            // TextField NAME
            JTextField textFieldName = new JTextField(15);
            gbc.gridx = 0;
            gbc.gridy = 2;
            gbc.insets = new Insets(0, 0, 10, 0); 
            gbc.fill = GridBagConstraints.HORIZONTAL;
            add(textFieldName, gbc);


            // Label Email
            JLabel labelEmail = new JLabel("Email");
            labelEmail.setForeground(Color.white);
            gbc.gridx = 0;
            gbc.gridy = 3;
            gbc.insets = new Insets(5, 0, 5, 0); 
            gbc.anchor = GridBagConstraints.WEST;
            add(labelEmail, gbc);

            // TextField Email
            JTextField textFieldEmail = new JTextField(15);
            gbc.gridx = 0;
            gbc.gridy = 4;
            gbc.insets = new Insets(0, 0, 10, 0); 
            gbc.fill = GridBagConstraints.HORIZONTAL;
            add(textFieldEmail, gbc);

            // Label Password
            JLabel password2 = new JLabel("Password");
            password2.setForeground(Color.white);
            gbc.gridx = 0;
            gbc.gridy = 5;
            gbc.insets = new Insets(5, 0, 5, 0); 
            gbc.anchor = GridBagConstraints.WEST;
            add(password2, gbc);

            // TextField Password
            JTextField textField3 = new JTextField(15);
            gbc.gridx = 0;
            gbc.gridy = 6;
            gbc.insets = new Insets(0, 0, 20, 0); 
            gbc.fill = GridBagConstraints.HORIZONTAL;
            add(textField3, gbc);

            // Tombol register
            JButton registerB = new JButton("register");
            registerB.setBackground(Color.GRAY);
            registerB.setForeground(Color.WHITE);
            registerB.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Menampilkan dialog saat tombol register ditekan
                    JOptionPane.showMessageDialog(registerB, "Pendaftaran mungkin berhasil, program terpotong", "Register", JOptionPane.INFORMATION_MESSAGE);
                }
            });
            gbc.gridx = 0;
            gbc.gridy = 7;
            gbc.insets = new Insets(10, 0, 10, 0); 
            gbc.fill = GridBagConstraints.NONE;
            gbc.anchor = GridBagConstraints.WEST;
            add(registerB, gbc);

            // I have an account"
            JLabel prom2 = new JLabel("I have an Account");
            prom2.setForeground(Color.WHITE);
            gbc.gridx = 0;
            gbc.gridy = 8;
            gbc.insets = new Insets(10, 0, 5, 0); 
            gbc.anchor = GridBagConstraints.WEST;
            add(prom2, gbc);

            // Tombol ke LOGIN
            JButton LoginB = new JButton("LOGIN");
            LoginB.setBackground(Color.gray);
            LoginB.setForeground(Color.WHITE);
            gbc.gridx = 1;
            gbc.gridy = 8;
            gbc.insets = new Insets(0, -30, 0, 0); 
            gbc.fill = GridBagConstraints.NONE;
            gbc.anchor = GridBagConstraints.WEST;
            LoginB.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    card.show(mainFrame, "loginPanel");
                }
            });
            add(LoginB, gbc);

        }


    }
    
