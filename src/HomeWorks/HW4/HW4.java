package HomeWorks.HW4;
import java.util.Random;
import java.util.Scanner;
/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 24.01.2022
 *
 * Subsequent changes when doing homework by Yuriy Lomtev 26/01/2022:
 * 1. Полностью разобраться с кодом,
 * 2. Попробовать переписать с нуля;
 * 3. Усовершенствовать метод проверки победы (через циклы);
 * 4.* Поле до 5х5 и в качестве условий победы установить серию равной 4.
 * 5.* Проработать базовый искусственный интеллект, чтобы он мог блокировать ходы игрока.
 * !!!Рубрика для ленивых: - сдать код с урока.
 */
public class HW4 {

    public static char [][] field;
    public static int fieldWidth;
    public static int fieldHeight;
    public static int lengthWinningLine;

    public static char playerOne = 'X';
    public static char playerTwo = 'O';
    public static char empty = '_';

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        createField();
        showField();

        while(true) {
            stepPlayerOne();
            showField();

            if (checkWinLine(playerOne)) {
                System.out.println(playerOne + " is win!");
                break;
            }

            if (checkFullField()) {
                System.out.println("Sorry, game draw");
                break;
            }

            stepPlayerTwo();
            showField();

            if (checkWinLine(playerTwo)) {
                System.out.println(playerTwo + " is win!");
                break;
            }

            if (checkFullField()) {
                System.out.println("Sorry, game draw");
                break;
            }
        }
        System.out.println("Game over!");
    }
    public static void createField() {
        fieldWidth = inputUserValue("Enter size field");
        fieldHeight = fieldWidth;
        if (fieldWidth == 5) { 
           lengthWinningLine = fieldWidth-1; // длина победной линии на 1 мешьше размеров поля для полей больше 4 (или вводим?)
        }
        else {
            lengthWinningLine = fieldWidth;
        }
        field = new char[fieldHeight][fieldWidth];

        for (int y = 0; y < fieldHeight; y++) {
            for (int x = 0; x < fieldWidth; x++) {
                field[y][x] = empty;
            }
        }
    }
    public static void showField() {
        for (int y = 0; y < fieldHeight; y++) {
            for (int x = 0; x < fieldWidth; x++) {
                System.out.print(field[y][x] + "|");
            }
            System.out.println();
        }
        System.out.println("----------");
    }
    public static void stepPlayerOne() {
        int x;
        int y;

        do {
            x = inputUserValue("Enter your X-coordinate") - 1;
            y = inputUserValue("Enter your Y-coordinate") - 1;
        } while (!checkStepPlayer(y, x) || !checkCellFree(y, x));

        field[y][x] = playerOne;
    }
    public static void stepPlayerTwo() {
        int x;
        int y;

        do {
            x = random.nextInt(fieldWidth);     // п.5 ДЗ - сделать ходы более осмысленными
            y = random.nextInt(fieldHeight);    // Проработать базовый искусственный интеллект, чтобы он мог блокировать ходы игрока
        } while (!checkCellFree(y, x));         // пока идея: аналогично checkWinLine4from5 (кроме коротких диагоналей)
                                                // т.е. если true, то ставить, после checkCellFree, 0 в пустую ячейку
                                                // в этой проверке серии и блокировать победную серию
        field[y][x] = playerTwo;
    }
    public static boolean checkCellFree(int y, int x) {
        return field[y][x] == empty;
    }
    public static boolean checkStepPlayer(int y, int x) {
        return x >= 0 && x < fieldWidth && y >= 0 && y < fieldHeight;
    }
    public static int inputUserValue(String systemMsg) {
        System.out.print(systemMsg + " > ");
        return scanner.nextInt();
    }
//п.3. ДЗ Усовершенствовать метод проверки победы (через циклы): для 3: 3+3+2=8, для 4: 4+4+2=10
// использовать размеры поля и "победную длину"
// Поле до 5х5 и в качестве условий победы установить серию равной 4 - число проверок (5+5+2)*2+2+2=28
    public static boolean checkWinLine(char playerChar) {
//        if (field[0][0] == playerChar && field[0][1] == playerChar && field[0][2] == playerChar) return true;
//        if (field[1][0] == playerChar && field[1][1] == playerChar && field[1][2] == playerChar) return true;
//        if (field[2][0] == playerChar && field[2][1] == playerChar && field[2][2] == playerChar) return true;
//
//        if (field[0][0] == playerChar && field[1][0] == playerChar && field[2][0] == playerChar) return true;
//        if (field[0][1] == playerChar && field[1][1] == playerChar && field[2][1] == playerChar) return true;
//        if (field[0][2] == playerChar && field[1][2] == playerChar && field[2][2] == playerChar) return true;
//
//        if (field[0][0] == playerChar && field[1][1] == playerChar && field[2][2] == playerChar) return true;
//        if (field[0][2] == playerChar && field[1][1] == playerChar && field[2][0] == playerChar) return true;

        if (lengthWinningLine < fieldWidth) {    // только для размера=5, победная серия=4, 4 полные короткие диагонали
                                                // ниже это же условие для проверки по обычным праввилам серии в 4 ячейки
            if (field[0][1] == playerChar && field[1][2] == playerChar && field[2][3] == playerChar && field[3][4] == playerChar) return true;
            if (field[1][0] == playerChar && field[2][1] == playerChar && field[3][1] == playerChar && field[4][3] == playerChar) return true;
            if (field[0][3] == playerChar && field[1][2] == playerChar && field[2][1] == playerChar && field[3][0] == playerChar) return true;
            if (field[1][4] == playerChar && field[2][3] == playerChar && field[3][2] == playerChar && field[4][1] == playerChar) return true;
        }
        int countWin;
            for (int y=0; y < fieldHeight; y++) {   // по строкам
            countWin=0;
            for (int x = 0; x < fieldWidth; x++) {
                if (lengthWinningLine < fieldWidth) {
                    if (field[y][x] == playerChar) {
                        countWin++;
                        if (countWin == lengthWinningLine && (field[y][fieldWidth - 1] != playerChar || field[y][0] != playerChar)) {
                            return true;
                        }
                    }
                }
                else {
                        if (field[y][x] != playerChar) { break; }
                        else if (x == fieldWidth - 1)  { return true; }
                    }
            }
        }
        for (int x=0; x < fieldWidth; x++) {        // по столбцам
            countWin=0;
            for (int y = 0; y < fieldHeight; y++) {
                if (lengthWinningLine < fieldHeight) {
                    if (field[y][x] == playerChar) {
                        countWin++;
                        if (countWin == lengthWinningLine && (field[fieldHeight-1][x] != playerChar || field[0][x] != playerChar)) {
                            return true;
                        }
                    }
                }
                else {
                    if (field[y][x] != playerChar) { break; }
                    else if (y == fieldHeight - 1) { return true; }
                }
            }
        }
        Boolean check = true;
        countWin=0;
        for (int w = 0; w < fieldWidth; w++) {     // по диагонали 1
            for (int h = 0; h < fieldHeight; h++) {
               if (w == h) {
                   if (lengthWinningLine < fieldHeight) {
                       if (field[h][w] == playerChar) {
                           countWin++;
                           if (countWin == lengthWinningLine && (field[0][0] != playerChar || field[fieldHeight - 1][fieldWidth - 1] != playerChar)) {
                               return true; }
                       }
                   }
                   else {
                       if (field[h][w] != playerChar)         { check = false; }
                       else if (w == fieldWidth - 1 && check) { return true;   }
                   }
               }
            }
         }
        check=true;
        countWin=0;
        for (int w = fieldWidth-1; w > -1; w--) {     // по диагонали 2
            for (int h = 0; h < fieldHeight; h++) {
                if (lengthWinningLine < fieldHeight) {
                    if (h == fieldWidth - w - 1) {
                        if (field[h][w] == playerChar) {
                            countWin++;
                            System.out.println(countWin);
                            if (countWin == lengthWinningLine && (field[fieldHeight - 1][0] != playerChar || field[0][fieldWidth - 1] != playerChar)) {
                                return true;
                            }
                        }
                    }
                    } else {
                    if (h == fieldWidth - w - 1) {
                        if (field[h][w] != playerChar) {
                            check = false;
                        } else if (w == 0 && check) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    public static boolean checkFullField() {
        for (int y = 0; y < fieldHeight; y++) {
            for (int x = 0; x < fieldWidth; x++) {
                if (field[y][x] == empty) {
                    return false;
                }
            }
        }
        return true;
    }
}
