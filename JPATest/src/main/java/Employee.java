

import javax.persistence.column;
import javax.persistence.Entity;
import javax.persistence.GenerateValue;
import javax.persistence.GenerateType;
import javax.persistence.Id;

@Entity
public class Employee {
	@id
	@Generated(strategy=GenericArrayType.IDENTITY)
	int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	String name;

}
