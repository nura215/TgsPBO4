public class Smartphone extends Handphone{
    public Smartphone(String merk, String model) {
        super(merk, model);
    }

    @Override
    public void nyalakan() {
        System.out.println("Smartphone " + merk + " " + model + " sedang booting.");
    }

    @Override
    public void matikan() {
        System.out.println("Smartphone " + merk + " " + model + " sedang shutdown.");
    }
    @Override
    public void kirimPesan(String nomorTujuan, String pesan) {
        System.out.println("Nomor Tujuan " + nomorTujuan +" Menampilkan Pesan " + pesan );
    }
    @Override
    public void kirimPesan(String emailTujuan, String subjek, String pesan) {
        System.out.println("Email Tujuan " + emailTujuan  +"  Subjek " + subjek  +" Pesan "+ pesan);

    }
    public void aksesInternet() {
        System.out.println("Mengakses Internet");
    }

}

