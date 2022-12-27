Feature:
Background:
  When open Browser and go to  spotify page


  @spoti
  Scenario Outline: GmiBankTestCase

      When  Click login sign in button
      Then  login "<username>" and "<password>"
      And   find the search button
      Then  send "<Eminem one shot two shot>" search button

    Examples:
      | username | password |
      |  iberkayuslu_41@hotmail.com | 123789465Bb |
