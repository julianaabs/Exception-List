public class Validador{

	private String palavra;

	public Validador(String palavra){
		this.palavra = palavra;
	}

	public void validaString() throws Exception{
		for(int i=0; i<palavra.length(); i++){
			if(Character.isUpperCase(palavra.charAt(i))){
				System.out.println(palavra.charAt(i) + "\n");
				throw new UppercaseException();
			}
			if(!Character.isLetter(palavra.charAt(i))){
				System.out.println(palavra.charAt(i) + "\n");
				throw new NoLetterException();
			}
		}
	}
}