package Model.Entities;

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
	
    
	public void InvoicingPallets(int entry, int exit,int breaked) {
		if (entry<exit) {
			int invoice = exit - entry;
			if(breaked != 0) {
				invoice = invoice - breaked;
				System.out.println("Tem " + breaked + " Paletes quebrados");
			}
			
			System.out.println("Será faturado " + invoice + "Paletes");
			invoicedPallet += invoice ;
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

}
