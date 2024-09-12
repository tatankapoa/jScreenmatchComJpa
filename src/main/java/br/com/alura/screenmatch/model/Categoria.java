package br.com.alura.screenmatch.model;

public enum Categoria {

	ACAO ("Action"),
	ROMANCE ("Romance"),
	COMEDIA ("Comedy"),
	CRIME ("Crime"),
	AVENTURA("Adventure"),
	DRAMA ("Drama");
	
	private String categoriaOmdb;
	
	Categoria(String categoriaOmdb){
		this.categoriaOmdb = categoriaOmdb;
	}
	
	public static Categoria fromString(String text) {
		
		for (Categoria categoria : Categoria.values()) {
			if (categoria.categoriaOmdb.equalsIgnoreCase(text)) {
				return categoria;
			}
		}
		throw new IllegalArgumentException("Nenhuma categoria encontrada para o texto["+text+"] forncecido.");
	}

}
