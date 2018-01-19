import java.util.Scanner;
class Perwalian{
	String nama;
	String kelas;
	String jurusan;
	int nim;
	String dosen;
	int semester;

	Dosen dos = new Dosen();

	void daftarwali(){
	Scanner mhs = new Scanner(System.in);
	System.out.println("\t ========================================================");
	System.out.println("\t ======================= PERWALIAN ======================");
	System.out.println("\t ========================================================");
	System.out.println("\t  "); 
	System.out.println("\t Silakan isi formulir perwalian berikut ini : "); 
	System.out.print("\t Nama             : ");
	nama = mhs.nextLine();
	System.out.print("\t Jurusan          : ");
	jurusan = mhs.nextLine();
	System.out.print("\t Kelas            : ");
	kelas = mhs.nextLine();
	System.out.print("\t NIM              : ");
	nim = mhs.nextInt();

	Scanner dsn = new Scanner(System.in);
	System.out.print("\t Nama Dosen Wali  : ");
	dosen = dsn.nextLine();
	System.out.print ("\t Pilih Semester lanjutan (2/3/4/5/6/7/8) : ");
	semester = dsn.nextInt();
	System.out.println("\t ");
	System.out.println("\t Harap menunggu konfirmasi pengesahan dari Akademik dan Wali Dosen");
	System.out.println("\t ");
	dos.konfirmwali();
	}
}