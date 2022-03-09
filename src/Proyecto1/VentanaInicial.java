package Proyecto1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaInicial extends JFrame implements ActionListener {

    // PANELES, LABELS, JTEXTFIELDS, BOTONES Y JCOMBOBOX DE LA PESTAÑA LIBROS
    JPanel pestañaLibros, p1L, p2L;
    JLabel l1L, l2L, l3L, l4L, l5L;
    JTextField t1L, t2L, t3L, t4L;
    JComboBox cb1L;
    JButton b1L, b2L;
    JTable taL1;
    JScrollPane scrollL1;

    // PANELES, LABELS, JTEXTFIELDS, BOTONES Y JCOMBOBOX DE LA PESTAÑA LIBROS
    JPanel pestañaPrestamos, p1P, p2P;
    JLabel l1P, l2P, l3P;
    JTextField t1P, t2P, t3P;
    JButton b1P, b2P;
    JTable taP1;
    JScrollPane scrollP1;

    // DE LA PESTAÑA REPORTES
    JPanel pestañaReportes, p1R, p2R;
    JLabel l1R;
    JButton b1R;
    JComboBox cb1R;
    JTable taR1;
    JScrollPane scrollR1;

    // DE LA PESTAÑA GRAFICAS
    JPanel pestañaGraficas;

    public VentanaInicial() {

        this.setSize(1300, 700);
        this.setLocationRelativeTo(null);
        this.setTitle("PROYECTO 1");
        this.setBackground(new Color(112, 110, 63));

        contenidoPestañas();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void contenidoPestañas() {

        JTabbedPane pestañas = new JTabbedPane();

        /*
         * 
         * -PESTAÑA LIBROS
         * -CONTENIDO PESTAÑA LIBROS
         * 
         */

        // PANEL DE LA LIBROS
        pestañaLibros = new JPanel();
        pestañaLibros.setLayout(null);
        pestañaLibros.setBackground(new Color(112, 110, 63));
        // pestañaLibros.setBackground(Color.MAGENTA);

        // SUB-PANEL1 LIBROS
        p1L = new JPanel();
        p1L.setLayout(null);
        p1L.setBounds(20, 20, 275, 595);
        p1L.setBackground(new Color(184, 181, 110));
        pestañaLibros.add(p1L);

        // COMPONENTES DEl SUB-PANEL 1

        // ID LIBRO
        l1L = new JLabel("ID Libro: ");
        l1L.setBounds(20, 20, 100, 25);
        p1L.add(l1L);

        t1L = new JTextField();
        t1L.setBounds(100, 20, 150, 25);
        p1L.add(t1L);

        // NOMBRE LIBRO
        l2L = new JLabel("LIbro: ");
        l2L.setBounds(20, 55, 100, 25);
        p1L.add(l2L);

        t2L = new JTextField();
        t2L.setBounds(100, 55, 150, 25);
        p1L.add(t2L);

        // AUTOR
        l3L = new JLabel("Autor:");
        l3L.setBounds(20, 90, 150, 25);
        p1L.add(l3L);

        t3L = new JTextField();
        t3L.setBounds(100, 90, 150, 25);
        p1L.add(t3L);

        // COPIAS
        l4L = new JLabel("Copias:");
        l4L.setBounds(20, 125, 150, 25);
        p1L.add(l4L);

        t4L = new JTextField();
        t4L.setBounds(100, 125, 150, 25);
        p1L.add(t4L);

        // TIPO DE LIBROS
        l5L = new JLabel("Tipo:");
        l5L.setBounds(20, 160, 150, 25);
        p1L.add(l5L);

        cb1L = new JComboBox();
        cb1L.setBounds(100, 160, 150, 25);
        p1L.add(cb1L);

        // AÑADIMOS LAS OPCIONES QUE TENDRA NUESTRO JCOMBOBOX
        cb1L.addItem("Libros");
        cb1L.addItem("Revistas");
        cb1L.addItem("Libros Electronicos");

        // BOTONES
        b1L = new JButton("Registrar");
        b1L.setBounds(55, 225, 150, 25);
        p1L.add(b1L);
        b1L.addActionListener(this);

        b2L = new JButton("Carga Masiva");
        b2L.setBounds(110, 555, 150, 25);
        p1L.add(b2L);
        b2L.addActionListener(this);

        // SUB-PANEL2 LIBROS
        p2L = new JPanel();
        p2L.setLayout(null);
        p2L.setBounds(310, 20, 950, 595);
        p2L.setBackground(new Color(184, 181, 110));
        pestañaLibros.add(p2L);

        // TABLA PARA LA PESTAÑA LIBROS
        String[] cabeceraL = { "ID libro", "Nombre Libro", "Autor", "Tipo", "Copias", "Disponibles", "Ocupados" };
        Object[][] datosL = { { "", "", "", "", "", "", "" } };

        JTable taL1 = new JTable(datosL, cabeceraL);

        scrollL1 = new JScrollPane(taL1);
        scrollL1.setBounds(20, 20, 910, 555);
        scrollL1.setVisible(true);
        p2L.add(scrollL1);

        pestañas.addTab("Libros", pestañaLibros);// SE AÑADE LA PESTAÑA

        /*******************************************************************************************************************************************/

        /*
         * 
         * -PESTAÑA PRESTAMOS
         * -CONTEIDO PESTAÑA PRESTAMOS}
         * 
         */

        // PANEL PESTAÑA PRESTAMOS
        pestañaPrestamos = new JPanel();
        pestañaPrestamos.setLayout(null);
        pestañaPrestamos.setBackground(new Color(112, 110, 63));

        // SUB-PANEL 1 PRESTAMOS!
        p1P = new JPanel();
        p1P.setLayout(null);
        p1P.setBounds(20, 20, 275, 595);
        p1P.setBackground(new Color(184, 181, 110));
        pestañaPrestamos.add(p1P);

        // CONTENIDO DEL SUB-PANEL 1
        // ID USUARIO
        l1P = new JLabel("Usuario:");
        l1P.setBounds(20, 20, 100, 25);
        p1P.add(l1P);

        t1P = new JTextField();
        t1P.setBounds(100, 20, 150, 25);
        p1P.add(t1P);

        // ID LIBRO
        l2P = new JLabel("Libro:");
        l2P.setBounds(20, 55, 100, 25);
        p1P.add(l2P);

        t2P = new JTextField();
        t2P.setBounds(100, 55, 150, 25);
        p1P.add(t2P);

        // FECHA
        l3P = new JLabel("Fecha:");
        l3P.setBounds(20, 90, 100, 25);
        p1P.add(l3P);

        t3P = new JTextField();
        t3P.setBounds(100, 90, 150, 25);
        p1P.add(t3P);

        // BOTONES
        b1P = new JButton("Prestar Libro");
        b1P.setBounds(55, 145, 150, 25);
        p1P.add(b1P);

        b2P = new JButton("Carga Masiva");
        b2P.setBounds(110, 555, 150, 25);
        p1P.add(b2P);

        // SUB-PANEL2 LIBROS
        p2P = new JPanel();
        p2P.setLayout(null);
        p2P.setBounds(310, 20, 950, 595);
        p2P.setBackground(new Color(184, 181, 110));
        pestañaPrestamos.add(p2P);

        // TABLA PARA LA PESTAÑA LIBROS
        String[] cabeceraP = { "Nombre Usuario    ", "Libro  ", "Fecha de Entrega", "Status  " };
        Object[][] datosP = { { "", "", "", "" } };

        JTable taP1 = new JTable(datosP, cabeceraP);

        scrollP1 = new JScrollPane(taP1);
        scrollP1.setBounds(20, 20, 910, 555);
        scrollP1.setVisible(true);
        p2P.add(scrollP1);

        pestañas.addTab("Prestamos", pestañaPrestamos);// SE AÑADE LA PESTAÑA

        /*******************************************************************************************************************************************/

        /*
         * 
         * -PESTAÑA REPORTES
         * -CONTEIDO PESTAÑA REPORTES
         * 
         */

        // PANEL PESTAÑA REPORTES
        pestañaReportes = new JPanel();
        pestañaReportes.setLayout(null);
        pestañaReportes.setBackground(new Color(112, 110, 63));

        // SUB-PANEL 1 REPORTES
        p1R = new JPanel();
        p1R.setLayout(null);
        p1R.setBounds(20, 20, 350, 100);
        p1R.setBackground(new Color(184, 181, 110));
        pestañaReportes.add(p1R);

        // TIPO DE REPORTE
        l1R = new JLabel("Tipo de reporte:");
        l1R.setBounds(20, 20, 170, 25);
        p1R.add(l1R);

        cb1R = new JComboBox();
        cb1R.setBounds(120, 20, 150, 25);
        p1R.add(cb1R);

        cb1R.addItem("Reporte de Usuarios");
        cb1R.addItem("Reporte de Prestamos");
        cb1R.addItem("Reporte de Libros");

        // BOTON
        b1R = new JButton("Generar");
        b1R.setBounds(145, 55, 125, 25);
        p1R.add(b1R);

        // SUB-PANEL 2 REPORTES
        p2R = new JPanel();
        p2R.setLayout(null);
        p2R.setBounds(385, 20, 875, 595);
        p2R.setBackground(new Color(184, 181, 110));
        pestañaReportes.add(p2R);

        // TABLA PARA LA PESTAÑA REPORTES
        String[] cabeceraR = { "Fecha de generacion    ", "Usuario  ", "Tipo de reporte" };
        Object[][] datosR = { { "", "", "" } };

        JTable taR1 = new JTable(datosR, cabeceraR);

        scrollR1 = new JScrollPane(taR1);
        scrollR1.setBounds(20, 20, 835, 555);
        scrollR1.setVisible(true);
        p2R.add(scrollR1);

        pestañas.addTab("Reportes", pestañaReportes);// SE AÑADE LA PESTAÑA

        /*******************************************************************************************************************************************/

        /*
         * 
         * -PESTAÑA GRAFICAS
         * -CONTEIDO PESTAÑA GRAFICAS
         * 
         */

        // PANEL PESTAÑA GRAFICAS
        pestañaGraficas = new JPanel();

        pestañas.addTab("Graficas", pestañaGraficas);// SE AÑADE LA PESTAÑA

        /*******************************************************************************************************************************************/

        getContentPane().add(pestañas);

    }

    public static void main(String[] args) {

        Login iniciar = new Login();

        iniciar.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1L) {

        }

        else if (ae.getSource() == b2L) {

            CargaMasivaLibros cl1 = new CargaMasivaLibros();
            this.dispose();
            cl1.setVisible(true);

        }
    }

}
