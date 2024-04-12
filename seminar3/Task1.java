package seminar3;

/*Создайте метод doSomething(), который может быть источником одного из
типов checked exceptions (тело самогометода прописывать не обязательно).
Вызовите этот метод из main и обработайте в нем исключение, которое
вызвалметод doSomething().
*/

public class Task1 {
    public static void main(String[] args) {

        try{
            doSomething();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        
    }

    public static void doSomething() throws ArithmeticException{
        throw new ArithmeticException();
    }

}
