package array;

import java.util.Scanner;

public class ArrayController2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] arr = {"Java", "JSP", "Spring", "JS", "Html"}; 
			
		// 2. 검색(1).. 첫글자가 H로 시작하는 단어를 출력
		String res = "";
		for(int i=0;i<arr.length;i++){
			if('H'==arr[i].charAt(0)){
				res=arr[i];
				break;
			}
		}
		System.out.printf("%s\n",res);
		// 3. 검색(some).. 첫글자가 J로 시작하는 단어를 출력
		res="";
		for(int i=0;i<arr.length;i++){
			if('J'==arr[i].charAt(0)){
				res+=arr[i]+"\t";
			}
		}
		System.out.printf("%s\n",res);
		
		// 4. 전체 출력
		res = "";
		for(int i=0;i<arr.length;i++){
			res+=arr[i]+"\t";
		}
		System.out.printf("%s\n",res);
					
		// 5. 수정(JS를 Javascript로 변경)
		res = "";
		for(int i=0;i<arr.length;i++){
			if("JS".equals(arr[i])){
				arr[i]= "Javascript";
			}
		}
	
		// 수정이 끝나면 배열 arr을 프린트하기

		for(int i=0;i<arr.length;i++){
			res+=arr[i]+"\t";
		}
		System.out.printf("%s\n",res);
		res = "";
		// 6. 삭제 (Spring을 삭제)
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
		System.out.printf("%s\n",res);
		}
	}
	

