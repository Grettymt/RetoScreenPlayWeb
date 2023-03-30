package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaInicioSesion extends PageObject {
    public static final Target BOTON_MI_CUENTA = Target.the("campo correo")
            .located(By.xpath("(//i[@class='icon--user-vqt'])"));

    public static final Target CAMPO_CORREO = Target.the("campo correo")
            .located(By.id("email"));

    public static final Target CAMPO_CONTRASENNA = Target.the("campo contraseña")
            .located(By.id("pass"));

    public static final Target BOTON_INICIAR_SESION = Target.the("Botón iniciar sesion")
            .located(By.id("send2"));
}