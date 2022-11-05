
public class JuiceFactory {

	public Fruit getJuice(TypeFruit type) {
		switch (type) {
		case Orange: return new Orange();
		case BANNANE: return new Bannane();
		case APPLE: return new Apple();
		default:return null;
		}
	}
}
