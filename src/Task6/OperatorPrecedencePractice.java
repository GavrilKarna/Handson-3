package Task6;

public class OperatorPrecedencePractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operator Precedence
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk memahami
         * operator precedence, associativity, dan cara mengontrol urutan evaluasi.
         */

        // ===== PRECEDENCE OPERATOR ARITMATIKA =====
        System.out.println("=== PRECEDENCE OPERATOR ARITMATIKA ===");

        // Latihan 1: Precedence aritmatika dasar
        // - Buat variabel: a = 10, b = 5, c = 2

        // - Hitung hasil dari: a + b * c
        // - Prediksi hasilnya terlebih dahulu, lalu hitung dan print
        // - Tambahkan komentar dengan prediksi vs hasil aktual

        // - Hitung hasil dari: (a + b) * c
        // - Bandingkan dengan hasil sebelumnya

        // - Hitung hasil dari: a * b + c / 2
        // - Jelaskan urutan operasi dalam komentar

        // - Hitung hasil dari: a / b + c * 2
        // - Tunjukkan evaluasi step-by-step dalam komentar

        // ===== PRECEDENCE PERBANDINGAN DAN ARITMATIKA =====
        System.out.println("\\n=== PRECEDENCE PERBANDINGAN DAN ARITMATIKA ===");

        // Latihan 2: Mencampur operator aritmatika dan perbandingan
        // - Buat variabel: x = 15, y = 10, z = 20

        // - Evaluasi: x + y > z - 5
        // - Uraikan urutan evaluasi dalam komentar

        // - Evaluasi: x > y + z / 4
        // - Jelaskan operasi mana yang terjadi lebih dulu

        // - Evaluasi: (x + y) > (z - 5) && x < z
        // - Tunjukkan bagaimana tanda kurung mengubah evaluasi

        // - Buat ekspresi kompleks: x * 2 + y > z && y < x + 5
        // - Prediksi hasilnya, lalu verifikasi

        // ===== PRECEDENCE OPERATOR LOGIKA =====
        System.out.println("\\n=== PRECEDENCE OPERATOR LOGIKA ===");

        // Latihan 3: Memahami precedence operator logika
        // - Buat variabel boolean: p = true, q = false, r = true

        // - Evaluasi: p && q || r
        // - Jelaskan mengapa && memiliki precedence lebih tinggi dari ||

        // - Evaluasi: p || q && r
        // - Bandingkan dengan hasil sebelumnya

        // - Evaluasi: !p && q || r
        // - Tunjukkan bagaimana NOT (!) memiliki precedence tertinggi

        // - Gunakan tanda kurung untuk mengubah evaluasi: p && (q || r)
        // - Bandingkan dengan p && q || r

        // ===== TIPE OPERATOR CAMPURAN =====
        System.out.println("\\n=== TIPE OPERATOR CAMPURAN ===");

        // Latihan 4: Menggabungkan operator aritmatika, perbandingan, dan logika
        // - Buat variabel: num1 = 25, num2 = 15, num3 = 30

        // - Evaluasi: num1 > num2 + 5 && num3 / 2 < num1
        // - Uraikan urutan evaluasi lengkap

        // - Evaluasi: num1 + num2 > 30 || num3 - num1 < 10 && num2 > 10
        // - Tunjukkan evaluasi step-by-step

        // - Gunakan tanda kurung untuk memaksa evaluasi berbeda: (num1 + num2 > 30 || num3 - num1 < 10) && num2 > 10
        // - Bandingkan hasil dan jelaskan perbedaannya

        // ===== UNARY OPERATORS DAN PRECEDENCE =====
        System.out.println("\\n=== UNARY OPERATORS DAN PRECEDENCE ===");

        // Latihan 5: Unary operators dengan operasi lain
        // - Buat variabel: value = 8

        // - Evaluasi: ++value * 2
        // - Jelaskan operasi mana yang terjadi lebih dulu

        // - Reset value ke 8, lalu evaluasi: value++ * 2
        // - Bandingkan dengan hasil sebelumnya

        // - Reset value ke 8, lalu evaluasi: 2 * ++value
        // - Amati urutan evaluasi

        // - Reset value ke 8, lalu evaluasi: -value + 10
        // - Tunjukkan bagaimana unary minus memiliki precedence tinggi

        // ===== PRECEDENCE OPERATOR ASSIGNMENT =====
        System.out.println("\\n=== PRECEDENCE OPERATOR ASSIGNMENT ===");

        // Latihan 6: Operator assignment dan precedence
        // - Buat variabel: a = 5, b = 10

        // - Evaluasi dan jelaskan: a += b * 2
        // - Tunjukkan bahwa aritmatika terjadi sebelum assignment

        // - Reset a ke 5, lalu evaluasi: a *= b + 3
        // - Jelaskan urutan evaluasi

        // - Evaluasi: a = b > 5 ? b * 2 : b / 2
        // - Tunjukkan bagaimana ternary operator bekerja dengan assignment

        // ===== TANDA KURUNG DAN OVERRIDE PRECEDENCE =====
        System.out.println("\\n=== TANDA KURUNG DAN OVERRIDE PRECEDENCE ===");

        // Latihan 7: Menggunakan tanda kurung untuk mengontrol evaluasi
        // - Buat variabel: a = 8, b = 4, c = 2, d = 6

        // - Bandingkan hasil dari: a + b * c - d dan (a + b) * (c - d)
        // - Tunjukkan langkah kalkulasi untuk keduanya

        // - Bandingkan hasil dari: a > b && c < d || a == b dan a > b && (c < d || a == b)
        // - Jelaskan bagaimana tanda kurung mengubah logika

        // - Buat ekspresi nested kompleks menggunakan beberapa level tanda kurung
        // - Contoh: ((a + b) * c) / (d - 2) > (a - b)
        // - Tunjukkan evaluasi step-by-step
    }
}

