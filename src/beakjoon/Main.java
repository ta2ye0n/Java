package beakjoon;

import java.io.BufferedReader; // 한 라인을 읽기 때문에 StringTokenizer를 통해 공백 단위 데이터 가공이 필요
import java.io.BufferedWriter;
import java.io.IOException; // BufferedReader를 사용하면 IOExcption이나 try catch문을 사용해서 예외처리를 해줘야 함
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer; // 공백 단위 데이터 가공
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // 백준 11022번
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            System.out.println("Case #"+(i+1)+": "+ a + " + " + b + " = " + (a + b));
        }
        in.close();

        // 백준 11021번
//        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
//
//        int a = Integer.parseInt(br.readLine());
//
//        StringBuilder sb = new StringBuilder();
//        StringTokenizer st;
//
//        for (int i = 1; i <= a; i++) {
//            st = new StringTokenizer(br.readLine()," ");
//            sb.append("Case #").append(i).append(": ")
//                    .append(Integer.parseInt(st.nextToken())
//                            +Integer.parseInt(st.nextToken())).append('\n');
//        }
//        br.close();
//        System.out.println(sb);

        // 백준 15552번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//
//        int N = Integer.parseInt(br.readLine());
//
//        StringTokenizer st;
//
//        for (int i = 0; i < N; i++) {
//            st = new StringTokenizer(br.readLine()," ");
//            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
//        }
//        br.close();
//
//        bw.flush(); // 남아있는 데이터를 모두 출력
//        bw.close(); // 출력 후 close로 닫음

    }
}
//test