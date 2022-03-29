package model;

//import java.awt.Image;

public class PerfilDoCliente extends Perfil {
	//CONSTRUTOR:
	public PerfilDoCliente(String nome, String cpf_cnpj, String idade,/*Image foto,*/ Endereco endereco) {
		super( nome,  cpf_cnpj,  idade,  /*foto,*/  endereco);
	}
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//METODOS:
	@Override
	public void cadastrar() {
		System.out.println("Digite o seu nome:");
		nome=ler.nextLine();
		System.out.println(" ");
		
		System.out.println("Digite o seu CPF ou CNPJ: ");
		cpf_cnpj=ler.nextLine();
		System.out.println(" ");

		System.out.println("Digite a sua idade: ");
		idade=ler.nextLine();
		System.out.println(" ");

		System.out.println("Digite o seu endereço: ");
		endereco.cadastrar();	
		System.out.println(" ");

		super.cadastrar();
	}
	//---//------------//---//
	@Override
	public void editar() {
		String desejada, nova;

        System.out.println("Escolha o que deseja editar: ");
        desejada = ler.nextLine();
        desejada = desejada.toLowerCase(); 

        switch (desejada) {
            case "nome":
                System.out.println("Digite o novo nome: ");
                nova = ler.nextLine();
                nome = nome.replace(nome, nova); 
				System.out.println(" ");      
                break;
            case "cpf":
                System.out.println("Digite o novo CPF/CNPJ: ");
                nova = ler.nextLine();
                cpf_cnpj = cpf_cnpj.replace(cpf_cnpj, nova);  
				System.out.println(" ");             
                break;
            
            case "idade":
            	System.out.println("Digite a nova idade: ");
                nova = ler.nextLine();
                idade = idade.replace(idade, nova); 
				System.out.println(" ");       
                break;

            /*case "foto":
            	System.out.println("Adicione a nova foto: ");
                break;
			*/

            case "endereco":
            	endereco.editar();
                break;
            
            default:
				System.out.println("Opcao Invalida");
				System.out.println(" ");      
                break;
        }
		super.editar();
	}
	//---//------------//---//
	@Override
	public void deletar() {
		nome = nome.replace(nome, "Nome nao cadastrado");  
		cpf_cnpj = cpf_cnpj.replace(cpf_cnpj, "CPF/CNPJ nao cadastrado");  
		idade = idade.replace(idade, "Idade nao cadastrada");  
		endereco.deletar();
		
		super.deletar();
	}
	//---//------------//---//
	/*public boolean pesquisar() {
		return true;
	}*/
	//---//------------//---//
	@Override
	public void visualizar() {
		System.out.printf("Nome: %s\nCPF/CPNJ: %s\nIdade: %s", nome, cpf_cnpj, idade);
		System.out.println(" ");
		System.out.printf("F O T O   B O N I T I N H A ");
		System.out.println(" ");
		endereco.visualizar();
		System.out.println(" ");

		super.visualizar();
	}
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//GETS E SETS:
	@Override
	public String getNome() {
		return super.getNome();
	}
	//---//------------//---//
	@Override
	public void setNome(String nome) {
		super.setNome(nome);
	}
	//---//------------//---//
	@Override
	public String getCpf_cnpj() {
		return super.getCpf_cnpj();
	}
	//---//------------//---//
	@Override
	public void setCpf_cnpj(String cpf_cnpj) {
		super.setCpf_cnpj(cpf_cnpj);
	}
	//---//------------//---//
	@Override
	public String getIdade() {
		return super.getIdade();
	}
	//---//------------//---//
	@Override
	public void setIdade(String idade) {
		super.setIdade(idade);
	}
	//---//------------//---//
	@Override
	public Endereco getEndereco() {
		return super.getEndereco();
	}
	//---//------------//---//
	@Override
	public void setEndereco(Endereco endereco) {
		super.setEndereco(endereco);
	}
}
