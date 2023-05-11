package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // 배열의 순회
        String[] coffees = { "아메리카노" , "카페모카" , "라떼" , "카푸치노" };

        // for 반복문 순회
        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("-------------------------------");

        // 배열의 길이를 이용한 순회
        // .length 크기를 알려줌
        // 인덱스의 값을 이용하여 처리할때 사용하면 좋음
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("-------------------------------");

        // enhanced for (for-each) 반복문
        // 배열의 모든 요소를 순회하며 사용할 때 좋음
        for (String coffee /*순회할때마다 이 변수에 값을 저장하여 사용*/: coffees/*순회할 배열 이름*/) {
            System.out.println(coffee + " 하나");
        }
        System.out.println("주세요");
    }
}
