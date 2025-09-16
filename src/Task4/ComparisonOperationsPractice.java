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
        int firstNum = 25;
        int secondNum = 18;

        // - Bandingkan firstNum > secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println("firstNum > secondNum : " + (firstNum > secondNum));

        // - Bandingkan firstNum < secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println("firstNum < secondNum : " + (firstNum < secondNum));

        // - Bandingkan firstNum >= secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println("firstNum >= secondNum : " + (firstNum >= secondNum));

        // - Bandingkan firstNum <= secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println("firstNum <= secondNum : " + (firstNum <= secondNum));

        // - Bandingkan firstNum == secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println("firstNum == secondNum : " + (firstNum == secondNum));

        // - Bandingkan firstNum != secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println("firstNum != secondNum : " + (firstNum != secondNum));


        // ===== PERBANDINGAN FLOATING-POINT =====
        System.out.println("\\n=== PERBANDINGAN FLOATING-POINT ===");

        // Latihan 2: Bekerja dengan perbandingan angka floating-point
        // - Buat dua variabel double: price1 = 19.99, price2 = 20.0
        double price1 = 19.99;
        double price2 = 20.0;

        // - Bandingkan harga mana yang lebih murah menggunakan operator perbandingan yang sesuai
        System.out.println("price1 < price2 : " + (price1 < price2));

        // - Periksa apakah perbedaan antara harga kurang dari 1.0
        System.out.println("Selisih harga kurang dari 1.0 : " + (Math.abs(price1 - price2) < 1.0));

        // - Buat skenario dimana dua nilai double seharusnya "sama" tetapi tidak karena presisi
        // Contoh: 0.1 + 0.2 dibandingkan dengan 0.3
        double sum = 0.1 + 0.2;
        System.out.println("0.1 + 0.2 == 0.3 ? " + (sum == 0.3));
        System.out.println("Nilai sebenarnya dari 0.1 + 0.2 : " + sum);

        // ===== PERBANDINGAN KARAKTER =====
        System.out.println("\\n=== PERBANDINGAN KARAKTER ===");

        // Latihan 3: Bandingkan karakter menggunakan operator perbandingan
        // - Buat dua variabel char: letter1 = 'A', letter2 = 'B'
        char letter1 = 'A';
        char letter2 = 'B';

        // - Bandingkan letter1 < letter2 dan jelaskan mengapa hasilnya masuk akal (nilai ASCII)
        System.out.println("letter1 < letter2 : " + (letter1 < letter2));

        // - Bandingkan huruf kecil dengan huruf besar dan amati hasilnya
        System.out.println("'a' > 'A' : " + ('a' > 'A'));

        // - Periksa apakah suatu karakter adalah digit dengan membandingkannya dengan '0' dan '9'
        char digit = '7';
        System.out.println("Apakah '7' digit? " + (digit >= '0' && digit <= '9'));

        // ===== PERBANDINGAN STRING =====
        System.out.println("\\n=== PERBANDINGAN STRING ===");

        // Latihan 4: Pahami jebakan perbandingan string dan metode yang benar
        // - Buat dua variabel String dengan konten yang sama: name1 = "Java", name2 = "Java"
        String name1 = "Java";
        String name2 = "Java";

        // - Bandingkan name1 == name2 dan print hasilnya
        System.out.println("name1 == name2 : " + (name1 == name2));

        // - Buat string lain: name3 = new String("Java")
        String name3 = new String("Java");

        // - Bandingkan name1 == name3 dan print hasilnya - jelaskan mengapa berbeda dari di atas
        System.out.println("name1 == name3 : " + (name1 == name3));

        // - Gunakan metode .equals() untuk membandingkan name1 dan name3 dengan benar
        System.out.println("name1.equals(name3) : " + name1.equals(name3));

        // - Demonstrasikan perbandingan case-sensitive dengan .equals()
        System.out.println("name1.equals(\"java\") : " + name1.equals("java"));

        // - Demonstrasikan perbandingan case-insensitive dengan .equalsIgnoreCase()
        System.out.println("name1.equalsIgnoreCase(\"java\") : " + name1.equalsIgnoreCase("java"));

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\\n=== APLIKASI PRAKTIS ===");

        // Latihan 5: Gunakan perbandingan dalam skenario dunia nyata
        // - Buat variabel untuk pengecekan nilai siswa
        // grade = 85, passingGrade = 60, honorRoll = 90
        int grade = 85, passingGrade = 60, honorRoll = 90;


        // - Periksa apakah siswa lulus menggunakan operator perbandingan
        System.out.println("Apakah lulus? " + (grade >= passingGrade));

        // - Periksa apakah siswa memenuhi syarat untuk honor roll
        System.out.println("Apakah honor roll? " + (grade >= honorRoll));

        // - Buat skenario verifikasi usia
        // age = 17, drivingAge = 16, votingAge = 18, drinkingAge = 21
        int age = 17, drivingAge = 16, votingAge = 18, drinkingAge = 21;

        // - Periksa kelayakan untuk mengemudi, memilih, dan minum menggunakan perbandingan
        System.out.println("Boleh mengemudi? " + (age >= drivingAge));
        System.out.println("Boleh memilih? " + (age >= votingAge));
        System.out.println("Boleh minum? " + (age >= drinkingAge));

        // Latihan 6: Skenario shopping dan discount
        // - Buat variabel untuk skenario belanja
        // originalPrice = 100, discountThreshold = 50, customerAge = 65, seniorAge = 60
        int originalPrice = 100, discountThreshold = 50, customerAge = 65, seniorAge = 60;
        boolean bulkDiscount = originalPrice > discountThreshold;
        boolean seniorDiscount = customerAge >= seniorAge;

        // - Periksa apakah pembelian memenuhi syarat untuk diskon bulk (harga > threshold)
        System.out.println("Diskon bulk? " + bulkDiscount);

        // - Periksa apakah pelanggan memenuhi syarat untuk diskon senior
        System.out.println("Diskon senior? " + seniorDiscount);

        // - Gabungkan kondisi untuk menentukan kelayakan akhir
        System.out.println("Diskon total? " + (bulkDiscount || seniorDiscount));


        // ===== PENGUJIAN BATAS =====
        System.out.println("\\n=== PENGUJIAN BATAS ===");

        // Latihan 7: Test edge cases dan kondisi batas
        // - Buat variabel 'score' dengan nilai 100
        int score = 100;
        System.out.println("Score valid (0-100)? " + (score >= 0 && score <= 100));

        // - Periksa apakah score berada dalam rentang yang valid (0 sampai 100) menggunakan dua operasi perbandingan
        int[] testScores = {0, 100, -1, 101};

        // - Test nilai batas: apa yang terjadi dengan score = 0, score = 100, score = -1, score = 101
        for (int s : testScores) {
            System.out.println("Score " + s + " valid? " + (s >= 0 && s <= 100));
        }

        // - Buat pengecekan rentang suhu (rentang valid: -10 sampai 40 derajat Celsius)
        int temperature = 25;
        System.out.println("Suhu valid (-10 sampai 40)? " + (temperature >= -10 && temperature <= 40));


        // Latihan 8: Rantai perbandingan dan kondisi kompleks
        // - Buat variabel: height = 175, minHeight = 160, maxHeight = 200
        int height = 175, minHeight = 160, maxHeight = 200;

        // - Periksa apakah tinggi berada dalam rentang yang dapat diterima menggunakan operator perbandingan
        System.out.println("Tinggi valid? " + (height >= minHeight && height <= maxHeight));

        // - Buat sistem penilaian menggunakan beberapa perbandingan:
        // score >= 90: "A", score >= 80: "B", score >= 70: "C", score >= 60: "D", selainnya: "F"
        score = 85;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

    }
}

