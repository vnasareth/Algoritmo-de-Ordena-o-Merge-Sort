package view;

import controller.OrdenacaoController;

public class Principal {

	public static void main(String[] args) {
		int[] vetor = {15,18,29,1,0,4,13,18,25,15,43,0};
//		int[] vetor = {9,8,7,6,5,4,3,2,1,0};
		
		OrdenacaoController oCont = new OrdenacaoController();
         //vetor = oCont.bubbleSort(vetor);
		vetor = oCont.mergeSort(vetor, 0, vetor.length - 1);
		
		System.out.println("");
		System.out.println("=======================================");
		for (int valor : vetor) {
			System.out.print(valor+" ");
		}
		System.out.println("");
		System.out.println("=======================================");

	}

}
