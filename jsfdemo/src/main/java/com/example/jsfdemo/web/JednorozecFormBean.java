package com.example.jsfdemo.web;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import com.example.jsfdemo.domain.Jednorozec;
import com.example.jsfdemo.domain.Person;
import com.example.jsfdemo.service.JednorozecManager;

@SessionScoped
@Named("jednorozecBean")
public class JednorozecFormBean implements Serializable{
	private static final long serialVersionUID = 8748565244717500353L;

	private Jednorozec jednorozec = new Jednorozec();
	private ListDataModel<Jednorozec> jednorozce = new ListDataModel<Jednorozec>();
	
	@Inject
	private JednorozecManager jednorozecManager;
	
	public Jednorozec getJednorozec(){
		return jednorozec;
	}

	public void setJednorozec(Jednorozec jednorozec) {
		this.jednorozec = jednorozec;
	}
	
	// Actions
	public String addJednorozec() {
		jednorozecManager.addJednorozec(jednorozec);
		return "listaJednorozcow"; //redirect home.xhtml
		//return null;
	}
	
	public String deleteJednorozec(){
		Jednorozec jednorozecToDelete = jednorozce.getRowData();
		jednorozecManager.deleteJednorozec(jednorozecToDelete);
		return null;
	}
	
	public ListDataModel<Jednorozec> getJednorozce() {
		jednorozce.setWrappedData(jednorozecManager.getJednorozce());
		return jednorozce;
	}
	
	public ListDataModel<Jednorozec> getSearchImie(){
		jednorozce.setWrappedData(jednorozecManager.getSearchImie(jednorozec));
		return jednorozce;
	}
}
