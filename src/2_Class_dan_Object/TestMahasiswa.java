public class TestMahasiswa {
    public static void main (String args[]){
        Mahasiswa mhs1=new Mahasiswa();
        Mahasiswa mhs2=new Mahasiswa();
        Mahasiswa mhs3=new Mahasiswa();
        
        System.out.println("----");
        mhs1.nim=101;
        mhs1.nama="Lestari";
        mhs1.alamat="Jl.Vinolia No.1A";
        mhs1.kelas="1A";
        mhs1.tampilBiodata();
        
        System.out.println("----");
        mhs2.nim=102;
        mhs2.nama="Sayang";
        mhs2.alamat="Jl.Vinolia No.1B";
        mhs2.kelas="2A";
        mhs2.tampilBiodata();
        
        System.out.println("----");
        mhs3.nim=102;
        mhs3.nama="Mama";
        mhs3.alamat="Jl.Vinolia No.1C";
        mhs3.kelas="3A";
        mhs3.tampilBiodata();
    }
}
