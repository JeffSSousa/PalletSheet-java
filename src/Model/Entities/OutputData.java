package Model.Entities;

import java.util.Scanner;

import Model.Enums.ResponseEnum;

public class OutputData {
	private int entry;
	private int exit;
	private int breaked;
    private int invoicedPallet;
    
	public OutputData(int entry, int exit, int breaked, int invoicedPallet) {
		this.entry = entry;
		this.exit = exit;
		this.breaked = breaked;
		this.invoicedPallet = invoicedPallet;
	}
	
	public OutputData() {
		
	}
	public int getEntry() {
		return entry;
	}

	public int getExit() {
		return exit;
	}

	public int getBreaked() {
		return breaked;
	}
	public void setBreaked(int breaked) {
		this.breaked = breaked;
	}
	public int getInvoicedPallet() {
		return invoicedPallet;
	}
	
    
	public void InvoicingPallets(int entry, int exit,int breaked) { // validar a quantidade de pallets que serão faturados
		int invoice;
		if (entry<exit) {
			invoice = exit - entry;
			if(breaked != 0) {
				invoice = invoice + breaked;
				System.out.println("Tem " + breaked + " Paletes quebrados");
			}
			
			System.out.println("Será faturado " + invoice + " Paletes");
			invoicedPallet = invoice ;
		}
	}
	
	
	public void PalletOutput (int amount) {
		exit += amount ;
	}
	
	public void PalletInput (int amount) {
		entry += amount;
	}
	
	public void PalletBreaked (int amount) {
		breaked += amount;
	}
	
	public void PalletFLow(int entry) {//fazer tratamento de exceção
		
		Scanner sc = new Scanner (System.in);
		System.out.print("TROUXE PALLETES ? (SIM/NÃO) ");
		String respStr = sc.next();
		ResponseEnum resp;
		if (respStr.equalsIgnoreCase("SIM")) { //metodo onde o processo de pergunta do enumerador seja feita na class enum
			resp = ResponseEnum.SIM;
			System.out.print("ENTRADA: ");
			entry = sc.nextInt();
		} else if (respStr.equalsIgnoreCase("NAO")) {
			resp = ResponseEnum.NAO;
			entry = 0;
		}
	}

}
