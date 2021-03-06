package com.cardekho.model;

public abstract class Vehicle extends BaseModel{

	/* Data Members */
	private String make;
	private String model;
	private String engineCC;
	private String fuelCapacity;
	private String mileage;
	private int price;
	private int roadTax;
	private String imagePath;
	
	/** Method to set Fuel capacity of vehicle
	 * 
	 * @param fuelCapacity
	 */
	public void setFuelCapacity(String fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	
	/** Method to get price of a vehicle 
	 * 
	 * @return price : price of vehicle
	 */
	public int getPrice() {
		return price;
	}

	/** Method to set price of a vehicle
	 * 
	 * @param price : price of vehicle
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/** Method to get roadTax of a vehicle
	 * 
	 * @return roadTax : road tax of vehicle
	 */
	public int getRoadTax() {
		return roadTax;
	}

	/** Method to set roadTax of a vehicle
	 * 
	 * @param roadTax : road tax of vehicle
	 */
	public void setRoadTax(int roadTax) {
		this.roadTax = roadTax;
	}

	/** Method to set Mileage of vehicle 
	 * @param mileage
	 */
	public void setMileage(String mileage) {
		this.mileage = mileage;
	}
	
	/** Method to get company name of a vehicle 
	 * 
	 * @return make : company of vehicle
	 */
	public String getMake() {
		return make;
	}
	
	/** Method to set company name of a vehicle
	 * 
	 * @param make : comapny name of vehicle
	 */
	public void setMake(String make) {
		this.make = make;
	}
	
	/** Method to return model of a vehicle
	 * 
	 * @return model : model name
	 */
	public String getModel() {
		return model;
	}
	
	/** Method to set model of a vehicle
	 * 
	 * @param model
	 */
	public void setModel(String model) {
		this.model = model;
	}
	
	/** Method to get Engine CC of a vehicle
	 * 
	 * @return engineCC
	 */
	public String getEngineCC() {
		return engineCC;
	}
	
	/** Method to set Engine CC of a vehicle
	 * 
	 * @param engineCC
	 */
	public void setEngineCC(String engineCC) {
		this.engineCC = engineCC;
	}
	
	/** Method to get fuel Capacity of a vehicle
	 * 
	 * @return fuelCapacity
	 */
	public String getFuelCapacity() {
		return fuelCapacity;
	}
	
	/** Method to get mileage of a vehicle
	 * 
	 * @return mileage
	 */
	public String getMileage() {
		return mileage;
	}
	
	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	/** this method returns basic details of a vehicle	*/
	public String toString() {
		return "Make: "+ this.make +",Model: "+this.model+
				",Engine CC: "+this.engineCC+
				",Fuel Capacity: "+this.fuelCapacity+
				",Mileage: "+this.mileage+
				",Price: "+this.price+
				",Road Tax: "+this.roadTax+
				",Image Path: " + this.imagePath;
	}
	
	/** Method to calculate on road price of a vehicle */
	public int calculateOnRoadPrice() {
		return (price+(price*roadTax)/100);
	}

	@Override
	public int hashCode() {
		final int prime = 47;
		int result = 1;
		if(make == null) {
			result = prime * result;
		} else {
			result = prime * result + make.hashCode();
		}
		
		if(model == null) {
			result = prime * result;
		} else {
			result = prime * result + model.hashCode();
		}
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Vehicle))
			return false;
		
		Vehicle other = (Vehicle) obj;
		
		if (other.make == null ) {
			if (this.make != null)
				return false;
		} else if (!other.make.equals(this.make))
			return false;
		
		if (other.model == null) {
			if (this.model != null)
				return false;
		} else if (!other.model.equals(this.model))
			return false;
		
		return true;
	}
}