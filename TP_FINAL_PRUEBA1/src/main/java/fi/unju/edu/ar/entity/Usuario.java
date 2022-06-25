package fi.unju.edu.ar.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "usu_key")
	private Long key;
	@Column(name="usu_id")
	private String id;//puede tomar el valor de cuit o dni depenndiendo del tipo de usuario
	@Column(name="usu_tipo")
	private String tipo;
	@Column(name="usu_contrasenia")
	private String contrasenia;
	
	public Usuario() {
		
	}
	 
	
	public Usuario( String id, String tipo, String contrasenia) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.contrasenia = contrasenia;
	}


	/**
	 * @return the key
	 */
	public Long getKey() {
		
		return key;
	}


	/**
	 * @param key the key to set
	 */
	public void setKey(Long key) {
		this.key = key;
	}


	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the contrasenia
	 */
	public String getContrasenia() {
		return contrasenia;
	}

	/**
	 * @param contrasenia the contrasenia to set
	 */
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}


	@Override
	public String toString() {
		return "Usuario [key=" + key + ", id=" + id + ", tipo=" + tipo + ", contrasenia=" + contrasenia + "]";
	}
	
	
	

}
