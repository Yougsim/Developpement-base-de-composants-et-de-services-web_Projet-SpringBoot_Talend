package com.gestionachatsbackend.modele;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produit")
public class Produit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProduit;

	@Column
	private String designation;

	@Column
	private Double prix;

	@Column
	private Double discounted_price;

	// Constructeurs, getters, setters, toString()

	public Produit() {
		super();
	}

	public Produit(int idProduit, String designation, Double prix, Double discounted_price) {
		super();
		this.idProduit = idProduit;
		this.designation = designation;
		this.prix = prix;
		this.discounted_price = discounted_price;
	}

	public int getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public Double getDiscounted_price() {
		return this.discounted_price;
	}

	public void setDiscounted_price(Double discounted_price) {
		this.discounted_price = discounted_price;
	}

	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", designation=" + designation + ", prix=" + prix
				+ ", discounted_price" + discounted_price + "]";
	}
}
