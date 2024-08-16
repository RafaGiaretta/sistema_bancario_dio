package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args){
		 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem vindo ao Banco do Polvo");
		System.out.println("Entre com o seu nome: ");
		String nome = sc.nextLine();
		
		ContaCorrente cc = new ContaCorrente(1, 1, nome, 200.0);
		ContaPoupanca cp = new ContaPoupanca(1,	1, nome, 200.0);
		
		System.out.println("Entre qual valor que deseja depositar: ");
		double dep = sc.nextDouble();
		cc.depositar(dep);
		cp.depositar(dep);
		
		System.out.println("Entre com o valor que deseja transferir da conta corrente: ");
		double transCC = sc.nextDouble();
		try {
			cc.transferir(transCC);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enrte com o valor que deseja sacar da conta poupanca: ");
		double sPP = sc.nextDouble();		
		sc.close();
		try {
			cp.sacar(sPP);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Extrato das contas: ");
		System.out.println(cc);
		System.out.println("");
		System.out.println(cp);
	}

}
