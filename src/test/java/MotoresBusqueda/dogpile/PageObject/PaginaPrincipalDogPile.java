package MotoresBusqueda.dogpile.PageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.dogpile.com/")
public class PaginaPrincipalDogPile extends PageObject {

    @FindBy(css = "#q")
    WebElementFacade CajaBusqueda;

    @FindBy(xpath = "//*[@id='search']/button/div[2]")
    WebElementFacade BtnBuscar;

    public void IngresarPalabraClave(String palabraClave) {
        CajaBusqueda.type(palabraClave);
    }

    public void RealizarBusqueda() {
        BtnBuscar.click();
    }
}
