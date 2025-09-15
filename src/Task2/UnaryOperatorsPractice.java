package Task2;

public class UnaryOperatorsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Unary Operators
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk memahami
         * unary operators, terutama perbedaan antara pre dan post increment/decrement.
         */

        // ===== OPERATOR INCREMENT DAN DECREMENT =====
        System.out.println("=== OPERATOR INCREMENT DAN DECREMENT ===");

        // Latihan 1: Increment dan decrement dasar
        // - Buat variabel 'counter' dengan nilai 5
        int counter = 5;

        // - Gunakan pre-increment (++counter) dan print hasilnya
        System.out.println("Pre-increment (++counter): " + ++counter);

        // - Gunakan post-increment (counter++) dan print hasilnya
        System.out.println("Post-increment (counter++): " + counter++);

        // - Reset counter ke 5, lalu gunakan pre-decrement (--counter) dan print hasilnya
        counter = 5;
        System.out.println("Reset counter ke 5");
        System.out.println("Pre-decrement (--counter): " + --counter);

        // - Gunakan post-decrement (counter--) dan print hasilnya
        System.out.println("Post-decrement (counter--): " + counter--);

        // ===== PERILAKU PRE vs POST INCREMENT =====
        System.out.println("\\n=== PERILAKU PRE vs POST INCREMENT ===");

        // Latihan 2: Pahami perbedaan antara pre dan post increment
        // - Buat dua variabel: a = 10, b = 10
        int a = 10, b = 10;

        // - Buat variabel 'result1' dan assign nilai dari ++a (pre-increment)
        // - Print kedua 'a' dan 'result1' - amati nilainya
        int result1 = ++a;
        System.out.println("a: " + a + ", result1 (from ++a): " + result1);

        // - Buat variabel 'result2' dan assign nilai dari b++ (post-increment)
        // - Print kedua 'b' dan 'result2' - amati nilainya
        int result2 = b++;
        System.out.println("b: " + b + ", result2 (from b++): " + result2);

        // - Jelaskan dalam komentar apa yang Anda amati tentang perbedaannya
        // Perbedaan: pre-increment menaikkan nilai sebelum assignment; post-increment setelah.

        // ===== PERILAKU PRE vs POST DECREMENT =====
        System.out.println("\\n=== PERILAKU PRE vs POST DECREMENT ===");

        // Latihan 3: Pahami perbedaan antara pre dan post decrement
        // - Buat dua variabel: x = 8, y = 8
        int x = 8, y = 8;

        // - Print nilai dari --x (pre-decrement) dan kemudian print x lagi
        System.out.println("--x: " + --x);
        System.out.println("x sekarang: " + x);

        // - Print nilai dari y-- (post-decrement) dan kemudian print y lagi
        System.out.println("y--: " + y--);
        System.out.println("y sekarang: " + y);

        // - Tulis komentar yang menjelaskan kapan decrement terjadi pada setiap kasus
        // Decrement terjadi sebelum assignment pada pre-decrement, setelah assignment pada post-decrement.

        // ===== UNARY PLUS DAN MINUS =====
        System.out.println("\\n=== UNARY PLUS DAN MINUS ===");

        // Latihan 4: Berlatih operator unary plus dan minus
        // - Buat variabel integer positif 'positive' dengan nilai 42
        int positive = 42;

        // - Buat variabel integer negatif 'negative' menggunakan operator unary minus pada positive
        int negative = -positive;

        // - Buat variabel 'backToPositive' menggunakan unary minus pada negative (membuatnya positif lagi)
        int backToPositive = -negative;

        // - Demonstrasikan bahwa unary plus tidak mengubah nilai (buat variabel dengan +positive)
        int stillPositive = +positive;

        // - Print ketiga variabel tersebut
        System.out.println("positive: " + positive); // 42
        System.out.println("negative: " + negative); // -42
        System.out.println("backToPositive: " + backToPositive); // 42
        System.out.println("stillPositive (+positive): " + stillPositive); // 42

        // ===== OPERATOR BOOLEAN NOT =====
        System.out.println("\\n=== OPERATOR BOOLEAN NOT ===");

        // Latihan 5: Berlatih operator boolean NOT
        // - Buat variabel boolean 'isReady' dengan nilai true
        boolean isReady = true;

        // - Buat boolean lain 'isNotReady' menggunakan operator NOT (!) pada isReady
        boolean isNotReady = !isReady;

        // - Print kedua variabel
        System.out.println("isReady: " + isReady);
        System.out.println("isNotReady: " + isNotReady);

        // - Buat ekspresi boolean yang mengecek apakah suatu angka TIDAK sama dengan nol
        // Gunakan angka apapun dan print hasilnya
        int angka = 10;
        System.out.println("Apakah angka TIDAK sama dengan nol? " + (angka != 0));

        // - Rangkai beberapa operator NOT: buat variabel dengan !!isReady dan amati hasilnya
        boolean doubleNot = !!isReady;
        System.out.println("!!isReady = " + doubleNot);


        // ===== APLIKASI PRAKTIS =====
        System.out.println("\\n=== APLIKASI PRAKTIS ===");

        // Latihan 6: Gunakan unary operators dalam skenario praktis
        // - Buat variabel 'attempts' dimulai dari 0
        int attempts = 0;

        // - Simulasikan tiga percobaan login yang gagal dengan increment 'attempts' setiap kali
        // Print "Attempt: " + attempts setelah setiap increment
        attempts++;
        System.out.println("Attempt: " + attempts);
        attempts++;
        System.out.println("Attempt: " + attempts);
        attempts++;
        System.out.println("Attempt: " + attempts);

        // - Buat variabel 'lives' dimulai dari 3
        int lives = 3;

        // - Simulasikan kehilangan nyawa dalam game dengan decrement 'lives'
        // Print "Lives remaining: " + lives setelah setiap decrement
        lives--;
        System.out.println("Lives remaining: " + lives);
        lives--;
        System.out.println("Lives remaining: " + lives);
        lives--;
        System.out.println("Lives remaining: " + lives);

        // Latihan 7: Loop counters dengan increment/decrement
        // - Gunakan while loop yang berjalan 5 kali menggunakan post-increment
        // Buat variabel 'i' dimulai dari 1, kondisi: i <= 5, increment: i++
        // Print loop counter setiap iterasi
        System.out.println("\nLoop dengan post-increment:");
        int i = 1;
        while (i <= 5) {
            System.out.println("i = " + i);
            i++;
        }

        // - Gunakan while loop yang menghitung mundur dari 3 ke 1 menggunakan post-decrement
        // Buat variabel 'countdown' dimulai dari 3, kondisi: countdown > 0, decrement: countdown--
        // Print "Countdown: " + countdown setiap iterasi
        System.out.println("\nLoop countdown dengan post-decrement:");
        int countdown = 3;
        while (countdown > 0) {
            System.out.println("Countdown: " + countdown);
            countdown--;
        }

        // ===== SKENARIO MENANTANG =====
        System.out.println("\\n=== SKENARIO MENANTANG ===");

        // Latihan 8: Skenario increment/decrement kompleks
        // - Buat variabel 'value' dengan nilai awal 5
        int value = 5;

        // - Hitung dan simpan hasil dari: value++ + ++value
        // Print kedua hasil dan nilai akhir dari 'value'
        int complex1 = value++ + ++value;
        System.out.println("value++ + ++value = " + complex1 + ", value akhir = " + value);

        // - Reset value ke 5, lalu hitung: --value + value--
        // Print kedua hasil dan nilai akhir dari 'value'
        value = 5;
        int complex2 = --value + value--;

        // - Prediksi hasilnya sebelum menjalankan dan tambahkan komentar dengan prediksi Anda
        System.out.println("--value + value-- = " + complex2 + ", value akhir = " + value);
        // Pre-increment/decrement mengubah nilai sebelum dipakai,
        // post-increment/decrement memakainya dulu baru mengubah.

        // Latihan 9: Increment/Decrement dengan pemanggilan method
        // - Buat variabel 'score' dengan nilai 10
        int score = 10;

        // - Print hasil dari Math.max(++score, 12)
        // Kemudian print nilai score saat ini
        System.out.println("Math.max(++score, 12) = " + Math.max(++score, 12));
        System.out.println("score sekarang = " + score);

        // - Reset score ke 10, lalu print hasil dari Math.max(score++, 12)
        // Kemudian print nilai score saat ini
        score = 10;
        System.out.println("Math.max(score++, 12) = " + Math.max(score++, 12));
        System.out.println("score sekarang = " + score);

        // - Komentari perbedaan perilaku yang Anda amati
        // Pada ++score, nilai sudah naik saat dipakai dalam method.
        // Pada score++, nilai lama dipakai dulu, lalu baru dinaikkan.
    }
}

