package br.com.flaviohenrique.loggingWithLombok.domine;

import lombok.Data;

@Data
public class Person {

	private String nome;
	private Integer idade;
	private String cpf;
	private String sexo;
}
