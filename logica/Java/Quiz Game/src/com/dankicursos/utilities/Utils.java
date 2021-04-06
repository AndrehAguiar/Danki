package com.dankicursos.utilities;

import java.util.ArrayList;
import java.util.Scanner;

import com.dankicursos.models.Question;

public class Utils{
	
	protected int score;
	protected ArrayList<Question> questions;
	protected ArrayList<String> perguntas;
	protected ArrayList<ArrayList<String>> respostas;
	protected ArrayList<Integer> corrects;
	
	public Utils() {
		this.score = 0;
		this.questions =  new ArrayList<Question>();
		this.perguntas = new ArrayList<String>();
		this.respostas = new ArrayList<ArrayList<String>>();
		this.corrects = new ArrayList<Integer>();
		
		setPerguntas();
		setRespostas();
		setCorrects();
		setQuestions();
	}
	
	private void setPerguntas() {
		this.perguntas.add("Qual a capital do Brasil?");
		this.perguntas.add("Qual país não fica na América do Sul?");
		this.perguntas.add("Como se escreve cachorro em inglês?");
	}
	
	private void setRespostas() {
		
		ArrayList<String> opcoes1 = new ArrayList<String>();
		ArrayList<String> opcoes2 = new ArrayList<String>();
		ArrayList<String> opcoes3 = new ArrayList<String>();
		
		opcoes1.add("1) Buenos Aires");
		opcoes1.add("2) Brasilia");
		opcoes1.add("3) São Paulo");		

		opcoes2.add("1) México");
		opcoes2.add("2) Argentina");
		opcoes2.add("c) Equador");		

		opcoes3.add("1) Cat");
		opcoes3.add("2) Horse");
		opcoes3.add("3) Dog");
		
		this.respostas.add(opcoes1);
		this.respostas.add(opcoes2);
		this.respostas.add(opcoes3);
	}
	
	private void setCorrects() {
		this.corrects.add(2);
		this.corrects.add(1);
		this.corrects.add(3);
	}
	
	private void setQuestions() {
		for (int i = 0; i < this.perguntas.size(); i++) {
			String pergunta = this.perguntas.get(i);
			ArrayList<String> respostas = this.respostas.get(i);
			Integer correct =  this.corrects.get(i);
			Question obj = new Question(pergunta, respostas, correct);
			this.questions.add(obj);
		}
	}
	
	@SuppressWarnings("resource")
	public void start() {
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < this.questions.size(); i++) {
			Question obj = this.questions.get(i);
			System.out.println(obj.getPergunta());
			ArrayList<String> respostas = obj.getRespostas(); 
			
			for(int j = 0; j < respostas.size(); j++) {
				System.out.println(respostas.get(j));
			}
			
			System.out.println("\n");
			
			double startGame = System.currentTimeMillis();
			String r = scanner.nextLine();
			
			try {
				Integer resp = Integer.parseInt(r);
				if(resp < 1 | resp > respostas.size()) {
					System.out.println("Resposta inválida!\nDigite o número da resposta correta!\n");
					i--;
				}else {

					Integer correct = obj.getCorrect();
					if(correct == resp) {
						this.score++;
					};
				}
			}catch(Exception e) {
				System.out.println("Resposta inválida!\nDigite o número da resposta correta!\n");
				i--;
			}
			System.out.println("Você gastou "+ obj.convertTime(System.currentTimeMillis(), startGame)+" seg\n");
		}
		System.out.println("Fim do jogo!\nSeu Score é "+this.score);
	}
}
