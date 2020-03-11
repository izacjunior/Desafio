@tag
Feature: Deletar imagem de api e receber resultado json

  @tag1
  Scenario: Deletar imagens e receber resposta em json
    Given o hash de autenticacao
    And o id da imagem
    When realiza a pesquisa pela api
    Then deleta imagem retornará a resposta em json

  @tag2
  Scenario: Exclusão não realizada
    Given o hash de autenticacao
    And o id inexistente da imagem
    When realiza a pesquisa pela api
    Then retornará a resposta em json exclusao não realizada
