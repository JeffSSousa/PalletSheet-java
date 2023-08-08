package Application;

import java.util.Scanner;

import Model.Entities.DriverData;
import Model.Entities.OutputData;
import Model.Entities.SecuritySeal;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int entry = 0;
		int exit;

		System.out.println("-----IMPRESSÃO------"); // dados do
													// motorista-----------------------------------------------------------

		System.out.println("----DADOS----");// começar a criar os metodos da DriverData
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
		DriverData dd = new DriverData(driver, carrierCargo, password,truckType, truckPlate);
		
		// fluxo de pallet--------------------------------------------
		System.out.print("\n---------FLUXO DE PALETES------------\n");
		OutputData ot = new OutputData();
		ot.PalletFLow(entry);

		System.out.print("EXIT: ");
		exit = sc.nextInt();

		// Lacres ------------------------------------------------------------
		System.out.println();
		SecuritySeal ss = new SecuritySeal();
		ss.CheckingSeals();

		
		System.out.println(dd.toString()); // METHOD TO STRING
		
		sc.close();
	}

}
