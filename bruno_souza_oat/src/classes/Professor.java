package classes;

public class Professor extends Pessoa {
	
	int code;
	
	
	public Professor(String name, int code) {
		super(name);
		this.code = code;
	}
	
	
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	
}
