public class Handphone {
    protected String merk;
    protected String model;

    public Handphone(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }

    public void nyalakan() {
        System.out.println("Handphone dinyalakan.");
    }

    public void matikan() {
        System.out.println("Handphone dimatikan.");
    }
    public void kirimPesan(String nomorTujuan, String pesan) {
        System.out.println("nomor Tujuan " + nomorTujuan + " "+ pesan);
    }
    public void kirimPesan(String nomorTujuan1, String nomorTujuan2, String pesan) {
        System.out.println("nomor Tujuan1 " + nomorTujuan1 + " ke " + nomorTujuan2 + " " + pesan);
    }

    public void kirimPesan(String[] daftarNomor, String pesan) {
        for(String nomor : daftarNomor){
            System.out.println("mengirim pesan ke " + nomor + " " + pesan );
        }
    }
}
