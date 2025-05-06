package pl.wit.lab3.p5;

import java.util.Date;
/**
 * Klasa przechowująca podstawowe dane osobowe
 * używająca konstruktorów przeciążonych
 * @author Łukasz
 *
 */
public class Person3 {
	// Imię
	private String firstName = null;
	// Nazwisko
	private String lastName = null;
	// Data urodzenia
	private Date dateOfBirth = null;

	public Person3(String firstName,String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

	public Person3(String firstName,String lastName,Date dateOfBirth) {
			this(firstName,lastName);
			this.dateOfBirth = dateOfBirth;
		}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("firstName=").append(firstName).append("\n");
		sb.append("lastName=").append(lastName).append("\n");
		sb.append("dateOfBirth=").append(dateOfBirth.toString()).append("\n");
		return sb.toString();
	}
	public boolean matches(String firstName, String lastName, Date birthFrom, Date birthTo) {
		return matches(firstName, lastName, birthFrom, birthTo, false);
	}

	public boolean matches(String firstName, String lastName, Date birthFrom, Date birthTo, boolean strict) {
		if (firstName != null && !firstName.isEmpty()) {
			if (this.firstName == null) return false;
			if (strict) {
				if (!this.firstName.equals(firstName)) return false;
			} else {
				if (!this.firstName.startsWith(firstName)) return false;
			}
		}
		if (lastName != null && !lastName.isEmpty()) {
			if (this.lastName == null) return false;
			if (strict) {
				if (!this.lastName.equals(lastName)) return false;
			} else {
				if (!this.lastName.startsWith(lastName)) return false;
			}
		}
		if (birthFrom != null) {
			if (this.dateOfBirth == null || this.dateOfBirth.before(birthFrom)) {
				return false;
			}
		}
		if (birthTo != null) {
			if (this.dateOfBirth == null || this.dateOfBirth.after(birthTo)) {
				return false;
			}
		}
		return true;
	}

	///////////////////////////////////////////
	// getters and setters
	///////////////////////////////////////////
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
