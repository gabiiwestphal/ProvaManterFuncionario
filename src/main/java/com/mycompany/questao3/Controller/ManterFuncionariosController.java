/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao3.Controller;

import com.mycompany.questao3.DAO.FuncionarioDAO;
import com.mycompany.questao3.Exception.CampoVazioException;
import com.mycompany.questao3.Model.Funcionario;
import com.mycompany.questao3.View.ManterFuncionariosView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 13289069907
 */
public class ManterFuncionariosController {
    
    private Funcionario funcionario;
    private ManterFuncionariosView mfv;
    
    
    public ManterFuncionariosController(ManterFuncionariosView mfv) {
        this.funcionario = new Funcionario();
        this.mfv = mfv;
        inicializarAcaoBotoes();
    }
    
    private void inicializarAcaoBotoes() {
        mfv.adicionarAcaoCadastrarFuncionario(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                try {
                    salvarFuncionario(funcionario);
                    atualizarDadosNaTela(funcionario);
                    funcionario = new Funcionario();
                } catch (CampoVazioException ex) {
                    mfv.exibirMensagem(ex.getMessage());
                }          
            }
            
        });
    }
    
    private void salvarFuncionario(Funcionario funcionario) throws CampoVazioException {
        FuncionarioDAO funcDAO = new FuncionarioDAO();
        
            funcionario.setNome(mfv.getNome());
            funcionario.setCargo(mfv.getCargo());
            funcionario.setDataAdmissao(mfv.getDataAdmissao());
            
            funcDAO.salvarFuncionario(funcionario);
            mfv.exibirMensagem("Sucesso!");     
        
    }
    
    public void atualizarDadosNaTela(Funcionario funcionario) {
        mfv.atualizarDados(funcionario.toString());
    }
    
    public void exibirTela() {
        this.mfv.exibir();
    }
}
