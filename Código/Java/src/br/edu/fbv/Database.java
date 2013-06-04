package br.edu.fbv;

public class Database {

	private Node first;

	public Database() {
		inicializar();
	}

	/**
	 * Inicializa perguntas e doenças e efetua mapeamento:
	 */
	private void inicializar() {
		Doenca d1 = new Doenca("d1", "Bronquite");
		Doenca d2 = new Doenca("d2", "Gripe");
		Doenca d3 = new Doenca("d3", "Pneumonia");
		Doenca d4 = new Doenca("d4", "Rinite");
		Doenca d5 = new Doenca("d5", "Asma");
		Doenca d6 = new Doenca("d6", "Tuberculose");
		Doenca d7 = new Doenca("d7", "Resfriado");
		Doenca d8 = new Doenca("d8", "Dengue");

		Pergunta p1 = new Pergunta("p1", "Paciente apresenta tosse?");
		Pergunta p2 = new Pergunta("p2", "É crônica?");
		Pergunta p3 = new Pergunta("p3", "É produtiva?");
		Pergunta p4 = new Pergunta("p4", "Mais de 3 meses em 2 anos seguidos?");
		Pergunta p5 = new Pergunta("p5", "Febre repentina?");
		Pergunta p6 = new Pergunta("p6", "Calafrios?");
		Pergunta p7 = new Pergunta("p7", "Dor de garganta?");
		Pergunta p8 = new Pergunta("p8", "Congestão nasal?");
		Pergunta p9 = new Pergunta("p9", "É recorrente?");
		Pergunta p10 = new Pergunta("p10", "Chiado no peito?");
		Pergunta p11 = new Pergunta("p11", "Piora a noite?");
		Pergunta p12 = new Pergunta("p12", "Sente febre?");
		Pergunta p13 = new Pergunta("p13", "Perda de peso?");
		Pergunta p14 = new Pergunta("p14", "Presença do Bacilo de Kotch?");
		Pergunta p15 = new Pergunta("p15", "Coriza?");

		p1.setRespostas(p2, p5);
		p2.setRespostas(p3, p9);
		p3.setRespostas(p4, p12);
		p4.setRespostas(d1, d2);
		p5.setRespostas(p6, p15);
		p6.setRespostas(p7, d7);
		p7.setRespostas(p8, d4);
		p8.setRespostas(d8, d7);
		p9.setRespostas(p10, d7);
		p10.setRespostas(p11, d7);
		p11.setRespostas(d5, d7);
		p12.setRespostas(p13, p14);
		p13.setRespostas(p14, d2);
		p14.setRespostas(d6, d3);
		p15.setRespostas(p7, d7);

		first = p1;
	}

	public Node first() {
		return first;
	}
}
