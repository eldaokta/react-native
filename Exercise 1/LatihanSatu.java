public class LatihanSatu{

    public static void main (String[]args){
        // y = (x + 2) * x

        int x,y;
        //pertama kita cape untuk bikin rumus untuk setiap hasilnya
        x = 5;
        y = (x + 2) * 2;
        System.out.println("x = " + x + ", y = " + y);

        //lalu kita panggil methodnya
        x = 10;
        y = hitung (x); //
        System.out.println("x = " + x + ", y = " + y);
    }

    //kita bikin method untuk mempermudah pemanggilan prosesnya
    static int hitung (int input){
        int hasil;

        hasil = (input + 2) * input;

        return hasil;
    }
}