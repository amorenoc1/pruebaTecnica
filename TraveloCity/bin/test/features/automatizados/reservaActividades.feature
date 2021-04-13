#codificación: iso-8859-1
# encoding: utf-8
Feature: Quiero ingresar a la aplicacion para realizar reservas de actividades

           		
 @UserStory=1
  Scenario: Reservas de actividades
   When  el usuario desea realizar una reserva de actividades en travelocity
   | Actividades      | Del      | Al | 
   | California       | 25       | 4  |
   Then  visualiza la lista de actividades vinculados
   