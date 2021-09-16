package com.template.mock.model;

public class ProssimaBollettaModel {
    private String emissionePrevista;
	private boolean msgEmissioneAlternativa;
	private String pubblicazionePrevista;
	
	public String getEmissionePrevista() {
		return emissionePrevista;
	}
	public void setEmissionePrevista(String emissionePrevista) {
		this.emissionePrevista = emissionePrevista;
	}
	public boolean isMsgEmissioneAlternativa() {
		return msgEmissioneAlternativa;
	}
	public void setMsgEmissioneAlternativa(boolean msgEmissioneAlternativa) {
		this.msgEmissioneAlternativa = msgEmissioneAlternativa;
	}
	public String getPubblicazionePrevista() {
		return pubblicazionePrevista;
	}
	public void setPubblicazionePrevista(String pubblicazionePrevista) {
		this.pubblicazionePrevista = pubblicazionePrevista;
	}    
}
