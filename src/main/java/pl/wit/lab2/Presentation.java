package pl.wit.lab2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

/**
 * 
 * @author DarkAvenger54
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
	private String[] visitedPlaces;
	
	private Presentation(String firstName,String lastName) {
		//inicjalizacja imienia i nazwiska
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Presentation(String firstName,String lastName,byte birthdayDay,byte birthdayMonth,short birthdayYear) {
		//wywołanie konstruktora 2-argumentowego
		this(firstName, lastName);
		if (birthdayYear < 1900)
		{
			throw new IllegalArgumentException("Year must be >= 1900");
		}
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
		StringBuilder sb = new StringBuilder();
		if(birthdayDay < 10) {
			sb.append("0".concat(String.valueOf(birthdayDay)));
		}
		else {
			sb.append(String.valueOf(birthdayDay));
		}
		sb.append(".");
		if(birthdayMonth < 10) {
			sb.append("0".concat(String.valueOf(birthdayMonth)));
		}
		else {
			sb.append(String.valueOf(birthdayMonth));
		}
		sb.append(".");
		sb.append(birthdayYear);
		return sb.toString();
	}
	
	public byte getAge() {
		LocalDate now = LocalDate.now();  
		LocalDate then = LocalDate.of(birthdayYear, birthdayMonth, birthdayDay);
        return (byte)Period.between(then, now).getYears();
	}
	public void addNewVisitedPlace(String visitedPlace)
	{
		if(visitedPlaces == null)
		{
			visitedPlaces = new String[1];
        }
		else
		{
			visitedPlaces = Arrays.copyOf(visitedPlaces, visitedPlaces.length + 1);
        }
        visitedPlaces[visitedPlaces.length - 1] = visitedPlace;
    }
	
	public String getPresentationStory() {
		StringBuilder sb = new StringBuilder();
		int	age = getAge();
		sb.append("Full name: ");
		sb.append(getFullName());
		sb.append(" Age: ");
		sb.append(age);
		sb.append(" ");
		if (age < 18) {
			sb.append("Child");
		}
		else if (age > 18 && age < 60) {
			sb.append("Adult");
		}
		else {
			sb.append("Senior");
		}
		sb.append(" Born: ");
		sb.append(getBirthdayDateAsString());
		sb.append(" in ");
		sb.append(getPlaceOfBirth());
		sb.append(" Visited places: ");
		for(String visitedPlace: visitedPlaces)
		{
			sb.append(visitedPlace.concat(" "));
		}
		sb.append("Facebook friends: ");
		int	friends = getFacebookFriendsQuantity();
		sb.append(friends);
		sb.append(" ");
		if (friends == 0)
		{
			sb.append("no friends");
		}
		else if(friends < 100)
		{
			sb.append("Small amount of friends");
		}
		else if(friends > 100 && friends < 1000)
		{
			sb.append("Medium amount of friends");
		}
		else
		{
			sb.append("Big amount of friends");
		}
		return sb.toString();
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
