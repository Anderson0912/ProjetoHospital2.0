
package br.com.anderson.singleton;

import br.com.anderson.objetos.Triagem;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class STriagem {
    List<Triagem> triagem = new ArrayList();

    public List<Triagem> getTriagem() {
        return triagem;
    }
    
    private STriagem() {
    }
    
    public static STriagem getInstance() {
        return STriagemHolder.INSTANCE;
    }
    
    private static class STriagemHolder {

        private static final STriagem INSTANCE = new STriagem();
    }
}
