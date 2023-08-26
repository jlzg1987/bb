package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.LINK_ARTICULO;

public class BuscarProducto implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Click.on(LINK_ARTICULO)
    );
    }
    public static Performable conDescripcion() {
        return instrumented(BuscarProducto.class );
    }

}
