package sistemas.midias.midia;

import java.util.List;

public class Serie extends Midias{
    private List<Episodio> episodios;

    public Serie(String titulo, String genero, int anoLancamento,String descricao, String[] elenco, String diretor, List<Episodio> episodios) {
        super(titulo, genero, anoLancamento,descricao, elenco, diretor);
        this.episodios = episodios;
    }
    public List<Episodio> getEpisodios() {
        return episodios;
    }
    public void setEpisodios(List<Episodio> episodios) {
        this.episodios = episodios;
    }
    @Override
    public String toString(){
        return "Filme de titulo "+super.getTitulo()+"\nGenero "+super.getGenero()+
                "\nAno de Lançamento "+super.getAnoLancamento()+"\nDescrição "+super.getDescricao()+
                "\nElenco "+String.join(",",super.getElenco())+
                "\nDiretor "+super.getDiretor()+"\nDuração "+this.episodios.size();
    }
}
