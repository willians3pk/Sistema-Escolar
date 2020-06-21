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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Departamento")
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String cod;
    private String nome;
    @OneToOne
    private Professor chefeDepartamento;
    private String descricao;

    public Departamento(String cod, String nome, String descricao) {
        this.cod = cod;
        this.nome = nome;
        this.chefeDepartamento = null;
        this.descricao = descricao;
    }

    public Departamento(String cod, String nome, Professor chefeDepartamento, String descricao) {
        this.cod = cod;
        this.nome = nome;
        this.chefeDepartamento = chefeDepartamento;
        this.descricao = descricao;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getChefeDepartamento() {
        return chefeDepartamento;
    }

    public void setChefeDepartamento(Professor chefeDepartamento) {
        this.chefeDepartamento = chefeDepartamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
