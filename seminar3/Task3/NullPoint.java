package seminar3.Task3;

public class NullPoint extends NullPointerException{
    public NullPoint() {
        super("Обращение к  пустому элементу.");
    }

    public NullPoint(int index){
        super("Обращание к пустому элементу с индексом " + index);
    }
}
