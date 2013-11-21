package com.example.jsfdemo.domain;

import javax.validation.constraints.*;

public class Jednorozec{
	private int id;
	private String imie;
	@Max(2013)
	private Integer rokUrodzenia;
	private double dlugoscRogu;
	private int regon;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRegon() {
		return regon;
	}

	public void setRegon(int regon) {
		this.regon = regon;
	}	
	
	
}
