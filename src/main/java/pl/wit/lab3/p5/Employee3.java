package pl.wit.lab3.p5;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

/**
 * Klasa pracownika
 * wykonana z użyciem wywołania konstruktora
 * klasy bazowej
 * @author Łukasz
 *
 */
public class Employee3 extends Person3{
	//Data zatrudnienia
	private Date employmentDate = null;
	//Wyngrodzenie
	private BigDecimal sallary = null;
	
	public Employee3(String firstName, String lastName, Date dateOfBirth,Date employmentDate, BigDecimal sallary ) {
		super(firstName, lastName, dateOfBirth);
		this.employmentDate = employmentDate;
		this.sallary = sallary;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		sb.append("employmentDate=").append(employmentDate.toString()).append("\n");
		sb.append("sallary=").append(sallary.toString()).append("\n");
		return sb.toString();
	}
	public boolean matches(String firstName, String lastName, Date birthFrom, Date birthTo, Date employmentFrom, Date employmentTo, BigDecimal sallaryFrom, BigDecimal sallaryTo) {
		return matches(firstName, lastName, birthFrom, birthTo, employmentFrom, employmentTo, sallaryFrom, sallaryTo, false);
	}

	public boolean matches(String firstName, String lastName, Date birthFrom, Date birthTo, Date employmentFrom, Date employmentTo, BigDecimal sallaryFrom, BigDecimal sallaryTo, boolean strict) {
		if (!super.matches(firstName, lastName, birthFrom, birthTo, strict)) {
			return false;
		}
		if (employmentFrom != null) {
			if (this.employmentDate == null || this.employmentDate.before(employmentFrom)) {
				return false;
			}
		}
		if (employmentTo != null) {
			if (this.employmentDate == null || this.employmentDate.after(employmentTo)) {
				return false;
			}
		}
		if (sallaryFrom != null) {
			if (this.sallary == null || this.sallary.compareTo(sallaryFrom) < 0) {
				return false;
			}
		}
		if (sallaryTo != null) {
			if (this.sallary == null || this.sallary.compareTo(sallaryTo) > 0) {
				return false;
			}
		}
		return true;
	}
	////////////////////////////////////////
	//	getters and setters
	////////////////////////////////////////
	
	public Date getEmploymentDate() {
		return employmentDate;
	}

	public BigDecimal getSallary() {
		return sallary;
	}
}