package com.example.jsfdemo.domain;

import javax.validation.constraints.*;

public class Jednorozec{
	private int id;
	private String imie;
	@Max(2013)
	@NotNull
	private Integer rokUrodzenia;
	private double dlugoscRogu;
	private String regon = "";
	private boolean magiczny;
	private Integer ocena;
	
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRegon() {
		return regon;	
	}

	public void setRegon(String regon) {
		this.regon = regon;
	}

	public Integer getOcena() {
		return ocena;
	}

	public void setOcena(Integer ocena) {
		this.ocena = ocena;
	}

	
}
