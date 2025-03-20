package string.String_builder;

public class String_Builder_ex {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" World");
		System.out.println(sb);

		//insert
		sb.insert(5, " Java");
		System.out.println(sb);

		//replace
		sb.replace(5, 10, " C++");
		System.out.println(sb);

		//delete
		sb.delete(5, 9);
		System.out.println(sb);

		//reverse
		sb.reverse();
		System.out.println(sb);
	}
}

