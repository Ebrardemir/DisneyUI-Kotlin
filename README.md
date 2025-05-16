# 🎬 DisneyUI – Film Listeleme Uygulaması (Kotlin)

Bu uygulama, Disney+ benzeri bir kullanıcı arayüzü ile popüler filmleri kategori bazlı listeleyen bir Android uygulamasıdır. Kotlin dili ve RecyclerView kullanılarak geliştirilmiştir.

## 🚀 Özellikler

- 🎞️ Film görselleri ile yatay kaydırılabilir film listeleri (Nested RecyclerView)
- 🖼️ Üstte banner (örneğin tanıtım afişi)
- 🗂️ "Disney+'ta Yeni" ve "Sana Özel Öneriler" gibi başlıklarla kategorilere ayrılmış içerik
- 📱 Alt navigasyon menüsü (ana sayfa, arama, indirme, profil)
- 🌙 Koyu tema uyumlu modern tasarım
- ⚙️ XML ile custom layout kullanımı (`item_film.xml`, `item_section.xml`)

## 🧩 Kullanılan Teknolojiler

- Kotlin
- Android XML
- RecyclerView (Nested)
- ImageView, LinearLayout, ConstraintLayout
- Android Studio

## 🖼️ Ekran Görüntüsü

![WhatsApp Görsel 2025-05-17 saat 00 22 18_8dd0dd4f](https://github.com/user-attachments/assets/ed5bb188-cffa-485c-8d41-4f16b17e387d)

## 📂 Proje Yapısı
app/
└── java/com/example/disneyui/
├── MainActivity.kt
├── Film.kt
├── FilmAdapter.kt
├── Section.kt
└── SectionAdapter.kt
└── res/
├── layout/
│ ├── activity_main.xml
│ ├── item_film.xml
│ └── item_section.xml
├── drawable/
│ └── film afişleri ve ikonlar
└── values/
└── themes.xml, colors.xml


## ⚙️ Nasıl Çalıştırılır?

1. Android Studio ile projeyi açın.
2. Bir emülatör veya cihaz seçin.
3. `Run` butonuna basarak uygulamayı çalıştırın.


