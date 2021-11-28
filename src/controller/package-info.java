package controller;

public class OrdenacaoController {

	public OrdenacaoController() {
		super();
	}
	
	public int[] mergeSort(int[] vetor, int inicio, int fim) {
		System.out.println("Vetor da posi��o "+inicio+" at� "+fim);
		
		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			mergeSort(vetor, inicio, meio); //Esquerda
			mergeSort(vetor, meio + 1, fim); //Direita
			intercala(vetor,inicio, meio, fim);
		}
		
		return vetor;
	}
	
	
	private void intercala(int[] vetor, int inicio, int meio, int fim) {
		int novoVetor[] = new int[vetor.length];
		for(int i = inicio ; i <= fim; i++) {
			novoVetor[i] = vetor[i];
		}
		
		int esq = inicio;
		int dir = meio + 1;
		
		for(int cont = inicio ; cont <= fim ; cont++) {
			if (esq > meio) {
				vetor[cont] = novoVetor[dir];
				dir++;
			} else if (dir > fim) {
				vetor[cont] = novoVetor[esq];
				esq++;
			} else if (novoVetor[esq] < novoVetor[dir]){
				vetor[cont] = novoVetor[esq];
				esq++;
			} else {
				vetor[cont] = novoVetor[dir];
				dir++;
			}
		}
		
	}

	public int[] bubbleSort(int[] vetor) {
		int tamanho = vetor.length;
		
		//Rodadas
		for (int i = 0; i < tamanho ; i++) {
			//Din�mica
			for (int j = 0 ; j < tamanho - 1 ; j++) {
				if (vetor[j] > vetor[j + 1]) {
					int aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}
			}
			
//			for (int valor : vetor) {
//				System.out.print(valor + " ");
//			}
//			System.out.println(" ==> Rodada #"+ (i+1));
		}
		
		return vetor;
	}

}
