public class TesteGerente {
   public static void main(String[] args) {
   Gerente gerente = new Gerente(1200, 15899, "Javison", Pessoa.SEXO_MASCULINO, 1200);
       System.out.println(gerente);
       
       Funcionario funcionario = gerente;
       
       System.out.println(funcionario);
       
       
       
}
}
