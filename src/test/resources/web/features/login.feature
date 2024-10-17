@Login @Clockify
Feature: Login

 Background:
    Given esta en la pagina de Login

  @Smoke
  Scenario: Iniciar sesion exitosamente de manera manual
    When hace click en el boton Log in manually
    And ingresa el email arian@yopmail.com
    And ingresa el password Password1$
    And hace click en el boton LOG IN
    Then ingresa a la cuenta de clockify de manera exitosa

  @Smoke
  Scenario: Iniciar sesion manualmente de manera incorrecta al ingresar un mail incorrecto
    When hace click en el boton Log in manually
    And ingresa el email ariantres
    And ingresa el password Password1$
    Then visualiza el mensaje de error Email format is not valid



