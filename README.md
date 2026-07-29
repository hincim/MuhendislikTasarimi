# Kelime Lab (Bitirme Projesi)

Kelime Lab, Kotlin ile geliştirilmiş Android tabanlı bir kelime öğrenme uygulamasıdır. Uygulama; kelime yönetimi, çoktan seçmeli quiz, skor takibi ve çeşitli yardımcı araçlar sunmaktadır.

## Özellikler

* Firebase Authentication ile kullanıcı girişi ve kayıt
* İngilizce–Türkçe kelime ekleme, güncelleme, silme ve arama
* Room veritabanı ile yerel veri saklama
* Çoktan seçmeli quiz sistemi
* Firebase Firestore üzerinde skor kaydı
* TDK API ile kelime anlamı sorgulama
* Yanlış cevaplanan kelimeler için CSV oluşturma
* Yapay zekâ destekli kelime önerileri

## Kullanılan Teknolojiler

* Kotlin
* Android SDK
* MVVM
* Hilt
* Room
* Retrofit
* Firebase Authentication
* Firebase Firestore
* Kotlin Coroutines
* ViewBinding & DataBinding
* Navigation Component
* Material Components
* Lottie

## Proje Yapısı

```text
app/
├── data/
├── domain/
├── module/
├── view/
└── viewmodel/
```

## Kurulum

### Gereksinimler

* Android Studio
* JDK 17
* Android SDK (API 34)

### Adımlar

1. Repoyu klonlayın.

```bash
git clone https://github.com/kullaniciadi/MuhendislikTasarimi.git
```

2. Projeyi Android Studio ile açın.

3. `google-services.json` dosyasını `app/` klasörüne ekleyin.

4. Projede kullanılan yerel yapılandırma dosyası (`Constants.kt`) oluşturularak gerekli API bilgileri tanımlanmalıdır.

5. Gradle senkronizasyonunu tamamlayın.

6. Bir emülatör veya fiziksel cihaz seçerek uygulamayı çalıştırın.

## Gradle Komutları

```bash
./gradlew assembleDebug
./gradlew test
```

## Testler

* Birim testleri: `app/src/test`
* Enstrümantasyon testleri: `app/src/androidTest`

## Notlar

* Uygulama arayüzü Türkçe olarak geliştirilmiştir.
* Skor verileri Firebase Firestore üzerinde saklanmaktadır.
* Araçlar ekranındaki hava durumu ve film kartları mevcut sürümde pasif durumdadır.

## Geliştirici

**hincim**
