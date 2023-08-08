package Model.Entities;

public class DriverData {
	private String driver;
	private String carrierCargo;
	private int password;
	private String truckType;
	private String truckPlate;

	public DriverData(String driver,String carrierCargo, int password, String truckType, String truckPlate) {
		this.driver = driver;
		this.carrierCargo = carrierCargo;
		this.password = password;
		this.truckType = truckType;
		this.truckPlate = truckPlate;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getCarrierCargo() {
		return carrierCargo;
	}

	public void setCarrierCargo(String carrierCargo) {
		this.carrierCargo = carrierCargo;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String getTruckType() {
		return truckType;
	}

	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}

	public String getTruckPlate() {
		return truckPlate;
	}

	public void setTruckPlate(String truckPlate) {
		this.truckPlate = truckPlate;
	}
	
	public String toString() {
		return "TRANSPORTADORA: " + carrierCargo 
				+ "  -   MOTORISTA: " + driver
				+ "  -   TIPO: " + truckType
				+ "\nPLACA DO VEICULO: " + truckPlate
				+ "   -  SENHA: " + password;
		
	}

}
