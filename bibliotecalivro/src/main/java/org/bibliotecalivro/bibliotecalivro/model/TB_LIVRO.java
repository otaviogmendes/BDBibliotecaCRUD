package org.bibliotecalivro.bibliotecalivro.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="TB_LIVRO")
public class TB_LIVRO {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY )	
private long id_livro;

@NotNull
private String genero_livro;

@NotNull
private String nm_livro;

@NotNull
private String qt_livro;

//Getters and Setters

public long getId_livro() {
	return id_livro;
}
public void setId_livro(long id_livro) {
	this.id_livro = id_livro;
}
public String getGenero_livro() {
	return genero_livro;
}
public void setGenero_livro(String genero_livro) {
	this.genero_livro = genero_livro;
}
public String getNm_livro() {
	return nm_livro;
}
public void setNm_livro(String nm_livro) {
	this.nm_livro = nm_livro;
}
public String getQt_livro() {
	return qt_livro;
}
public void setQt_livro(String qt_livro) {
	this.qt_livro = qt_livro;
}


}
