package exemplosEntities;

public class Employee {
	
	private String name;
	public double grossSalary, tax;
	
	private Double salary;
		
	public Employee(Integer id, String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public Employee() {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public double netSalary() {
		
		return grossSalary-tax;
	}
	
	public void increaseSalary(double percentage) {
		System.out.printf("Ugdated data: %s $ %.2f", name, netSalary() + grossSalary * percentage * 0.01);
	}
	
	public void increaseSalary2(double percentage) {
		salary += salary * percentage / 100.0;
	}
	
	@Override
	public String toString() {
		return "Employee: "
		+ name
		+ ", $ "
		+ String.format("%.2f%n", netSalary());
	}
	
}
