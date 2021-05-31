package MotoresBusqueda.dogpile.PageObject;

import net.serenitybdd.core.pages.PageObject;

import java.util.List;
import java.util.stream.Collectors;

public class PaginaResultadoDogPile extends PageObject {

    public static final String TITULO_RESULTADO = ".web-bing__title";

    public List<String> ObtenerResultado() {
        return findAll(TITULO_RESULTADO)
                .stream()
                .map(Element -> Element.getAttribute("textcontext"))
                .collect(Collectors.toList());
    }
}
