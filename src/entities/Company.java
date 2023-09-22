package entities;

public class Company extends TaxPayer{

	private Integer numberOfEmplyees;
	
	
	public Company() {
		super();
	}
	
	
	
	public Company(String name, Double anualIncome, Integer numberOfEmplyees) {
		super(name, anualIncome);
		this.numberOfEmplyees = numberOfEmplyees;
	}


	

	public Integer getNumberOfEmplyees() {
		return numberOfEmplyees;
	}



	public void setNumberOfEmplyees(Integer numberOfEmplyees) {
		this.numberOfEmplyees = numberOfEmplyees;
	}

	
	
	

	@Override
	public double tax() {
		if(numberOfEmplyees < 10) {
			return getAnualIncome() * 0.16;
		}
		else {
			return getAnualIncome() * 0.14;
		}
	}

}
