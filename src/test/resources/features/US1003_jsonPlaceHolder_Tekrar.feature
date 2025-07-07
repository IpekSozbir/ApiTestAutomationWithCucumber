Feature: JsonPlaceHolder endPoint'inde GET request test yapar

  Scenario:  Kullanici get request gonderip testleri yapar
    Given Kullanici "jPHBaseUrl" base url'ini kullanir
    And Path parametreleri icin "posts/23" kullanir
    And jPH server'a GET request gonderir ve testleri yapmak icin response degerini kaydeder
    Then jPH response'da status degerinin 200
    And jPH response'da content type degerinin "application/json; charset=utf-8"
    Then jPH GET respons body'sinde "title" degerinin String "maxime id vitae nihil numquam"