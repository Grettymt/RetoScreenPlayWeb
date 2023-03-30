package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CompraStepDefinitions extends Configuracion {
    public static Logger LOGGER = Logger.getLogger(CompraStepDefinitions.class);

    @Dado("que el cliente esta logueado en la pagina principal")
    public void queElClienteEstaLogueadoEnLaPaginaPrincipal() {
        try{
            configurarNavegador();

            theActorInTheSpotlight().wasAbleTo(
                    new AbrirPaginaInicial()
            );
        }catch (Exception exception) {
            quitarDriver();
            Assertions.fail(exception.getMessage(),exception);
            LOGGER.warn(exception.getMessage(), exception);
        }
    }

    @Cuando("agrega varios productos al carrito")
    public void agregaVariosProductosAlCarrito() {

    }

    @Cuando("completa la informacion del formulario del pago")
    public void completaLaInformacionDelFormularioDelPago() {

    }

    @Entonces("mostrara un mensaje confirmando la compra")
    public void mostraraUnMensajeConfirmandoLaCompra() {

    }
}