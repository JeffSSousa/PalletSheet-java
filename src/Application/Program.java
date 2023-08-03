package Application;

import java.util.Scanner;

import Model.Enums.ResponseEnum;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int entry;
		int exit;

		System.out.println("-----IMPRESSÃO------"); // dados do motorista

		System.out.println("----DADOS----");
		System.out.print("TRANSPORTADORA: ");
		sc.next();
		String carrierCargo = sc.nextLine();
		System.out.print("MOTORISTA: ");
		sc.next();
		String driver = sc.nextLine();
		System.out.print("PLACA DO VEICULO: ");
		sc.next();
		String truckPlate = sc.nextLine();
		System.out.print("SENHA :");
		int password = sc.nextInt();
		System.out.print("\n---------FLUXO DE PALETES------------\n");// fluxo de pallet

		System.out.print("TROUXE PALLETES ? (SIM/NÃO) ");
		String respStr = sc.next();
		ResponseEnum resp;
		if (respStr.equalsIgnoreCase("SIM")) {
			resp = ResponseEnum.SIM;
			System.out.print("ENTRADA: ");
			entry = sc.nextInt();
		} else if (respStr.equalsIgnoreCase("NAO")) {
			resp = ResponseEnum.NAO;
			entry = 0;
		}

		System.out.print("EXIT: ");
		exit = sc.nextInt();
		// lacres adiconados no final do processo

		sc.close();
	}

}
