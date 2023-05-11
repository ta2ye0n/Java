package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case

        // 석차에 따른 장학금 지급
        // 1등 : 전액 장학급
        // 2등 : 반액 장학급
        // 3등 : 반액 장학금
        // 그 외 : 장학금 대상 아님

        // If Else 문을 이용
        int ranking = 1; // 등수
        if (ranking == 1){
            System.out.println(("전액 장학금"));
        } else if (ranking == 2 || ranking == 3){
            System.out.println("반액 장학금");
        }
        else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");

        // Switch Case 문을 이용
        //switch ( expression ) {
        /*    case A: ...수행할 명령... Switch 문 형식
                break;
            case B: ...수행할 명령...
                break;
            case C: ...수행할 명령...
                break;
            defalut: ...수행할 명령...
        }*/

        ranking = 1;
        switch (ranking){
            case 1:
                System.out.println("전액 장학급");
                break;
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #2");

        // case 2 와 3 을 통합
        ranking = 2;
        switch (ranking){
            case 1:
                System.out.println("전액 장학급");
                break;
            case 2: // break 가 없으면 다음 문장이 실행됨
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #3");

        // 중고상품의 등급에 따른 가격을 책정 (1급 : 최상, 4금 : 최하)
        int grade = 1; // 등급
        int price = 7000; // 기본 가격
        switch (grade){
            case 1:
                price += 1000; // price = price + 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격 : " + price + "원");
        // 1등급 제품의 가겨 : 10000원
        // 2등급 제품의 가격 : 9000원

        // Case 문은 명확한 케이스가 있는 경우에 쓰면 좋고
        // If Else 문은 여러 조건 또는 범위에 해당하는 조건인 경우에 사용하면 좋음
    }
}
