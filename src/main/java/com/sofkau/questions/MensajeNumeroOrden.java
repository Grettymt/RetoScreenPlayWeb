package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.ConfirmacionCompra.MENSAJE_NUMERO_ORDEN;

public class MensajeNumeroOrden implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return MENSAJE_NUMERO_ORDEN.resolveFor(actor).getText();
    }

    public static MensajeNumeroOrden mensajeNumeroOrden(){
        return new MensajeNumeroOrden();
    }
}
