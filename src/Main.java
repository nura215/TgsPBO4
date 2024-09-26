public class Main {
    public static void main(String[] args) {
        // Membuat array atau list dari Handphone
        Handphone[] daftarHandphone = new Handphone[2];

        // Mengisi array dengan objek Smartphone dan FeaturePhone
        daftarHandphone[0] = new Smartphone("Samsung", "Galaxy S21");
        daftarHandphone[1] = new FeaturePhone("Nokia", "3310");

        // Menggunakan loop untuk memanggil metode secara polimorfik
        for (Handphone hp : daftarHandphone) {
            hp.nyalakan();
            hp.kirimPesan("08123456789", " halo nenden");
            if (hp instanceof Smartphone){
                ((Smartphone)hp).kirimPesan("nenden@gmail.com","penting", "pesan nenden");
            } else {
                hp.kirimPesan("0834344435345","0832435433", "halo lagi dimana");
            }
            hp.matikan();
            System.out.println();
        }

        // Mengakses metode khusus dengan casting
        for (Handphone hp : daftarHandphone) {
            if (hp instanceof Smartphone) {
                ((Smartphone) hp).aksesInternet();
            } else if (hp instanceof FeaturePhone) {
                ((FeaturePhone) hp).mainGameSnake();
            }
        }

        String[] daftarNomor={"08376763473298", "0847634757898", "0867324497298"};
        System.out.println("\nMengirim Pesan Ke Semuanya:");
        for(Handphone hp :daftarHandphone){
            hp.kirimPesan(daftarNomor, "Kirim Pesan Kesemuanya");
        }

    
    }
}