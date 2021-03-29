package com.ti2cc;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		dao.conectar();
		Scanner entrada = new Scanner(System.in);
		int id;
		int opc=0;
		String personagem="";
        String autor= "";
		int ano=-1;
		
		do{
			System.out.println( "Escreva 1 para inserir um série" );
			System.out.println( "Escreva 2 para alterar um série" );
			System.out.println( "Escreva 3 para excluir um série" );
			System.out.println( "Escreva 4 para mostrar todos as séries" );
			System.out.println( "Escreva 0 para sair" );
			opc = entrada.nextInt();
			

			if(opc == 1){

				System.out.println( "Escreva o id da série" );
				id = entrada.nextInt();


				System.out.println( "Escreva o autor da série" );
				autor = entrada.nextLine();
				


				System.out.println( "Escreva o personagem da série" );
				personagem = entrada.nextLine();


				System.out.println( "Escreva o ano da série" );
				ano = entrada.nextInt();
				Serie série = new Serie (id,autor,personagem,ano);
				dao.inserirserie(série);
			
            }    

			if(opc == 2){

				System.out.println("Escreva o ID da Serie a ser alterado");
				id = entrada.nextInt();
				Serie s2 = new Serie(id,"","",'M');


				System.out.println("Escreva um novo autor para o série");
				autor = entrada.nextLine();


				s2.setautor(autor);
				dao.atualizarserie(s2);
			
            }

			if(opc == 3){

				System.out.println("Escreva o ID da série a ser exluido");
				id = entrada.nextInt();
				dao.excluirserie(id);
				
            }

			if(opc == 4){

				Serie[] series;
				series = dao.getseries();
				System.out.println("==== Mostrar Séries === ");		
				for(int i = 0; i < series.length; i++) {
					System.out.println(series[i].toString());
				
				
                }
				
				
			}
			
			
			
			
		}while(opc != 0);

		
		dao.close();
	}
}