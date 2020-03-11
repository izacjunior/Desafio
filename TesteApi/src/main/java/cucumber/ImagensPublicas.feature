
@tag
Feature: Realizar pesquisas de imagens

  @tag1
  Scenario: Pesquisar imagem em get utilizando size como parametro de pesquisa
    Given o hash de autenticacao
    And o size de pesquisa em get
    When realiza a pesquisa pela api
    Then a api retornará a resposta em json

  @tag2
  Scenario: Pesquisar imagem em get utilizando Mime_Type como parametro de pesquisa
    Given o hash de autenticacao
    And o Mime_Type de pesquisa
    When realiza a pesquisa pela api
    Then a api retornará a resposta em json

  @tag3
  Scenario: Pesquisar imagem em get ordenadas como parametro de pesquisa
    Given o hash de autenticacao
    And o ordenar de pesquisa em get
    When realizará a pesquisa pela api
    Then a api retornará a resposta em json

  @tag4
  Scenario: Pesquisar imagens em get utilizando limite como parametro de pesquisa
    Given o hash de autenticacao
    And o limite de pesquisa em get
    When realizará a pesquisa pela api
    Then a api retornará a resposta em json

  @tag5
  Scenario: Pesquisar imagens em get utilizando pagina como parametro de pesquisa
    Given o hash de autenticacao 
    And o pagina de pesquisa em get
    When realizará a pesquisa pela api
    Then a api retornará a resposta em json

  @tag6
  Scenario: Pesquisar imagens retornanado tipo json
    Given o hash de autenticacao
    And o formato json em get
    When realizará a pesquisa pela api
    Then a api retornará a resposta em json
