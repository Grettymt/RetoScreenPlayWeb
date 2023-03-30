#language:es
#encoding:UTF-8
#Author: Gretty Maria Mosquera Taborda

Característica: Comprar en linea
  yo como usuario de la pagina la vaquita
  Quiero comprar varios productos por medio de la pagina web
  Para poder ahorrar tiempo y acceder a mas productos disponibles sin necesidad de ir a la tienda

  @CompraExitosa
  Escenario: Compra exitosa de productos
    Dado que el cliente esta logueado en la pagina principal
    Cuando agrega varios productos al carrito
    Y completa la informacion del formulario del pago
    Entonces mostrara un mensaje confirmando la compra