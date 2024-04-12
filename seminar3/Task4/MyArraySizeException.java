package seminar3.Task4;

public class MyArraySizeException extends NumberFormatException{
    public MyArraySizeException (){
        super("Размер двумерного массива должен быть 4х4");
    }

    public MyArraySizeException (int row, int column){
        super("Размер двумерного массива должен быть 4х4, у вас (" + row + ", " + column + ")");
    }
}
