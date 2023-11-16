package ex4;

import java.util.Date;
import java.util.Objects;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
	double salary;
	Date hireDate;
	String insuranceNumber;
	
	
	public Employee(){}
	
	public Employee(double salary, Date hireDate, String insuranceNumber, String name) {
		super(name);
		this.salary = salary;
		this.hireDate = hireDate;
		this.insuranceNumber = insuranceNumber;
	}

	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public String getInsuranceNumber() {
		return insuranceNumber;
	}
	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return super.equals(obj)&& Objects.equals(hireDate, other.hireDate) && Objects.equals(insuranceNumber, other.insuranceNumber)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	@Override
	public String toString() {
		return super.toString() + "[salary=" + salary + ", hireDate=" + hireDate + ", insuranceNumber=" + insuranceNumber + "]";
	}

	@Override
	public int compareTo(Employee o) {
		if(this.salary>o.salary) return 1;
		if(this.salary<o.salary) return -1;
		return 0;
	}
	
	public Object clone() throws CloneNotSupportedException{
		Employee e = (Employee)super.clone();
		e.hireDate = (Date)hireDate.clone();
		return e;
	}
	
}
