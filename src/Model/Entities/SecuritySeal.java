package Model.Entities;

import java.util.ArrayList;
import java.util.Scanner;

public class SecuritySeal {
	private int Seal01;
	private int Seal02;
	private int Seal03;
	private int Seal04;
	
	public SecuritySeal() {
		
	}

	public SecuritySeal(int seal01, int seal02, int seal03, int seal04) {
		super();
		Seal01 = seal01;
		Seal02 = seal02;
		Seal03 = seal03;
		Seal04 = seal04;
	}

	public int getSeal01() {
		return Seal01;
	}

	public void setSeal01(int seal01) {
		Seal01 = seal01;
	}

	public int getSeal02() {
		return Seal02;
	}

	public void setSeal02(int seal02) {
		Seal02 = seal02;
	}

	public int getSeal03() {
		return Seal03;
	}

	public void setSeal03(int seal03) {
		Seal03 = seal03;
	}

	public int getSeal04() {
		return Seal04;
	}

	public void setSeal04(int seal04) {
		Seal04 = seal04;
	}
	
    public void CheckingSeals(int amount) {
    	Scanner sc = new Scanner(System.in);
    	ArrayList <Integer> seal = new ArrayList<>();
    	for(int i= 0 ; i<amount;i++) {
    		System.out.println("Lacre #" + (i+1));
    		seal.add(sc.nextInt());
        	Seal01 = seal.get(i);
    	}
    	for(int list: seal) {
    		System.out.println(list);
    	}

    }
	
}
