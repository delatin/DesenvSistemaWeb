import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Agenda{
   private int id;
   private String nome;
   private String email;
   private String telefone;
   private String endereco;
   Connection conn;
   
   public int getId(){
      return id;
   }
   public String getNome(){
      return nome;
   }
   public String getEmail(){
      return email;
   }
   public String getTelefone(){
      return telefone;
   }
   public String getEndereco(){
      return endereco;
   }
   public void setId(int id){
      this.id = id;
   }
   public void setNome(String nome){
      this.nome = nome;
   }
   public void setEmail(String email){
      this.email = email;
   }
   public void setTelefone(String telefone){
      this.telefone = telefone;
   }
   public void setEndereco(String endereco){
      this.endereco = endereco;
   }
 
   
   public Agenda() {

	}

	public Agenda(int id, String nome, String telefone,String email, String endereco) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;

	}

}