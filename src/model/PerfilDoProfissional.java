package model;

public class PerfilDoProfissional extends Perfil {
	//ATRIBUTOS:
	private Servico servicos;
	private Contato contatos;
	private String experiencia;
	//private Pedido pedidos[]= new Pedido[1];
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//CONSTRUTOR:
	public PerfilDoProfissional(String nome, String cpf_cnpj, String idade, Endereco endereco, 
								Servico servicos, Contato contatos, String experiencia) {

		super(nome, cpf_cnpj, idade, endereco);
		this.servicos = servicos;
		this.contatos = contatos;
		this.experiencia = experiencia;
	}
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//METODOS:
	@Override
	public void cadastrar() {
		String uf;

		System.out.println("Digite o seu nome:");
		nome = ler.nextLine();
		System.out.println(" ");
		
		System.out.println("Digite o seu CPF ou CNPJ: ");
		cpf_cnpj = ler.nextLine();
		System.out.println(" ");

		contatos.cadastrar();

		System.out.println("Digite a sua idade: ");
		idade = ler.nextLine();
		System.out.println(" ");

		System.out.println("Digite a UF em que você atua: ");
		uf = ler.nextLine();
		endereco.setUf(uf);	
		System.out.println(" ");

		servicos.cadastrar();
		System.out.println(" ");

		System.out.print("Escreva algo sobre sua experiencia na area: ");
		experiencia = ler.nextLine();
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
            	System.out.println("Digite sua idade atual: ");
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

			case "servico":
            	servicos.editar();
                break;

			case "contato":
            	contatos.editar();
                break;

			case "experiencia":
				System.out.println("Digite a sua experiencia atual: ");
				nova = ler.nextLine();
				experiencia = experiencia.replace(experiencia, nova); 
				System.out.println(" "); 
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
		servicos.deletar();
		contatos.deletar();
		experiencia = experiencia.replace(experiencia, "Experiencia nao cadastrada");  

		super.deletar();
	}
	//---//------------//---//
	@Override
	public void visualizar() {
		System.out.printf("Nome: %s\nCPF/CPNJ: %s\nIdade: %s", nome, cpf_cnpj, idade);
		System.out.println(" ");
		System.out.printf("F O T O   B O N I T I N H A ");
		System.out.println(" ");
		System.out.printf("Zona de atuacao: %s ", endereco.getUf());
		System.out.println(" ");
		servicos.visualizar();
		System.out.println(" ");
		contatos.visualizar();
		System.out.println(" ");
		System.out.printf("O que sei sobre %s: %s", servicos.getTipoDeServico(), experiencia);
		System.out.println(" ");

		super.visualizar();
	}
	//---//------------//---//
	public void visualizarPedidos() {
		System.out.print("Em breve ");
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
	//---//------------//---//
	public Servico getServicos() {
		return servicos;
	}
	//---//------------//---//
	public void setServicos(Servico servicos) {
		this.servicos = servicos;
	}
	//---//------------//---//
	public Contato getContatos() {
		return contatos;
	}
	//---//------------//---//
	public void setContatos(Contato contatos) {
		this.contatos = contatos;
	}
	//---//------------//---//
	public String getExperiencia() {
		return experiencia;
	}
	//---//------------//---//
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	//---//------------//---//
	/*public Pedido[] getPedidos() {
		return pedidos;
	}
	//---//------------//---//
	public void setPedidos(Pedido[] pedidos) {
		this.pedidos = pedidos;
	}*/
}
