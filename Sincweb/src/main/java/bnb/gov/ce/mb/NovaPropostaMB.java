//package br.gov.bnb.s035.sinc.proposta;
package bnb.gov.ce.mb;

import java.io.Serializable;
import java.math.BigDecimal;
//import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
//import javax.faces.bean.SessionScoped;
import javax.inject.Named;

import bnb.gov.ce.entity.Autor;
import bnb.gov.ce.entity.CamposAutorTO;

@Named
@SessionScoped
public class NovaPropostaMB implements Serializable {
	
	private static final long serialVersionUID = 2570045328684716449L;
		
	private Autor         autor;
	private Autor         autorSelecionado;
	private CamposAutorTO autorTO;			
	private List<Autor>   autores;	
	private List<Autor>   autoresSelecionados;
	private String        nome;
		
	@PostConstruct
	public void init()  {		
		nome = new String();
		autor = new Autor();
		autorSelecionado = new Autor();
		autorTO = new CamposAutorTO();
		autores = new ArrayList<Autor>();
		autoresSelecionados = new ArrayList<Autor>();	
		carga();
	}
		
 	public NovaPropostaMB() throws ParseException {
		super();		
	}
	 	 	
	//@EJB
	//private ClienteAS clienteAS;
	
    public void carga() {    	
    	Autor a1 = new Autor();   
		a1.setNome("Luiz Carlos");
		a1.setEmail("luizcsssoares@gmail.com");
		
		Autor a2 = new Autor();   
		a2.setNome("Arytusa Aires");
		a2.setEmail("aires@gmail.com");
		
		Autor a3 = new Autor();   
		a3.setNome("Maria Erandir");
		a3.setEmail("erandir@gmail.com");
				 				
		this.autores.add(a1);
		this.autores.add(a2);
		this.autores.add(a3);				
    }
	
	public void metodoTeste(){
	    
	}
 	
 	public String selecionaAutor() { 		
 	    return "resultado";	
 	}
 	 	
	public void buscarAutor() {
								
	    List<Autor> listaTmp = new ArrayList<Autor>();
	    
		for (Autor autor : autores) 
		{			
            if (! (this.autorTO.getNome() == null)) {
            	if (autor.getNome().contains(this.autorTO.getNome())) {
            		listaTmp.add(autor);
        		}
			 }   
            else 
            {
            	listaTmp = autores;
             }
		}
						
		this.autoresSelecionados = listaTmp;		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public List<Autor> getAutoresSelecionados() {
		return autoresSelecionados;
	}

	public void setAutoresSelecionados(List<Autor> autoresSelecionados) {
		this.autoresSelecionados = autoresSelecionados;
	}

	public List<Autor> getAutores() {		
		return autores;
	}

	public CamposAutorTO getAutorTO() {		
		return autorTO;
	}

	public void setAutorTO(CamposAutorTO autorTO) {
		this.autorTO = autorTO;
	}
	
	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
}
