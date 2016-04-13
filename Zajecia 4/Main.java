import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Tu mo¿esz kodowaæ
		// Projekt zajecia4
//		try {
//			throw new Exception();
////			System.out.println("Po wyj¹tku 1");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("Po obs³udze wyj¹tku");
		
//		try {
//			Integer i = Integer.parseInt("a");
//			System.out.println("Po wyj¹tku 1");
//		} catch (RuntimeException e) {
//			e.printStackTrace();
//		}
			
//			try{
//				Integer a = Integer.parseInt("a");
//				
//				throw new IOException();
//			} catch(IOException | NumberFormatException e){
//				System.err.println("Tu jestem");
//			} finally{
//				System.out.println("finally");
//			}
		
//		System.out.println(metoda());
		
		
			
	}
	
	static Integer metoda(){
		Scanner scanner = null;
		try/*(Scanner scanner = new Scanner(System.in))*/{
			Integer a = Integer.parseInt("a");
			return a;
		}catch (NumberFormatException e){
			System.err.println("blad");
			return 1;
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

}
