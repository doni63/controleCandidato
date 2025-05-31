package candidatura;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		analisarCandidato(5000.0);
		//analisarCandidato(2000);
		//analisarCandidato(2200.0);
		
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
