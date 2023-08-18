package Application;

import java.util.Scanner;

import Model.Entities.DriverData;
import Model.Entities.OutputData;
import Model.Entities.SecuritySeal;
import Model.FileOutput.FileCsv;

public class Program {
	public static void main(String[] args) throws Exception{

		Scanner sc = new Scanner(System.in);

try {
		System.out.println("-----IMPRESSÃO------");
		// dados do motorista-----------------------------------------------------------
		System.out.println("----DADOS----");
		System.out.print("TRANSPORTADORA: ");
		String carrierCargo = sc.nextLine();
		System.out.print("MOTORISTA: ");
		String driver = sc.nextLine();
		System.out.print("PLACA DO VEICULO: ");
		String truckPlate = sc.nextLine();
		System.out.println("TIPO DO VEICULO: ");
		String truckType = sc.nextLine();
		System.out.print("SENHA :");
		int password = sc.nextInt();
		DriverData dd = new DriverData(driver, carrierCargo, password, truckType, truckPlate);

		// fluxo de pallet--------------------------------------------

		System.out.print("\n---------FLUXO DE PALETES------------\n");
		OutputData out = new OutputData();
		out.PalletFLow();
		

		// Lacres ------------------------------------------------------------
		System.out.println();
		SecuritySeal ss = new SecuritySeal();
		ss.CheckingSeals();

		System.out.println(dd.toString()); // print---------------------
		System.out.println();

		System.out.println(out.toString());
		out.InvoicingPallets();
		
		String concat = password  // CONCATE PARA O CSV
		+ "," + carrierCargo 
	    + "," + out.getEntry() 
		+ "," + out.getExit()
		+ "," + out.getInvoicedPallet()
		+ "," + out.getBreaked()
		+ "," + driver
		+ "," + truckPlate
		+ "," + truckType
		+ "," + ss.getSeal01()
		+ "," + ss.getSeal02()
		+ "," + ss.getSeal03()
		+ "," + ss.getSeal04();
		
		// input dados csv
		FileCsv csv = new FileCsv();// pedir para rodar se o arquiv
		csv.AppendData(concat);
		csv.ReadData();
		
		sc.close();
}catch(Exception e) {
	System.out.println("Error :" + e);
	
}

	}
	

}
