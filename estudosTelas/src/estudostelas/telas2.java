/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudostelas;
import javax.swing.*;
/**
 *
 * @author andre
 */
public class telas2 {
    public static void main(String[] args){
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
        if (nome.equals("")) return;
        int confirma = JOptionPane.showConfirmDialog(null, "Confirmar nome: " + nome + " ?");
        if (confirma == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Bem-vindo(a), " + nome + "!");
            JFrame areaTrabalho = new JFrame("FICHA DE CADASTRO - iSYS");
            areaTrabalho.setSize(500, 450);
            areaTrabalho.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            areaTrabalho.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Opercao cancelada");
        }
    }
}
