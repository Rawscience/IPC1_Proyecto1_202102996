package Proyecto1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {

    static Usuarios[] users = new Usuarios[50];
    static int cUsers = 0;

    JPanel panelLogin = new JPanel();
    JButton btnIngreso, btnCargaMasiva;
    JTextField txtUsuario, txtPass;

    public Login() {

        this.setSize(350, 300);
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(11, 45, 90));
        this.setTitle("PROYECTO 1");

        iniciar();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void AgregarUsuarios(Usuarios user) {
        if (cUsers < users.length) {
            users[cUsers] = user;
            cUsers++;
        } else {
            JOptionPane.showMessageDialog(null, "YA NO HAY ESPACIO PARA MAS USUARIOS");
        }

    }

    private void iniciar() {// SE ESTABLECE LOS METODOS QUE SE EJECUTARAN EN LA VENTANA DENTRO DEL PANEL
                            // PRINCIPAOL

        colocarPaneles();
        colocarLabels();
        colocarBotones();
        colocarTextField();

    }

    private void colocarPaneles() {

        // ATRIBUTOS DADOS AL PANEL DEL LOGIN
        panelLogin.setBackground(new Color(184, 181, 110));
        panelLogin.setLayout(null);
        this.getContentPane().add(panelLogin);
    }

    private void colocarLabels() {

        JLabel lblUsuario = new JLabel();
        // ATRIBUTOS PARA EL LABEL DEL USUARIO
        lblUsuario.setText("Usuario: ");
        lblUsuario.setBounds(25, 50, 50, 25);
        panelLogin.add(lblUsuario);

        JLabel lblPass = new JLabel();
        // ATRIBUTOS PARA EL LABEL DE LA CONTRASEÑA
        lblPass.setText("Ingrese contraseña: ");
        lblPass.setBounds(25, 100, 125, 25);
        panelLogin.add(lblPass);
    }

    private void colocarBotones() {

        btnIngreso = new JButton("Iniciar sesion");
        // BOTON PARA INGRESAR A LA BIBLIOTECA
        btnIngreso.setBounds(100, 150, 125, 25);
        panelLogin.add(btnIngreso);
        btnIngreso.addActionListener(this);

        btnCargaMasiva = new JButton();
        btnCargaMasiva.setText("Carga Masiva");
        btnCargaMasiva.setBounds(200, 200, 125, 25);
        panelLogin.add(btnCargaMasiva);
    }

    private void colocarTextField() {

        txtUsuario = new JTextField();
        txtUsuario.setBounds(160, 50, 125, 25);
        txtUsuario.getText();
        panelLogin.add(txtUsuario);

        txtPass = new JTextField();
        txtPass.setBounds(160, 100, 125, 25);
        panelLogin.add(txtPass);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btnIngreso) {

            this.dispose();

            VentanaInicial ventana = new VentanaInicial();

            ventana.setVisible(true);

        }

        else {
            JOptionPane.showInputDialog("USUARIO NO REGISTRADO");
        }
    }
}
