package HomeWork2;

public class Main {
    public static int SIZE = 4;

    public static void main(String[] args) {
        String[][] numbersInWords = {
                {"13", "23", "32", "8"},
                {"11", "22", "33", "37"},
                {"73", "24", "15", "12"},
                {"43", "46", "72", "17"}
        };
        try {
            System.out.println(var(numbersInWords));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataExcemption e) {
            e.printStackTrace();
        }

        System.out.println("End!");
    }

    static int var(String[][] numbersInWords) throws MyArrayDataExcemption, MyArraySizeException {
        if (numbersInWords.length != SIZE) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < numbersInWords.length; i++) {
            if (numbersInWords[i].length != SIZE) {
                throw new MyArraySizeException();
            }
        }
        int var = 0;
        for (int i = 0; i < numbersInWords.length; i++) {
            for (int j = 0; j < numbersInWords[i].length; j++) {
                try {
                    var += Integer.parseInt(numbersInWords[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataExcemption("wrong format " + i + " " + j, i, j);
                }
            }
        }
        return var;
    }
}

