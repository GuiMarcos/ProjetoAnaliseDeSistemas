/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utfpr.projetoanalisedesistemas;

public class Aluno {
    private String RA;
    private String name;
    private String eMail;
    private String password;
    private Ticket ticket;
    
    public void setTicket(Ticket ticket){
        this.ticket = ticket;
    }
    
    public Ticket getTicket(){
        return ticket;
    }
    
    public void setRA(String RA){
        this.RA = RA;
    }
    
    public String getRA(){
        return RA;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setEmail(String eMail){
        this.eMail = eMail;
    }
    
    public String getEmail(){
        return eMail;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getPassword(){
        return password;
    }
}