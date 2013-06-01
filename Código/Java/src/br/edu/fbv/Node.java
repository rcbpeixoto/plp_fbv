package br.edu.fbv;

public abstract class Node {

	private final String id;
	private final String valor;
	
	public Node(String id, String valor) {
		this.id = id;
		this.valor = valor;
	}
	
	public String getId() {
		return id;
	}
	
	public String getValor() {
		return valor;
	}
}
