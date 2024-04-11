public class Task4 {
    public static void main(String[] args) {
        Integer[] arr = { 1, null, 4, 2, 4, null };
        checkArray(arr);
    }

    public static void checkArray(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null)
                System.out.println("Найден элемент равный null с индексом " + i);
        }
    }
}
