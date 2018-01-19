 import java.util.Scanner;
class Akademik{

	// Menu menu =new Menu();
	Keuangan uang = new Keuangan();

 	void cekregist(){
		System.out.println("\t Registrasi berhasil");
	}

	void testing (){
		Scanner test = new Scanner(System.in);
		uang.isRegistPaid();
		System.out.print("\t Sudah melakukan ujian? (y/t) : ");
		String ujian = test.nextLine();

				if(ujian.equalsIgnoreCase("y")){
					System.out.println(" ");
					System.out.println("\t kamu lulus ujian ");
				}

				else if (ujian.equalsIgnoreCase("t")){
					System.out.println("\t mohon maaf, coba tes lagi tahun depan ya.. ");
					// menu.bukamenu();
				}
		
	}

	void kirimNIM(){
		System.out.println("\t NIM kamu adalah 15111189");
	} 
		
	void cekperwalian(){
		
		uang.isWaliPaid();
		
	} 
	
 }

