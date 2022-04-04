package com.company;

public class Main {
    /**
     * membuat array
     * @String[]array = new String[3];
     * @String[]array = String[]array =new String[]{...};
     * @String[]array={...};
     */

    public static void main(String[] args) {


        //array adalah jumlah data dengan tipe data yang sama
        //cara kerja array kita harus tentukan panjang array itu berapa
        //tapi ingat data nya harus dengan tipe data yang sama.
        //data array di akses berdasarkan index
        //misalnya data 10 kita akses hanya sampai index 9
        //nih biar jelas
        /*
        misalnya kota punya satu variabel misalnya variabel namanya 'angka'
        int angka = 1, 2, 3, 4, 5, 5, 8;
        nah kita tidak boleh masukan nilai variabel lain selain tipe data int
        int angka = 1, "upil komodo" , 3, 4, 5, 5, 8 <- ini pasti (error) karena datanya bukan lagi tipe data int
        tapi ada String di dalamnya

        int angka = 1, 2, 3, 4, 5, 5, 8;
        nah apa bedanya nilai dari variabel dan index
        nilai 1, 2, 3, 4, 5, 6, 7;
        index 0, 1, 2, 3, 4, 5, 6

        kan datanya ada 1-7 maka index yang bisa di akses hanya dari 0 - 6
         */

        //cara buat array seperti ini
        String [] array;
        array = new String[3];
        //atau kaya gini
        String [] array1 = new String[3];
        //kalau kita masukan parameternya atau panjangnya 3 maka kita hanya bisa akses index dari 0 - 2
        //karena di awal sudah saya jelaskan index pertama di mulai dari 0 sampai panjang data di kurang satu
        //memasukan nilai dari index 0 - 2
        array[0] = "Pilipus";
        array[1] = "pratama";
        array[2] = "putra balla";
        //menampilkan
        System.out.println("index 0 : " + array[0]);
        System.out.println("index 1 : " + array[1]);
        System.out.println("index 2 : " + array[2]);
        //setelah pembuktian run tolong di jadikan komen lagi yaa hehe
        //biar tidak error
        System.out.println("index 3 : " + array[3]); //akan error kalau di run karena nilai dari index ketiga belum ada

        //dalam array tipe data tidak bisa di hapus hanya di ubah
        //ini agak sedikit mendiskriminasi tapi pahami saja kalau String kalau kita tidak masukan nilai nya itu berarti
        //nilai nya adalah null
        //mengganti nilai array anda bisa buat 'nama variabel yang sudah di buat di tambah kurung []'
        array [0] = "yohanes Pembaptis";
        System.out.println("index 0 : " + array[0]);

        //ada banyak cara membuat array kalau anda malas memasukan nilai dari index nya satu2 bisa kaya gini
        int angka [] = new int []{
                1, 2, 3, 4, 5,6,7,8
        };
        //atau lebih mudah lagi

        String NamaTeman []= {
                "tama laki2 bahenol", "ale sang penyembah kijang", "angel malaikat kos", "goran suger dady pesbuk",
                "rio lelaki berbiji marunge", "alda jelmaan saitama hirojiun", "rendy lima padahal tidak bisa kagebunsin",
                "ian wibu toyota"
        };
        //lalu tinggal akses atau tampolkan nilai index nya
        System.out.println(angka[0] + "." + NamaTeman[0]);
        System.out.println(angka[1] + "." + NamaTeman[1]);
        System.out.println(angka[2] + "." + NamaTeman[2]);
        System.out.println(angka[3] + "." + NamaTeman[3]);
        System.out.println(angka[4] + "." + NamaTeman[4]);
        System.out.println(angka[5] + "." + NamaTeman[5]);
        System.out.println(angka[6] + "." + NamaTeman[6]);
        System.out.println(angka[7] + "." + NamaTeman[7]);

        //next pembahasan Operasi di Array & Array di dalam Array kalau mau sih aku buatin


    }

}
