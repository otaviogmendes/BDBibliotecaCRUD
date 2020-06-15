package org.bibliotecalivro.bibliotecalivro.model;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="TB_EMPRESTIMO_LIVRO")
public class TB_EMPRESTIMO_LIVRO {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY )
private long id_emprestimo;

@NotNull
private Date dt_emprestmo = new java.sql.Date(System.currentTimeMillis());

@NotNull
private Date dt_devolucao;

@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name="cpf_cliente",referencedColumnName = "cpf_cliente")
private TB_CLIENTE  TB_CLIENTE ;

@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name="id_livro",referencedColumnName = "id_livro")
private TB_LIVRO TB_LIVRO;

private String qt_livroEmprestado;

//Getters and Setters

public long getId_emprestimo() {
	return id_emprestimo;
}
public void setId_emprestimo(long id_emprestimo) {
	this.id_emprestimo = id_emprestimo;
}
public Date getDt_emprestmo() {
	return dt_emprestmo;
}
public void setDt_emprestmo(Date dt_emprestmo) {
	this.dt_emprestmo = dt_emprestmo;
}
public Date getDt_devolucao() {
	return dt_devolucao;
}
public void setDt_devolucao(Date dt_devolucao) {
	this.dt_devolucao = dt_devolucao;
}

public TB_CLIENTE getTB_CLIENTE() {
	return TB_CLIENTE;
}
public void setTB_CLIENTE(TB_CLIENTE tB_CLIENTE) {
	TB_CLIENTE = tB_CLIENTE;
}
public TB_LIVRO getTB_LIVRO() {
	return TB_LIVRO;
}
public void setTB_LIVRO(TB_LIVRO tB_LIVRO) {
	TB_LIVRO = tB_LIVRO;
}
public String getQt_livroEmprestado() {
	return qt_livroEmprestado;
}
public void setQt_livroEmprestado(String qt_livroEmprestado) {
	this.qt_livroEmprestado = qt_livroEmprestado;
}

}
