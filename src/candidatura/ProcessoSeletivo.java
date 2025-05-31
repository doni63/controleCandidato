package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		//analisarCandidato(5000.0);
		//analisarCandidato(2000);
		//analisarCandidato(2200.0);
		
		//selecaoCandidatos();
		//imprimirSelecionados();
		String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
		int i = 1;
		for(String candidato: candidatos) {
			entrandoEmContato(candidato);
		}	
	}
	
	static void imprimirSelecionados() {
		String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
		System.out.println("Imprimir a lista de candidato");
		/*for(int i=0; i < candidatos.length; i++) {
			System.out.println("O candidato " + (i+1) + " é " + candidatos[i]);
		}*/
		
		System.out.println("Os candidatos selecionados foram");
		int i = 1;
		for(String candidato: candidatos) {
			
			System.out.println(i++ + "-"+ candidato);
			
		}
	}
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		
		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			
			if(continuarTentando) {
				tentativasRealizadas++;
			}else {
				System.out.println("Contato realizado com sucesso!");
			}
			
		}while(continuarTentando && tentativasRealizadas<3);
		
		if(atendeu) {
			System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativas \n");
		}else {
			System.out.println("Não conseguimos contato com " + candidato + "\n");
		}
		
	}
	
	//metodo auxiliar
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	static void selecaoCandidatos() {
		String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","FABRICIO","MIRELA","MARCO","MARIO","CRISTINA"};
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000;
		
		while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para vaga");
				candidatosSelecionados ++; 
			}
			candidatoAtual ++;
		}
	}
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido) {
			System.out.println("Ligar para candidato");
		}else if(salarioBase == salarioPretendido) {
			System.out.println("Ligar com contraproposta");
		}else if(salarioBase < salarioPretendido) {
			System.out.println("Aguardar demais candidatos");
		}
	}

}
