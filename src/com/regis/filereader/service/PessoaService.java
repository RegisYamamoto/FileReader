package com.regis.filereader.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.regis.filereader.model.Pessoa;

public class PessoaService {

	public  List<Pessoa> mapearPessoasPorDadosEmTexto() {
        List<Pessoa> listaPessoas = new ArrayList<>();
        try {
            @SuppressWarnings("resource")
			BufferedReader file = new BufferedReader(new FileReader("C:\\Workspace\\FileReader\\pessoas.txt"));
            String  pessoaTxt;
            while(( pessoaTxt = file.readLine())!=null) {
                Pessoa pessoa = new Pessoa();
                String[] parts = pessoaTxt.split(";");
                pessoa.setEmail(parts[0]);
                pessoa.setIdade(Integer.parseInt(parts[1]));
                pessoa.setNome(parts[2]);
                listaPessoas.add(pessoa);
            }
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaPessoas;
    }

}