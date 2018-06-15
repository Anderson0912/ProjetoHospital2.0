
package br.com.anderson.objetos;

import java.util.Date;

public class Medico extends Pessoa{
   private int crm;
   private String especialidade;
   private String setor;

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Medico(int crm, String especialidade, String setor, String nome, Date dataNascimento, String cpf, String rg, String endereco, String telefone, String estadoCivil, char sexo) {
        super(nome, dataNascimento, cpf, rg, endereco, telefone, estadoCivil, sexo);
        this.crm = crm;
        this.especialidade = especialidade;
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "Medico{" + "crm=" + crm + ", especialidade=" + especialidade + ", setor=" + setor + '}';
    }
    
}