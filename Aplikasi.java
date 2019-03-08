
package praktek1;

public class Aplikasi {
    public static void main(String[] args) {
        Mahasiswa mhs1 =
                new Mahasiswa("17090063","atika");
        Mahasiswa mhs2 =
                new Mahasiswa("17090065","ani");
        
        mhs1.cetak();
        mhs2.cetak();
        System.out.println(mhs1.getNim());
//        mhs1.nama = "ani";
//        mhs1.nim = "17090063";
//        System.out.println(mhs1.nim+":"+ mhs1.nama);
//        System.out.println(mhs2.nim+":"+ mhs2.nama);
    }
}
