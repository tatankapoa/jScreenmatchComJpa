package br.com.alura.screenmatch.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.screenmatch.model.Categoria;

public class CategoriaUtils {
	
	
	public static List<Categoria> obterCategorias(String generos) {

		return Arrays.stream(generos.split(","))
				.map(String::trim)
				.filter(s-> !s.isEmpty())
				.map(String::toUpperCase)
				.map(CategoriaUtils::toCategoria)
				.collect(Collectors.toList());
	}
	
	public String exibeCategoria(List<Categoria> lista) {
		
		
		return null;
		
		
		
	}


	private static Categoria toCategoria(String nome) {
        try {
            return Categoria.fromString(nome);
            
        } catch (IllegalArgumentException e) {
            System.err.println("Categoria inválida: " + nome);
            return null; 
        }
    }
	
	

}
