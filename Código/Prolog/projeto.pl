%# ******************************************
%# DIAGNÓSTICO DE DOENÇAS RESPIRATÓRIAS
%# Para dar início digite "start."
%# ******************************************

inicializar	:- 	assert(p1), assert(np1),
				assert(p2), assert(np2),
				assert(p3), assert(np3),
				assert(p4), assert(np4),
				assert(p5), assert(np5),
				assert(p6), assert(np6),
				assert(p7), assert(np7),
				assert(p8), assert(np8),
				assert(p9), assert(np9),
				assert(p10), assert(np10),
				assert(p11), assert(np11),
				assert(p12), assert(np12),
				assert(p13), assert(np13),
				assert(p14), assert(np14),
				assert(p15), assert(np15).


limpar	:- 	retract(p1), retract(np1),
			retract(p2), retract(np2),
			retract(p3), retract(np3),
			retract(p4), retract(np4),
			retract(p5), retract(np5),
			retract(p6), retract(np6),
			retract(p7), retract(np7),
			retract(p8), retract(np8),
			retract(p9), retract(np9),
			retract(p10), retract(np10),
			retract(p11), retract(np11),
			retract(p12), retract(np12),
			retract(p13), retract(np13),
			retract(p14), retract(np14),
			retract(p15), retract(np15),
			limpar.



%# Início do programa:
start :- 	write_ln('*** DIAGNOSTICO DE DOENCAS RESPIRATORIAS: ***'), 
			inicializar,
			\+limpar,
			pergunta(_),
			diagnostico(_).



%# Diagnóstico para obter a doença associada ao predicado 'X' encontrado após algumas perguntas:
diagnostico(X) :-  (doenca(X),
					write('Seu diagnostico e: '),
					write(X)).



%# Mapeamento das perguntas para obter diagnóstico:
pergunta(p1) :- 
	write('Paciente apresenta tosse? (s/n) '), 
	read(A), 
	((A=s, assert(p1)); (A=n, assert(np1))).

pergunta(p2) :- p1,
	write('E tosse cronica? (s/n) '), 
	read(A), 
	((A=s, assert(p2)); (A=n, assert(np2))).

pergunta(p3) :- p2,
	write('E produtiva? (s/n) '), 
	read(A), 
	((A=s, assert(p3)); (A=n, assert(np3))).

pergunta(p4) :- p3,
	write('A tosse teve duracao de 3 meses em 2 anos seguidos? (s/n) '), 
	read(A), 
	((A=s, assert(p4)); (A=n, assert(np4))).

pergunta(p5) :- np1,
	write('Apresenta febre repentina? (s/n) '), 
	read(A), 
	((A=s, assert(p5)); (A=n, assert(np5))).
pergunta(p6) :- p5,
	write('Sente calafrios? (s/n) '), 
	read(A), 
	((A=s, assert(p6)); (A=n, assert(np6))).

pergunta(p7) :- (p6; p15),
	write('Tem dor de garganta? (s/n) '), 
	read(A), 
	((A=s, assert(p7)); (A=n, assert(np7))).

pergunta(p8) :- p7,
	write('Apresenta congestao nasal? (s/n) '), 
	read(A), 
	((A=s, assert(p8)); (A=n, assert(np8))).

pergunta(p9) :- np2,
	write('E recorrente? (s/n) '), 
	read(A), 
	((A=s, assert(p9)); (A=n, assert(np9))).

pergunta(p10) :- p9,
	write('Apresenta chiado no peito? (s/n) '), 
	read(A), 
	((A=s, assert(p10)); (A=n, assert(np10))).

pergunta(p11) :- p10,
	write('E recorrente? (s/n) '), 
	read(A), 
	((A=s, assert(p11)); (A=n, assert(np11))).

pergunta(p12) :- np3,
	write('Sente febre? (s/n) '), 
	read(A), 
	((A=s, assert(p12)); (A=n, assert(np12))).

pergunta(p13) :- p12,
	write('Apresenta perda de peso? (s/n) '), 
	read(A), 
	((A=s, assert(p13)); (A=n, assert(np13))).

pergunta(p14) :- (p13; np12),
	write('Ha presenca do Bacilo de Koch? (s/n) '), 
	read(A), 
	((A=s, assert(p14)); (A=n, assert(np14))).

pergunta(p15) :- np5,
	write('Apresenta coriza? (s/n) '), 
	read(A), 
	((A=s, assert(p15)); (A=n, assert(np15))).



%# Mapeamento das doenças possíveis e seus predicados:
doenca(bronquite) :- p4.
doenca(gripe) :- np4; np13.
doenca(dengue) :- p8.
doenca(tuberculose) :- p14.
doenca(pneumonia) :- np14.
doenca(rinite) :- np7.
doenca(asma) :- p11.
doenca(resfriado) :- np6; np8; np9; np10; np11; np15.
