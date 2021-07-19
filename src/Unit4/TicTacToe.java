package Unit4;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] field = new char[4][4];
        int x, y, count;
        final char COR_X = 'x';
        final char COR_O = '0';
        final char EMPTY = '~';
        boolean flag = false, flag1 = false;

        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                field[i][j] = EMPTY;
            }
        }

        while (true)
        {
            do {
                System.out.println("Ход 1-ого игрока:");
                System.out.println("Введите координаты клетки (1..4) -->");
                x = input.nextInt() - 1;
                y = input.nextInt() - 1;
            } while ((x < 0) || (y < 0) || (x > 3) || (y > 3));
            field[x][y] = COR_X;

            for (int i = 0; i < 4; i++)
            {
                if (((field[i][0] == COR_X) && (field[i][1] == COR_X) && (field[i][2] == COR_X) &&
                        (field[i][3] == COR_X)) || ((field[0][i] == COR_X) && (field[1][i] == COR_X) &&
                        (field[2][i] == COR_X) && (field[3][i] == COR_X)))
                {
                    System.out.println("ВЫ ВЫИГРАЛИ!");
                    flag = true;
                }
            }

            if (flag)
            {
                break;
            }

            if (((field[0][0] == COR_X) && (field[1][1] == COR_X) && (field[2][2] == COR_X) &&
                    (field[3][3] == COR_X)) || ((field[3][0] == COR_X) && (field[2][1] == COR_X) &&
                    (field[1][2] == COR_X) && (field[0][3] == COR_X)))
            {
                System.out.println("ВЫ ВЫИГРАЛИ!");
                break;
            }

            count = 0;
            for (int i = 0; i < 4; i++)
            {
                for (int j = 0; j < 4; j++)
                {
                    if (field[i][j] != EMPTY)
                    {
                        flag1 = true;
                        count++;
                    }
                }
            }

            if (flag1 && count == 16)
            {
                System.out.println("НИЧЬЯ!");
                break;
            }

            do {
                System.out.println("\n----------------------------------");
                System.out.println("Ход 2-ого игрока:");
                System.out.println("Введите координаты клетки (1..4) -->");
                x = input.nextInt() - 1;
                y = input.nextInt() - 1;
            } while ((x < 0) || (y < 0) || (x > 3) || (y > 3));
            field[x][y] = COR_O;

            for (int i = 0; i < 4; i++)
            {
                for (int j = 0; j < 4; j++)
                {
                    System.out.print(" " + field[i][j] + " ");
                }
                System.out.println();
            }

            for (int i = 0; i < 4; i++)
            {
                if (((field[i][0] == COR_O) && (field[i][1] == COR_O) && (field[i][2] == COR_O) &&
                        (field[i][3] == COR_O)) || ((field[0][i] == COR_O) && (field[1][i] == COR_O) &&
                        (field[2][i] == COR_O) && (field[3][i] == COR_O)))
                {
                    System.out.println("ВЫ ВЫИГРАЛИ!");
                    flag = true;
                }
            }

            if (flag)
            {
                break;
            }

            if (((field[0][0] == COR_O) && (field[1][1] == COR_O) && (field[2][2] == COR_O) &&
                    (field[3][3] == COR_O)) || ((field[3][0] == COR_O) && (field[2][1] == COR_O) &&
                    (field[1][2] == COR_O) && (field[0][3] == COR_O)))
            {
                System.out.println("ВЫ ВЫИГРАЛИ!");
                break;
            }

            count = 0;
            for (int i = 0; i < 4; i++)
            {
                for (int j = 0; j < 4; j++)
                {
                    if (field[i][j] != EMPTY)
                    {
                        flag1 = true;
                        count++;
                    }
                }
            }

            if (flag1 && count == 16)
            {
                System.out.println("НИЧЬЯ!");
                break;
            }
        }

        System.out.print("**************************************");
        System.out.print("\nИГРА ОКОНЧЕНА!\n");
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                System.out.print(" " + field[i][j] + " ");
            }
            System.out.println();
        }
    }
}
