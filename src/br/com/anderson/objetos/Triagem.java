
package br.com.anderson.objetos;

import java.util.List;

public class Triagem {
   private Enfermeira enfermeira;
   private Paciente paciente;
   private String pressao;
   private float temperatura;
   private String sintomas;
   private List<String> alergias;
   private float peso;
   private float altura;
   private float IMC;
   private boolean febre;

    public Enfermeira getEnfermeira() {
        return enfermeira;
    }

    public void setEnfermeira(Enfermeira enfermeira) {
        this.enfermeira = enfermeira;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getPressao() {
        return pressao;
    }

    public void setPressao(String pressao) {
        this.pressao = pressao;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public List<String> getAlergias() {
        return alergias;
    }

    public void setAlergias(List<String> alergias) {
        this.alergias = alergias;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getIMC() {
        return IMC;
    }

    public void setIMC(float IMC) {
        this.IMC = IMC;
    }

    public boolean isFebre() {
        return febre;
    }

    public void setFebre(boolean febre) {
        this.febre = febre;
    }

    public Triagem(Enfermeira enfermeira, Paciente paciente, String pressao, float temperatura, String sintomas, List<String> alergias, float peso, float altura) {
        this.enfermeira = enfermeira;
        this.paciente = paciente;
        this.pressao = pressao;
        this.temperatura = temperatura;
        this.sintomas = sintomas;
        this.alergias = alergias;
        this.peso = peso;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Triagem{" + "enfermeira=" + enfermeira + ", paciente=" + paciente + ", pressao=" + pressao + ", temperatura=" + temperatura + ", sintomas=" + sintomas + ", alergias=" + alergias + ", peso=" + peso + ", altura=" + altura + ", IMC=" + IMC + ", febre=" + febre + '}';
    }
    
}