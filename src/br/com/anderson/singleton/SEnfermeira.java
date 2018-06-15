
package br.com.anderson.singleton;

import br.com.anderson.objetos.Enfermeira;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class SEnfermeira {
    List<Enfermeira> enfermeira = new ArrayList();

    public List<Enfermeira> getEnfermeira() {
        return enfermeira;
    }
    
    private SEnfermeira() {
    }
    
    public static SEnfermeira getInstance() {
        return SEnfermeiraHolder.INSTANCE;
    }
    
    private static class SEnfermeiraHolder {

        private static final SEnfermeira INSTANCE = new SEnfermeira();
    }
}
