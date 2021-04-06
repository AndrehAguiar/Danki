package com.dankicurso.imc_calculator;

public class Utils extends Person{
	
	public String result;

	public Utils(String name, Double height, Double weight, Integer age) {
		super(name, height, weight, age);

		setResult();
	}
	
	private String older(Double imc) {

		if(imc < 18.5) {
			return "Baixo peso";
		
		}else if(imc >= 18.5 & imc < 25) {
			return "Peso normal";
			
		}else if(imc >= 25 & imc < 30) {
			return "Excesso de peso";
			
		}else if(imc >= 30 & imc < 35) {
			return "Obesidade classe 1";
			
		}else if(imc >= 35 & imc < 40) {
			return "Obesidade classe 2";
		
		}else {
			return "Obesidade classe 3";
			
		}
	}
	
	private String newest(Double imc) {

		if(imc <= 22) {
			return "Baixo peso";
		
		}else if(imc > 22 & imc < 27) {
			return "Adequado ou eutrófico";
			
		}else{
			return "Sobrepeso";
			
		}
	}
	
	private String checkTable(String str, Double imc) {
		
		switch(str) {
		case "idoso":
			return this.older(imc);
		case "adulto":
			return this.newest(imc);
		}
		
		return "";
	}
	
	public void setResult() {
		Integer age = getAge();
		Double imc = calcIMC();
		if (age < 65) {
			this.result = checkTable("idoso", imc);
			
		}else {
			this.result = checkTable("adulto", imc);
			
		}
	}
}


