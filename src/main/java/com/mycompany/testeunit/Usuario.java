package com.mycompany.testeunit;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
Gustavo Rodriguez Braghetti     TIA : 32057725​
Gabriel Soares Diniz                  TIA : 32049536​
Gabriel Penella Chequer             TIA : 32040377​
Lucas Pereira Pires                    TIA : 32078935
 */
public class Usuario {
    public String classificaIdade (int ano){
        
        String retonaClassificacao;
        
        if (ano >= 1900 && ano <= 2022){
            retonaClassificacao = "Data válida";
        } else {
            retonaClassificacao = "Data inválida";
        }
        
        return retonaClassificacao;
    }
    
    public String classificaNota(int nota){
        
        String retonaClassificacao;
        
        if (nota >= 0 && nota <= 10){
            retonaClassificacao = "Nota válida";
        } else {
            retonaClassificacao = "Nota inválida";
        }
        
        return retonaClassificacao;
    }
    
    public String classificaMotorista(int idade){
        
        String retonaClassificacao;
        
        if(idade < 50){
            retonaClassificacao = "10 anos";
        } else if (idade >= 70){
            retonaClassificacao = "3 anos";
        } else {
            retonaClassificacao =  "5 anos";
        }
        
        return retonaClassificacao;
    }
}
