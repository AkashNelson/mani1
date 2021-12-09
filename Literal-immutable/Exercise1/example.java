package Exercise1;

public class example {
public static void main(String[] args) {
			String s1=" ";
			System.out.println(System.identityHashCode(s1));
			String s2="dog";
			System.out.println(System.identityHashCode(s2));
			String concat = s1.concat(s2);
			System.out.println(System.identityHashCode(concat));
			System.out.println("123");
			
}
}
