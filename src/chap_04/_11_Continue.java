package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue

        // 치킨 주문 손님중에 노쇼 손님이 있다고 가정
        // For 문
        int max = 20; // 최대 치킨 판매 수량
        int sold = 0; // 현재 치킨 판매 수량
        int noShow = 17; // 대기번호 17번 손님이 노쇼
        for (int i = 1; i <= 50 ; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");

            // 손님이 없다면? (noShow)
            if (i == noShow){
                System.out.println(i + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue; // 즉시 동작을 멈추고 다음 동작을 실행함
            }

            sold++; // 판매처리
            if (sold == max){
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");

        System.out.println("--------------------");

        // While 문
        sold = 0;
        int index = 1;
        //while (index <= 50){ // 특정 조건에서 반복문을 탈출하는 break 가 있기 때문에 조건이 없어도 됨
        while (true){ // 무한반복이지만 특정 조건에서 반복문을 탈출하는 break 가 있어서 이렇게 써도 됨
            System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");

            // 손님이 없다면 (noShow)
            if (index == noShow){
                System.out.println(index + "번 소님, 노쇼로 인해 다음 손님에게 기회가 주어집니다.");
                index++;
                continue; // 밑에 있는 문장이 실행이 안되서 index 증감이 되지 않음
            }

            sold++; // 판매처리
            if (sold == max){
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
            index++;
        }
        System.out.println("영업을 종료합니다.");
    }
}
