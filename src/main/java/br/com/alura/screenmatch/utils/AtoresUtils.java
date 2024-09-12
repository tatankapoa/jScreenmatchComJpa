package br.com.alura.screenmatch.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;



public class AtoresUtils {
	
	
	public static List<String> obterAtores(String atores) {
		
		if (StringUtils.isBlank(atores)) {
			return new ArrayList<>();
		}

		return Arrays.stream(atores.split(","))
				.map(String::trim)
				.filter(s-> !s.isEmpty())
				.collect(Collectors.toList());
	}

}
