package com.template.mock.model;

/**
 * Model per l'init
 */
public class InitModel {
    private String codiceCliente;
	private String codiceClienteImpersonificato;
	private String codiceContoDefault;
	private String genericErrorMessage;
	private String statoUtente;
    private String tipoUtente;
    private boolean isAdminPrezzi = false;
	private boolean isAdminCheckup = false;
	private boolean isAdmin = false;
	private String serverName;
	private String nome;
	private String cognome;
	private int numeroNotifiche;
	private boolean flAmmCondominio;
	
	public String getCodiceCliente() {
		return codiceCliente;
	}
	public void setCodiceCliente(String codiceCliente) {
		this.codiceCliente = codiceCliente;
	}
	public String getCodiceContoDefault() {
		return codiceContoDefault;
	}
	public void setCodiceContoDefault(String codiceContoDefault) {
		this.codiceContoDefault = codiceContoDefault;
	}
	public String getGenericErrorMessage() {
		return genericErrorMessage;
	}
	public void setGenericErrorMessage(String genericErrorMessage) {
		this.genericErrorMessage = genericErrorMessage;
	}
	public String getStatoUtente() {
		return statoUtente;
	}
	public void setStatoUtente(String statoUtente) {
		this.statoUtente = statoUtente;
	}
	public String getTipoUtente() {
		return tipoUtente;
	}
	public void setTipoUtente(String tipoUtente) {
		this.tipoUtente = tipoUtente;
	}
	public boolean isAdminPrezzi() {
		return isAdminPrezzi;
	}
	public void setAdminPrezzi(boolean isAdminPrezzi) {
		this.isAdminPrezzi = isAdminPrezzi;
	}
	public boolean isAdminCheckup() {
		return isAdminCheckup;
	}
	public void setAdminCheckup(boolean isAdminCheckup) {
		this.isAdminCheckup = isAdminCheckup;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public String getCodiceClienteImpersonificato() {
		return codiceClienteImpersonificato;
	}
	public void setCodiceClienteImpersonificato(String codiceClienteImpersonificato) {
		this.codiceClienteImpersonificato = codiceClienteImpersonificato;
	}
	public String getServerName() {
		return serverName;
	}
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getNumeroNotifiche() {
		return numeroNotifiche;
	}
	public void setNumeroNotifiche(int numeroNotifiche) {
		this.numeroNotifiche = numeroNotifiche;
	}
	public boolean isFlAmmCondominio() {
		return flAmmCondominio;
	}
	public void setFlAmmCondominio(boolean flAmmCondominio) {
		this.flAmmCondominio = flAmmCondominio;
	}

}
