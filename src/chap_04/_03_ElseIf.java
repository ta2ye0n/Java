package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // 조건문 ElseIf
        // 한라봉 에이드가 있으면 +1
        // 또는 망고 주스가 있으면 +1
        // 또는 아이스 아메리카노 +1

        boolean Ade = true; // 한라봉 에이드
        boolean Juice = true; // 망고 주스

        if (Ade){
            System.out.println("한라봉 에이드 +1");
        }
        else if (Juice) {
            System.out.println("망고 주스 +1");
        }
        else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #1");

        // else if 는 여러번 사용 가능
        Ade = false;
        Juice = false;
        boolean orange = true;

        if (Ade){
            System.out.println("한라봉 에이드 +1");
        }
        else if (Juice) {
            System.out.println("망고 주스 +1");
        }
        else if ( orange){
            System.out.println("오렙지 주스 + 1");
        }
        else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #2");

        // else 는 없어도 가능
        Ade = false;
        Juice = false;
        orange = false;

        if (Ade){
            System.out.println("한라봉 에이드 +1");
        }
        else if (Juice) {
            System.out.println("망고 주스 +1");
        }
        else if ( orange){
            System.out.println("오렙지 주스 + 1");
        }
        System.out.println("커피 주문 완료 #3");
    }
}
