package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.HoverOverElement;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofkau.ui.DespensaCompra.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class FlujoCompra implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OPCION_CATEGORIA_DESPENSA),
                Click.on(OPCION_ACEITES),
                Click.on(OPCION_ORDERNAR_POR),
                HoverOverElement.over(OPCION_ORDERNAR_POR_PRECIO),
                WaitUntil.the(FLECHA,isClickable()),
                Click.on(FLECHA),
                WaitUntil.the(AGREGAR_PRODUCTO_UNO,isClickable()),
                Click.on(AGREGAR_PRODUCTO_UNO),
                WaitUntil.the(AGREGAR_PRODUCTO_DOS,isClickable()),
                Click.on(AGREGAR_PRODUCTO_DOS),
                WaitUntil.the(AGREGAR_PRODUCTO_TRES,isClickable()),
                Click.on(AGREGAR_PRODUCTO_TRES),
                WaitUntil.the(CARRITO_COMPRAS,isClickable()),
                Click.on(CARRITO_COMPRAS),
                WaitUntil.the(VER_CARRITO_COMPRAS,isClickable()),
                Click.on(VER_CARRITO_COMPRAS),
                WaitUntil.the(TRAMITAR_PEDIDO,isClickable()),
                Click.on(TRAMITAR_PEDIDO),
                WaitUntil.the(BOTON_ENVIO_CONTINUAR,isClickable()),
                Scroll.to(BOTON_ENVIO_CONTINUAR),
                Click.on(BOTON_ENVIO_CONTINUAR),
                WaitUntil.the(RADIO_BUTTON_CONSIGNACION,isClickable()),
                Click.on(RADIO_BUTTON_CONSIGNACION),
                WaitUntil.the(BOTON_REALIZAR_PEDIDO,isClickable()),
                Click.on(BOTON_REALIZAR_PEDIDO)
        );
    }

    public static FlujoCompra flujoCompra(){
        return new FlujoCompra();
    }
}