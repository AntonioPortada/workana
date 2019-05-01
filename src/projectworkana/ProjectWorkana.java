/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectworkana;

import view.LoginView;

import model.AdministradorModel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

/**
 *
 * @author Antonio-PC
 */
public class ProjectWorkana extends JFrame {
    
    JPanel panel = new JPanel();
    
    private JTextField txtUser;
    private JPasswordField txtPass;
    private JComboBox boxNivel;

    /*public ProjectWorkana(){
        super("Proyecto");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(10,10,600,400);
        panel.setLayout(null);
        setContentPane(panel);
        
        JLabel lblUser = new JLabel("Ingresa tu Usuario");
        lblUser.setBounds(60, 100, 150, 30);
        lblUser.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(lblUser);
        
        txtUser = new JTextField();
        txtUser.setBounds(210, 100, 150, 30);
        panel.add(txtUser);
        
        JLabel lblPass = new JLabel("Ingresa tu Contraseña");
        lblPass.setBounds(60, 140, 150, 30);
        lblPass.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(lblPass);
        
        txtPass = new JPasswordField();
        txtPass.setBounds(210, 140, 150, 30);
        panel.add(txtPass);
        
        JButton btnCheck = new JButton("Ingresar");
        btnCheck.setBounds(200, 180, 100, 50);
        panel.add(btnCheck);
        btnCheck.addActionListener(event -> {
            AdministradorModel a = new AdministradorModel();
            
            if(txtUser.getText().equals(a.getUser()) && txtPass.getText().equals(a.getPass())){
                index index = new index();
                index.setVisible(true);
                System.exit(0);
            }
            else
                JOptionPane.showMessageDialog(null, "Datos incorrectos");
            
        });
        
        boxNivel = new JComboBox();
        boxNivel.setBounds(400, 100, 120, 30);
        boxNivel.addItem("Administrador");
        boxNivel.addItem("Docente");
        boxNivel.addItem("Alumno");
        panel.add(boxNivel);
    }*/
    
    private int getNivel(){
        if(boxNivel.getSelectedItem().toString().equals("Administrador"))
            return 1;
        else if(boxNivel.getSelectedItem().toString().equals("Docente"))
            return 2;
        else
            return 3;
    }
    
    public static void main(String[] args) {
        //new ProjectWorkana().setVisible(true);
        new LoginView().setVisible(true);
    }
    
}
