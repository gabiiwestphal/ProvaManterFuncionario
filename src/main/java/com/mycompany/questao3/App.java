/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao3;

import com.mycompany.questao3.Controller.ManterFuncionariosController;
import com.mycompany.questao3.View.ManterFuncionariosView;

/**
 *
 * @author 13289069907
 */
public class App {
    public static void main(String[] args) {
        ManterFuncionariosController mfc = new ManterFuncionariosController(new ManterFuncionariosView());
        
        mfc.exibirTela();
    }
   
}
