package Model.FileOutput;

import java.io.FileWriter;
import java.nio.file.Paths;
import java.util.Scanner;


public class FileCsv {
	public String fileName;

	public FileCsv(String fileName) {
		this.fileName = fileName;
	}

	public FileCsv() {
	}

	public void CreateCsv() {
		fileName = Paths.get(System.getProperty("user.home"), "Desktop", "dados.csv").toString();
	}



	public void ReadData() {// leitura -----------------
		try (Scanner sc = new Scanner(fileName)) {
			System.out.println("\nDados do Arquivo CSV:");

			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
		}catch (Exception e) {
			System.out.println("Error" + e);
		}
	}
	
	public void AppendData(String value) throws Exception {
        try {
            CreateCsv(); // Garante que o arquivo existe
            FileWriter fw = new FileWriter(fileName, true);
            fw.append(value);
            fw.append("\n");
            fw.append("Romaneio,Placa,Entrada,Saida,FatPallet,QuebraPallet,Transp,Motorista,,tipoveiculo,Lacre1,lacre2,lacre3,lacre4");
            //criar um if para confimar se as colunas já existem , se não criar
            // ler csv se existira colunanas então não executar append
            fw.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
