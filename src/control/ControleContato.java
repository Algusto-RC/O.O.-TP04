package control;

import java.util.*;
import model.*;

public class ControleContato {
	
	private String telefone, email;
	private Contato ctt = new Contato("null","null");
	static Scanner ler=new Scanner(System.in);
	
	public void cadastrarTelefone() {
		telefone = ler.nextLine();
		ctt.setTelefone(telefone);
	}
	
	public void cadastrarEmail() {
		email = ler.nextLine();
		ctt.setEmail(email);
	}
}
