package Task5;

public class BooleanOperationsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operasi Boolean
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * operator boolean, operasi logika, dan evaluasi short-circuit.
         */

        // ===== OPERATOR BOOLEAN DASAR =====
        System.out.println("=== OPERATOR BOOLEAN DASAR ===");

        // Latihan 1: Berlatih operator AND (&&)
        // - Buat variabel boolean: isLoggedIn = true, hasPermission = false

        // - Gunakan operator AND untuk mengecek apakah user bisa akses admin panel (kedua kondisi harus true)

        // - Test keempat kombinasi operator AND:
        // true && true, true && false, false && true, false && false

        // Latihan 2: Berlatih operator OR (||)
        // - Buat variabel boolean: isWeekend = false, isHoliday = true

        // - Gunakan operator OR untuk mengecek apakah hari libur (salah satu kondisi bisa true)

        // - Test keempat kombinasi operator OR:
        // true || true, true || false, false || true, false || false

        // Latihan 3: Berlatih operator NOT (!)
        // - Buat variabel boolean: isRaining = true

        // - Gunakan operator NOT untuk membuat variabel 'isSunny'

        // - Terapkan operator NOT dua kali (!(!isRaining)) dan amati hasilnya

        // - Gunakan NOT dengan perbandingan: !(5 > 3) dan jelaskan hasilnya

        // ===== EKSPRESI BOOLEAN GABUNGAN =====
        System.out.println("\\n=== EKSPRESI BOOLEAN GABUNGAN ===");

        // Latihan 4: Gabungkan beberapa operator boolean
        // - Buat variabel untuk evaluasi siswa
        // attendanceGood = true, gradesHigh = false, behaviorGood = true

        // - Buat ekspresi untuk "siswa outstanding": attendanceGood && gradesHigh && behaviorGood

        // - Buat ekspresi untuk "siswa memuaskan": attendanceGood && (gradesHigh || behaviorGood)

        // - Buat ekspresi untuk "perlu perbaikan": !attendanceGood || !behaviorGood

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\\n=== APLIKASI PRAKTIS ===");

        // Latihan 5: Sistem kontrol akses
        // - Buat variabel untuk sistem keamanan
        // hasKeyCard = true, knowsPassword = false, isAuthorizedTime = true, isEmergency = false

        // - Buat logika untuk akses normal: hasKeyCard && knowsPassword && isAuthorizedTime

        // - Buat logika untuk akses darurat: isEmergency || (hasKeyCard && isAuthorizedTime)

        // - Buat logika untuk akses ditolak: !(akses normal OR akses darurat)

        // Latihan 6: Pengambilan keputusan berdasarkan cuaca
        // - Buat variabel kondisi cuaca
        // isRaining = false, isSnowing = true, temperature = -5, isCloudy = true

        // - Tentukan apakah cuaca bagus untuk aktivitas outdoor
        // Cuaca bagus: tidak hujan AND tidak salju AND suhu > 0

        // - Tentukan apakah Anda butuh payung: isRaining OR (isCloudy AND temperature > 20)

        // - Tentukan apakah jalan mungkin berbahaya: isSnowing OR (isRaining AND temperature < 5)

        // ===== EVALUASI SHORT-CIRCUIT =====
        System.out.println("\\n=== EVALUASI SHORT-CIRCUIT ===");

        // Latihan 7: Demonstrasikan perilaku short-circuit dengan AND
        // - Buat variabel: a = 5, b = 0

        // - Buat ekspresi boolean: (b != 0) && (a / b > 2)
        // Ini TIDAK seharusnya menyebabkan division by zero karena evaluasi short-circuit

        // - Buat ekspresi lain: (b == 0) || (a / b > 2)
        // Ini juga TIDAK seharusnya menyebabkan division by zero karena evaluasi short-circuit

        // - Jelaskan dalam komentar mengapa ekspresi ini aman

        // Latihan 8: Short-circuit dengan pemanggilan method (simulasi)
        // - Buat variabel untuk simulasi operasi mahal
        // expensiveCheck1 = false, expensiveCheck2 = true

        // - Simulasikan AND short-circuit: expensiveCheck1 && expensiveCheck2
        // Tambahkan komentar tentang "method" mana yang akan dipanggil

        // - Simulasikan OR short-circuit: expensiveCheck2 || expensiveCheck1
        // Tambahkan komentar tentang "method" mana yang akan dipanggil
    }
}

