public class SwitchExample{
	public static void main(String[] args){
		int number = 20;
		switch (number){
			case 10:
			System.out.println("10");
			break;
			
			case 20:
			System.out.println("20");
			break;

			case 30:
			System.out.println("30");
			break;

			default :
			System.out.println("Not in 10, 20 or 30");
		}
	}
}

/*
	Penjelasan :
		Program diatas kita memiliki 1 variabel bertipe int
		disini kita menggunakan loop switch case dimana hanya
		akan ada satu kondisi saja yang akan ditampilkan.

		Pada program kita ini variabel number memiliki nilai = 20
		maka seleksi switch case dilakukan maka hanya ada satu pernyataan
		saja yang benar dan case 20 dan akan menghasilkan output ("20")

*/