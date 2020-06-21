/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String cod;
    private String nome;
    private String descricao;
    private int cargaHoraria;
    @OneToOne
    private Professor coordenador;
    private TipoCurso tipoCurso;
    @OneToOne
    private Departamento departamento;
    @OneToMany
    private List<Grade> gradesAtivas;
    @OneToMany
    private List<Grade> gradesInativas;

    public Curso() {

    }

    public Curso(String cod, String nome, String descricao, int cargaHoraria, Professor coordenador/*, TipoCurso tipoCurso*/, Departamento departamento) {
        this.cod = cod;
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.coordenador = coordenador;
        // this.tipoCurso = tipoCurso;
        this.departamento = departamento;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Professor getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Professor coordenador) {
        this.coordenador = coordenador;
    }

    public TipoCurso getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(TipoCurso tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<Grade> getGradesAtivas() {
        return gradesAtivas;
    }

    public void setGradesAtivas(List<Grade> gradesAtivas) {
        this.gradesAtivas = gradesAtivas;
    }

    public List<Grade> getGradesInativas() {
        return gradesInativas;
    }

    public void setGradesInativas(ArrayList<Grade> gradesInativas) {
        this.gradesInativas = gradesInativas;
    }

    public void addGradeAtiva(Grade novaGrade) {
        gradesAtivas.add(novaGrade);
    }

    public void addGradeInativa(Grade velhaGrade) {
        gradesInativas.add(velhaGrade);
    }

    //TODO remove grades
}
