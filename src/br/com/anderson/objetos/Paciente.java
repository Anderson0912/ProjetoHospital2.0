
package br.com.anderson.objetos;

import java.util.Date;

public class Paciente extends Pessoa{
   private int id;
   private int numeroSus;
   private Pessoa responsavel;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroSus() {
        return numeroSus;
    }

    public void setNumeroSus(int numeroSus) {
        this.numeroSus = numeroSus;
    }

    public Pessoa getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Pessoa responsavel) {
        this.responsavel = responsavel;
    }

    public Paciente(int id, int numeroSus, Pessoa responsavel, String nome, Date dataNascimento, String cpf, String rg, String endereco, String telefone, String estadoCivil, char sexo) {
        super(nome, dataNascimento, cpf, rg, endereco, telefone, estadoCivil, sexo);
        this.id = id;
        this.numeroSus = numeroSus;
        this.responsavel = responsavel;
    }

    

    @Override
    public String toString() {
        return "Paciente{" + "id=" + id + ", numeroSus=" + numeroSus + ", responsavel=" + responsavel + '}';
    }
    
}