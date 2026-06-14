/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudostelas;


import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author andre
 */
public class telas3 {
    public static void main(String[] args){
        JFrame janela = new JFrame("Cadastro");
        janela.setSize(500, 450);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(null);
        
        //campo de nome
        JLabel lblNome = new JLabel("Nome: ");
        lblNome.setBounds(20, 30, 80, 25);
        janela.add(lblNome);
        
        JTextField txtNome = new JTextField();
        txtNome.setBounds(80, 20, 200, 25);
        janela.add(txtNome);
        
        JButton btnEnviar = new JButton("Mostrar Nome");
        btnEnviar.setBounds(100, 70, 130, 30);
        janela.add(btnEnviar);
        
        //evento de clique
        btnEnviar.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            if (txtNome.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Por favor, insira um nome!");
            } else{
                String nome = txtNome.getText();
                JOptionPane.showMessageDialog(null, "Ola, " + nome + "!");
            }
        }
        });
            
        janela.setVisible(true);
    }
}
