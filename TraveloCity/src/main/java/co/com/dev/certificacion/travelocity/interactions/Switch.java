package co.com.dev.certificacion.travelocity.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class Switch implements Interaction {

	private int number;
	private WebDriver webDriver = Serenity.getWebdriverManager().getCurrentDriver();

	public Switch(int number) {
		this.number = number;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		Set<String> handlesSet = webDriver.getWindowHandles();
		List<String> handlesList = new ArrayList<String>(handlesSet);
		webDriver.switchTo().window(handlesList.get(number));
	}

	public static Switch toSecondWindow() {
		return instrumented(Switch.class, 1);
	}

	public static Switch toDefaultWindow() {
		return instrumented(Switch.class, 0);
	}
}