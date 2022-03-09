package Proyecto1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CargaMasivaLibros extends JFrame implements ActionListener {
    
    JPanel pCL1;
    JTextArea txtCL1;

    public CargaMasivaLibros() {

        this.setLayout(null);
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setTitle("Carga masiva libros");

        contenidoCargaMasivaLibros();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void contenidoCargaMasivaLibros() {

        //PANEL CARGA MASIVA USUARIOS
        pCL1 = new JPanel();
        pCL1.setLayout(null);
        pCL1.setSize(350,350);
        this.add(pCL1);

        //TEXT AREA PARA LA CARGA MASIVA (ACA ENTRARA LA INFORMACION A LA CARGA MASIVA)
        txtCL1 = new JTextArea();
        txtCL1.setBounds(3,3, 300, 300);
        txtCL1.setVisible(true);
        pCL1.add(txtCL1);

    }

    @Override
    public void actionPerformed(ActionEvent ae){
        
    }
}
