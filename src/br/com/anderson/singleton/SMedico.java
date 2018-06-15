
package br.com.anderson.singleton;

import br.com.anderson.objetos.Medico;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class SMedico {
    List<Medico> medicos = new ArrayList();

    public List<Medico> getMedicos() {
        return medicos;
    }
    
    private SMedico() {
    }
    
    public static SMedico getInstance() {
        return SingletonHolder.INSTANCE;
    }
    
    private static class SingletonHolder {

        private static final SMedico INSTANCE = new SMedico();
    }
}
