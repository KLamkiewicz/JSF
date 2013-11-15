package com.example.jsfdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.example.jsfdemo.domain.Jednorozec;

@ApplicationScoped
public class JednorozecManager {
	private List<Jednorozec> listaJednorozcow = new ArrayList<Jednorozec>();
	
	public void addJednorozec(Jednorozec jednorozec){
		Jednorozec j = new Jednorozec();
		j.setImie(jednorozec.getImie());
		j.setRokUrodzenia(jednorozec.getRokUrodzenia());
		j.setDlugoscRogu(jednorozec.getDlugoscRogu());
		j.setMagiczny(jednorozec.isMagiczny());
		listaJednorozcow.add(j);
	}
	
	public List<Jednorozec> getJednorozce(){
		return listaJednorozcow;
	}
	
	public void deleteJednorozcaByNazwa(Jednorozec jednorozec){
		Jednorozec jednorozecDoUsuniecia = null;
			
			for(Jednorozec j : listaJednorozcow){
				if(j.getImie().equals(jednorozec.getImie())){
					jednorozecDoUsuniecia = j;
					listaJednorozcow.remove(jednorozecDoUsuniecia);
					break;
				}
			}
	}
	
	public List<Jednorozec> getJedrnozecByImie(Jednorozec jednorozec){
		List<Jednorozec> szukanyJednorozec = new ArrayList<Jednorozec>();
			for(Jednorozec j: listaJednorozcow){
				if(j.getImie().equals(jednorozec.getImie())){
					szukanyJednorozec.add(j);
				}
			}
		return szukanyJednorozec;
	}
}
