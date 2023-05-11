package chap_05;
// 신발 사이즈는 250 부터 295 까지 5 단위로 증가
// 신발 사이즈 수는 총 10가지
public class _Quiz_05 {
    public static void main(String[] args) {
        //int size[] = {250, 255, 260, 265, 270, 275, 280, 285, 290, 295};

        //for (int i = 0; i < size.length; i++) {
        //    System.out.println("사이즈 " + size[i] + " (재고있음)");
        //}

        int[] size = new int[10];
        for (int i = 0; i < size.length; i++) {
            size[i] = 250 + (5 * i);
            System.out.println("사이즈 " + size[i] + " (재고있음)");
        }

        //for (int size1 : size) {
          //  System.out.println("사이즈 " + size + " (재고있음)");
        //}
    }
}
