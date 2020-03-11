@tag
Feature: Deletar imagem de api e receber resultado json

  @tag1
  Scenario: Deletar imagens e receber resposta em json
    Given o hash de autenticacao
    And o id da imagem
    When realiza a pesquisa pela api
    Then deleta imagem retornar� a resposta em json

  @tag2
  Scenario: Exclus�o n�o realizada
    Given o hash de autenticacao
    And o id inexistente da imagem
    When realiza a pesquisa pela api
    Then retornar� a resposta em json exclusao n�o realizada
