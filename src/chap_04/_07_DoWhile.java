package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        // 반복문 DoWhile
        int distance = 25; // 전체 거리 25m
        int move = 0; // 현재 이동 거리 0m
        int height = 2; // 키 2m
        while(move + height < distance){
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }
        System.out.println("도착했습니다.");

        System.out.println("----- 반복문 #1 -----");

        // 키가 엄청나게 큰 사람?
        move = 0;
        height = 25; // 키가 25m
        while(move + height < distance){ // 처음부터 조건이 거짓이라서 while문 안에 문장이 실행되지 않음
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }
        System.out.println("도착했습니다.");

        System.out.println("----- 반복문 #2 -----");

        // Do While 반복문
        //do{
            // 먼저 수행하고 난 뒤 조건 확인 일단 한번은 실행됨
        //} while ( 조건 );
        do{
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        } while (move + height < distance); // 조건이 참일 동안 실행
        System.out.println("도착했습니다.");
    }
}
