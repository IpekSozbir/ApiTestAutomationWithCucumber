Feature: JsonPlaceHolder endPoint'inde GET request test yapar

 @api1
  Scenario: TC01 44 numarali  endPoint'e get request gonderip testleri yapar

    Given Kullanici "jPHBaseUrl" base url'ini kullanir
    Then Path parametreleri icin "posts/44" kullanir
    And jPH server'a GET request gonderir ve testleri yapmak icin response degerini kaydeder
    Then jPH response'da status degerinin 200
    And jPH response'da content type degerinin "application/json; charset=utf-8"
    Then jPH GET response body'sinde "userId" dgerinin Integer 5
    And jPH GET respons body'sinde "title" degerinin String "optio dolor molestias sit"
