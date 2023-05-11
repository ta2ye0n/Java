package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 for
        // 매장
        System.out.println("어서오세요.");
        // 또 다른 소님이 들어오면?
        System.out.println("어서오세요");
        System.out.println("어서오세요");
        System.out.println("어서오세요");
        System.out.println("어서오세요");
        System.out.println("어서오세요");
        // 만약에 인사 법이 바뀌면?
        System.out.println("환영합니다.");
        System.out.println("환영합니다.");
        System.out.println("환영합니다.");
        // 매장 이름이 바뀌면?
        // 매장 --> 자바
        System.out.println("환영합니다. 자바입니다.");
        System.out.println("환영합니다. 자바입니다.");
        System.out.println("환영합니다. 자바입니다.");

        System.out.println("----- 반복문 사용 -----");

        // 반복문 사용 for
        // for ( 선언; 조건 ; 증감 ){ ... 수행 명령... } for 문 형식 수행한뒤 증감됨
        for ( int i = 0; i < 10 ; i++) { // i 가 10보다 작을 때까지 수행
            //System.out.println("어서오세요. " + i);
            //System.out.println("환영합니다. " + i);
            System.out.println("환영합니다. 자바입니다. " + i);
        }

        // 짝수만 출력 (fori 만 적고 엔터 치면 for 문의 기본적인 틀을 만들어줌)
        // 0, 2 ,4 ,6, 8  println > 자동 줄 바꿈 print > 줄바꿈 없음
        for (int i = 0; i < 10 ; i += 2) {
            System.out.print(i);
        }

        System.out.println(); // 그냥 줄 바꿈

        // 홀수만 출력
        // 1, 3, 5, 7, 9
        for (int i = 1; i < 10; i += 2) {
            System.out.print(i);
        }

        System.out.println();

        // 거꾸로 숫자 출력
        // 5, 4, 3, 2, 1
        for (int i = 5; i > 0 ; i--) {
            System.out.print(i);
        }

        System.out.println();

        // 1부터 10까지의 수들의 합
        // 1 + 2 .... + 10 = 55
        int sum = 0;
        for (int i = 1; i <= 10 ; i++) {
            sum += i;
            System.out.println("현재까지 총합은 " + sum + "입니다.");
        }
        System.out.println("1부터 10까지의 모든 수의 총합은 " + sum + "입니다.");
    }
}
