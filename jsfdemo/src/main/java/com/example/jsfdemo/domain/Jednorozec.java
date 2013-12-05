package com.example.jsfdemo.domain;



import java.util.Date;
import javax.validation.constraints.*;



public class Jednorozec{
	private int id;
	@Size(min=3, max=30)
	private String imie;
	@NotNull
	private Integer rokUrodzenia;
	@Past
	private Date dataUrodzenia;
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

	public Date getDataUrodzenia() {
		return dataUrodzenia;
	}

	public void setDataUrodzenia(Date dataUrodzenia) {
		this.dataUrodzenia = dataUrodzenia;
	}

	
}
