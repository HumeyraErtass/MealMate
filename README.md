
# MealMate — Tez Projesi

**Proje Başlığı:** MealMate — Besin ve Kalori Takip Sistemi (Tez Projesi)

**Yazar:** Hümeyra Ertaş

**Kurum:** Manisa Celal Bayar Üniversitesi / Yazılım Mühendisliği

Özet
- Bu repo, lisans/tez projesi kapsamında geliştirilmiş olan MealMate uygulamasını içerir. MealMate; kullanıcıların besin tüketimini, günlük loglarını ve besin analizlerini takip etmelerini sağlayan REST tabanlı bir Spring Boot servisidir. Proje akademik amaçlı değerlendirme, deneysel doğrulama ve sonuçların raporlanması için hazırlanmıştır.

Amaç ve Kapsam
- Amaç: Kullanıcıların günlük kalori alımlarını izleyebilecekleri, besinleri kaydedebilecekleri ve periyot bazlı özetler alabilecekleri bir platform sunmaktır. Tez kapsamında performans, doğruluk ve kullanılabilirlik kriterleri değerlendirilir.
- Kapsam: Backend API, veri modeli (JPA entity'leri), temel güvenlik (JWT), ve analiz/özet servislerini kapsar.

Teknolojiler
- Java 17
- Spring Boot
- Spring Data JPA
- Lombok
- MapStruct
- JJWT (JWT)

Proje Yapısı
- `src/main/java` : uygulama kaynak kodu (controller, service, repository, entity, dto)
- `src/main/resources/application.yml` : konfigürasyon
- `pom.xml` : bağımlılıklar ve build ayarları

Kurulum ve Çalıştırma
1. Gereksinimler: `Java 17`, Maven (veya projedeki Maven Wrapper), Git.
2. Projeyi klonlayın ve dizine girin:

```bash
git clone <repo-url>
cd mealmate
```

3. Derleme (Windows PowerShell):

```powershell
.\mvnw.cmd -DskipTests package
```

4. Uygulamayı çalıştırma:

```powershell
.\mvnw.cmd spring-boot:run

# veya
java -jar target/*-SNAPSHOT.jar
```


Sorun Giderme
- Derleme sırasında `bad source file` veya `duplicate class` hataları alıyorsanız, proje kaynak dosyalarındaki `package` bildirimlerinin dosya yoluyla uyumlu olduğundan emin olun (örneğin `src/main/java/com/humeyra/...`). Yanlış `package main.java.com...` gibi önekler derlemeyi engeller.
- IDE önerileri:
  - `Maven > Reimport` yapın veya IDE içinde proje yeniden yükleyin.
  - Lombok kullanılıyorsa IDE'de Lombok eklentisi yüklü ve annotation processing etkin olmalıdır.

Testler
- Testleri çalıştırmak için:

```powershell
.\mvnw.cmd test
```

