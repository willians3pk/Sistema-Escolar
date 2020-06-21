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
@Table(name = "Grade")
public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    int ano;
    @OneToOne
    Curso curso;
    @OneToMany
    List<Disciplina> disciplinasObrigatorias;
    boolean ativa;

    public Grade(int ano, Curso curso) {
        this.ano = ano;
        this.curso = curso;
    }

    public Grade(int ano, Curso curso, ArrayList<Disciplina> disciplinasObrigatorias, boolean isAtiva) {
        this.ano = ano;
        this.curso = curso;
        this.disciplinasObrigatorias = disciplinasObrigatorias;
        this.ativa = isAtiva;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Disciplina> getDisciplinasObrigatorias() {
        return disciplinasObrigatorias;
    }

    public void setDisciplinasObrigatorias(List<Disciplina> disciplinasObrigatorias) {
        this.disciplinasObrigatorias = disciplinasObrigatorias;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setIsAtiva(boolean ativa) {
        this.ativa = ativa;
    }

}
