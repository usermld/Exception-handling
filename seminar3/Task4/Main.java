package seminar3.Task4;

public class Main {
    public static void main(String[] args) {
        String[][] arr = {{"12","23", "12","23"}, 
                         {"1", "5", "12","23"}, 
                         {"2", "7", "12","23"}, 
                         {"3", "5", "6","23"}};

        System.out.println(summArray(arr));
    }

    public static int summArray(String[][] arr){
        if(arr.length !=4 || arr[0].length != 4){
            throw new MyArraySizeException(arr.length, arr[0].length);
        }
        int resultSumm = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                try{
                    resultSumm += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return resultSumm;
    }
}
