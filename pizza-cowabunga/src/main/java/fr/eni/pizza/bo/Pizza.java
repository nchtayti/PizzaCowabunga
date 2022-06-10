package fr.eni.pizza.bo;



public class Pizza {
	
	
	private Integer id;
	private String type;
	private String libelle;
	private double prix;
	private String base64;
	
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
	public Pizza(String type, String libelle, double prix, String base64) {
		super();
		this.type = type;
		this.libelle = libelle;
		this.prix = prix;
		this.base64 = base64;
	}
	public Pizza(int id, String type, String libelle, double prix, String base64) {
		super();
		this.id = id;
		this.type = type;
		this.libelle = libelle;
		this.prix = prix;
		this.base64 = base64;
	}
	@Override
	public String toString() {
		return "Pizza [id=" + id + ", type=" + type + ", libelle=" + libelle + ", prix=" + prix + "€" + "]";
	}
	public String getBase64() {
		return base64;
	}
	public void setBase64(String base64) {
		this.base64 = base64;
	}

	
}
