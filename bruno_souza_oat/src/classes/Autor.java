package classes;

public class Autor extends Pessoa {
	
	String nationality;

	
	public Autor(String name, String nationality) {
		super(name);
		this.nationality = nationality;
	}



	public String getNationality() {
		return nationality;
	}



	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	
	
	
	

}
