package com.regis.filereader;

import java.util.ArrayList;
import java.util.List;

import com.regis.filereader.model.Pessoa;
import com.regis.filereader.service.PessoaService;

public class Inicio {

	public static void main(String[] args) {
		
		List<Pessoa> pessoas = new ArrayList<>();
		PessoaService ps = new PessoaService();
		pessoas = ps.mapearPessoasPorDadosEmTexto();
		System.out.println(pessoas);

	}

}
