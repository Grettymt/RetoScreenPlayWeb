package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DespensaCompra extends PageObject {
    public static final Target OPCION_CATEGORIA_DESPENSA = Target.the("categoria despensa")
            .located(By.cssSelector("a[href='https://vaquitaexpress.com.co/despensa.html']"));

    public static final Target OPCION_ACEITES = Target.the("opcion aceites")
            .located(By.xpath("(//span[contains(@class,'label')][normalize-space()='Aceites'])[1]"));

    public static final Target OPCION_ORDERNAR_POR = Target.the("opcion ordenar por")
            .located(By.cssSelector("div[class='js-toolbar-switch']"));

    public static final Target OPCION_ORDERNAR_POR_PRECIO = Target.the("opcion ordenar por precio")
            .located(By.cssSelector("div[data-role='sorter'][data-value='price']"));

    public static final Target FLECHA = Target.the("carrito").located(By.xpath("(//*[name()='polygon'])[1]"));

    public static final Target AGREGAR_PRODUCTO_UNO = Target.the("agregar producto1")
            .located(By.xpath("(//button[contains(@class,'tocart ')])[1]"));

    public static final Target AGREGAR_PRODUCTO_DOS = Target.the("agregar producto2")
            .located(By.xpath("(//button[contains(@class,'tocart ')])[2]"));

    public static final Target AGREGAR_PRODUCTO_TRES = Target.the("agregar producto3")
            .located(By.xpath("(//button[contains(@class,'tocart ')])[3]"));

    public static final Target CARRITO_COMPRAS = Target.the("carrito compras")
            .located(By.cssSelector(".action.showcart"));

    public static final Target VER_CARRITO_COMPRAS = Target.the("ver carrito compras")
            .located(By.cssSelector(".action.viewcart"));

    public static final Target TRAMITAR_PEDIDO = Target.the("tramitar pedido")
            .located(By.xpath("(//button[@title='Tramitar pedido'])[1]"));

    public static final Target BOTON_ENVIO_CONTINUAR = Target.the("ver carrito compras")
            .located(By.cssSelector(".button.action.continue.primary"));

    public static final Target RADIO_BUTTON_CONSIGNACION = Target.the("consignacion")
            .located(By.id("banktransfer"));

    public static final Target BOTON_REALIZAR_PEDIDO = Target.the("realizar pedido")
            .located(By.xpath("(//button[contains(@title,'Realizar pedido')])[1]"));
}