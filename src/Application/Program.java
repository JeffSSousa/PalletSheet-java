package Application;

import java.util.ArrayList;

import Model.Entities.OutputData;

public class Program {
	public static void main (String[]args) {
		
		ArrayList <OutputData> list = new ArrayList<>();	
	
		OutputData o = new OutputData();
		
		int entry  = 25;
		int exit = 28;
		int br = 5;
		o.InvoicingPallets(entry, exit, br);
		o.PalletOutput(exit);
		o.PalletInput(entry);
		o.PalletBreaked(br);
		
		
		
		System.out.println(o.getEntry() + " " + o.getExit() + " " + o.getBreaked() + " " + o.getInvoicedPallet());
		
		
		System.out.println();
		
	}

}
