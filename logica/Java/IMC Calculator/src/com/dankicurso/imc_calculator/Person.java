package com.dankicurso.imc_calculator;

public class Person {

	private String name;
	private Double height;
	private Double weight;
	private Integer age;
	private Double imc;

	public Person(String name, Double height, Double weight, Integer age) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.imc = calcIMC();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWeight() {
		return weight;
	}
	
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public Double getImc() {
		return imc;
	}

	public void setImc(Double imc) {
		this.imc = this.calcIMC();
	}

	public Double calcIMC() {
		Double powHeight = Math.pow(this.height, this.height);
		return this.weight / powHeight;
	}

}
