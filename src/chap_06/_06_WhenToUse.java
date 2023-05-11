package chap_06;

public class _06_WhenToUse {
    public static void main(String[] args) {
        // 메소드가 필요한 이유
        // 여러번 반복되는 코드의 중복을 막을 수 있다.

        // 2의 2승을 구하기
        int result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 2;
        }
        System.out.println(result); // 2 * 2 = 4;

        // 3의 3승을 구하기
        result = 1;
        for (int i = 0; i < 3; i++) {
            result *= 3;
        }
        System.out.println(result); // 3 * 3 * 3 = 27

        // 4의 2승을 구하기
        result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 4;
        }
        System.out.println(result); // 4 * 4 = 16
    }
}
