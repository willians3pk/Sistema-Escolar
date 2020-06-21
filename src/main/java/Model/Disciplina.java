/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Disciplina")
public class Disciplina {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    String nome;
    String ementa;
    String bibliografia;
    

    public Disciplina(String nome) {
        this.nome = nome;
        ementa = null;
        bibliografia = null;
    }

    public Disciplina(String nome, String ementa, String bibliografia) {
        this.nome = nome;
        this.ementa = ementa;
        this.bibliografia = bibliografia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public String getBibliografia() {
        return bibliografia;
    }

    public void setBibliografia(String bibliografia) {
        this.bibliografia = bibliografia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
