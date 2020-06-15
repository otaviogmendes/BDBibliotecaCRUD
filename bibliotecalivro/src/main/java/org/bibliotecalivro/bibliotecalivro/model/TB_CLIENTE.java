package org.bibliotecalivro.bibliotecalivro.model;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
@Table(name="cliente")


public class TB_CLIENTE {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY )
private long cpf_cliente;

@NotNull
@Size(min = 30, max = 200)
private String nm_cliente;

@Temporal(TemporalType.DATE)
private Date idade_cliente;

@NotNull
@Size(min = 50, max = 200)
private String endereco_cliente;

@NotNull
@Size(min = 50, max = 200)
private String contato_cliente;


//Getters and Setters
public long getCpf() {
	return cpf_cliente;
}
public void setCpf(long cpf) {
	this.cpf_cliente = cpf;
}
public String getNm_cliente() {
	return nm_cliente;
}
public void setNm_cliente(String nm_cliente) {
	this.nm_cliente = nm_cliente;
}
public Date getIdade_cliente() {
	return idade_cliente;
}
public void setIdade_cliente(Date idade_cliente) {
	this.idade_cliente = idade_cliente;
}
public String getEndereco_cliente() {
	return endereco_cliente;
}
public void setEndereco_cliente(String endereco_cliente) {
	this.endereco_cliente = endereco_cliente;
}
public String getContato_cliente() {
	return contato_cliente;
}
public void setContato_cliente(String contato_cliente) {
	this.contato_cliente = contato_cliente;
}


}
