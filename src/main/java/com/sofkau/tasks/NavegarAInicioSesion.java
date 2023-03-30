package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.PaginaInicioSesion.BOTON_MI_CUENTA;

public class NavegarAInicioSesion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_MI_CUENTA)
        );
    }

    public static NavegarAInicioSesion navegarAInicioSesion(){
        return new NavegarAInicioSesion();
    }
}