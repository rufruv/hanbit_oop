package array;

public class ArrayController {
	public static void main(String[] args) {
		ArrayService service = new ArrayServiceImpl();
		String[] arr = new String[5];
		arr=service.add();
		System.out.printf("FindOne: %s\n"
			        	+ "FindSome: %s\n"
				        + "FindAll: %s\n"
				        + "Update: %s\n"
				        + "Delete: %S\n",service.findOne(),service.findSome(),service.findAll(),service.update(),service.delete());

		}
	}
	

