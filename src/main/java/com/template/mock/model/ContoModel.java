package com.template.mock.model;

import java.util.List;

public class ContoModel 
{
    private String alias;
	private boolean aliasIsBlank;
	private String codice;
	private String selezionato;
    private String tipo;
    private String commodity;
    private List<FornituraModel> forniture;
    
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public boolean isAliasIsBlank() {
		return aliasIsBlank;
	}
	public void setAliasIsBlank(boolean aliasIsBlank) {
		this.aliasIsBlank = aliasIsBlank;
	}
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public String getSelezionato() {
		return selezionato;
	}
	public void setSelezionato(String selezionato) {
		this.selezionato = selezionato;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCommodity() {
		return commodity;
	}
	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}
	public List<FornituraModel> getForniture() {
		return forniture;
	}
	public void setForniture(List<FornituraModel> forniture) {
		this.forniture = forniture;
	}

}
