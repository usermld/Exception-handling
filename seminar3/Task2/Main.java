package seminar3.Task2;

import java.io.IOException;

// https://www.notion.so/3f7a62a1ed884f23adb770d6ec157f3f?pvs=4

public class Main {
    public static void main(String[] args) throws IOException {
        try(Count ct = new Count()){
            ct.add();
            ct.add();
            ct.add();
            ct.add();
            ct.add();
            ct.add();
            System.out.println(ct.getCount());
            ct.close();
            ct.add();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
