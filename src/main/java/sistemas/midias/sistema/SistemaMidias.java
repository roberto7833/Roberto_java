package sistemas.midias.sistema;

import sistemas.midias.exception.MidiaInexistenteException;
import sistemas.midias.exception.MidiaJaExisteException;
import sistemas.midias.midia.Midias;

import java.util.Collection;

public interface SistemaMidias {
    void cadastrarMidia(Midias midia)throws MidiaJaExisteException;
    Collection<Midias> pesquisarPorTitulo(String titulo);
    Collection<Midias> pesquisarPorGenero(String genero);
    Collection<Midias> pesquisarPorAno(int ano);
    Collection<Midias> pesquisarPorAtor(String ator);
    Collection<Midias> pesquisarPorDiretor(String diretor);
    Collection<Midias> mostrarTodosOsFilmes();
    Collection<Midias> mostrarTodosAsSeries();
    Collection<Midias> mostrarTodasAsMidias();
    void atualizarDados(String titulo, String novoTitulo, String genero, int ano)throws MidiaInexistenteException;
    void removerMidia(String titulo);
    void recuperarDados();
    void salvarDados();
}
