/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utfpr.projetoanalisedesistemas;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Email {
    
    private static final String emailOrigem = "self.ru.05@gmail.com";
    private static final String senhaEmailOrigem = "xubgcjjqvkaicbtq";
    private static final String hostName = "smtp.gmail.com";
    private static final int hostPort = 465;
    
    public static void sendEmail(Aluno estudante, Ticket compra) throws EmailException {
        String emailAluno = estudante.getEmail();
        String nomeAluno = estudante.getName();

        // data/hora atual
        LocalDateTime agora = LocalDateTime.now();

        // formatar a data
        DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        String dataFormatada = formatterData.format(agora);
        
        Locale localeBR = new Locale("pt","BR");
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

        List<String> adicionais = compra.getAdicionais();
        double valorCompra = compra.getValorTotal(); 
        
        SimpleEmail email = new SimpleEmail();
        //Utilize o hostname do seu provedor de email
        System.out.println("alterando hostname...");
        email.setHostName(hostName);
        //Quando a porta utilizada não é a padrão (gmail = 465)
        email.setSmtpPort(hostPort);
        //Adicione os destinatários
        email.addTo(emailAluno, nomeAluno);
        //Configure o seu email do qual enviará
        email.setFrom(emailOrigem, "SelfRU");
        //Adicione um assunto
        email.setSubject("PEDIDO RU");
        
        String mensagem = "UTFPR - CENTRO\n O seu pedido foi confirmado\n\n Itens:\n - Refeição;\n";
        for(int i=0; i<adicionais.size(); i++){
                mensagem = mensagem+" - "+adicionais.get(i)+";\n";
        }
        mensagem = mensagem+" Valor: "+dinheiro.format(valorCompra)+"\n Data: "+dataFormatada
                + "\n\n---APRESENTE ESSE EMAIL PARA RETIRAR O PEDIDO---";
        
        
        //Adicione a mensagem do email
        email.setMsg(mensagem);
        //Para autenticar no servidor é necessário chamar os dois métodos abaixo
        System.out.println("autenticando...");
        email.setSSLOnConnect(true);
        email.setAuthentication(emailOrigem, senhaEmailOrigem);
        System.out.println("enviando...");
        email.send();
        System.out.println("Email enviado!");
    }
}
