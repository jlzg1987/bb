package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.CarroCompra.BOTON_ABRIR_CARRITO;
import static userinterfaces.CarroCompra.BOTON_COMPRAR;


public class VerCarritoProducto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_ABRIR_CARRITO),
                Click.on(BOTON_COMPRAR)
        );
    }
    public static VerCarritoProducto VerCarro() {
        return instrumented(VerCarritoProducto.class);
    }
}
