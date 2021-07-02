import java.util.Random;
import java.util.Scanner;

public class HW4 {
    static char[][] map;

    static final int SIZE = 3;
    static final char DOT_X = 'X';
    static final char DOT_O = '0';
    static final char DOT_EMPTY = '.';

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();

            if (checkWin(DOT_X)) {
                System.out.println("ПОБЕДА");
                break;
            }
            if (isFull()) {
                System.out.println("НИЧЬЯ");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("ТЫ ПРОИГРАЛ");
                break;
            }
            if (isFull()) {
                System.out.println("НИЧЬЯ");
                break;
            }

        }


    }


    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("input Y X");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;

        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;

    }

    public static void aiTurn() {
        int x, y;
        do {
            x = sc.nextInt(SIZE);
            y = sc.nextInt(SIZE);

        } while (!isCellValid(x, y));
        map[y][x] = DOT_O;

    }


    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        return map[x][y] == DOT_EMPTY;
    }


    public static boolean checkWin(char c) {
        for (int i = 0; i < 3; i++)
            if ((map[i][0] == c && map[i][1] == c &&
                    map[i][2] == c) ||
                    (map[0][i] == c && map[1][i] == c &&
                            map[2][i] == c))
                return true;
        if ((map[0][0] == c && map[1][1] == c &&
                map[2][2] == c) ||
                (map[2][0] == c && map[1][1] == c &&
                        map[0][2] == c))
            return true;
        return false;
    }

    public static boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }

        }
        return true;

    }


}

