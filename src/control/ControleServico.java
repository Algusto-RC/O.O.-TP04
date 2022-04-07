package control;

import model.Servico;

public class ControleServico extends Servico {

    public ControleServico(String tipoDeServico, String formacao) {
        super(tipoDeServico, formacao);
    }
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//GETS E SETS:
	public String getTipoDeServico() {
		return tipoDeServico;
    }
	//---//------------//---//
    public void setTipoDeServico(String tipoDeServico) {
        this.tipoDeServico = tipoDeServico;
    }
	//---//------------//---//
    public String getFormacao() {
        return formacao;
    }
	//---//------------//---//
    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
}
