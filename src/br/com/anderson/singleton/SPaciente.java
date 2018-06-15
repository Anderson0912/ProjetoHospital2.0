
package br.com.anderson.singleton;

import br.com.anderson.objetos.Paciente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class SPaciente {
    List<Paciente> paciente = new ArrayList();

    public List<Paciente> getPaciente() {
        return paciente;
    }
    
    private SPaciente() {
    }
    
    public static SPaciente getInstance() {
        return SPacienteHolder.INSTANCE;
    }
    
    private static class SPacienteHolder {

        private static final SPaciente INSTANCE = new SPaciente();
    }
}
