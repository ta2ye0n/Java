package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java")); // 문자열 내용이 같으면 true, 다르면 false

        // 대소문자 구분 없이 문자열 내용이 같은지 여부 체크
        System.out.println(s2.equalsIgnoreCase("python"));

        // 문자열 비교 심화
        s1 = "1234"; // 참조 s1과 s2는 같이 참조하고 있음
        s2 = "1234";
        System.out.println(s1.equals(s2)); // true 내용이 같은지 비교
        System.out.println(s1 == s2); // true 참조하는게 같은지 비교

        s1 = new String("1234"); // 서로 다른 곳에
        s2 = new String("1234"); // 참조
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // false
    }
}
