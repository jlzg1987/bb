package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.DetalleArtuculoPage.*;

public class AgregarProducto  implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_AGREGAR),
                Click.on(BOTON_ALERT),
                Click.on(BOTON_AGREGAR),
                Click.on(BOTON_ALERT)
        );
    }
    public static AgregarProducto cantidad() {
        return instrumented(AgregarProducto.class);
    }
}
