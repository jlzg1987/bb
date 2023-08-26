package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DetalleArtuculoPage {

    public  static final Target BOTON_AGREGAR= Target.the( "Boton agregar al carrito").locatedBy("//div[@class='col-sm-12 col-md-6 col-lg-6']");
    public  static final Target BOTON_ALERT= Target.the( "Boton aceptar articulo").locatedBy("alert.accept()");


}
