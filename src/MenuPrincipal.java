import com.company.FichierPatient;
import com.company.FichierRdv;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal {
    JFrame frame= new JFrame();


    JLabel label =new JLabel("Bienvenue");

    private JPanel MainMenu;

    private JButton gestionRendez_vousButton;
    private JButton gestionPatientButton;
    private JButton gestionFichiersPatientsButton;
    private JButton gestionMedecinButton;
    private JButton gestionFichiers;


    public MenuPrincipal() {
        //frame.setVisible(false);
        gestionPatientButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //frame.setVisible(true);
                label.setBounds(0,0,100,50);
                label.setFont(new Font(null,Font.PLAIN,25));
                frame.setContentPane(new Patient().getMain());

                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(420,420);
                frame.setLayout(null);
                frame.setVisible(true);

               // Patient p = new Patient();


            }
        });
        gestionMedecinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //frame.setVisible(true);
                label.setBounds(0,0,100,50);
                label.setFont(new Font(null,Font.PLAIN,25));
                frame.setContentPane(new Medecinn().getMain());

                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(420,420);
                frame.setLayout(null);
                frame.setVisible(true);
            }
        });
        gestionFichiersPatientsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //frame.setVisible(true);
                label.setBounds(0,0,100,50);
                label.setFont(new Font(null,Font.PLAIN,25));
                frame.setContentPane(new FichierPatient().getMain());

                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(420,420);
                frame.setLayout(null);
                frame.setVisible(true);
            }
        });
        gestionRendez_vousButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //frame.setVisible(true);
                label.setBounds(0,0,100,50);
                label.setFont(new Font(null,Font.PLAIN,25));
                frame.setContentPane(new FichierRdv().getMain());

                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(420,420);
                frame.setLayout(null);
                frame.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        Patient patient=new Patient();
        Medecinn medecinn=new Medecinn();
        FichierRdv fichierRdv=new FichierRdv();
        FichierPatient fichierPatient=new FichierPatient();
        JFrame frame = new JFrame("MenuPrincipal");
        frame.setContentPane(new MenuPrincipal().MainMenu);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
