package model.klas;

import java.time.LocalDate;
import java.util.ArrayList;
import model.persoon.Docent;

public class College {
	private LocalDate datum;
	private String type;
	//private ArrayList<Presentie> collegePresentie;
	private Docent deDocent;
	
	public College(String tp, LocalDate dt){
		this.type = tp;
		this.datum = dt;
	}
	
	public void setType(String tp){
		this.type = tp;
	}
	
	public void setDatum(LocalDate dt){
		this.datum = dt;
	}
	
	public void setDocent(Docent d){
		this.deDocent = d;
	}
	
	public String getType(){
		return type;
	}
	
	public LocalDate getDatum(){
		return datum;
	}
	
	public Docent getDocent(){
		return deDocent;
	}
	
	//public void presentieWijzigen(Presentie pPresentie){
		
	}
	
	//public ArrayList presentieInzien(){
		//return collegePresentie; }
//}