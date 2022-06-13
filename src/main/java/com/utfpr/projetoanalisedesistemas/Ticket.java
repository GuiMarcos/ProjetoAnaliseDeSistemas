/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utfpr.projetoanalisedesistemas;

import java.util.ArrayList;
import java.util.List;


public class Ticket {
    private final float basePrice = 3.50f;
    private double valorTotal;
    private List<String> adicionais = new ArrayList<String>();

    public Ticket() {
    }
    
    public List<String> getAdicionais() {
        return adicionais;
    }
    
    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public float getBasePrice() {
        return basePrice;
    }
    
    public void incluiAdicional(String adicional){
        adicionais.add(adicional);
    }
    
    public void retiraAdicional(String adicional){
        for(int i=0; i<adicionais.size(); i++){
            String aux = adicionais.get(i);
            
            if(adicional.equals(aux)){
                adicionais.remove(aux);
                
                System.out.println("adicional removido: "+aux);
            }
            
        }
    }
    
    public boolean adicionalEstaIncluso(String adicional){
        for(int i=0; i<adicionais.size(); i++){
            String aux = adicionais.get(i);
            
            if(adicional.equals(aux)){
                return true;
            }
            
        }
        return false;
    }
    
    public void imprimeAdicionais(){
        System.out.println("\nadicionais selecionados: ");
        
        for(int i=0; i<adicionais.size(); i++){
            System.out.println(adicionais.get(i));
        }
    }
    
}
