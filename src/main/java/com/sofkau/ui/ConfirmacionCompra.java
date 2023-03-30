package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConfirmacionCompra extends PageObject {
    public static Target MENSAJE_COMPRA = Target.the("mensaje compra satisfactoria")
            .located(By.xpath("(//span[@class='base'])[1]"));

    public static Target MENSAJE_ORDEN = Target.the("mensaje orden")
            .located(By.xpath("(//p[@class='your-order-is'])[1]"));

    public static Target MENSAJE_NUMERO_ORDEN = Target.the("mensaje numero orden")
            .located(By.xpath("(//p[@class='your-order-is'])[1]"));
}