
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

Konfigürasyon
- Tüm ortam ayarları `src/main/resources/application.yml` dosyasında bulunur. Veritabanı bağlantısı, port numarası ve JWT ile ilgili anahtarlar burada yapılandırılır.

Güvenlik Notu
- `pom.xml` içinde `jjwt.version` güvenlik güncellemesi yapılmıştır (0.13.0). Güvenlik tarayıcıları bu sürümü tavsiye eder; üretim ortamında JWT anahtar yönetimi ve gizlilik politikaları dikkatle uygulanmalıdır.

Değerlendirme & Deneysel Prosedür
- Tez çalışmasında kullanılacak testler, veri setleri ve ölçüm metrikleri `docs/` veya tez raporunda belirtilmelidir. Örnek değerlendirme adımları:
  - Fonksiyonel doğrulama (API testleri)
  - Performans testleri (yük testi)
  - Kullanılabilirlik/anket sonuçları (varsa)

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

Veri Gizliliği
- Gerçek kullanıcı verisi kullanılıyorsa, kişisel verilerin korunması (anonimizasyon, erişim kontrolleri) sağlanmalıdır. Tez raporunda veri kaynağı ve izinler açıkça belirtilmelidir.

Katkıda Bulunma
- Akademik projeler için katkılar genellikle danışman onayı ile yapılır. Hata bildirimleri ve PR'lar kabul edilebilir; önce bir issue açmanız rica olunur.

Referanslar
- Kullanılan kütüphane sürümleri ve güvenlik notları `pom.xml` ve proje dokümantasyonunda listelenmiştir.

İletişim
- Projeyle ilgili sorular için `README` içine eklenecek e-posta veya GitHub profil bilgileri kullanılabilir.

---

Bu README, tez amaçlı belgeleme için temel bir iskelet sağlar; isterseniz tez raporunuzun başlık sayfası, özet (abstract), literatür özeti ve deney sonuçları gibi ek bölümleri ekleyebilirim.
- `src/main/resources/application.yml` : konfigürasyon
- `pom.xml` : bağımlılıklar ve build

Sonraki adım: projeyi derleyip çalıştırarak değişiklikleri (özellikle `jjwt` güncellemesi ve paket düzeltmeleri) doğrulayın.
