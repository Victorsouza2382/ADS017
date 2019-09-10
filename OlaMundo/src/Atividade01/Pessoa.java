/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade01;

/**
 *
 * @author 18214290005
 */
public class Pessoa {

   public static final int SEXO_MASCULINO = 1;
   public static final int SEXO_FEMININO = 2;
   
   private String nome;
   private int sexo;

    public Pessoa(String nome, int sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public int getSexo() {
        return sexo;
    }
   

    
}
