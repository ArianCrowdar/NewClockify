@timeTracker
Feature: timeTracker

  Background:
    Given esta en la pagina de Login

  @ej1
  Scenario: Registrar horas trabajadas de manera manual exitosamente
    Given hace click en el boton Log in manually
    And ingresa el email arian@yopmail.com
    And ingresa el password Password1$
    And hace click en el boton LOG IN
    When hace click en el boton Manual
    And ingresa la hora inicial 1300
    And ingresa la hora final 1345
    And ingresa la fecha 13031997
    And hace click en el boton ADD
    Then visualiza que el registro de horas trabajadas se guardo exitosamente

  @ej2
  Scenario: Cancelar entrada de datos del timer automatico
    Given hace click en el boton Log in manually
    And ingresa el email arian@yopmail.com
    And ingresa el password Password1$
    And hace click en el boton LOG IN
    When hace click en el boton Timer
    And hace click en el boton START
    And hace click en el boton 3 puntos
    And hace click en el opcion Discard
    And hace click en el boton Discard
    Then visualiza que el registro de horas trabajadas se cancelo exitosamente

  @ej3
  Scenario: Editar horas trabajadas exitosamente
    Given hace click en el boton Log in manually
    And ingresa el email arian@yopmail.com
    And ingresa el password Password1$
    And hace click en el boton LOG IN
    When hace click en el boton tag
    And selecciona el tag Fenix
    And hace click en el boton Facturable
    And ingresa la descripcion Negocio
    And hace click en el boton Project
    And selecciona el projecto Crowdar
    Then visualiza que los cambios se realizaron de manera exitosa



