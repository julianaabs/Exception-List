public class Teste{

	public static void main(String[] args){
		try{
			Validador palavra1 = new Validador("JuLiana8");
			palavra1.validaString();
		}catch(Exception e){
			//System.out.println(e.message);
		}
	}
}