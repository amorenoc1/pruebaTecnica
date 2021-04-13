#codificación: iso-8859-1
# encoding: utf-8
Feature: Quiero ingresar a la aplicacion para realizar reservas de vuelos
           		
 @UserStory=1
  Scenario: Reservas de vuelos
   When  el usuario desea realizar una reserva de vuelos en travelocity
   | Vuelo1           | Destino1      | Fecha1   |
   | California       | Miami         | 30       |
   Then  visualiza la lista de vuelos
   