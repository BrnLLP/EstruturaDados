import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	
	int opcao = -1;
	int opcaovetor=-1;
	int opcaolista=-1;
	
	int[] vetor = new int[20];
	
	while (opcao == -1) {
		System.out.print("-------------- \n| 1-Vetor    | \n| 2-Lista    | \n-------------- \n Selecione a opcao desejada: ");
		opcao = scanner.nextInt();	
		switch (opcao) {
		case 1:{
			opcaovetor=-1;
			while( opcaovetor == -1) {
			System.out.print("-------------------------- \n|          Vetor         |\n-------------------------- \n| 1-Inserir dado         | \n| 2-Alterar dado         | \n| 3-Pesquisar dado       |\n| 4-Mostrar dados        |\n| 5-Voltar               |  \n-------------------------- \n Selecione a opcao desejada: ");
			opcao=scanner.nextInt();
			int valor;
			int posicao;
			switch(opcao) {
			case 1:{
				System.out.print("Digite um valor: ");
				valor=scanner.nextInt();
				for(int i=0;i<vetor.length;i++) {
					if(vetor[i]==0) {
						vetor[i]=valor;
						break;
					}
					else {
						System.out.print(-1);
					}
				}
				break;
			}
			case 2:{
				System.out.print("Digite um valor");
				valor=scanner.nextInt();
				System.out.print("Digite a posição que deseja modificar");
				posicao=scanner.nextInt();
				vetor[posicao]=valor;
				break;
			}
			case 3:{
				System.out.print("Digite um valor para pesquisar:");
				 valor=scanner.nextInt();
				 for(int i=0;i<vetor.length;i++) {
					 if(vetor[i]==valor) {
						 System.out.print("Valor encontrado no indice : "+i+"\n");
						 break;
					 }
				 }
				break;
			}
			case 4:{
				for(int i=0;i<vetor.length;i++) {
					System.out.print(vetor[i]+"\n");
				}
				break;
			}
			case 5:{
				opcaovetor=1;
				opcao=-1;
				break;
			}
			}
			}
		}
		break;
		case 2:{
			opcaolista=-1;
			while(opcaolista == -1) {
				System.out.print("-------------------------- \n|          Lista         |\n-------------------------- \n| 1-Inserir dado         | \n| 2-Alterar dado         | \n| 3-Excluir dado         |\n| 4-Pesquisar dado       |\n| 5-Mostrar dado         |\n| 6-Voltar               |\n-------------------------- \n Selecione a opcao desejada: ");
				opcao=scanner.nextInt();
				int valor;
				int posicao;
			switch(opcao) {
			case 1:{
				break;
			}
			case 2:{
				break;
			}
			case 3:{
				break;
			}
			case 4:{
				break;
			}
			case 5:{
				break;
			}
			case 6:{
				opcaolista=1;
				opcao=-1;
				break;
			}
			}
			break;
		}
		}
}
	}
		scanner.close();
		
		
}
	}