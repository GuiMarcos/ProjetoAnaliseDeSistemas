/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utfpr.projetoanalisedesistemas;

/**
 *
 * @author ferna
 */

public class BancoDeDados {
    
    public boolean verificaDados(String ra, String password){
        if(ra.equals("1"))
            return true;
        else
            return false;
    }
    
    BancoDeDados(){
        //Inicializar Banco de Dados
    }  
}
