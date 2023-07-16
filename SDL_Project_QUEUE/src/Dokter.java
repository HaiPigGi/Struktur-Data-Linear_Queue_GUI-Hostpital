
public class Dokter {

    protected String nip;
    protected String nama;
    protected String poli;

    public Dokter(String nip, String nama, String Poli) {
        this.nip = nip;
        this.nama = nama;
        this.poli = Poli;
    }

    public String getNrm() {
        return nip;
    }

    public void setNrm(String nrm) {
        this.nip = nrm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
