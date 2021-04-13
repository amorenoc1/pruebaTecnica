#codificación: iso-8859-1
# encoding: utf-8
Feature: Quiero ingresar a la aplicacion para realizar reservas

           		
 @UserStory=1
  Scenario: Reservas
    Given  el usuario consulta un destino
    
    |Destino     |Diainicio  |Diafin|travelersAdults    |
    |Barcelona   | 30        |10    |2                  |
    
     When  toma  la reserva para llenar los datos requeridos
     
     | Nombrecontacto|Telefono    |Nombretarjeta    |Mesexp  |Year |Numerotarjeta   |Codigos |Zipcodigo|Correo          |
     | viaja maximo  |14842918707 |DEVCO SOFT       |01-Jan  |2023 |5390700823285988|1923    |123      |prueba@gmail.com|
      
     Then puede visualizarse el estado de la reserva