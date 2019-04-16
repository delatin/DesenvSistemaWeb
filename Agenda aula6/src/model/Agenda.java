package model;
import java.sql.Connection;

public class Agenda {

	int id;
	String nome;
	String email;
	String telefone;
	String endereco;
	Connection conn;

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	
	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
