package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.HoverOverElement;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofkau.ui.DespensaCompra.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class FlujoCompra implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_PERMITIR_COOKIES),
                Click.on(OPCION_CATEGORIA_DESPENSA),
                Click.on(OPCION_ACEITES),
                WaitUntil.the(OPCION_ORDERNAR_POR,isClickable()),
                Click.on(OPCION_ORDERNAR_POR),
                HoverOverElement.over(OPCION_ORDERNAR_POR_PRECIO),
                WaitUntil.the(ORDENAR_PRODUCTO_DESC,isClickable()),
                Click.on(ORDENAR_PRODUCTO_DESC),
                WaitUntil.the(AGREGAR_PRODUCTO_UNO,isClickable()),
                Scroll.to(PRECIO_PRODUCTO_UNO),
                Click.on(AGREGAR_PRODUCTO_UNO),
                WaitUntil.the(AGREGAR_PRODUCTO_DOS,isClickable()),
                Click.on(AGREGAR_PRODUCTO_DOS),
                WaitUntil.the(AGREGAR_PRODUCTO_TRES,isClickable()),
                Click.on(AGREGAR_PRODUCTO_TRES),
                WaitUntil.the(CARRITO_COMPRAS,isClickable()),
                Click.on(CARRITO_COMPRAS),
                WaitUntil.the(VER_CARRITO_COMPRAS,isClickable()),
                Click.on(VER_CARRITO_COMPRAS),
                Click.on(CANTIDAD_PRODUCTO_UNO),
                WaitUntil.the(TRAMITAR_PEDIDO,isPresent()),
                Click.on(TRAMITAR_PEDIDO),
                WaitUntil.the(CANTIDAD_RESUMEN_PRODUCTO_NUMERO_UNO,isVisible())
        );
    }

    public static FlujoCompra flujoCompra(){
        return new FlujoCompra();
    }
}