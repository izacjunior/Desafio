
@tag
Feature: Realizar pesquisa post pela api
  Realizar pesquisa post pela api e retornar resposta json

 @tag1
  Scenario: Realizar pesquisar post de imagens
    Given o hash de autenticacao
    When realiza a pesquisa pela api
    Then a api retornará a resposta em json
