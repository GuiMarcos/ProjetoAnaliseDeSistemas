/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utfpr.projetoanalisedesistemas;

import javax.swing.JPanel;

/**
 *
 * @author ferna
 */
public class Screen extends JPanel {
    private final String name;
    private static Aluno estudanteLogado;
    private static Ticket ticketEstudanteLogado;

    public static Ticket getTicketEstudanteLogado() {
        return ticketEstudanteLogado;
    }

    public static void setTicketEstudanteLogado(Ticket ticketEstudanteLogado) {
        Screen.ticketEstudanteLogado = ticketEstudanteLogado;
    }

    public static Aluno getEstudanteLogado() {
        return estudanteLogado;
    }

    public static void setEstudanteLogado(Aluno estudanteLogado) {
        Screen.estudanteLogado = estudanteLogado;
    }
    
    Screen(String name){
        this.name = name;
    }
    
    @Override
    public String getName(){
        return name;
    }
}
