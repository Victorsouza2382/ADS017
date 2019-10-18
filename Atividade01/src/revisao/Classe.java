package revisao;

public class Classe {
    
    private String codigo;
    private String nome;
    
    public void setCodigo(String codigo){
        if (codigo.isEmpty() == false){
        //(codigo.isEmpty())
            this.codigo = codigo;
        }
    }
            
          
    public static void main(String[] args) {
        Classe objeto = new Classe();
        objeto.codigo = "ADS017";
    }
    
}
