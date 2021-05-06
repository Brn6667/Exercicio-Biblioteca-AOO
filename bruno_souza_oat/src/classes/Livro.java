package classes;

public class Livro {

	String name;
	Autor author;
	Pessoa borrowBy;
	
	
	public Livro(String name, Autor author){
		this.name = name;
		this.author = author;
	}
	
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Autor getAuthor() {
		return author;
	}

	public void setAuthor(Autor author) {
		this.author = author;
	}

	public Pessoa getBorrowBy() {
		return borrowBy;
	}

	public void setBorrowBy(Pessoa borrowBy) {
		this.borrowBy = borrowBy;
	}

	
	
	
	public String toString() {
		return "Livro: (" + name + ")\n -Autor: " + author.name + "\n -Nacionalidade: "+ author.nationality +"\n -Emprestado por: " + borrowBy.name + "\n";
	}
	
	
	
}
