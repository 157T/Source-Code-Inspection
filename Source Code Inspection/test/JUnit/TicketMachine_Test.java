/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnit;

import br.calebe.ticketmachine.core.TicketMachine;
import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.rules.ExpectedException;

/**
 *
 * @author 157.
 */
public class TicketMachine_Test {
    
    
    public ExpectedException  ex = ExpectedException.none();
    @Test
    public void testarInserirMoedaValida() throws PapelMoedaInvalidaException{
        TicketMachine test = new TicketMachine(100);
        assertTrue(test.inserir(5));
        
    }
    @Test
    public void testarInserirMoedaInValida() throws PapelMoedaInvalidaException{
        
        
        TicketMachine test = new TicketMachine(100);
        ex.expect(PapelMoedaInvalidaException.class);
        //
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
