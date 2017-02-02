package generic;

public class GenericServiceImpl<T> implements GenericService {
	GenericBean<T> g;
	@Override
	public String println(String param) {
		GenericBean<?> g = new GenericBean<String>(param);
		return (String) g.getVal();
	}
	
	
}
