package person.entities;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Person {
    @Id
	public int id;
	public String Name;
	public String Loc;
	
	Person()
	{
		
	}

	public Person(int id, String name, String loc) {
		super();
		this.id = id;
		this.Name = name;
		this.Loc = loc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getLoc() {
		return Loc;
	}

	public void setLoc(String loc) {
		Loc = loc;
	}
	
	
	
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//	}

}
