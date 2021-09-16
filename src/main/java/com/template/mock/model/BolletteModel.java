package com.template.mock.model;

import java.util.List;

public class BolletteModel {
    private List<BollettaModel> bollette;
	private String commodity;
	private String dataAutoletturaA;
	private String dataAutoletturaDa;
	private boolean domiciliazione;
	private String email;
	private String errorDownloadMetadata;
	private String genericErrorMessage;
	private String indirizzoFornitura;
	private String numeroCliente;
	private int numBolletteNonPagate;
	private ProssimaBollettaModel prossimaBolletta;
	private String statoConto;
	private String statoUtente;
	private String tipoErrore;
	private boolean widgetVisibile;
	
	public List<BollettaModel> getBollette() {
		return bollette;
	}
	public void setBollette(List<BollettaModel> bollette) {
		this.bollette = bollette;
	}
	public String getCommodity() {
		return commodity;
	}
	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}
	public String getDataAutoletturaA() {
		return dataAutoletturaA;
	}
	public void setDataAutoletturaA(String dataAutoletturaA) {
		this.dataAutoletturaA = dataAutoletturaA;
	}
	public String getDataAutoletturaDa() {
		return dataAutoletturaDa;
	}
	public void setDataAutoletturaDa(String dataAutoletturaDa) {
		this.dataAutoletturaDa = dataAutoletturaDa;
	}
	public boolean isDomiciliazione() {
		return domiciliazione;
	}
	public void setDomiciliazione(boolean domiciliazione) {
		this.domiciliazione = domiciliazione;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getErrorDownloadMetadata() {
		return errorDownloadMetadata;
	}
	public void setErrorDownloadMetadata(String errorDownloadMetadata) {
		this.errorDownloadMetadata = errorDownloadMetadata;
	}
	public String getGenericErrorMessage() {
		return genericErrorMessage;
	}
	public void setGenericErrorMessage(String genericErrorMessage) {
		this.genericErrorMessage = genericErrorMessage;
	}
	public String getIndirizzoFornitura() {
		return indirizzoFornitura;
	}
	public void setIndirizzoFornitura(String indirizzoFornitura) {
		this.indirizzoFornitura = indirizzoFornitura;
	}
	public String getNumeroCliente() {
		return numeroCliente;
	}
	public void setNumeroCliente(String numeroCliente) {
		this.numeroCliente = numeroCliente;
	}
	public int getNumBolletteNonPagate() {
		return numBolletteNonPagate;
	}
	public void setNumBolletteNonPagate(int numBolletteNonPagate) {
		this.numBolletteNonPagate = numBolletteNonPagate;
	}
	public ProssimaBollettaModel getProssimaBolletta() {
		return prossimaBolletta;
	}
	public void setProssimaBolletta(ProssimaBollettaModel prossimaBolletta) {
		this.prossimaBolletta = prossimaBolletta;
	}
	public String getStatoConto() {
		return statoConto;
	}
	public void setStatoConto(String statoConto) {
		this.statoConto = statoConto;
	}
	public String getStatoUtente() {
		return statoUtente;
	}
	public void setStatoUtente(String statoUtente) {
		this.statoUtente = statoUtente;
	}
	public String getTipoErrore() {
		return tipoErrore;
	}
	public void setTipoErrore(String tipoErrore) {
		this.tipoErrore = tipoErrore;
	}
	public boolean isWidgetVisibile() {
		return widgetVisibile;
	}
	public void setWidgetVisibile(boolean widgetVisibile) {
		this.widgetVisibile = widgetVisibile;
	}
}
