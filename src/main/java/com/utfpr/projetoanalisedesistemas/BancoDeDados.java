/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utfpr.projetoanalisedesistemas;


public class BancoDeDados {
        
    BancoDeDados(){
        //Inicializar Banco de Dados
    } 
    
    public boolean verificaDados(String ra, String password){
        return ra.equals("1") && password.equals("1");
    }
 
    public float encontraItem(String text) {
        //procurar item no banco de dados e retornar preço
        return 1;
    }
}
