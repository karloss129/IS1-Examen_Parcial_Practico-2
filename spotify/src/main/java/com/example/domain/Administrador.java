package com.example.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;

import org.hibernate.validator.constraints.Email;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName="Id_persona")
public class Administrador extends Persona{
	
	
	public Administrador(String nombre, String email, Integer telefono) {
		super(nombre, email, telefono);
		// TODO Auto-generated constructor stub
	}
	/*@Id
	private Long Id_administrador;

	*/
	@Column(length = 64)
	private String password;
	
	@Column(length = 20)
	private Boolean estado;
	
	
	
	@Column(nullable = false)
	private Date fecha = new Date();
	
	
	public String getpassword() {
		return password;
	}

	public void setemail(String password) {
		this.password = password;
	}

	public Boolean getestado() {
		return estado;
	}

	public void setestado(Boolean estado) {
		this.estado = estado;
	}




	
	public Date getfecha() {
		return fecha;
	}

	public void setfecha(Date created) {
		this.fecha = created;
	}
	
	
	public void login(){
		
	}
	
	public boolean habilitar_cancion()
	{
		return true;
		
	}
	
	public boolean habilitar_album()
	{
		return true;
		
	}
	
	public boolean habilitar_usuario()
	{
		return true;
		
	}
	
	public boolean desactivar_cancion()
	{
		return true;
		
	}
	public void desactivar_album()
	{
		
	}
	public void crear_ranking()
	{
		
	}
	public void desactivar_usuario()
	{
		
	}
	
	
	
	
}
