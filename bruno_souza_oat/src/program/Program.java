package program;
import classes.Autor;
import classes.Professor;
import classes.Aluno;
import classes.Livro;

public class Program {
	
	public static void main(String[] args) {
	
	Autor author2 = new Autor("Stephen Covey", "Reino Unido");
	Autor author1 = new Autor("Stephen Hawking", "Estados Unidos");
	Aluno student0 = new Aluno("Bruno Souza", 169);
	Professor prof1 = new Professor("André Matos", 175);
	
	Livro book0 = new Livro("Os 7 habitos das pessoas altamente eficazes", author2);
	book0.setBorrowBy(student0);
	
	Livro book1 = new Livro("Uma breve história do tempo", author1);
	book1.setBorrowBy(prof1);
	
	
	System.out.println(book0.toString());
	System.out.println(book1.toString());
	
		

	}

}
