package br.edu.fbv;

public class Pergunta extends Node {

	private Node positivo;
	private Node negativo;
	
	public Pergunta(String id, String valor) {
		super(id, valor);
	}

	public Node getPositivo() {
		return positivo;
	}

	public Node getNegativo() {
		return negativo;
	}
	
	public void setRespostas(Node positivo, Node negativo) {
		this.positivo = positivo;
		this.negativo = negativo;
	}
}
