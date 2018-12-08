import pe.com.empresa.reconocimiento.Proceso;

public class Main {

	public static void main(String[] args) {
        if (args.length > 2) { 
            System.out.println("Hay demasiados par�metros.");
        } else if (args.length == 1) {       
            System.out.println("Falta un par�metro.");
        } else if (args.length == 0) {     
            System.out.println("Falta los par�metros.");
        } else {
    		Proceso.procesarImagenes(args[0], args[1]);
        }
	}
}
