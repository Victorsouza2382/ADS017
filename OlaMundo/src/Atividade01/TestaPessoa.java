//Classe aplicação que testa a classe Pessoa
package Atividade01;

    import Atividade01.Pessoa;

public class TestaPessoa {
        public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Putona", Pessoa.SEXO_FEMININO );
        
        System.out.println(pessoa.getNome() + " - " + pessoa.getSexo());
        
    }
}
