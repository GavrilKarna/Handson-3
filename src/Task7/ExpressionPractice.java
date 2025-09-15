package Task7;

public class ExpressionPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Expression, Statement & Block
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk memahami
         * perbedaan antara expressions, statements, dan blocks.
         */

        // ===== EXPRESSIONS =====
        System.out.println("=== EXPRESSIONS ===");

        // Latihan 1: Buat arithmetic expressions dan simpan hasilnya
        int a = 10;
        int b = 5;
        // - Buat expression yang menjumlahkan a dan b, simpan dalam variabel 'sum'

        // - Buat expression yang mengalikan a dan b, simpan dalam variabel 'product'

        // - Buat boolean expression yang mengecek apakah a lebih besar dari b

        // - Buat string expression yang menggabungkan "Hello" dan "World"

        // - Buat method call expression menggunakan Math.pow(2, 3)

        // - Print semua hasil expression dengan label yang deskriptif

        // ===== STATEMENTS =====
        System.out.println("\\n=== STATEMENTS ===");

        // Latihan 2: Buat berbagai jenis statements
        // - Buat declaration statement untuk variabel integer 'score'

        // - Buat assignment statement untuk memberikan nilai 85 ke score

        // - Buat conditional statement yang mencetak "Pass" jika score >= 60, "Fail" jika sebaliknya

        // - Buat loop statement yang mencetak angka 1 sampai 3

        // ===== BLOCKS =====
        System.out.println("\\n=== BLOCKS ===");

        // Latihan 3: Buat dan gunakan blocks
        int x = 15;

        // - Buat if block yang mengecek apakah x > 10
        // Di dalam block, deklarasikan variabel 'category' dan assign "High"
        // Print kedua nilai x dan category

        // - Buat for loop block yang melakukan iterasi 3 kali
        // Di dalam block, deklarasikan variabel 'iteration' yang menunjukkan nomor loop saat ini
        // Print nomor iterasi

        // Latihan 4: Demonstrasikan variable scope dengan blocks
        int outerVariable = 100;

        {
            // - Di dalam block ini, deklarasikan variabel 'innerVariable' dengan nilai 50
            // - Print kedua outerVariable dan innerVariable
            // - Modifikasi outerVariable di dalam block ini (tambahkan 25)
        }

        // - Print outerVariable setelah block (seharusnya menunjukkan nilai yang sudah dimodifikasi)
        // - Coba print innerVariable di sini - apa yang terjadi? (Comment baris ini setelah testing)
    }
}

