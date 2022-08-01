/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao3.DAO;

import com.mycompany.questao3.Model.Funcionario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 13289069907
 */
public class FuncionarioDAO {
    private static List<Funcionario> funcionarios = new ArrayList<>();
    
    public void salvarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
    
    public List<Funcionario> recuperarFuncionarios() {
        return funcionarios;
    }
}
