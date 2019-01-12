package bnb.gov.ce.entity;

import java.io.Serializable;
import java.util.ArrayList;

import javax.annotation.PostConstruct;

public class CamposAutorTO  implements Serializable{	
	
	private static final long serialVersionUID = 1L;
	
	private String nome;
    private String email;
    
    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
}
