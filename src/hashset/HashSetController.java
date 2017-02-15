package hashset;
import java.util.*;
public class HashSetController {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] arr = {"Java", "JSP", "Spring", "JS", "Html"}; 
		Set<String> set = new HashSet<String>();
		for(String i:arr){
			set.add(i);
		}

		for(int i=0;i<arr.length;i++){
			System.out.printf("%s,", arr[i]);
		}
		System.out.println();
		for(String i : arr){
			set.add(i); 
		}
		System.out.println("SET: " + set.toString());
		System.out.println("삭제를 원하는 값을 입력하세요");
		String del = s.next();
		String res ="";
		for(int i=0; i<arr.length; i++){
			if(del.equals(arr[i])){
				del=arr[arr.length-1];
				arr[arr.length-1]=null;
			}else{
				res=del+"는 없는값입니다.";
			}
		}
		System.out.println(res);
	}
}

