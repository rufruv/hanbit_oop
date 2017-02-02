package array;

public class ArrayServiceImpl implements ArrayService{
	String[] arr;
	public ArrayServiceImpl(){
		arr = new String[5];
	}
	@Override
	public String[] add() {
		arr[0]="Java";
		arr[1]="JSP";
		arr[2]="Spring";
		arr[3]="JS";
		arr[4]="Html";
		return arr;
	}

	@Override
	public String findOne() {
		String res = "";
		for(int i=0;i<arr.length;i++){
			if("H".equals(String.valueOf(arr[i].charAt(0)))){
				res=arr[i];
				break;
			}
		}
		return res;
	}

	@Override
	public String findSome() {
		String res = "";
		for(int i=0;i<arr.length;i++){
			if("J".equals(String.valueOf(arr[i].charAt(0))));{
				res+=arr[i]+"\t";
			}
		}
		return res;
	}

	@Override
	public String findAll() {
		String res = "";
		for(int i=0;i<arr.length;i++){
			res+=arr[i]+"\t";
		}
		return res;
	}

	@Override
	public String update() {
		String res = "";
		for(int i=0;i<arr.length;i++){
			if("JS".equals(arr[i])){
				arr[i]= "Javascript";
			}
		}
		for(int i=0;i<arr.length;i++){
			res+=arr[i]+"\t";
		}
		return res;
	}

	@Override
	public String delete() {
		String res = "";
		for(int i=0;i<arr.length;i++){
			if("Spring".equals(arr[i])){
				arr[i]= arr[arr.length-1];
				arr[arr.length-1]=null;
			}
		}
		// 삭제가 끝나면 배열 arr을 프린트하기
		for(int i=0;i<arr.length-1;i++){
			res+=arr[i]+"\t";
		}
		return res;
	}

}
