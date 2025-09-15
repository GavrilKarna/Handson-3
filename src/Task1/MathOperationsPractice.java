package Task1;

public class MathOperationsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operasi Matematika
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk berlatih
         * operator aritmatika dan memahami berbagai operasi numerik.
         */

        // ===== OPERATOR ARITMATIKA DASAR =====
        System.out.println("=== OPERATOR ARITMATIKA DASAR ===");

        // Latihan 1: Berlatih operasi aritmatika dasar
        // - Deklarasikan dua integer: num1 = 25, num2 = 4
        int num1 = 25;
        int num2 = 4;

        // - Hitung dan simpan hasil penjumlahan num1 dan num2
        int sum = num1 + num2;

        // - Hitung dan simpan hasil pengurangan num1 dan num2
        int diff = num1 - num2;

        // - Hitung dan simpan hasil perkalian num1 dan num2
        int product = num1 * num2;

        // - Hitung dan simpan hasil pembagian num1 dibagi num2 (pembagian integer)
        int quotient = num1 / num2;

        // - Hitung dan simpan sisa bagi num1 dibagi num2 (modulus)
        int remainder = num1 % num2;

        // - Print semua hasil dengan label yang deskriptif
        System.out.println("Penjumlahan: " + num1 + " + " + num2 + " = " + sum);
        System.out.println("Pengurangan: " + num1 + " - " + num2 + " = " + diff);
        System.out.println("Perkalian: " + num1 + " * " + num2 + " = " + product);
        System.out.println("Pembagian (integer): " + num1 + " / " + num2 + " = " + quotient);
        System.out.println("Sisa bagi: " + num1 + " % " + num2 + " = " + remainder);


        // ===== PEMBAGIAN INTEGER VS FLOATING-POINT =====
        System.out.println("\\n=== PEMBAGIAN INTEGER VS FLOATING-POINT ===");

        // Latihan 2: Jelajahi berbagai jenis pembagian
        // - Lakukan pembagian integer: 17 / 5 dan simpan hasilnya
        int intResult = 17 / 5;

        // - Lakukan pembagian floating-point: 17.0 / 5 dan simpan hasilnya
        double floatResult1 = 17.0 / 5;

        // - Konversi integer ke double sebelum pembagian: (double)17 / 5 dan simpan hasilnya
        double floatResult2 = (double)17 / 5;

        // - Print ketiga hasil pembagian dan amati perbedaannya
        System.out.println("Pembagian Integer: 17 / 5 = " + intResult);
        System.out.println("Pembagian Floating-point (17.0 / 5): " + floatResult1);
        System.out.println("Pembagian dengan casting: (double)17 / 5 = " + floatResult2);

        // ===== KALKULASI PRAKTIS =====
        System.out.println("\\n=== KALKULASI PRAKTIS ===");

        // Latihan 3: Selesaikan masalah dunia nyata menggunakan operator aritmatika
        // - Hitung luas persegi panjang dengan panjang 12.5 dan lebar 8.3

        // - Hitung keliling persegi panjang yang sama
        double panjang = 12.5;
        double lebar = 8.3;
        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);

        // - Hitung total harga: 3 barang dengan harga $15.99 masing-masing, dengan pajak 8%
        double hargaBarang = 15.99;
        int jumlahBarang = 3;
        double pajak = 0.08;
        double totalSebelumPajak = hargaBarang * jumlahBarang;
        double totalHarga = totalSebelumPajak * (1 + pajak);

        // - Konversi suhu dari Celsius ke Fahrenheit menggunakan rumus: F = (C * 9/5) + 32
        // Gunakan Celsius = 25
        double celsius = 25;
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("25°C = " + fahrenheit + "°F");

        // - Hitung berapa minggu penuh dalam 50 hari dan berapa hari sisanya
        int totalHari = 50;
        int minggu = totalHari / 7;
        int sisaHari = totalHari % 7;

        // - Print semua kalkulasi dengan label dan format yang sesuai
        System.out.println("Luas persegi panjang: " + luas);
        System.out.println("Keliling persegi panjang: " + keliling);
        System.out.println("Total harga (dengan pajak 8%): $" + String.format("%.2f", totalHarga));
        System.out.println("25°C = " + fahrenheit + "°F");
        System.out.println("50 hari = " + minggu + " minggu dan " + sisaHari + " hari");

        // ===== KALKULASI KOMPLEKS =====
        System.out.println("\\n=== KALKULASI KOMPLEKS ===");

        // Latihan 4: Berlatih ekspresi matematika yang kompleks
        // - Hitung jarak menggunakan rumus: jarak = kecepatan * waktu
        // Gunakan kecepatan = 65.5 km/jam dan waktu = 2.75 jam
        double kecepatan = 65.5; // km/jam
        double waktu = 2.75;     // jam
        double jarak = kecepatan * waktu;

        // - Hitung bunga majemuk menggunakan rumus sederhana: jumlah = pokok * (1 + suku_bunga) ^ waktu
        // Gunakan Math.pow() untuk perpangkatan
        // pokok = 1000, suku_bunga = 0.05 (5%), waktu = 3 tahun
        double pokok = 1000;
        double sukuBunga = 0.05;
        int waktuTahun = 3;
        double jumlahBungaMajemuk = pokok * Math.pow((1 + sukuBunga), waktuTahun);

        // - Hitung rata-rata dari lima nilai ujian: 85, 92, 78, 96, 88
        int nilai1 = 85, nilai2 = 92, nilai3 = 78, nilai4 = 96, nilai5 = 88;
        double rataRata = (nilai1 + nilai2 + nilai3 + nilai4 + nilai5) / 5.0;

        // - Print semua hasil dengan format yang proper (pertimbangkan menggunakan String.format())
        System.out.println("Jarak = kecepatan * waktu = " + jarak + " km");
        System.out.println("Jumlah (bunga majemuk): $" + String.format("%.2f", jumlahBungaMajemuk));
        System.out.println("Rata-rata nilai ujian = " + String.format("%.2f", rataRata));
    }
}

