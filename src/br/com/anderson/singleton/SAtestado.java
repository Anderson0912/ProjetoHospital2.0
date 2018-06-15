
package br.com.anderson.singleton;

import br.com.anderson.objetos.Atestado;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class SAtestado {
    List<Atestado> atestado = new ArrayList();

    public List<Atestado> getAtestado() {
        return atestado;
    }
    
    
    private SAtestado() {
    }
    
    public static SAtestado getInstance() {
        return SAtestadoHolder.INSTANCE;
    }
    
    private static class SAtestadoHolder {

        private static final SAtestado INSTANCE = new SAtestado();
    }
}
