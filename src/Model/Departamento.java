/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


public class Departamento {

    private String cod;
    private String nome;
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
