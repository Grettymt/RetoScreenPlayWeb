package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofkau.ui.DespensaCompra.*;
import static com.sofkau.ui.DespensaCompra.BOTON_REALIZAR_PEDIDO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class FinalizarCompra implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                WaitUntil.the(BOTON_ENVIO_CONTINUAR,isClickable()),
                Scroll.to(BOTON_ENVIO_CONTINUAR),
                Click.on(BOTON_ENVIO_CONTINUAR),
                WaitUntil.the(RADIO_BUTTON_CONSIGNACION,isVisible()),
                Click.on(RADIO_BUTTON_CONSIGNACION),
                WaitUntil.the(BOTON_REALIZAR_PEDIDO,isClickable()),
                Scroll.to(BOTON_REALIZAR_PEDIDO),
                Click.on(BOTON_REALIZAR_PEDIDO)
        );
    }

    public static FinalizarCompra finalizarCompra(){
        return new FinalizarCompra();
    }
}
