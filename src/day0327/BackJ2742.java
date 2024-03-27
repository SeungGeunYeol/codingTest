package day0327;

import java.io.*;

public class BackJ2742 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bf.readLine());

        bf.close();

        for (int i = N; i > 0; i--) {
            bw.write(i + "\n");
        }

        bw.flush();
        bw.close();


    }
}
