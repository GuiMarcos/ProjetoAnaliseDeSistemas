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
    private String name;
    
    Screen(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
}
