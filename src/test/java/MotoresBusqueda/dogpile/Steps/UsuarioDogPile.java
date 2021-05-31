package MotoresBusqueda.dogpile.Steps;

import MotoresBusqueda.dogpile.PageObject.PaginaPrincipalDogPile;
import MotoresBusqueda.dogpile.PageObject.PaginaResultadoDogPile;
import net.bytebuddy.implementation.bytecode.Throw;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.runner.RunWith;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class UsuarioDogPile {

    PaginaPrincipalDogPile PaginaPrincipal;
    PaginaResultadoDogPile PaginaResultado;


    @Step
    public void Ingresar_a_Dogpile() {
        PaginaPrincipal.open();
    }

    @Step
    public void Buscar_Palabra_clave(String PalabraClave) {
        PaginaPrincipal.IngresarPalabraClave(PalabraClave);

        PaginaPrincipal.RealizarBusqueda();
    }

    @Step
    public void Deberia_ver_resultados_con_palabra(String Palabra_Esperada) {
        List<String> Resultados = PaginaResultado.ObtenerResultado();
        Resultados.replaceAll(String::toLowerCase);
        for (int i = 0; i <= Resultados.size(); i++) {
            System.out.println(Resultados.get(i));
        }

        assertThat(Resultados, Matchers.everyItem(Matchers.containsString(Palabra_Esperada)));
    }
}
