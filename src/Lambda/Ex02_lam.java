package Lambda;
interface Lambda02 {
	public void lam(Object o);
}
public class Ex02_lam {

	public static void main(String[] args) {
		Lambda02 lam01 = (aaa)-> {
			System.out.println(aaa + " 출력");
			System.out.println("여러줄 사용 가능");
		};
		lam01.lam("안녕하세요");
	}

}
