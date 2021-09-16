package com.template.mock.model;

public class FornituraModel {
    private String codicePdf;
	private String codiceFornituraNumerico;
	private String commodity;
    private String alias;
    private String selezionato;
	
	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getSelezionato() {
		return selezionato;
	}

	public void setSelezionato(String selezionato) {
		this.selezionato = selezionato;
	}

	public String getCodicePdf() {
		return codicePdf;
	}
	
	public void setCodicePdf(String codicePdf) {
		this.codicePdf = codicePdf;
	}

	public String getCodiceFornituraNumerico() {
		return codiceFornituraNumerico;
	}

	public void setCodiceFornituraNumerico(String codiceFornituraNumerico) {
		this.codiceFornituraNumerico = codiceFornituraNumerico;
	}

	public String getCommodity() {
		return commodity;
	}

	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}

}
