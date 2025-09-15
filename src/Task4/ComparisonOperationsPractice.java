package Task4;

public class ComparisonOperationsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operasi Perbandingan
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * operator perbandingan dan memahami perilakunya dengan tipe data berbeda.
         */

        // ===== PERBANDINGAN NUMERIK DASAR =====
        System.out.println("=== PERBANDINGAN NUMERIK DASAR ===");

        // Latihan 1: Berlatih semua operator perbandingan dengan integers
        // - Buat dua variabel integer: firstNum = 25, secondNum = 18

        // - Bandingkan firstNum > secondNum dan print hasilnya dengan pesan deskriptif

        // - Bandingkan firstNum < secondNum dan print hasilnya dengan pesan deskriptif

        // - Bandingkan firstNum >= secondNum dan print hasilnya dengan pesan deskriptif

        // - Bandingkan firstNum <= secondNum dan print hasilnya dengan pesan deskriptif

        // - Bandingkan firstNum == secondNum dan print hasilnya dengan pesan deskriptif

        // - Bandingkan firstNum != secondNum dan print hasilnya dengan pesan deskriptif

        // ===== PERBANDINGAN FLOATING-POINT =====
        System.out.println("\\n=== PERBANDINGAN FLOATING-POINT ===");

        // Latihan 2: Bekerja dengan perbandingan angka floating-point
        // - Buat dua variabel double: price1 = 19.99, price2 = 20.0

        // - Bandingkan harga mana yang lebih murah menggunakan operator perbandingan yang sesuai

        // - Periksa apakah perbedaan antara harga kurang dari 1.0

        // - Buat skenario dimana dua nilai double seharusnya "sama" tetapi tidak karena presisi
        // Contoh: 0.1 + 0.2 dibandingkan dengan 0.3

        // ===== PERBANDINGAN KARAKTER =====
        System.out.println("\\n=== PERBANDINGAN KARAKTER ===");

        // Latihan 3: Bandingkan karakter menggunakan operator perbandingan
        // - Buat dua variabel char: letter1 = 'A', letter2 = 'B'

        // - Bandingkan letter1 < letter2 dan jelaskan mengapa hasilnya masuk akal (nilai ASCII)

        // - Bandingkan huruf kecil dengan huruf besar dan amati hasilnya

        // - Periksa apakah suatu karakter adalah digit dengan membandingkannya dengan '0' dan '9'

        // ===== PERBANDINGAN STRING =====
        System.out.println("\\n=== PERBANDINGAN STRING ===");

        // Latihan 4: Pahami jebakan perbandingan string dan metode yang benar
        // - Buat dua variabel String dengan konten yang sama: name1 = "Java", name2 = "Java"

        // - Bandingkan name1 == name2 dan print hasilnya

        // - Buat string lain: name3 = new String("Java")

        // - Bandingkan name1 == name3 dan print hasilnya - jelaskan mengapa berbeda dari di atas

        // - Gunakan metode .equals() untuk membandingkan name1 dan name3 dengan benar

        // - Demonstrasikan perbandingan case-sensitive dengan .equals()

        // - Demonstrasikan perbandingan case-insensitive dengan .equalsIgnoreCase()

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\\n=== APLIKASI PRAKTIS ===");

        // Latihan 5: Gunakan perbandingan dalam skenario dunia nyata
        // - Buat variabel untuk pengecekan nilai siswa
        // grade = 85, passingGrade = 60, honorRoll = 90

        // - Periksa apakah siswa lulus menggunakan operator perbandingan

        // - Periksa apakah siswa memenuhi syarat untuk honor roll

        // - Buat skenario verifikasi usia
        // age = 17, drivingAge = 16, votingAge = 18, drinkingAge = 21

        // - Periksa kelayakan untuk mengemudi, memilih, dan minum menggunakan perbandingan

        // Latihan 6: Skenario shopping dan discount
        // - Buat variabel untuk skenario belanja
        // originalPrice = 100, discountThreshold = 50, customerAge = 65, seniorAge = 60

        // - Periksa apakah pembelian memenuhi syarat untuk diskon bulk (harga > threshold)

        // - Periksa apakah pelanggan memenuhi syarat untuk diskon senior

        // - Gabungkan kondisi untuk menentukan kelayakan akhir

        // ===== PENGUJIAN BATAS =====
        System.out.println("\\n=== PENGUJIAN BATAS ===");

        // Latihan 7: Test edge cases dan kondisi batas
        // - Buat variabel 'score' dengan nilai 100

        // - Periksa apakah score berada dalam rentang yang valid (0 sampai 100) menggunakan dua operasi perbandingan

        // - Test nilai batas: apa yang terjadi dengan score = 0, score = 100, score = -1, score = 101

        // - Buat pengecekan rentang suhu (rentang valid: -10 sampai 40 derajat Celsius)

        // Latihan 8: Rantai perbandingan dan kondisi kompleks
        // - Buat variabel: height = 175, minHeight = 160, maxHeight = 200

        // - Periksa apakah tinggi berada dalam rentang yang dapat diterima menggunakan operator perbandingan

        // - Buat sistem penilaian menggunakan beberapa perbandingan:
        // score >= 90: "A", score >= 80: "B", score >= 70: "C", score >= 60: "D", selainnya: "F"
    }
}

