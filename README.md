# :globe_with_meridians: ApiTestAutomationWithCucumber
Bu repository, **Java** dili kullanılarak geliştirilmiş, **REST API test otomasyonu** çalışmalarını içeren bir projedir.
Proje, **Behavior Driven Development (BDD)** yaklaşımı doğrultusunda **Cucumber** framework’ü ile yapılandırılmıştır ve API testleri **Rest Assured** kütüphanesi kullanılarak gerçekleştirilmiştir.
Amaç; API endpoint’lerinin davranışlarını **okunabilir, sürdürülebilir ve otomatik** test senaryoları ile doğrulamaktır.
---
## :dart: Projenin Amacı
- RESTful API’leri otomatik test etmek
- İş birimi ve teknik ekipler için **okunabilir Gherkin senaryoları** oluşturmak
- Cucumber ile **BDD tabanlı test yaklaşımı** uygulamak
- Maven ile merkezi ve düzenli bir test altyapısı kurmak
- API yanıtlarını status code, body ve header seviyesinde doğrulamak
---
## :hammer_and_wrench: Kullanılan Teknolojiler ve Araçlar
| Teknoloji | Açıklama |
|----------|---------|
| **Java** | Test geliştirme dili |
| **Cucumber (BDD)** | Gherkin tabanlı senaryo yazımı |
| **Rest Assured** | API istekleri ve response doğrulamaları |
| **Maven** | Proje ve bağımlılık yönetimi |
| **JUnit** | Test çalıştırma altyapısı |
---
## :file_folder: Proje Yapısı
```ApiTestAutomationWithCucumber/
├── .gitignore
├── pom.xml # Maven bağımlılık ve yapılandırma dosyası
├── configuration.properties # Ortam ve API konfigürasyonları
└── src
└── test
├── java
│ ├── runners # Cucumber test runner sınıfları
│ ├── stepdefinitions # Gherkin adımlarının Java karşılıkları
│ └── utilities # Ortak yardımcı sınıflar
└── resources
└── features # Gherkin (.feature) dosyaları
```
---
