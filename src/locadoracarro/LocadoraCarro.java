package locadoracarro;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
  * and open the template in the editor.
 */

/**
 *
 * @author Henrique & Likeily Medeiros
 */
public class LocadoraCarro {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		Scanner teclado = new Scanner(System.in);
		String menu;
		int resp;
		CadastroClientes cadastro1 = new CadastroClientes();

		ArrayList<Carro> car = new ArrayList<>();
		ArrayList<CadastroClientes> listCadastro = new ArrayList<>();
		ArrayList<CadastroClientes> list = new ArrayList<>();
			

		do {

			System.out.println(
					"-------------------------------------------------------------------------------------------------------");
			System.out.println(
					"                                             APS LOCADORA                                             ");
			System.out.println(
					"                                            SEJAM BEM-VINDOS                                          ");
			System.out.println(
					"------------------------------------------------------------------------------------------------------");
			System.out.println("");
			System.out.println(
					"                                                  MENU                                                ");
			System.out.println("                                      ===============================");
			System.out.println("                                      |                             |");
			System.out.println("                                      |  1 - Catalogo de Carros     |");
			System.out.println("                                      |  2 - Carros Alugados        |");
			System.out.println("                                      |  3 - Carros Disponiveis     |");
			System.out.println("                                      |  4 - Cadastrar Clientes     |");
			System.out.println("                                      |  5 - Lista de Clientes      |");
			System.out.println("                                      |  6 - Sair                   |");
			System.out.println("                                      |                             |");
			System.out.println("                                      ===============================");
			System.out.println("");
			System.out.println("");
			System.out.println(
					"------------------------------------------------------------------------------------------------------");
			System.out.print("Digite a opção desejada: ");

			do {
		         menu = JOptionPane.showInputDialog("CARROS\n\nDigite o numero de acordo com o menu abaixo:\n1 Catalogo de Carros"
		         		+ "\n2 Carros Alugados\n3 Carros Disponiveis\n4 Cadastrar Clientes\n5 Lista de Clientes\n6 Sair\n0 voltar ao menu principal");
		         // Se a pessoa escreveu um numero
			 		if (menu != null && menu.matches("[0-6]"))
		           resp = Integer.parseInt(menu);
			 		else
			   	  resp = 6;
		                 
			 		Carro palio = new Carro(1 ,"Fiat", "palio", "Prata", "Total Flex", 1.0f, 50.0f, 15, false, resp);
			 		Carro hb20 = new Carro(2 ,"Hyundai", "hb20", "Branco", "Total Flex", 1.6f, 40.0f, 8, false, resp);
			 		Carro gol = new Carro(3 ,"Volkswagen", "gol", "Preto", "Gasolina", 1.0f, 55.0f, 5,false, resp);
			 		Carro camaro = new Carro(4, "GM", "camaro", "Amarelo", "Total Flex", 3.0f, 7.0f, 13,false, resp);
			 		Carro fusion = new Carro(5, "Ford", "fusion", "Preto", "Total Flex", 2.0f, 15.0f, 15,false, resp);
			 		Carro viper = new Carro(6 ,"Dodge", "viper", "Azul", "Gasolina", 8.3f, 5.0f, 5,false, resp);
			
			switch (resp) {
			case 1:

				System.out.println("");

				car.add(palio);
				car.add(hb20);
				car.add(gol);
				car.add(camaro);
				car.add(fusion);
				car.add(viper);

				palio.detalhes();
				hb20.detalhes();
				gol.detalhes();
				camaro.detalhes();
				fusion.detalhes();
				viper.detalhes();

				car.get(0).disp();
				car.get(2).disp();

				break;

			case 2:
				System.out.println("");
				System.out.println("OS SEGUINTES CARROS ESTAO ALUGADOS: ");
				System.out.println("");

				for (int i = 0; i < car.size(); i++) {
					car.get(i).disp();
				}
				break;

			case 3:
				System.out.println("");
				System.out.println("OS SEGUINTES CARROS ESTAO DISPONIVEIS: ");
				System.out.println("");
				
				for(int i = 0; i< car.size(); i++){
                     car.get(i).detalhes();
                 }
             break;

			case 4:
				cadastro1.alugar();
				listCadastro.add(cadastro1);
				cadastro1.mostrar();

				CadastroClientes cadastro2 = new CadastroClientes("Fernando Souza", 30, "Rua flores", "023658",
						"323659874", viper);
				listCadastro.add(cadastro2);
				CadastroClientes cadastro3 = new CadastroClientes("Maria de Fatima", 30, "Rua macunaima", "54788",
						"5488787457", palio);
				listCadastro.add(cadastro3);

				break;

			case 5:

				System.out.println("CLIENTES CADASTRADOS:");
				System.out.println("");
				System.out.println("");
				for (int i = 0; i < listCadastro.size(); i++) {
					cadastro1 = listCadastro.get(i);
					System.out.println("Nome: " + cadastro1.getNome() + " | " + "CPF: " + cadastro1.getCpf());
				}

				break;

			case 6:
				JOptionPane.showMessageDialog(null,"Finalizando Programa!");
                System.exit(0);
				
			default:
                JOptionPane.showMessageDialog(null,"Opção Inválida");
               break;
			}
			
			String verificar = JOptionPane.showInputDialog("CLIENTES\n\nDeseja adicionar outro cliente? [s/N]");	  	

				 if (verificar != null && verificar.equalsIgnoreCase("s"))
					 if (menu != null && menu.matches("[0-6]"))
				           resp = Integer.parseInt(menu);
					 		else
					   	  resp = 6;
			}while(menu != null);
		  	 	  break;
	      } while (resp != 0);
	   }
	}
