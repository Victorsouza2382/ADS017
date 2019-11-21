
package negocio;

import dados.Aluno;
import dados.AlunoDAO;
import dados.DadosException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AlunoBO implements BO<Aluno> {

    @Override
    public void validar(Aluno entidade) throws NegocioException {
        if(entidade.getMatricula() == 0){
            throw new NegocioException("Animal, insere uma matrícula ai por favor!");
        }
        if(entidade.getNome() == null || entidade.getNome().isEmpty()){
            throw new NegocioException("Insira um nome sua anta!");
        }
    }

    @Override
    public void incluir(Aluno entidade) throws NegocioException {
        validar(entidade);
        AlunoDAO dao = new AlunoDAO();
        
        try {
            dao.incluir(entidade);
        } catch (DadosException ex) {
            throw new NegocioException("Erro", ex);
        }
        
    }

    @Override
    public void alterar(Aluno entidade) throws NegocioException {
        validar(entidade);
        consultar(entidade);
        AlunoDAO dao = new AlunoDAO();
        try {
            dao.alterar(entidade);
        } catch (DadosException ex) {
            throw new NegocioException("Erro", ex);
        }
    }

    @Override
    public void excluir(Aluno entidade) throws NegocioException {
        consultar(entidade);
        AlunoDAO dao = new AlunoDAO();
        try {
            dao.excluir(entidade.getId());
        } catch (DadosException ex) {
            throw new NegocioException("Erro", ex);
        }
    }

    @Override
    public Aluno consultar(Aluno entidade) throws NegocioException {
        Aluno aluno = new Aluno();
        AlunoDAO dao = new AlunoDAO();
        try {
            aluno = dao.consultar(entidade.getId());
        } catch (DadosException ex) {
            throw new NegocioException("Erro", ex);
        }
        
        if(aluno == null || aluno.getId() == 0){
            throw new NegocioException("Aluno não encontrado graças a Deus!");
        }
        
        return aluno;
    }

    @Override
    public List<Aluno> listar() throws NegocioException {
        List<Aluno> lista = new ArrayList<Aluno>();
        AlunoDAO dao = new AlunoDAO();
        try {
            lista = dao.listar();
        } catch (DadosException ex) {
            throw new NegocioException("Nenhum fi duma égua cadastrado!");
        }
        return lista;
    }
    
}
