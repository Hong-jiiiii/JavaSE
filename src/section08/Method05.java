package section08;
/*
 * VO(Value Object), DTO(Data Transfer Object)
 * 	값 오브젝트로써 목적에 맞는 변수의 집합.
 * 	Database 또는 네트워크 통신값 운반용으로 사용.
 * 	
 * 캡슐화(정보은닉)- 객체의 속성과 행위를 하나로 묶고 
 * 					외부로부터 내부를 감싸 숨겨 은닉한다.
 * 
 * 	this
 *	자기 자신을 참조하는 연산자.
 * 
 * 
 */
public class Method05 {
	public static void main(String[] args) {
		//변수 생성시 소문자로 쓰다가 새로운 단어 등장하면 대문자로 표기 -> 낙타표기법(camelCase)
		//e.g.) strName
		//한 단어 뒤에 _로 표기 -> 스네이크표기법(snakeCase)
		//e.g.) str_name
		MemberVO memberVO = new MemberVO();
		
		
		memberVO.setId("025");
		memberVO.setName("피카츄");
		memberVO.setAge(29);
		
		String id = memberVO.getId();
		String name = memberVO.getName();
		int age = memberVO.getAge();
		
		System.out.println("id "+ id);
		System.out.println("name: "+ name);
		System.out.println("age: " + age);

		

	}
	

}
