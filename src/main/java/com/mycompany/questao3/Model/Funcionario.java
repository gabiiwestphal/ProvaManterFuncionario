/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao3.Model;

import com.mycompany.questao3.Exception.CampoVazioException;

/**
 *
 * @author 13289069907
 */
public class Funcionario {
    private int matricula;
    private String nome;
    private String cargo;
    private String dataAdmissao;
    
    private static int geradorMatricula;
    
    public Funcionario() {
        this.matricula = gerarMatricula();
    }
    
    public int gerarMatricula() {
        return ++geradorMatricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws CampoVazioException {

        if(nome.isBlank()) {
            throw new CampoVazioException();
        }
        
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) throws CampoVazioException{
        
        if(cargo.isBlank()) {
            throw new CampoVazioException();
        }
        
        this.cargo = cargo;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) throws CampoVazioException {  
        
        if(dataAdmissao.isBlank()) {
            throw new CampoVazioException();
        }
        
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public String toString() {
        return matricula + " - " + nome + " - " + cargo + " - " + dataAdmissao;
    }
    
    
}
