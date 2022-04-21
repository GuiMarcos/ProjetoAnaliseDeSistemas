/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utfpr.projetoanalisedesistemas;

/**
 *
 * @author ferna
 */
public class Aluno {
    private String email;
    private String name;
    private String ra;
    private String password;
    
    public Aluno() {
        email = "";
        name = "";
        ra = "";
        password = "";
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getRa() {
        return ra;
    }

    public String getPassword() {
        return password;
    }
}
