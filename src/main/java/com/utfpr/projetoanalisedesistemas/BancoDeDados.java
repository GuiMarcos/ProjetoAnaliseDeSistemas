/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utfpr.projetoanalisedesistemas;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class BancoDeDados {
    private static ConexaoMySQL conexao;
    private static Aluno estudante;
        
    BancoDeDados(){
        //Inicializar Banco de Dados
    } 
    
    public boolean verificaDadosAluno(String ra, String password){
        //return ra.equals("1") && password.equals("1");
        String DATABASE = "alunosUTFPR";
        String QUERY = "SELECT * FROM dados";
        estudante = null;
        
        conexao = new ConexaoMySQL(DATABASE);
        
        System.out.println(conexao.statusConection());
        
        try{
            java.sql.Connection con = conexao.getConexaoMySQL();
            
            System.out.println(conexao.statusConection());

            PreparedStatement ps = con.prepareStatement(QUERY);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                String nomeAluno = rs.getString("nome");
                String raAluno = rs.getString("RA");
                String senhaAluno = rs.getString("senha");
                String emailAluno = rs.getString("eMail");

                if(raAluno.equals(ra) && senhaAluno.equals(password)){
                    estudante = new Aluno();
                    
                    estudante.setName(nomeAluno);
                    estudante.setRA(raAluno);
                    estudante.setPassword(senhaAluno);
                    estudante.setEmail(emailAluno);
                    
                    conexao.fecharConexao();
                    return true;
                }
            }
        }
        catch (SQLException e){
            System.out.println("Erro na validação do aluno");
        }
        
        System.out.println(conexao.statusConection());
        
        conexao.fecharConexao();
        return false;
        
    }
    
    public static void imprimeInfoAlunoValidado(){
        if(estudante != null){
            System.out.println(estudante.getName()+", RA:"+estudante.getRA()+", Senha:"+estudante.getPassword()+", E-Mail:"+estudante.getEmail());
        }
    }
    
    public static Aluno retornaEstudanteValidado(){
        return estudante;
    }
 
    public double encontraPrecoItem(String produto) {
        //procurar item no banco de dados e retornar preço
        String DATABASE = "alunosUTFPR";
        String QUERY = "SELECT * FROM precos_doces_ru UNION SELECT * FROM precos_bebidas_ru";
        
        conexao = new ConexaoMySQL(DATABASE);
        
        System.out.println(conexao.statusConection());
        
        try{
            java.sql.Connection con = conexao.getConexaoMySQL();
            
            System.out.println(conexao.statusConection());

            PreparedStatement ps = con.prepareStatement(QUERY);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                String nomeProduto = rs.getString("nome");
                
                if(nomeProduto.equals(produto)){
                    double precoProduto = rs.getDouble("preco");
                    
                    conexao.fecharConexao();
                    return precoProduto;
                }
            }
        }
        catch (SQLException e){
            //System.out.println("Erro na validação do aluno");
            System.out.println("Produto não encontrado");
        }
        
        System.out.println(conexao.statusConection());
        
        conexao.fecharConexao();

        return 0;
    }
    
    public int transferenciaBancaria(String tipoDaCompra, String nCartao, String nTitular, String nCVV, String valCartao, double precoTotal){
        String DATABASE = "contasbancarias";
        
        String numeroCartao;
        String nomeTitular;
        String cvv;
        String validadeCartao;
        
        if(tipoDaCompra.equals("crédito")){
            //procurar item no banco de dados e retornar preço
            String QUERY = "SELECT * FROM dadoscartaocredito";
    

            conexao = new ConexaoMySQL(DATABASE);

            System.out.println(conexao.statusConection());

            try{
                java.sql.Connection con = conexao.getConexaoMySQL();

                System.out.println(conexao.statusConection());

                PreparedStatement ps = con.prepareStatement(QUERY);

                ResultSet rs = ps.executeQuery();

                while(rs.next()){
                    numeroCartao = rs.getString("numeroCartao");
                    nomeTitular = rs.getString("titular");
                    cvv = rs.getString("CVV");
                    validadeCartao = rs.getString("validadeCartao");

                    System.out.println("numero cartao: "+numeroCartao);
                    if(numeroCartao.equals(nCartao) && nomeTitular.equals(nTitular) 
                        && cvv.equals(nCVV) && validadeCartao.equals(valCartao)){
                        System.out.println("entrou");
                        conexao.fecharConexao();

                        return 1;
                    }
                    
                }
            }
            catch (SQLException e){
                //System.out.println("Erro na validação do aluno");
                System.out.println("Erro no pagamento com cartao de credito");
            }

            System.out.println(conexao.statusConection());

            conexao.fecharConexao();
            return 0;
        }
        else{
            //procurar item no banco de dados e retornar preço
            String QUERY = "SELECT * FROM dadoscartaodebito";
            //String QUERY2 = "SELECT * FROM saldos";

            conexao = new ConexaoMySQL(DATABASE);

            System.out.println(conexao.statusConection());

            try{
                java.sql.Connection con = conexao.getConexaoMySQL();

                System.out.println(conexao.statusConection());

                PreparedStatement ps = con.prepareStatement(QUERY);

                ResultSet rs = ps.executeQuery();

                while(rs.next()){
                    numeroCartao = rs.getString("numeroCartao");
                    nomeTitular = rs.getString("titular");
                    cvv = rs.getString("CVV");
                    validadeCartao = rs.getString("validadeCartao");
                    String numeroConta = rs.getString("numeroConta");

                    if(numeroCartao.equals(nCartao) && nomeTitular.equals(nTitular) 
                        && cvv.equals(nCVV) && validadeCartao.equals(valCartao)){

                        //conexao.fecharConexao();
                        return atualizaSaldos(numeroConta, nomeTitular, precoTotal);
                    }
                    
                }
            }
            catch (SQLException e){
                //System.out.println("Erro na validação do aluno");
                System.out.println("Erro no pagamento com cartao de debito");
            }

            System.out.println(conexao.statusConection());

            conexao.fecharConexao();
            return 0;
        }
    
    }
    
    public int atualizaSaldos(String numeroConta, String nomeTitular, double precoTotal){
        String DATABASE = "contasbancarias";
        String QUERY = "SELECT saldo FROM saldos WHERE numeroConta='4' and titular='UTFPR'";
        String QUERY2 = "SELECT * FROM saldos";
        
        //conexao = new ConexaoMySQL(DATABASE);
        
        System.out.println("Preco da compra: "+precoTotal);
        System.out.println(conexao.statusConection());
        
        try{
            java.sql.Connection con = conexao.getConexaoMySQL();
            
            System.out.println(conexao.statusConection());

            PreparedStatement ps = con.prepareStatement(QUERY);
            ResultSet rs = ps.executeQuery();
            
            Statement s = con.createStatement();
            
            double saldoUTFPR = 0;
            double saldoCliente = 0;
            
            while(rs.next()){
                saldoUTFPR = rs.getDouble("saldo");
                System.out.println("Saldo inicial da UTFPR: "+saldoUTFPR);
                saldoUTFPR= saldoUTFPR+precoTotal;
                System.out.println("Saldo final da UTFPR: "+saldoUTFPR);
            }
            
            //return true;
            
            ps = con.prepareStatement(QUERY2);
            rs = ps.executeQuery();
            
            while(rs.next()){
                String nConta = rs.getString("numeroConta");
                String nTitular = rs.getString("titular");
                
                if(nConta.equals(numeroConta) && nTitular.equals(nomeTitular)){
                    saldoCliente = rs.getDouble("saldo");
                    System.out.println("Saldo inicial do cliente: "+saldoCliente);
                    
                    saldoCliente = saldoCliente-precoTotal;
                    System.out.println("Saldo final do cliente: "+saldoCliente);
                    
                    if(saldoCliente<=0){
                        System.out.println("Cliente não tem dinheiro o suficiente");
                        saldoCliente = saldoCliente-precoTotal;
                        return -1;
                    }
                    
                    String QUERY3 = "UPDATE saldos SET saldo="+saldoCliente+" WHERE numeroConta='"+numeroConta+"' and titular='"+nomeTitular+"'";
                    s.executeUpdate(QUERY3);
                    
                    
                    String QUERY4 = "UPDATE saldos SET saldo="+saldoUTFPR+" WHERE numeroConta='4' and titular='UTFPR'";
                    s.executeUpdate(QUERY4);
                    
                    conexao.fecharConexao();
                    return 1;
                }
            }
            
        }
        catch (SQLException e){
            //System.out.println("Erro na validação do aluno");
            System.out.println("Erro na transferencia de dinheiro");
        }
        
        System.out.println(conexao.statusConection());
        
        conexao.fecharConexao();

        return 0;
    }

    void getCardapio() {
       //
    }
}
