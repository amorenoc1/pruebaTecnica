#codificación: iso-8859-1
# encoding: utf-8
Feature: Quiero ingresar a la aplicacion para realizar reservas de vuelos

           		
 @UserStory=1
  Scenario: Reservas de vuelos
   When  el usuario desea realizar una reserva de vehiculo en travelocity
   | Entrega    | Devolucion      | Fechaentrega | Fechadevolu  | Horaentrega | Horadevolucion|
   | Madrid     | Aranjuez        | 30           | 19           | 19:00       | 23:00         |
   Then  visualiza la lista de vehiculos vinculados
   