import java.util.Scanner;

class UrnaEletronica {
	private String[] nomes = {"Ada Lovelace", "Alan Turing", "Marie Curie", "Albert Einstein", "Ludwig van Beethoven"};
	private String[] numerosV = {"01", "02", "03", "04", "05"};
	private int[] votos = new int[nomes.length];
	private int votosNulos = 0;
	
	public void receberVoto(String numero) {
        boolean votoValido = false;
	
        for (int i = 0; i < numerosV.length; i++) {
            if (numerosV[i].equals(numero)) {
                votos[i]++;
                votoValido = true;
                break;
        }
	}
	
        if (!votoValido) {
        	votosNulos++;
    }
}
	
	public void exibirResultados() {
        int totalVotosValidos = 0;
        int maxVotos = 0;
        String vencedor = "";
        boolean empate = false;

        for (int voto : votos) {
            totalVotosValidos += voto;
        }
    
        System.out.println("\nResultado da Votação:");
        for (int i = 0; i < nomes.length; i++) {
            double percentual = (totalVotosValidos > 0) ? (votos[i] * 100.0 / totalVotosValidos) : 0.0;
            System.out.printf("%s: %d votos (%.1f%%)%n", nomes[i], votos[i], percentual);

    
            if (votos[i] > maxVotos) {
                maxVotos = votos[i];
                vencedor = nomes[i];
                empate = false;
            } else if (votos[i] == maxVotos && maxVotos > 0) {
                empate = true;
            }
        }

        System.out.printf("Votos Nulos: %d%n", votosNulos);
        if (empate) {
            System.out.println("Resultado: Houve empate entre os candidatos mais votados.");
        } else if (maxVotos > 0) {
            System.out.printf("Vencedor: %s%n", vencedor);
        } else {
            System.out.println("Nenhum vencedor (sem votos válidos).");
        }
    }
	
	public void iniciarVotacao() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Urna Eletrônica!");
        System.out.println("Candidatos:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("%s - %s%n", numerosV[i], nomes[i]);
        }
        
        int totalVotos = 10; 
        for (int i = 1; i <= totalVotos; i++) {
            boolean votoValido = false;
            
            
            while (!votoValido) {
                System.out.printf("Digite o número do seu candidato (%d/%d): ", i, totalVotos);
                String numero = scanner.next();

                if (numero.length() == 2 && numero.charAt(0) >= '0' && numero.charAt(0) <= '9'
                        && numero.charAt(1) >= '0' && numero.charAt(1) <= '9') {
                    receberVoto(numero);
                    votoValido = true;
                } else {
                    System.out.println("Valor inválido! Por favor, digite o número no formato correto (exemplo: 01, 02).");
                }
            }
        }


        scanner.close();
        exibirResultados();
	}
	public static void main(String[] args) {
        UrnaEletronica urna = new UrnaEletronica();
        urna.iniciarVotacao();
    }
}

