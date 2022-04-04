package com.company;

public class OperasIArray {
    /**
     * operasi array
     * @Array[index]   mengambil data di array
     * @Array[index]=value   menganti nilai
     * @Array.langth  mengambil panjang array
     */
    public static void main(String[] args) {

        int Array [] = {
                1, 2, 3, 4 ,5 ,6 ,7 ,8
        };
        //Array [index]   mengambil data di array
        System.out.println(Array[0]);
        System.out.println(Array[1]);
        System.out.println(Array[3]);

        //Array [index] = value baru atau nilai baru tapi harus tipe data yang sama untuk menganti nilai
        Array[0] = 30;
        System.out.println(Array[0]);
        //bagaimana menghapus? di array tidak ada yang namanya hapus nilai dari data array
        //hanya bisa mengganti misalnya kalau datanya fundamental seperti int, long, float, di ganti dengan 0
        //kalau String di ganti dengan null
        //misalnya
        Array [5] = 0;
        System.out.println(Array[0]);
        //atau String
        String nama [] = new String[3];
        nama[0]= "polipus";
        nama[1]= "pratama";
        nama[2]= "putra";
        System.out.println(nama[0]);
        System.out.println(nama[1]);
        System.out.println(nama[2]);
        //mengkosongkan yaa bukan menghapus bisa gini
        nama[2] = null;
        System.out.println(nama[2]);

        //Array.langth  mengambil panjang array
        System.out.println("Panjang Data pada variabel Array : " + Array.length);
        System.out.println("Panjang Data pada variabel nama : " + nama.length);

   }
}
