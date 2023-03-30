package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

import static com.sofkau.questions.MensajeCompra.mensajeCompra;
import static com.sofkau.questions.MensajeOrden.mensajeOrden;
import static com.sofkau.questions.NumeroOrden.mensajeNumeroOrden;
import static com.sofkau.tasks.FlujoCompra.flujoCompra;
import static com.sofkau.tasks.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.NavegarAInicioSesion.navegarAInicioSesion;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;

public class CompraStepDefinitions extends Configuracion {
    public static Logger LOGGER = Logger.getLogger(CompraStepDefinitions.class);

    @Dado("que el cliente esta logueado en la pagina principal")
    public void queElClienteEstaLogueadoEnLaPaginaPrincipal() {
        try{
            configurarNavegador();

            theActorInTheSpotlight().wasAbleTo(
                    new AbrirPaginaInicial()
            );

            theActorInTheSpotlight().attemptsTo(
                    navegarAInicioSesion(),
                    iniciarSesion()
            );
        }catch (Exception exception) {
            quitarDriver();
            Assertions.fail(exception.getMessage(),exception);
            LOGGER.warn(exception.getMessage(), exception);
        }
    }

    @Cuando("agrega varios productos al carrito")
    public void agregaVariosProductosAlCarrito() {
        try{
            theActorInTheSpotlight().attemptsTo(
                    flujoCompra()
            );
        }catch (Exception exception) {
            quitarDriver();
            Assertions.fail(exception.getMessage(),exception);
            LOGGER.warn(exception.getMessage(), exception);
        }
    }

    @Cuando("completa la informacion del formulario del pago")
    public void completaLaInformacionDelFormularioDelPago() {
        try{
            theActorInTheSpotlight().attemptsTo(
                    flujoCompra()
            );
        }catch (Exception exception) {
            quitarDriver();
            Assertions.fail(exception.getMessage(),exception);
            LOGGER.warn(exception.getMessage(), exception);
        }
    }

    @Entonces("mostrara un mensaje confirmando la compra")
    public void mostraraUnMensajeConfirmandoLaCompra() {
        try{
            theActorInTheSpotlight().should(
                    seeThat(mensajeCompra(), equalTo("Gracias por su compra!")),
                    seeThat(mensajeOrden(), equalTo("Your order number is:")),
                    seeThat(mensajeNumeroOrden(), equalTo(notNullValue()))
            );
            quitarDriver();
        }catch (Exception exception) {
            quitarDriver();
            Assertions.fail(exception.getMessage(),exception);
            LOGGER.warn(exception.getMessage(), exception);
        }
    }
}