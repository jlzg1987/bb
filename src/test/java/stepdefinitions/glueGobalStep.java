package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import questions.FormQuestions;
import tasks.*;
import userinterfaces.HomePage;


import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static userinterfaces.DriverSetup.initializeDriver;



public class glueGobalStep {

    private Actor actor= Actor.named("Global").whoCan(BrowseTheWeb.with(initializeDriver()));;
@Before
public  void setTheStag(){
    OnStage.setTheStage((new OnlineCast()));
}
@Dado("^que un nuevo cliente accede hasta la web de compras$")
public void queUnNuevoClienteAccedeHastaLaWebDeCompras() {
    Actor actor = theActorCalled("Global");
    actor.attemptsTo(OpenPage.loadpage(), Click.on(HomePage.LINK_ARTICULO));
}
@Cuando("^el agregar producto al carro$")
    public void elAgregarProductoAlCarro() {
actor.wasAbleTo(
        BuscarProducto.conDescripcion(),
        AgregarProducto.cantidad()

);
    }
    @Entonces("^el ve los productos listo en el carro de compras$")
    public void elVeLosProductosListoEnElCarroDeCompras() {
        actor.wasAbleTo(
                VerCarritoProducto.VerCarro()
        );
    }
    @Dado("^una ves seleccionado comprar$")
    public void una_ves_seleccionado_comprar() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Cuando("^veo el formulario$")
    public void elAgregarUnProductoAlCarro(List<Map<String, String>> formData) {

        String name = formData.get(0).get("Name");
        String country = formData.get(0).get("Country");
        String city = formData.get(0).get("city");
        String creditCard = formData.get(0).get("creditCard");
        String month = formData.get(0).get("month");
        String year = formData.get(0).get("year");

        actor.attemptsTo(
                FormQuestions.data(name, country, city, creditCard, month, year)
        );
    }

    @Entonces("^final de compra$")
    public void finalDeCompra() {
        actor.wasAbleTo(
                FinQuestions.fin()
        );
    }

}
