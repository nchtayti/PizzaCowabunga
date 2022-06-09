package fr.eni.pizza.bo;



public class Pizza {
	
	
	private Integer id;
	private String type;
	private String libelle;
	private double prix;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	public Pizza() {
	}
	public Pizza(String type, String libelle, double prix) {
		super();
		this.type = type;
		this.libelle = libelle;
		this.prix = prix;
	}
	public Pizza(int id, String type, String libelle, double prix) {
		super();
		this.id = id;
		this.type = type;
		this.libelle = libelle;
		this.prix = prix;
	}
	@Override
	public String toString() {
		return "Pizza [id=" + id + ", type=" + type + ", libelle=" + libelle + ", prix=" + prix + "€" + "]";
	}

	
}
