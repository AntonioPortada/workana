/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import view.LoginView;

import javax.swing.JMenu;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Antonio-PC
 */
public abstract class index extends JFrame {
    
    public index(){
        JMenuBar bar = new JMenuBar();
        JMenu menuOptions = new JMenu("Opciones");
        JMenuItem itemProfile = new JMenuItem("Perfil");
        JMenuItem itemLogout = new JMenuItem("Logout");
        JMenuItem itemExit = new JMenuItem("Exit");
        menuOptions.add(itemProfile);
        menuOptions.add(itemLogout);
        menuOptions.add(itemExit);
        bar.add(menuOptions);
        setJMenuBar(bar);
        itemExit.addActionListener(event -> {
            System.exit(0);
        });
        itemLogout.addActionListener(event -> {
            new LoginView().setVisible(true);
            dispose();
        });
        itemProfile.addActionListener(event -> {
            
        });
    }
}
