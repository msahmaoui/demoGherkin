Feature: ***************************** Faire une recherche sur Google de la societe Publicis a l'aide de Gherkin & Selenium (JAVA)  ********************************

Scenario: Faire une recherche de Publicis sur navigateur Chrome


Given Lancer Google Chrome et aller sur la page de google.fr
When Faire une recherche du mot publicis puis cliquer sur le bouton rechercher
Then Consulter la page de resultats et aller sur le site de Publicis

