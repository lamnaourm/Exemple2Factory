
public class Principale {

	public static void main(String[] args) {

		JuiceFactory factory = new JuiceFactory();
		
		Fruit b = factory.getJuice(TypeFruit.APPLE);
		b.produiceJuice();
		
		

	}

}
