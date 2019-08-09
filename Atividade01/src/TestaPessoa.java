
public class TestaPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Maria", Pessoa.SEXO_FEMININO);
        System.out.println(pessoa.getNome() + " - " + pessoa.getSexo());
    }
}
