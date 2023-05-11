package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "집";
        int hour = 4;

        System.out.println(name + "가고 싶다.");
        System.out.println(name + hour + "일 남음");

        double score = 90.5;
        char grade = 'A';
        name = "강백호";
        System.out.println(name + "평균 점수는 " + score + "점입니다.");
        System.out.println("학접은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험의 합격했을까요? " + pass);

        double d = 3.14123456789;
        float f = 3.14123456789f;
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000l;
        l = 1_000_000_000_000l;
        System.out.println(l);
    }
}
