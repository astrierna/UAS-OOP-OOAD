import java.util.Scanner;
class Keuangan{


	// Menu menu =new Menu();

    void isRegistPaid(){
        Scanner in = new Scanner(System.in);
		System.out.print("\t Sudah melakukan Pembayaran? (y/t) : ");
		String pay = in.nextLine();

				if(pay.equalsIgnoreCase("y")){
					System.out.println(" ");
					System.out.println("\t pembayaran anda sudah berhasil ");
				}

				else if (pay.equalsIgnoreCase("t")){
					System.out.println("\t Mohon untuk melakukan pembayaran terlebih dahulu ");
					// menu.bukamenu();
				}

    }
   
    void isWaliPaid(){
    Scanner in = new Scanner(System.in);
		System.out.print("\t Sudah melakukan Pembayaran? (y/t) : ");
		String payw = in.nextLine();

				if(payw.equalsIgnoreCase("y")){
					System.out.println(" ");
					System.out.println("\t pembayaran anda sudah berhasil ");
					System.out.println("\t Data terverifikasi");
					System.out.println("\t Perwalian Anda disetujui");
				}

				else if (payw.equalsIgnoreCase("t")){
					System.out.println("\t Mohon untuk melakukan pembayaran terlebih dahulu untuk semester ini ");
					// menu.bukamenu();
				}

    }

}