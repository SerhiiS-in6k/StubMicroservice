import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = "hello from program";
        FileOutputStream fos = new FileOutputStream(new File("/home/sergiish/sergei/Main/out/artifacts/Main_jar/exit.txt"));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fos));
        writer.write("start program");
        writer.flush();
        while (!str.equals("exit")){
            if (str.equals("stop")){
                writer.write(" work stop");
                writer.flush();
            }
            str = bufferedReader.readLine();
        }
    }
}
