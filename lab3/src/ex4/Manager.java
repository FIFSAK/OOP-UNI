package ex4;

import java.util.Date;
import java.util.Objects;
import java.util.Vector;

import ex4.interfaces2.src.interfaces2.Student;

public class Manager extends Employee implements Cloneable {
	Vector<Employee> v = new Vector<Employee>();
	double bonus;

	public Manager() {

	}

	public Manager(double salary, Date hireDate, String insuranceNumber, String name, int bonus) {
		super(salary, hireDate, insuranceNumber, name);
		this.bonus = bonus;
	}

	public void addEmployee(Employee e) {
		v.add(e);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manager other = (Manager) obj;
		return super.equals(obj) && bonus == other.bonus && v.equals(other.v);
	}

	public String toString() {
		return super.toString() + bonus + v.toString();
	}

	public int compareTo(Manager o) {
		if (this.salary > o.salary)
			return 1;
		if (this.salary < o.salary)
			return -1;
		if (this.bonus > o.bonus)
			return 1;
		if (this.bonus > o.bonus)
			return -1;
		return 0;
	}

	public Object clone() throws CloneNotSupportedException {
		Manager m = (Manager) super.clone();
		m.bonus = bonus;
		m.v = (Vector<Employee>) v.clone();
		return m;

	}

}
