package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.ConfirmacionCompra.CANTIDAD_RESUMEN_PRODUCTO_UNO;

public class MensajeValorCantidadProducto implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return CANTIDAD_RESUMEN_PRODUCTO_UNO.resolveFor(actor).getText();
    }

    public static MensajeValorCantidadProducto mensajeValorCantidadProducto(){
        return new MensajeValorCantidadProducto();
    }
}
