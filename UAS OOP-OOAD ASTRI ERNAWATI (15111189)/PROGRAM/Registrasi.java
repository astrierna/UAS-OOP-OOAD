import java.util.Scanner;

class Registrasi {
	String nama, alamat;
	int umur, telp;
	String simpan, keluar;
	Akademik akad = new Akademik();

	void regist(){

	// Menu menu =new Menu();

	Scanner maba = new Scanner(System.in);
	System.out.println("\t========================================================");
	System.out.println("\t================ PENERIMAAN MAHASISWA BARU==============");
	System.out.println("\t========================================================");
	System.out.println(" "); 
	System.out.println("\tSilakan isi formulir berikut ini : "); 
	System.out.print("\t Nama        : ");
	nama = maba.nextLine();
	System.out.print("\t Alamat      : ");
	alamat = maba.nextLine();
	System.out.print("\t Umur        : ");
	umur = maba.nextInt();
	System.out.print("\t Telp        : ");
	telp = maba.nextInt();

	Scanner sv = new Scanner(System.in);
	System.out.print("\t Simpan data? (y/t)   : ");
 	simpan = sv.nextLine();

    if(simpan.equalsIgnoreCase("y")){
    	
           System.out.println("\t Data berhasil disimpan");
           akad.cekregist();
           akad.testing();
           akad.kirimNIM();
    }
    else{
          System.out.print ("\t Datatidak tersimpan, Kembali ke menu ? (y/t) ");
          keluar = sv.nextLine();

            if(keluar.equalsIgnoreCase("y") || keluar.equalsIgnoreCase("Y")){
                    // menu.bukamenu();
                }else{
                	System.out.println("\t Terimakasih"); 
                }

	}
	}
}