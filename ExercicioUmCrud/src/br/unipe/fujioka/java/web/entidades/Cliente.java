package br.unipe.fujioka.java.web.entidades;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
//@SequenceGenerator(sequenceName="cliente_seq", name="cliente_id")
public class Cliente {
	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="movimento_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nome;
	private String matricula;
	private boolean isAtivo;
	
	@OneToMany(mappedBy="id_cliente")
	private List<Preferencia> preferencias;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public boolean isAtivo() {
		return isAtivo;
	}
	public void setAtivo(boolean isAtivo) {
		this.isAtivo = isAtivo;
	}
	public List<Preferencia> getPreferencias() {
		return preferencias;
	}
	public void setPreferencias(List<Preferencia> preferencias) {
		this.preferencias = preferencias;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + "," + "nome=" + nome + "]";
	}
	
}
