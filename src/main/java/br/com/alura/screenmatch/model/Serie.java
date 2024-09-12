package br.com.alura.screenmatch.model;

import java.util.List;
import java.util.OptionalDouble;

import br.com.alura.screenmatch.utils.AtoresUtils;
import br.com.alura.screenmatch.utils.CategoriaUtils;

public class Serie {
	
	private String titulo;
	private Integer totalTemporadas;
    private Double avaliacao;
	private List<Categoria> genero;
	private List<String> autores;
	private String urlPoster;	
	private String sinopse;
	
	
	public Serie(DadosSerie dadosSerie) {
		super();
		this.titulo = dadosSerie.titulo();
		this.totalTemporadas = dadosSerie.totalTemporadas();
		this.avaliacao = OptionalDouble.of(Double.valueOf(dadosSerie.avaliacao())).orElse(0);
		this.genero = CategoriaUtils.obterCategorias(dadosSerie.genero());
		this.autores = AtoresUtils.obterAtores(dadosSerie.autores());
		this.urlPoster = dadosSerie.urlPoster();
		this.sinopse = dadosSerie.sinopse();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public Integer getTotalTemporadas() {
		return totalTemporadas;
	}


	public void setTotalTemporadas(Integer totalTemporadas) {
		this.totalTemporadas = totalTemporadas;
	}


	public Double getAvaliacao() {
		return avaliacao;
	}


	public void setAvaliacao(Double avaliacao) {
		this.avaliacao = avaliacao;
	}


	public List<Categoria> getGenero() {
		return genero;
	}


	public void setGenero(List<Categoria> genero) {
		this.genero = genero;
	}


	public List<String> getAutores() {
		return autores;
	}

	public void setAutores(List<String> autores) {
		this.autores = autores;
	}

	public String getUrlPoster() {
		return urlPoster;
	}

	public void setUrlPoster(String urlPoster) {
		this.urlPoster = urlPoster;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	@Override
	public String toString() {
		return "Serie [" + (titulo != null ? "titulo=" + titulo + ", " : "")
				+ (totalTemporadas != null ? "totalTemporadas=" + totalTemporadas + ", " : "")
				+ (avaliacao != null ? "avaliacao=" + avaliacao + ", " : "")
				+ (genero != null ? "genero=" + genero + ", " : "")
				+ (autores != null ? "autores=" + autores + ", " : "")
				+ (urlPoster != null ? "urlPoster=" + urlPoster + ", " : "")
				+ (sinopse != null ? "sinopse=" + sinopse : "") + "]";
	}

}
