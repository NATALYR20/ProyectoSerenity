package MotoresBusqueda.dogpile;

import MotoresBusqueda.dogpile.Steps.UsuarioDogPile;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
public class CuandoEjecutamosBusqueda {

    //@Managed(driver="chrome", uniqueSession=true)
    //WebDriver driver;

    @Steps
    UsuarioDogPile juan;

    @Test
    public void Deberiamos_Ver_resultados_Relevantes() {
        juan.Ingresar_a_Dogpile();
        juan.Buscar_Palabra_clave("rock nacional");
        juan.Deberia_ver_resultados_con_palabra("rock");

    }
}
