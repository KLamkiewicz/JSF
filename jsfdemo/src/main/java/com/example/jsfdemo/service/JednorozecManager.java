package com.example.jsfdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.example.jsfdemo.domain.Jednorozec;

@ApplicationScoped
public class JednorozecManager {
	private List<Jednorozec> listaJednorozcow = new ArrayList<Jednorozec>();
	private static int id = 0;
	
	public void addJednorozec(Jednorozec jednorozec){
		Jednorozec j = new Jednorozec();
		j.setId(id);
		j.setImie(jednorozec.getImie());
		//j.setRokUrodzenia(jednorozec.getRokUrodzenia());
		j.setDataUrodzenia(jednorozec.getDataUrodzenia());
		j.setDlugoscRogu(jednorozec.getDlugoscRogu());
		j.setRegon(jednorozec.getRegon());
		j.setMagiczny(jednorozec.isMagiczny());
		j.setOcena(jednorozec.getOcena());
		listaJednorozcow.add(j);
		id++;
	}
	
	public List<Jednorozec> getJednorozce(){
		return listaJednorozcow;
	}
	
	//po imieniu usuwa nie te wpisy co trzeba
//	public void deleteJednorozec(Jednorozec jednorozec){
//		Jednorozec jednorozecDoUsuniecia = null;
//			
//			for(Jednorozec j : listaJednorozcow){
//				if(j.getImie().equals(jednorozec.getImie())){
//					jednorozecDoUsuniecia = j;
//					listaJednorozcow.remove(jednorozecDoUsuniecia);
//					break;
//				}
//			}
//	}
	
	public void deleteJednorozec(Jednorozec jednorozec){
		Jednorozec jednorozecDoUsuniecia = null;
			
			for(Jednorozec j : listaJednorozcow){
				if(j.getId()==jednorozec.getId()){
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

	public List<Jednorozec> getSearchImie(Jednorozec jednorozec) {
		List<Jednorozec> szukanyJednorozec = new ArrayList<Jednorozec>();
		for(Jednorozec j: listaJednorozcow){
			if(j.getImie().equals(jednorozec.getImie())){
				szukanyJednorozec.add(j);
			}
		}
		return szukanyJednorozec;
	}

}
