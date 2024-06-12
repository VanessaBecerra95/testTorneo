package cl.praxis;

import cl.praxis.model.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.logging.Logger;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Test clase Torneo")
public class TorneoTest {
    private static Logger logger = Logger.getLogger("cl.praxis.model.Torneo");



    @Test
    public void agregarEquipoTest() {
        Torneo torneo = new Torneo();
        torneo.agregarEquipo("Equipo Alpha");
        assertEquals(1, torneo.getEquiposSize());

    }




}
