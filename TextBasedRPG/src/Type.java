
import java.util.Scanner;
public class Type {
	private String name;
	private String description;
	
	public Type() {
		Scanner input = new Scanner(System.in);
		System.out.println("Choose your character type");
		System.out.println("1. Archer");
		System.out.println("2. Mage");
		System.out.println("3. Knight");
		this.name = input.next();
		
		if(name == "Archer") {
			description = "Long ranged but weak damage";
			
		}
		else if (name == "Mage") {
			description = "High damage spells but low health";
			
		}
		else if (name == "knight") {
			description = "High damage and health, but low mobility";
		}
		
		
	}
	
	public String getName() {
		return this.name;
	}
	public void setName() {
		Scanner input = new Scanner(System.in);
		System.out.println("Choose your character type");
		System.out.println("1. Archer");
		System.out.println("2. Mage");
		System.out.println("3. Knight");
		this.name = input.next();
		
		if(name == "Archer") {
			description = "Long ranged but weak damage";
			
		}
		else if (name == "Mage") {
			description = "High damage spells but low health";
			
		}
		else if (name == "knight") {
			description = "High damage and health, but low mobility";
		}
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String descrip) {
		this.description = descrip;
	}
}
