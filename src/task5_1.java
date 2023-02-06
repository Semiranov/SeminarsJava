//Шахматную доску размером NxN обойти конём так,
//чтобы фигура в каждой клетке была строго один раз.
public class task5_1 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        go(1, array, 2, 2);


    }

    public static void go(int number, int[][] field, int x, int y) {
        if (x < 0 || y < 0 || x >= field[0].length || y >= field.length) return;
        if (field[y][x] != 0) return;
        field[y][x] = number;
        if (number == field[0].length * field.length) {
            printArray(field);
            System.exit(0);
        }
        go(number + 1, field, x + 1, y - 2);
        go(number + 1, field, x - 1, y - 2);
        go(number + 1, field, x + 1, y + 2);
        go(number + 1, field, x - 1, y + 2);
        go(number + 1, field, x + 2, y - 1);
        go(number + 1, field, x - 2, y - 1);
        go(number + 1, field, x + 2, y + 1);
        go(number + 1, field, x - 2, y + 1);
        field[y][x] = 0;
    }

    private static void printArray(int[][] array) {
        for (int[] arr : array) {
            for (int cell : arr) {
                System.out.printf("%2d ", cell);
            }
            System.out.println();

        }
    }
}
