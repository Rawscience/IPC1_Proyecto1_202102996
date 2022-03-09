package Proyecto1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CargaMasivaUsuarios extends JFrame implements ActionListener {
    
    private JPanel pCU1;
    private JTextArea txtCU1;
    private JScrollPane scroocg1;
    private JButton b1, b2;

    public CargaMasivaUsuarios() {

        this.setLayout(null);
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setTitle("Carga masiva usarios");

        
        //PANEL CARGA MASIVA USUARIOS
        pCU1 = new JPanel();
        pCU1.setLayout(null);
        pCU1.setSize(350,350);
        this.add(pCU1);

        //TEXT AREA PARA LA CARGA MASIVA (ACA ENTRARA LA INFORMACION A LA CARGA MASIVA)
        txtCU1 = new JTextArea();
        txtCU1.setBounds(3,3, 300, 300);
        txtCU1.setVisible(true);
        pCU1.add(txtCU1);

        //BOTONES PARA LA CARGA MASIVA Y EL REGISTRO DE ESTA
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    
}
