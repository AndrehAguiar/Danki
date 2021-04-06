package com.dankicursos.models;

import java.util.ArrayList;

public class Question extends Pergunta{
	
	protected int time;

	public Question(String pergunta, ArrayList<String> respostas, int correct) {
		super(pergunta, respostas, correct);
		
		setTime(10);
	}

	protected Integer getTime() {
		return time;
	}

	protected void setTime(int time) {
		this.time = time;
	}
	
	public double convertTime(double now, double start) {		
		return (now - start)/1000;
	}
	
	public Boolean checkReply(int reply) {
		Integer correct = getCorrect();
		
		if(reply == correct) {
			return true;
			
		}else {
			return false;
			
		}
	}
}
