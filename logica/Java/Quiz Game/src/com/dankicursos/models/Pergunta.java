package com.dankicursos.models;

import java.util.ArrayList;

public abstract class Pergunta extends Resposta{
	
	protected String pergunta;
	
	public Pergunta(String pergunta, ArrayList<String> respostas, int correct) {
		super(respostas, correct);
		this.pergunta = pergunta;
	}

	public String getPergunta() {
		return pergunta;
	}

	protected void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}
	

}
