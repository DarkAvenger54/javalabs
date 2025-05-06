package pl.wit.lab3;
 
import java.util.LinkedHashMap;
import java.util.Map;
 
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
 
/**
* Klasa pochodna - Student
* @author Łukasz
*
*/
public class StudentDemo extends AbstractDemo {
	private Map<String,Byte> mapPoints = null;
	protected static final Logger log = LogManager.getLogger(StudentDemo.class.getName());
	public StudentDemo(String firstName, String lastName) {
		super(firstName, lastName);
		this.mapPoints = new LinkedHashMap<>();
	}
	@Override
	protected EnPersonType getPersonType() {
		return EnPersonType.student;
	}
	public void addPoints(String name, byte mark) throws PersonException {
		if(name != null && !name.isEmpty() && mark >= 0) {
			mapPoints.put(name,mark);
			logDebug("Dodano punkty do mapy: " + name + " " + mark + " ");
			logTrace("Dodano kryterium: " + name + ", liczba punktów: " + mark + " ");
		}
		else {
			throw new PersonException("Bledne kryterium lub ocena");
		}
	}
	public Logger getLogger() {
		return log;
	}
	public Map<String, Byte> getMapPoints() {
		return mapPoints;
	}
}