package control;

import model.Contato;
import model.Endereco;
import model.PerfilDoProfissional;
import model.Servico;

public class ControlePerfilDoProfissional extends PerfilDoProfissional{
    /*private String nome, cpf_cnpj, idade, experiencia;
    private Endereco endereco;
    private Servico servicos;
    private Contato contatos;*/

    public ControlePerfilDoProfissional(String nome, String cpf_cnpj, String idade, Endereco endereco, Servico servicos,
            Contato contatos, String experiencia) {
        super(nome, cpf_cnpj, idade, endereco, servicos, contatos, experiencia);
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
    

}
