package pl.wit.lab2;

import java.time.LocalDate;
import java.time.Period;

/**
 * 
 * @author 
 *
 */
public class Presentation {
	
	//pole imia
	private String firstName;
	//pole nazwiska
	private String lastName;
	//pola daty urodzenia
	private byte birthdayDay, birthdayMonth;
	//pole roka urodzenia
	private short birthdayYear;
	//pole miejsca urodzenia
	private String placeOfBirth;
	//pole ilosc koleg
	private short facebookFriendsQuantity;
	//pole zwiedzonych miejsc
	private String visitedPlaces[];
	
	private Presentation(String firstName,String lastName) {
		//inicjalizacja imienia i nazwiska
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Presentation(String firstName,String lastName,byte birthdayDay,byte birthdayMonth,short birthdayYear) {
		//wywołanie konstruktora 2-argumentowego
		this(firstName, lastName);
		//dalsza inicjalizacja
		this.birthdayDay = birthdayDay;
		this.birthdayMonth = birthdayMonth;
		this.birthdayYear = birthdayYear;
	}
	
	public String getFullName() {
		//Zwrócenie połączonej wartości imienia i nazwiska ze spacją pomiędzy
		return firstName.concat(" ").concat(lastName);
	}
	
	public String getBirthdayDateAsString() {
		//Ręczne zbudowanie Daty w formacie dd.MM.yyyy 
		
		return String.valueOf(birthdayDay).concat(".").concat(String.valueOf(birthdayMonth)).concat(".").concat(String.valueOf(birthdayYear));
	}
	
	public byte getAge() {
		LocalDate now = LocalDate.now();  
		LocalDate then = LocalDate.of(birthdayDay, birthdayMonth, birthdayYear);
		byte years = (byte)Period.between(now, then).getYears();
		return years;
	}
	
	public String getPresentationStory() {
		StringBuilder sb = new StringBuilder();
		return null;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public byte getBirthdayDay() {
		return birthdayDay;
	}

	public void setBirthdayDay(byte birthdayDay) {
		this.birthdayDay = birthdayDay;
	}

	public byte getBirthdayMonth() {
		return birthdayMonth;
	}

	public void setBirthdayMonth(byte birthdayMonth) {
		this.birthdayMonth = birthdayMonth;
	}

	public short getBirthdayYear() {
		return birthdayYear;
	}

	public void setBirthdayYear(short birthdayYear) {
		this.birthdayYear = birthdayYear;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public short getFacebookFriendsQuantity() {
		return facebookFriendsQuantity;
	}

	public void setFacebookFriendsQuantity(short facebookFriendsQuantity) {
		this.facebookFriendsQuantity = facebookFriendsQuantity;
	}

	public String[] getVisitedPlaces() {
		return visitedPlaces;
	}

	public void setVisitedPlaces(String[] visitedPlaces) {
		this.visitedPlaces = visitedPlaces;
	}


	
	
	////////////////////////////////////////////
	// gettery i settery
	////////////////////////////////////////////
}
