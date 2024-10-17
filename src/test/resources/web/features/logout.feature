@Logout
Feature: Logout

  Background:
    Given esta en la pagina de Login

  Scenario: Cerrar sesion exitosamente
    Given hace click en el boton Log in manually
    And ingresa el email arian@yopmail.com
    And ingresa el password Password1$
    And hace click en el boton LOG IN
    When hace click en el boton Usuario
    And hace click en el boton Logout
    Then la sesion del usuario se cierra mostrando la pantalla de Login