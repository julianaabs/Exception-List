public class Teste{

	public static void main(String[] args){
		try{
			Conversor conversor1 = new Conversor(30.0, 'C');
			conversor1.converter();
		}catch(FahException e){
			System.out.println(e.message);
		}
	}
}