@Proyecto
Feature: Proyecto

  Background:
    Given esta en la pagina de Login

Scenario: Crear nuevo proyecto
  Given hace click en el boton Log in manually
  And ingresa el email arian@yopmail.com
  And ingresa el password Password1$
  And hace click en el boton LOG IN
  When hace click en el boton PROJECTS
  And hace click en el boton CREATE NEW PROJECT
  And ingresa en el campo Enter project name Fenix
  And hace click en el boton CREATE PROJECT
  Then visualiza el proyecto agregado a la lista
