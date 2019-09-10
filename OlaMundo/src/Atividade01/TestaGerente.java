//Classe aplicação que testa a classe Gerente
package Atividade01;

public class TestaGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente(1215, 14863 ,"Victor", Pessoa.SEXO_FEMININO, 1000);
        System.out.println(gerente);
        
        //um funcionário pode receber funcionário porque todo gerente é funcionário.
        Funcionario funcionario = gerente;
        System.out.println(funcionario);
        
        //Um gerente não pode receber gerente pq nem todo funcionário é gerente.
        //gerente = funcionario;
    }
    
    void contratar(Gerente gerente){
        
    }
    
}