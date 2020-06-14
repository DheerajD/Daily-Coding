package TestNG.demo;

public class EmpBusinessLogic {
	
	public double calcYearlySalary(EmpDemo emp) {
		return (emp.getSalary()*12);
	}
	
	public double calcAppraisal(EmpDemo emp) {
		double appraisal = 0;
		
		if(emp.getSalary() < 10000) {
			appraisal = 500;
		}
		else {
			appraisal = 1000;
		}
		
		return appraisal;
	}

}
