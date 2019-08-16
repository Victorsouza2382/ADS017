
public class TestaGerente {

    public static void main(String[] args) {
        Gerente gerente = new Gerente(1000, 14863, "Maria", Pessoa.SEXO_FEMININO, 1000);
        System.out.println(gerente);

        Funcionario funcionario = gerente;

        System.out.println(funcionario);

    }
   

}
