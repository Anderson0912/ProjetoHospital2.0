
package br.com.anderson.singleton;

import br.com.anderson.objetos.Consulta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class SConsulta {
    List<Consulta> consulta = new ArrayList();
    
    private SConsulta() {
    }
    
    public static SConsulta getInstance() {
        return SConsultaHolder.INSTANCE;
    }
    
    private static class SConsultaHolder {

        private static final SConsulta INSTANCE = new SConsulta();
    }
}
