package classes;

public class Aluno extends Pessoa {
	
	int code;
	

	public Aluno(String name, int code) {
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
