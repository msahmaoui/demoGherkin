Feature: Faire une recherche sur Google de la soci�t� Publicis � l'aide Gherkin & Selenium en Java

Scenario: Faire une recherche de Publicis sur navigateur Chrome

Given Lancer Google Chrome et aller sur la page de google.fr
When Lancer une recherche du mot publicis puis cliquer sur le bouton
Then  Consulter la page de resultats et verifier la presence de publicis