package com.dankicursos.models;

import java.util.ArrayList;

public abstract class Resposta {
	
	protected ArrayList<String> respostas;
	protected int correct;
	
	protected Resposta(ArrayList<String> respostas, int correct) {
		this.respostas = respostas;
		this.correct = correct;
	}

	public ArrayList<String> getRespostas() {
		return this.respostas;
	}

	protected void setRespostas(ArrayList<String> respostas) {
		this.respostas = respostas;
	}

	public Integer getCorrect() {
		return correct;
	}

	protected void setCorrect(int correct) {
		this.correct = correct;
	}

}
