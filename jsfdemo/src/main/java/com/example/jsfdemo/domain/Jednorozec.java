package com.example.jsfdemo.domain;

public class Jednorozec {
	private String imie;
	private Integer rokUrodzenia;
	private double dlugoscRogu;
	private boolean magiczny;
	
	public Jednorozec(){
		
	}
	
	public String getImie() {
		return imie;
	}
	
	public void setImie(String imie) {
		this.imie = imie;
	}
	
	public Integer getRokUrodzenia() {
		return rokUrodzenia;
	}
	
	public void setRokUrodzenia(Integer rokUrodzenia) {
		this.rokUrodzenia = rokUrodzenia;
	}
	
	public double getDlugoscRogu() {
		return dlugoscRogu;
	}
	
	public void setDlugoscRogu(double dlugoscRogu) {
		this.dlugoscRogu = dlugoscRogu;
	}

	public boolean isMagiczny() {
		return magiczny;
	}

	public void setMagiczny(boolean magiczny) {
		this.magiczny = magiczny;
	}	
}
