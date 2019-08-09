
public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(12345, "Joao",
            Funcionario.SEXO_MASCULINO, 1000);
        System.out.println(funcionario.getMatricula() + " - " 
        + funcionario.getNome() + " - "
        + funcionario.getSexo() + " - "
        + funcionario.getSala);
    }
}
