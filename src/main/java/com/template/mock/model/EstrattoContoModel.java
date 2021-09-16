package com.template.mock.model;

public class EstrattoContoModel {
    private String commodity;
    private String dataOdierna;
    private float debitoTotale;
    private String esitoFattureRateizzabili;
    private float inScadenza;
    private int numBolletteNonPagate;
    private ProssimaBollettaModel prossimaBolletta;
    private float saldo;
    private float scaduto;
    private String situazione;
    private String statoConto;
    private String statoUtente;
    private boolean widgetVisibile;

    public String getCommodity() {
        return commodity;
    }
    public void setCommodity(String commodity) {
        this.commodity = commodity;
    }
    public String getDataOdierna() {
        return dataOdierna;
    }
    public void setDataOdierna(String dataOdierna) {
        this.dataOdierna = dataOdierna;
    }
    public float getDebitoTotale() {
        return debitoTotale;
    }
    public void setDebitoTotale(float debitoTotale) {
        this.debitoTotale = debitoTotale;
    }
    public String getEsitoFattureRateizzabili() {
        return esitoFattureRateizzabili;
    }
    public void setEsitoFattureRateizzabili(String esitoFattureRateizzabili) {
        this.esitoFattureRateizzabili = esitoFattureRateizzabili;
    }
    public float getInScadenza() {
        return inScadenza;
    }
    public void setInScadenza(float inScadenza) {
        this.inScadenza = inScadenza;
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
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public float getScaduto() {
        return scaduto;
    }
    public void setScaduto(float scaduto) {
        this.scaduto = scaduto;
    }
    public String getSituazione() {
        return situazione;
    }
    public void setSituazione(String situazione) {
        this.situazione = situazione;
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
    public boolean isWidgetVisibile() {
        return widgetVisibile;
    }
    public void setWidgetVisibile(boolean widgetVisibile) {
        this.widgetVisibile = widgetVisibile;
    }
}
