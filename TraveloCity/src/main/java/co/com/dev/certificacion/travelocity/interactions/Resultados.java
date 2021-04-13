package co.com.dev.certificacion.travelocity.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Resultados implements Interaction {

    private final String xpath;

    public Resultados(String xpath) {
        this.xpath = xpath;
    }

    public static Resultados onList(String xpath) {
        return instrumented(Resultados.class, xpath);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).findAll(xpath).get(0).click();
    }
}
