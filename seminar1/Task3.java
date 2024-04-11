// Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
// Необходимо посчитать и вернуть сумму элементов этого массива.
// При этом накладываем на метод 2 ограничения: метод может работать только с
// квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать
// только значение 0 или 1.
// Если нарушается одно из условий, метод должен вернуть код ошибки.
// Программа должна корректно обработать код ошибки и вывести соответствующее
// сообщение пользователю

public class Task3 {
    public static void main(String[] args) {
        int[][] matrix = { { 0, 1, 0 }, { 1, 0, 1 }, { 0, 0, 1 } };
        getText(sumElements(matrix));
    }

    public static int sumElements(int[][] matrix) {
        int resultSum = 0;
        if (matrix == null) {
            return -1;
        }
        if (matrix.length != matrix[0].length)
            return -2;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0 && matrix[i][j] != 1) {
                    return -3;
                }
                resultSum += matrix[i][j];
            }
        }
        return resultSum;
    }

    public static void getText(int code) {
        switch (code) {
            case -3:
                System.out.println("элементы отличные от 0 или 1");
                break;
            case -1:
                System.out.println("вместо массива пришел null");
                break;
            case -2:
                System.out.println("массив не квадратный");
                break;
            default:
                System.out.println("сумма элементов массива равна " + code);
        }
    }
}
