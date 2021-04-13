#codificación: iso-8859-1
# encoding: utf-8
Feature: Quiero ingresar a la aplicacion para realizar reservas de paquetes

           		
 @UserStory=1
  Scenario: Reservas de actividades
   When  el usuario desea realizar una reserva de paquetes en travelocity
   | Origen           | Destino      | Salida | Regreso |
   | Barcelona        | Monaco       | 25     | 1       |
   Then  visualiza la lista de paquetes
   