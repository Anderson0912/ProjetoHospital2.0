
package br.com.anderson.objetos;

import java.util.Date;

public class Enfermeira extends Pessoa{
    private int cofen;
    private String setor;

    public int getCofen() {
        return cofen;
    }

    public void setCofen(int cofen) {
        this.cofen = cofen;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Enfermeira(int cofen, String setor, String nome, Date dataNascimento, String cpf, String rg, String endereco, String telefone, String estadoCivil, char sexo) {
        super(nome, dataNascimento, cpf, rg, endereco, telefone, estadoCivil, sexo);
        this.cofen = cofen;
        this.setor = setor;
    }


    @Override
    public String toString() {
        return "Enfermeira{" + "cofen=" + cofen + ", setor=" + setor + '}';
    }
    
}