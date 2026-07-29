# Kelime Lab (MuhendislikTasarimi)

Android tabanlı bir kelime çalışma uygulaması. Proje; kelime ekleme/yönetme, çoktan seçmeli alıştırma, skor takibi ve yardımcı araçlar (sözlük/AI) akışlarını içerir.

## Öne Çıkan Özellikler

- Firebase Authentication ile e-posta/şifre giriş ve kayıt
- Room veritabanında İngilizce-Türkçe kelime saklama
- Kelime arama, güncelleme, silme ve toplu temizleme
- Çoktan seçmeli quiz akışı ve sonuç ekranı
- Firestore üzerinde skor kaydı ve skor listesi
- TDK API üzerinden kelime anlamı arama
- Yanlış cevaplanan kelimeleri CSV dosyasına yazma ve bu kelimelerden AI destekli öneri üretme

## Teknoloji ve Kütüphaneler

- **Dil:** Kotlin
- **Platform:** Android (minSdk 24, compileSdk 34, targetSdk 33)
- **Mimari:** Katmanlı yapı (data / domain / view / viewmodel) + MVVM yaklaşımı
- **Bağımlılık enjeksiyonu:** Hilt
- **Yerel veri:** Room
- **Uzak veri:** Retrofit, Gson, RxJava3 (bazı API akışlarında)
- **Asenkron:** Kotlin Coroutines
- **Kimlik doğrulama / Bulut veri:** Firebase Auth, Firebase Firestore
- **UI:** ViewBinding, DataBinding, Navigation Component, Material Components, Lottie

## Proje Yapısı

`/home/runner/work/BitirmeProjesi/BitirmeProjesi/app/src/main/java/com/example/muhendisliktasarimi`

- `data/`: API ve repository implementasyonları, Room DAO/database
- `domain/`: model ve repository arayüzleri
- `module/`: Hilt modülleri
- `view/`: Activity ve Fragment’lar
- `viewmodel/`: ekran state ve iş mantığı

## Kurulum

### Gereksinimler

- Android Studio (Güncel sürüm)
- JDK 17
- Android SDK (compileSdk 34)

### Gerekli Yerel Dosyalar

Bu depo, hassas bilgiler içeren bazı dosyaları bilerek versiyonlamıyor:

- `/home/runner/work/BitirmeProjesi/BitirmeProjesi/app/google-services.json`
- `Constants.kt` (gitignore’da hariç tutulmuş)

`Constants.kt` dosyası, kodda şu sabitler için kullanılıyor:

- `MOVIE_BASE_URL`
- `TDK_BASE_URL`
- `WEATHER_BASE_URL`
- `MOVIE_API_KEY`
- `API_KEY` (hava durumu API anahtarı)
- `WORD_API_KEY`
- `WORD_BASE_URL`
- `AI_API_KEY`
- `WORD_QUESTİON`

> Not: Bu değerler depoda paylaşılmadığı için README içinde örnek değer verilmemiştir.

### Çalıştırma

1. Repoyu açın:
   - `/home/runner/work/BitirmeProjesi/BitirmeProjesi`
2. Gerekli yerel dosyaları (`google-services.json`, `Constants.kt`) ekleyin.
3. Android Studio ile projeyi senkronize edin.
4. Uygulamayı emülatör veya fiziksel cihazda başlatın.

## Gradle Komutları

Proje kök dizininde:

```bash
./gradlew assembleDebug
./gradlew test
```

## Testler

- Birim testleri: `app/src/test`
- Enstrümantasyon testleri: `app/src/androidTest`

## Notlar

- Uygulama arayüz metinleri ağırlıklı olarak Türkçe’dir.
- Araçlar ekranında hava durumu ve film kartlarına ait kod bölümleri mevcut olsa da ilgili tıklama akışları şu an yorum satırına alınmıştır.
