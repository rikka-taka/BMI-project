# Kalkulator MBI (Body Mass Index)

## 📌 Deskripsi Proyek

Kalkulator MBI (Massa/Berat Badan Indeks) merupakan aplikasi desktop sederhana berbasis Java yang digunakan untuk menghitung Indeks Massa Tubuh (IMT) atau Body Mass Index (BMI) seseorang berdasarkan berat badan dan tinggi badan.

Aplikasi ini dikembangkan menggunakan **JavaFX** sebagai antarmuka pengguna (GUI). Pengguna cukup memasukkan berat badan dalam kilogram (kg) dan tinggi badan dalam sentimeter (cm), kemudian aplikasi akan menghitung nilai BMI serta menampilkan kategori berdasarkan hasil perhitungan.

## ✨ Fitur Utama

- **Input Berat Badan:** Memasukkan berat badan dalam satuan kilogram (kg).
- **Input Tinggi Badan:** Memasukkan tinggi badan dalam satuan sentimeter (cm).
- **Perhitungan BMI:** Menghitung nilai BMI secara otomatis.
- **Klasifikasi BMI:** Menampilkan kategori berdasarkan nilai BMI.
- **Validasi Input:** Memastikan data yang dimasukkan berupa angka yang valid dan bernilai lebih dari nol.
- **Fleksibilitas Format Angka:** Mendukung penggunaan titik (.) maupun koma (,) sebagai pemisah desimal.

## 🛠️ Teknologi yang Digunakan

- **Bahasa Pemrograman:** Java
- **GUI Framework:** JavaFX
- **FXML:** Untuk mengatur struktur antarmuka aplikasi.
- **IDE:** NetBeans (atau IDE Java lain yang mendukung JavaFX).

## 📂 Struktur Proyek

```text
MBI-Project/
│
├── src/
│   ├── upi/
│   │   └── mbiproject/
│   │       └── MBIproject.java
│   │
│   ├── model/
│   │   └── MBI.java
│   │
│   ├── Controller/
│   │   └── BMIprojectController.java
│   │
│   └── BMI-project.fxml
│
└── README.md
```

**Keterangan:**

| File | Fungsi |
|---|---|
| `MBIproject.java` | Menjadi kelas utama untuk menjalankan aplikasi JavaFX dan memuat tampilan FXML. |
| `MBI.java` | Menangani proses perhitungan BMI dan menentukan kategori berdasarkan hasilnya. |
| `BMIprojectController.java` | Menghubungkan komponen antarmuka dengan logika perhitungan serta menangani input pengguna. |
| `BMI-project.fxml` | Mengatur tampilan antarmuka aplikasi. |

## 🧮 Rumus Perhitungan

Perhitungan BMI menggunakan rumus:

**BMI = Berat Badan (kg) / Tinggi Badan (m)²**

Karena input tinggi badan menggunakan satuan sentimeter, maka tinggi badan dikonversi terlebih dahulu ke meter.

Contoh:

- Berat badan: 60 kg
- Tinggi badan: 170 cm = 1,7 m

Perhitungan:

BMI = 60 / (1,7 × 1,7)

BMI = 20,8

## 📊 Kategori BMI

Aplikasi mengelompokkan hasil perhitungan ke dalam empat kategori:

| Nilai BMI | Kategori |
|---|---|
| < 18,5 | Kurus (Underweight) |
| 18,5 – < 25,0 | Normal |
| 25,0 – < 30,0 | Kelebihan Berat Badan (Overweight) |
| ≥ 30,0 | Obesitas |

## ⚙️ Cara Kerja Aplikasi

1. Pengguna membuka aplikasi Kalkulator MBI.
2. Pengguna memasukkan berat badan dalam kilogram.
3. Pengguna memasukkan tinggi badan dalam sentimeter.
4. Pengguna menekan tombol untuk melakukan perhitungan.
5. Sistem membaca dan memvalidasi input.
6. Sistem menghitung nilai BMI menggunakan rumus yang telah ditentukan.
7. Sistem menentukan kategori BMI.
8. Hasil perhitungan dan kategori ditampilkan pada aplikasi.

## 🚀 Cara Menjalankan Proyek

1. Clone atau download repository proyek ini.
2. Buka proyek menggunakan NetBeans atau IDE Java yang mendukung JavaFX.
3. Pastikan JavaFX sudah dikonfigurasi pada proyek.
4. Pastikan file `BMI-project.fxml` tersedia pada lokasi resource yang sesuai.
5. Jalankan file `MBIproject.java`.
6. Aplikasi Kalkulator MBI akan terbuka dan siap digunakan.

## 🛡️ Validasi Input

Aplikasi memiliki beberapa validasi untuk menjaga agar proses perhitungan berjalan dengan benar:

- Input tidak boleh kosong.
- Input harus berupa angka.
- Berat badan harus lebih dari 0.
- Tinggi badan harus lebih dari 0.
- Input tidak menerima nilai yang tidak valid seperti NaN dan Infinity.

Apabila input tidak sesuai, aplikasi akan menampilkan pesan kesalahan.

## 👨‍💻 Pengembang

**Nama:** Muamad Asif

**Proyek:** Kalkulator MBI (BMI Calculator)

**Bahasa Pemrograman:** Java

---

*Catatan: Hasil BMI merupakan indikator sederhana berdasarkan perbandingan berat dan tinggi badan, bukan diagnosis kondisi kesehatan.*
