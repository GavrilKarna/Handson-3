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
        int a = 10, b = 5, c = 2;

        // - Hitung hasil dari: a + b * c
        // - Prediksi hasilnya terlebih dahulu, lalu hitung dan print
        // - Tambahkan komentar dengan prediksi vs hasil aktual
        System.out.println("\nLatihan 1.1: a + b * c");
        System.out.println("Prediksi: 10 + (5 * 2) = 20  (karena * dievaluasi sebelum +)");
        int res1 = a + b * c;
        System.out.println("Hasil  : " + res1 + "\n");

        // - Hitung hasil dari: (a + b) * c
        // - Bandingkan dengan hasil sebelumnya
        System.out.println("Latihan 1.2: (a + b) * c");
        System.out.println("Prediksi: (10 + 5) * 2 = 30  (kurung memaksa penjumlahan dulu)");
        int res2 = (a + b) * c;
        System.out.println("Hasil  : " + res2);
        System.out.println("Perbandingan: 20 (sebelumnya) vs 30 (dengan kurung)\n");

        // - Hitung hasil dari: a * b + c / 2
        // - Jelaskan urutan operasi dalam komentar
        System.out.println("Latihan 1.3: a * b + c / 2");
        System.out.println("Penjelasan: * dan / dievaluasi dulu (kiri-ke-kanan), lalu +");
        System.out.println("  a * b = 10 * 5 = 50");
        System.out.println("  c / 2 = 2 / 2 = 1   (pembagian integer)");
        int res3 = a * b + c / 2;
        System.out.println("Prediksi: 50 + 1 = 51");
        System.out.println("Hasil  : " + res3 + "\n");

        // - Hitung hasil dari: a / b + c * 2
        // - Tunjukkan evaluasi step-by-step dalam komentar
        System.out.println("Latihan 1.4: a / b + c * 2");
        System.out.println("Evaluasi step-by-step:");
        System.out.println("  a / b = 10 / 5 = 2   (integer)");
        System.out.println("  c * 2 = 2 * 2 = 4");
        System.out.println("  2 + 4 = 6");
        int res4 = a / b + c * 2;
        System.out.println("Hasil  : " + res4);


        // ===== PRECEDENCE PERBANDINGAN DAN ARITMATIKA =====
        System.out.println("\\n=== PRECEDENCE PERBANDINGAN DAN ARITMATIKA ===");

        // Latihan 2: Mencampur operator aritmatika dan perbandingan
        // - Buat variabel: x = 15, y = 10, z = 20
        int x = 15, y = 10, z = 20;

        // - Evaluasi: x + y > z - 5
        // - Uraikan urutan evaluasi dalam komentar
        System.out.println("\nLatihan 2.1: x + y > z - 5");
        System.out.println("Urutan: hitung penjumlahan dan pengurangan dulu, lalu perbandingan.");
        System.out.println("  x + y = 15 + 10 = 25");
        System.out.println("  z - 5 = 20 - 5 = 15");
        boolean res21 = x + y > z - 5; // 25 > 15 => true
        System.out.println("Hasil  : " + res21);

        // - Evaluasi: x > y + z / 4
        // - Jelaskan operasi mana yang terjadi lebih dulu
        System.out.println("\nLatihan 2.2: x > y + z / 4");
        System.out.println("Urutan: z / 4, lalu y + (z/4), lalu perbandingan dengan x.");
        System.out.println("  z / 4 = 20 / 4 = 5");
        System.out.println("  y + 5 = 10 + 5 = 15");
        boolean res22 = x > (y + z / 4); // 15 > 15 => false
        System.out.println("Prediksi: 15 > 15 -> false");
        System.out.println("Hasil  : " + res22);

        // - Evaluasi: (x + y) > (z - 5) && x < z
        // - Tunjukkan bagaimana tanda kurung mengubah evaluasi
        System.out.println("\nLatihan 2.3: (x + y) > (z - 5) && x < z");
        System.out.println("Tanda kurung memastikan perbandingan dilakukan sebelum &&.");
        boolean res23 = (x + y) > (z - 5) && x < z;
        System.out.println("Evaluasi: (25 > 15) && (15 < 20) => true && true => true");
        System.out.println("Hasil  : " + res23);

        // - Buat ekspresi kompleks: x * 2 + y > z && y < x + 5
        // - Prediksi hasilnya, lalu verifikasi
        System.out.println("\nLatihan 2.4: x * 2 + y > z && y < x + 5");
        System.out.println("Langkah:");
        System.out.println("  x*2 + y = 15*2 + 10 = 30 + 10 = 40");
        System.out.println("  40 > z (20) => true");
        System.out.println("  y < x + 5 => 10 < 20 => true");
        boolean res24 = x * 2 + y > z && y < x + 5;
        System.out.println("Hasil  : " + res24);

        // ===== PRECEDENCE OPERATOR LOGIKA =====
        System.out.println("\\n=== PRECEDENCE OPERATOR LOGIKA ===");

        // Latihan 3: Memahami precedence operator logika
        // - Buat variabel boolean: p = true, q = false, r = true
        boolean p = true, q = false, r = true;

        // - Evaluasi: p && q || r
        // - Jelaskan mengapa && memiliki precedence lebih tinggi dari ||
        System.out.println("\nLatihan 3.1: p && q || r");
        System.out.println("&& memiliki precedence lebih tinggi daripada ||");
        System.out.println("  p && q = true && false = false");
        System.out.println("  false || r = false || true = true");
        boolean res31 = p && q || r;
        System.out.println("Hasil  : " + res31);

        // - Evaluasi: p || q && r
        // - Bandingkan dengan hasil sebelumnya
        System.out.println("\nLatihan 3.2: p || q && r");
        System.out.println("q && r dievaluasi dulu, lalu || dengan p:");
        System.out.println("  q && r = false && true = false");
        System.out.println("  p || false = true");
        boolean res32 = p || q && r;
        System.out.println("Hasil  : " + res32);

        // - Evaluasi: !p && q || r
        // - Tunjukkan bagaimana NOT (!) memiliki precedence tertinggi
        System.out.println("\nLatihan 3.3: !p && q || r");
        System.out.println("! (NOT) memiliki precedence tertinggi, lalu &&, lalu ||");
        System.out.println("  !p = !true = false");
        System.out.println("  false && q = false && false = false");
        System.out.println("  false || r = true");
        boolean res33 = !p && q || r;
        System.out.println("Hasil  : " + res33);

        // - Gunakan tanda kurung untuk mengubah evaluasi: p && (q || r)
        // - Bandingkan dengan p && q || r
        System.out.println("\nLatihan 3.4: p && (q || r)");
        System.out.println("Tanda kurung mengubah evaluasi: q||r dievaluasi dulu");
        System.out.println("  q || r = false || true = true");
        System.out.println("  p && true = true");
        boolean res34 = p && (q || r);
        System.out.println("Hasil  : " + res34);
        System.out.println("Bandingkan dengan p && q || r (yang hasilnya juga true di kasus ini)\n");

        // ===== TIPE OPERATOR CAMPURAN =====
        System.out.println("\\n=== TIPE OPERATOR CAMPURAN ===");

        // Latihan 4: Menggabungkan operator aritmatika, perbandingan, dan logika
        // - Buat variabel: num1 = 25, num2 = 15, num3 = 30
        int num1 = 25, num2 = 15, num3 = 30;

        // - Evaluasi: num1 > num2 + 5 && num3 / 2 < num1
        // - Uraikan urutan evaluasi lengkap
        System.out.println("\nLatihan 4.1: num1 > num2 + 5 && num3 / 2 < num1");
        System.out.println("Urutan: aritmatika dulu, lalu perbandingan, lalu &&");
        System.out.println("  num2 + 5 = 15 + 5 = 20 -> num1 > 20 => 25 > 20 => true");
        System.out.println("  num3 / 2 = 30 / 2 = 15 -> 15 < 25 => true");
        boolean res41 = num1 > num2 + 5 && num3 / 2 < num1;
        System.out.println("Hasil  : " + res41);

        // - Evaluasi: num1 + num2 > 30 || num3 - num1 < 10 && num2 > 10
        // - Tunjukkan evaluasi step-by-step
        System.out.println("\nLatihan 4.2: num1 + num2 > 30 || num3 - num1 < 10 && num2 > 10");
        System.out.println("Perhatikan: && dievaluasi sebelum ||");
        System.out.println("  Left side: num1 + num2 = 25 + 15 = 40 -> 40 > 30 => true");
        System.out.println("  Karena left side (sebelah kiri ||) sudah true, seluruh ekspresi menjadi true (short-circuit).");
        boolean res42 = num1 + num2 > 30 || num3 - num1 < 10 && num2 > 10;
        System.out.println("Hasil  : " + res42);


        // - Gunakan tanda kurung untuk memaksa evaluasi berbeda: (num1 + num2 > 30 || num3 - num1 < 10) && num2 > 10
        // - Bandingkan hasil dan jelaskan perbedaannya
        System.out.println("\nLatihan 4.3: (num1 + num2 > 30 || num3 - num1 < 10) && num2 > 10");
        System.out.println("Dengan tanda kurung, bagian sebelum && dievaluasi dulu.");
        System.out.println("  (num1 + num2 > 30) => true, jadi (true || ...) => true");
        System.out.println("  num2 > 10 => 15 > 10 => true");
        boolean res43 = (num1 + num2 > 30 || num3 - num1 < 10) && num2 > 10;
        System.out.println("Hasil  : " + res43);
        System.out.println("Perbedaan: tanpa kurung RHS dari || (yang ber-&&) bisa dievaluasi atau tidak karena short-circuit; dengan kurung, ekspresi dikontrol lebih eksplisit.\n");

        // ===== UNARY OPERATORS DAN PRECEDENCE =====
        System.out.println("\\n=== UNARY OPERATORS DAN PRECEDENCE ===");

        // Latihan 5: Unary operators dengan operasi lain
        // - Buat variabel: value = 8
        int value;

        // - Evaluasi: ++value * 2
        // - Jelaskan operasi mana yang terjadi lebih dulu
        value = 8;
        System.out.println("\nLatihan 5.1: ++value * 2");
        System.out.println("++value (pre-increment) dilakukan dulu -> value jadi 9, lalu dikalikan 2");
        int res51 = ++value * 2; // value becomes 9, then 9*2 = 18
        System.out.println("Prediksi: 9 * 2 = 18");
        System.out.println("Hasil  : " + res51 + " (value sekarang = " + value + ")");

        // - Reset value ke 8, lalu evaluasi: value++ * 2
        // - Bandingkan dengan hasil sebelumnya
        value = 8;
        System.out.println("\nLatihan 5.2: value++ * 2");
        System.out.println("value++ (post-increment) menghasilkan nilai lama (8) untuk operasi, baru setelah itu value naik");
        int res52 = value++ * 2; // uses 8 * 2 = 16, then value becomes 9
        System.out.println("Prediksi: 8 * 2 = 16 (lalu value -> 9)");
        System.out.println("Hasil  : " + res52 + " (value sekarang = " + value + ")");

        // - Reset value ke 8, lalu evaluasi: 2 * ++value
        // - Amati urutan evaluasi
        value = 8;
        System.out.println("\nLatihan 5.3: 2 * ++value");
        System.out.println("++value dulu jadi 9, lalu 2 * 9 = 18");
        int res53 = 2 * ++value; // value -> 9, result 18
        System.out.println("Hasil  : " + res53 + " (value sekarang = " + value + ")");

        // - Reset value ke 8, lalu evaluasi: -value + 10
        // - Tunjukkan bagaimana unary minus memiliki precedence tinggi
        value = 8;
        System.out.println("\nLatihan 5.4: -value + 10");
        System.out.println("Unary minus diterapkan dulu -> -8 + 10 = 2");
        int res54 = -value + 10;
        System.out.println("Hasil  : " + res54);

        // ===== PRECEDENCE OPERATOR ASSIGNMENT =====
        System.out.println("\\n=== PRECEDENCE OPERATOR ASSIGNMENT ===");

        // Latihan 6: Operator assignment dan precedence
        // - Buat variabel: a = 5, b = 10
        a = 5;
        b = 10;

        // - Evaluasi dan jelaskan: a += b * 2
        // - Tunjukkan bahwa aritmatika terjadi sebelum assignment
        System.out.println("\nLatihan 6.1: a += b * 2");
        System.out.println("Aritmatika di kanan (= b * 2) dievaluasi dulu -> 10 * 2 = 20, baru ditambahkan ke a");
        a += b * 2; // a = 5 + 20 = 25
        System.out.println("Hasil  : a = " + a);

        // - Reset a ke 5, lalu evaluasi: a *= b + 3
        // - Jelaskan urutan evaluasi
        a = 5;
        System.out.println("\nLatihan 6.2: a *= b + 3");
        System.out.println("b + 3 dievaluasi dulu -> 10 + 3 = 13, lalu a = a * 13 -> 5 * 13 = 65");
        a *= b + 3;
        System.out.println("Hasil  : a = " + a);

        // - Evaluasi: a = b > 5 ? b * 2 : b / 2
        // - Tunjukkan bagaimana ternary operator bekerja dengan assignment
        System.out.println("\nLatihan 6.3: a = b > 5 ? b * 2 : b / 2");
        System.out.println("Ternary: cek kondisi (b > 5). Jika true, pilih b*2, else b/2");
        a = (b > 5) ? b * 2 : b / 2; // b = 10 -> true -> a = 20
        System.out.println("Hasil  : a = " + a);

        // ===== TANDA KURUNG DAN OVERRIDE PRECEDENCE =====
        System.out.println("\\n=== TANDA KURUNG DAN OVERRIDE PRECEDENCE ===");

        // Latihan 7: Menggunakan tanda kurung untuk mengontrol evaluasi
        // - Buat variabel: a = 8, b = 4, c = 2, d = 6
        a = 8; b = 4; c = 2; int d = 6;

        // - Bandingkan hasil dari: a + b * c - d dan (a + b) * (c - d)
        // - Tunjukkan langkah kalkulasi untuk keduanya
        System.out.println("\nLatihan 7.1: Bandingkan a + b * c - d  dan  (a + b) * (c - d)");
        System.out.println("Ekspresi 1: a + b * c - d");
        System.out.println("  b * c = 4 * 2 = 8");
        System.out.println("  a + 8 = 8 + 8 = 16");
        System.out.println("  16 - d = 16 - 6 = 10");
        int res71 = a + b * c - d;
        System.out.println("Hasil Ekspresi 1: " + res71);

        System.out.println("\nEkspresi 2: (a + b) * (c - d)");
        System.out.println("  (a + b) = 8 + 4 = 12");
        System.out.println("  (c - d) = 2 - 6 = -4");
        System.out.println("  12 * -4 = -48");
        int res72 = (a + b) * (c - d);
        System.out.println("Hasil Ekspresi 2: " + res72);

        // - Bandingkan hasil dari: a > b && c < d || a == b dan a > b && (c < d || a == b)
        // - Jelaskan bagaimana tanda kurung mengubah logika
        System.out.println("\nLatihan 7.2: Bandingkan a > b && c < d || a == b  dan  a > b && (c < d || a == b)");
        boolean res73a = a > b && c < d || a == b;
        boolean res73b = a > b && (c < d || a == b);
        System.out.println("Evaluasi Ekspresi tanpa kurung:");
        System.out.println("  a > b = 8 > 4 = true");
        System.out.println("  c < d = 2 < 6 = true");
        System.out.println("  true && true = true");
        System.out.println("  a == b = false, lalu true || false = true");
        System.out.println("Hasil tanpa kurung: " + res73a);

        System.out.println("\nEvaluasi Ekspresi dengan kurung:");
        System.out.println("  (c < d || a == b) = true || false = true");
        System.out.println("  a > b && true = true && true = true");
        System.out.println("Hasil dengan kurung: " + res73b);

        // - Buat ekspresi nested kompleks menggunakan beberapa level tanda kurung
        // - Contoh: ((a + b) * c) / (d - 2) > (a - b)
        // - Tunjukkan evaluasi step-by-step
        System.out.println("\nLatihan 7.3: ((a + b) * c) / (d - 2) > (a - b)");
        System.out.println("Langkah:");
        System.out.println("  (a + b) = 12");
        System.out.println("  (a + b) * c = 12 * 2 = 24");
        System.out.println("  (d - 2) = 6 - 2 = 4");
        System.out.println("  24 / 4 = 6   (pembagian integer)");
        System.out.println("  (a - b) = 8 - 4 = 4");
        boolean res74 = ((a + b) * c) / (d - 2) > (a - b); // 6 > 4 => true
        System.out.println("Hasil perbandingan: 6 > 4 => " + res74);
        System.out.println("\n--- SELESAI: Semua latihan telah di-evaluasi dan dicetak ---");

    }
}

