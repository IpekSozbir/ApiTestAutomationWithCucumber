Feature: US1002 kullanici JPH endPoint'ine Put request gonderir

  @api2
  Scenario: TC02 Kullanici put request sonucu donen response'i test eder

    Given Kullanici "jPHBaseUrl" base url'ini kullanir
    When Path parametreleri icin "posts/70" kullanir
    When Put request icin "Ipek","Sozbir",10 70 bilgiler ile request body olusturur
    And jPH server'a PUT request gonderir ve testleri yapmak icin response degerini kaydeder
    Then jPH response'da status degerinin 200
    And jPH response'da content type degerinin "application/json; charset=utf-8"
    And jPH response'daki "Connection" header degerinin "keep-alive"
    Then response attributelerindeki degerlerin "Ipek","Sozbir",10 70

