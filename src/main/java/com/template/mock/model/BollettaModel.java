package com.template.mock.model;

import com.template.mock.enumeration.StatoBollettaView;
import java.util.List;

public class BollettaModel {
    private String billingSystemName;
	private String bollettaSmart;
	private String codiceAzienda;
	private String codiceBollettino;
	private long dataElaborazioneLettera;
	private String emissione;
	private String fatturaRateizzata;
	private boolean flDefaultDataElaborazioneLettera;
	private String idFattura;
	private String idProtocolloDocPdf;
	private float importo;
	private String importoPagare;
	private String importoSIA;
	private float importoVersato;
	private String linkPagaOnline;
	private String mac;
	private boolean nonPagabileSIA;
	private String numeroBolletta;
	private String numeroOrdine;
	private String numPagina;
	private String options;
	private String pubblicazione;
	private List<RataFatturaRateizzataModel> rate;
	private boolean ratePresenti;
	private String scadenza;
	private StatoBollettaView statoBollettaView;
	private String statoPagamento;
	private String urlBack;
	private String urlDone;
	private String urlMs;
	private String redirectPage;
	
	public String getBillingSystemName() {
		return billingSystemName;
	}
	public void setBillingSystemName(String billingSystemName) {
		this.billingSystemName = billingSystemName;
	}
	public String getBollettaSmart() {
		return bollettaSmart;
	}
	public void setBollettaSmart(String bollettaSmart) {
		this.bollettaSmart = bollettaSmart;
	}
	public String getCodiceAzienda() {
		return codiceAzienda;
	}
	public void setCodiceAzienda(String codiceAzienda) {
		this.codiceAzienda = codiceAzienda;
	}
	public String getCodiceBollettino() {
		return codiceBollettino;
	}
	public void setCodiceBollettino(String codiceBollettino) {
		this.codiceBollettino = codiceBollettino;
	}
	public long getDataElaborazioneLettera() {
		return dataElaborazioneLettera;
	}
	public void setDataElaborazioneLettera(long dataElaborazioneLettera) {
		this.dataElaborazioneLettera = dataElaborazioneLettera;
	}
	public String getEmissione() {
		return emissione;
	}
	public void setEmissione(String emissione) {
		this.emissione = emissione;
	}
	public String getFatturaRateizzata() {
		return fatturaRateizzata;
	}
	public void setFatturaRateizzata(String fatturaRateizzata) {
		this.fatturaRateizzata = fatturaRateizzata;
	}
	public boolean isFlDefaultDataElaborazioneLettera() {
		return flDefaultDataElaborazioneLettera;
	}
	public void setFlDefaultDataElaborazioneLettera(
			boolean flDefaultDataElaborazioneLettera) {
		this.flDefaultDataElaborazioneLettera = flDefaultDataElaborazioneLettera;
	}
	public String getIdFattura() {
		return idFattura;
	}
	public void setIdFattura(String idFattura) {
		this.idFattura = idFattura;
	}
	public String getIdProtocolloDocPdf() {
		return idProtocolloDocPdf;
	}
	public void setIdProtocolloDocPdf(String idProtocolloDocPdf) {
		this.idProtocolloDocPdf = idProtocolloDocPdf;
	}
	public float getImporto() {
		return importo;
	}
	public void setImporto(float importo) {
		this.importo = importo;
	}
	public String getImportoPagare() {
		return importoPagare;
	}
	public void setImportoPagare(String importoPagare) {
		this.importoPagare = importoPagare;
	}
	public String getImportoSIA() {
		return importoSIA;
	}
	public void setImportoSIA(String importoSIA) {
		this.importoSIA = importoSIA;
	}
	public float getImportoVersato() {
		return importoVersato;
	}
	public void setImportoVersato(float importoVersato) {
		this.importoVersato = importoVersato;
	}
	public String getLinkPagaOnline() {
		return linkPagaOnline;
	}
	public void setLinkPagaOnline(String linkPagaOnline) {
		this.linkPagaOnline = linkPagaOnline;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public boolean isNonPagabileSIA() {
		return nonPagabileSIA;
	}
	public void setNonPagabileSIA(boolean nonPagabileSIA) {
		this.nonPagabileSIA = nonPagabileSIA;
	}
	public String getNumeroBolletta() {
		return numeroBolletta;
	}
	public void setNumeroBolletta(String numeroBolletta) {
		this.numeroBolletta = numeroBolletta;
	}
	public String getNumeroOrdine() {
		return numeroOrdine;
	}
	public void setNumeroOrdine(String numeroOrdine) {
		this.numeroOrdine = numeroOrdine;
	}
	public String getNumPagina() {
		return numPagina;
	}
	public void setNumPagina(String numPagina) {
		this.numPagina = numPagina;
	}
	public String getOptions() {
		return options;
	}
	public void setOptions(String options) {
		this.options = options;
	}
	public String getPubblicazione() {
		return pubblicazione;
	}
	public void setPubblicazione(String pubblicazione) {
		this.pubblicazione = pubblicazione;
	}
	public List<RataFatturaRateizzataModel> getRate() {
		return rate;
	}
	public void setRate(List<RataFatturaRateizzataModel> rate) {
		this.rate = rate;
	}
	public boolean isRatePresenti() {
		return ratePresenti;
	}
	public void setRatePresenti(boolean ratePresenti) {
		this.ratePresenti = ratePresenti;
	}
	public String getScadenza() {
		return scadenza;
	}
	public void setScadenza(String scadenza) {
		this.scadenza = scadenza;
	}
	public StatoBollettaView getStatoBollettaView() {
		return statoBollettaView;
	}
	public void setStatoBollettaView(StatoBollettaView statoBollettaView) {
		this.statoBollettaView = statoBollettaView;
	}
	public String getStatoPagamento() {
		return statoPagamento;
	}
	public void setStatoPagamento(String statoPagamento) {
		this.statoPagamento = statoPagamento;
	}
	public String getUrlBack() {
		return urlBack;
	}
	public void setUrlBack(String urlBack) {
		this.urlBack = urlBack;
	}
	public String getUrlDone() {
		return urlDone;
	}
	public void setUrlDone(String urlDone) {
		this.urlDone = urlDone;
	}
	public String getUrlMs() {
		return urlMs;
	}
	public void setUrlMs(String urlMs) {
		this.urlMs = urlMs;
	}
	public String getRedirectPage() {
		return redirectPage;
	}
	public void setRedirectPage(String redirectPage) {
		this.redirectPage = redirectPage;
	}

}
