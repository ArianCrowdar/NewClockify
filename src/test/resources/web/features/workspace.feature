@Workspace
Feature: Workspace

  Background:
    Given esta en la pagina de Login

  @Smoke
  Scenario: Crear un nuevo workspace de manera exitosa
    Given hace click en el boton Log in manually
    And ingresa el email arian@yopmail.com
    And ingresa el password Password1$
    And hace click en el boton LOG IN
    When hace click en el boton ...
    And hace click en el boton Manage Workspaces
    And hace click en el boton CREATE NEW WORKSPACE
    And ingresa en el campo Workspace name Crowdar
    And hace click en el boton CREATE
    Then visualiza el workspace creado en el listado

    @Ejercicio5
  Scenario: Cambiar nombre de workspace de manera exitosa
    Given hace click en el boton Log in manually
    And ingresa el email arian@yopmail.com
    And ingresa el password Password1$
    And hace click en el boton LOG IN
    When hace click en el boton ...
    And hace click en el boton Manage Workspaces
    And hace click en el boton SETTINGS
    And ingresa en el campo Settings Workspace name rian's workspace
    And hace click en la pagina
    Then visualiza el cambio del nombre de Workspace

