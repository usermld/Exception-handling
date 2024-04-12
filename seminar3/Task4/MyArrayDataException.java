package seminar3.Task4;

public class MyArrayDataException extends NumberFormatException{
    public MyArrayDataException() {
        super("Невозможно преобразовать элмент в числовой формат данных");
    }

    public MyArrayDataException(int i, int j){
        super("Невозможно преобразовать элмент в числовой формат данных, находящийся на позиции - (" + i + ", " + j + ")");
    }
}
