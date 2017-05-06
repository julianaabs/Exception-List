public class NoLetterException extends Exception{

	public NoLetterException(){
		super("String possui caracteres que não são letras!");
	}
}