package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConfirmacionCompra extends PageObject {
    public static Target MENSAJE_COMPRA = Target.the("mensaje compra satisfactoria")
            .located(By.xpath("(//span[@class='base'])[1]"));

    public static Target MENSAJE_NUMERO_ORDEN = Target.the("mensaje numero orden")
            .located(By.xpath("(//p[@class='your-order-is'])//a[@class='order-number']//strong"));

    public static final Target CANTIDAD_RESUMEN_PRODUCTO_UNO = Target.the("cantidad resumen producto uno")
            .located(By.xpath("(//ol[@class='minicart-items']/li)[1]//div[@class='product-item-inner']//div[@class='details-qty']/span[@class='value']"));
}