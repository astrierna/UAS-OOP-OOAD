import java.util.Scanner;

class Menu{
	String keluar;
	
	Registrasi daftar = new Registrasi();
	Perwalian perwali = new Perwalian();


	void bukamenu(){
		Scanner in = new Scanner(System.in);
		System.out.println("\t========================================================");
		System.out.println("\t==================== SISTEM AKADEMIK  ==================");
		System.out.println("\t========================================================");
		System.out.println("\t MENU "); 
		System.out.println("\t 1. PENERIMAAN MAHASISWA BARU "); 
		System.out.println("\t 2. PERWALIAN MAHASISWA ");
		System.out.println("\t 3. KELUAR ");
		System.out.println("\t========================================================");
		System.out.println("\t "); 
		System.out.print("\t Silakan masukkan pilihan anda (1/2/3): "); 
		System.out.print("\t "); 

		int pil = in.nextInt();
		switch (pil){
			case 1:
				daftar.regist(); 
				bukamenu();
				break;
			case 2:
				perwali.daftarwali(); // ini juga
				bukamenu();
				break;
			case 3:
				System.out.println(" ");
					Scanner input = new Scanner(System.in);
					System.out.print("\t Anda Yakin Ingin Keluar? [y/t] : ");
					keluar = input.nextLine(); 

					if(keluar.equalsIgnoreCase("y")){
						System.out.println("\t ");
						System.out.println("\t Terima Kasih ");
					}

					else if (keluar.equalsIgnoreCase("t")){
						bukamenu();
					}

					else {
						System.out.println(" ");
						System.out.println("Masukkan Pilihan Dengan Benar");
						bukamenu();
					}

					break;
			default :
			 System.out.println("\t Silakan masukkan pilihan anda (1/2/3): ");
			 bukamenu();

		}

	}
}