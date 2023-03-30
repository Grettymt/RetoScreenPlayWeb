package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.sofkau.ui.PaginaInicioSesion.*;

public class IniciarSesion implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        Properties properties= null;
        try {
            properties = propertiesArchivo();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(
                Click.on(BOTON_INICIAR_SESION),
                Enter.theValue(properties.getProperty("serenity.correo")).into(CAMPO_CORREO),
                Enter.theValue(properties.getProperty("serenity.contrasenna")).into(CAMPO_CONTRASENNA),
                Click.on(BOTON_INICIAR_SESION)
        );
    }

    public static IniciarSesion iniciarSesion(){
        return new IniciarSesion();
    }

    public Properties propertiesArchivo () throws IOException{
        Properties properties = new Properties();
        FileInputStream archive = new FileInputStream("src\\test\\resources\\serenity.properties");
        properties.load(archive);
        return properties;
    }
}