package com.template.mock.model;

import java.util.List;

public class ListaContiClienteModel {
    
    private List<ContoModel> conto;
	private String tipoCliente;
	private String commodity;
	
	public List<ContoModel> getConto() {
		return conto;
	}
	public void setConto(List<ContoModel> conto) {
		this.conto = conto;
	}
	public String getTipoCliente() {
		return tipoCliente;
	}
	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	public String getCommodity() {
		return commodity;
	}
	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}
}
