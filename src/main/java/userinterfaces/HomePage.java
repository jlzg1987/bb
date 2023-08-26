package userinterfaces;

import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class HomePage extends PageObject {
 public  static final Target LINK_ARTICULO= Target.the( "Link Articulo encontrado").located(By.id("card-title"));


}
