#language: es

Característica: Realizar compres de articulos
  como un nuevo cliente
  quiero ingresar a la pagina www.abc.com
  para realizar una compre de un articulo

  Escenario: Agregar articulos al carrito de compras
    Dado que un nuevo cliente accede hasta la web de compras
    Cuando el agregar producto al carro
    Entonces el ve los productos listo en el carro de compras

  Esquema del escenario: Finalizar la compra
    Dado una ves seleccionado comprar
    Cuando veo el formulario
      | Name   | Country   | City       | Credit card   | Month   | Year   |
      | <Name> | <Country> | <City>     | <Credit card> | <Month> | <Year> |
      | Jose   | Ecuador   | Esmeraldas | 1122211111    | Agosto  | 2023   |
    Entonces final de compra
    Ejemplos: