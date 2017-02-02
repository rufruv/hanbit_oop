package generic;

public class GenericController {
	public static void main(String[] args) {
		GenericService service = new GenericServiceImpl();
		System.out.println(service.println("Hello Generic !!"));
	}
}
