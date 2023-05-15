package excepciones;

public class mainCoso3 {

	public static void main(String[] args) {
		
		try {
			verificarVocal('a');
			verificarVocal('b');
		} catch (NoVocalException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void verificarVocal(char letra) throws NoVocalException {
		switch (Character.toLowerCase(letra)) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            System.out.println(letra);
            break;
        default:
            throw new NoVocalException();
		}
    }
	
}
