
package praktek1;

public class Mahasiswa {
    public static void main(String[] args) {
        
    }
    private String nama;
    private String nim;

    Mahasiswa(){
        nama= "tidak ada nama";
        nim = "17090064";
    }
    Mahasiswa(String nim, String nama){
        this.nim = nim;
        this.nama = nama;}
    void cetak(){
        System.out.println(nim + ": " + nama);
    }
    void setNim(String nim){
        this.nim= nim;
    }
    String getNim(){
        return nim;
    }
}
