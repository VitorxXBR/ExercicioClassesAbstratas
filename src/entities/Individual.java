package entities;

public class Individual extends TaxPayer {

	private Double healthExpendures;
	
	
	public Individual() {
		super();
	}
	


	public Individual(String name, Double anualIncome, Double healthExpendures) {
		super(name, anualIncome);
		this.healthExpendures = healthExpendures;
	}


	public Double getHealthExpendures() {
		return healthExpendures;
	}



	public void setHealthExpendures(Double healthExpendures) {
		this.healthExpendures = healthExpendures;
	}



	@Override
	public double tax() {
		if(getAnualIncome() < 20000.00) {
			return getAnualIncome() * 0.15 - healthExpendures * 0.5;
		}
		else {
			return getAnualIncome() * 0.25 - healthExpendures * 0.5;
		}
	}
	
}
