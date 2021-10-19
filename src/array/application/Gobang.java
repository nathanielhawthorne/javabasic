package array.application;

import java.util.Scanner;

//Java��Ŀʵս����������Ϸ������Դ��ͽ�����
public class Gobang {
    // �������̵Ĵ�С
    public static int BOARD_SIZE = 15;
    // ����һ����ά�������䵱����
    public static String[][] board = new String[BOARD_SIZE][BOARD_SIZE];

    String black = "��"; // ����
    String white = "��"; // ����

    /**
     * ��ʼ��е������
     */
    public void initBoard() {

        // ��ÿ��Ԫ�ظ�Ϊ"��"�������ڿ���̨��������
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = "��";
            }
        }
    }

    /**
     * �ڿ���̨������̵ķ���
     */
    public void printBoard() {
        // ��ӡ��������Ԫ��
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                // ��ӡ����Ԫ�غ󲻻���
                System.out.print(board[i][j]);
            }
            // ����ӡ��һ������Ԫ�غ����һ�����з�
            System.out.print("\n");
        }
    }

    /**
     * �ж���Ӯ�ķ���
     */
    public static boolean isWin(int x, int y, String color) {
        if (color.equals("black")) {
            color = "��";
        }
        if (color.equals("white")) {
            color = "��";
        }
        // ����
        for (int i = 0; i < board.length - 5; i++) {
            if (board[x][i].equals(color) && board[x][i + 1].equals(color) && board[x][i + 2].equals(color)
                    && board[x][i + 3].equals(color) && board[x][i + 4].equals(color)) {
                return true;
            }
        }
        // ����
        for (int i = 0; i < board.length - 5; i++) {
            if (board[i][y].equals(color) && board[i + 1][y].equals(color) && board[i + 2][y].equals(color)
                    && board[i + 3][y].equals(color) && board[i + 4][y].equals(color)) {
                return true;
            }
        }
        return false;
    }

    /**
     * �ж�ָ�������Ƿ�������
     */
    public static boolean isOk(int x, int y) {
        if (!board[x - 1][y - 1].equals("��")) {
            return false;
        }
        return true;
    }

    /**
     * ��������
     */
    public static String computer(String color) {

        int x = (int) (Math.random() * 14) + 1; // ����һ��1~14֮��������
        int y = (int) (Math.random() * 14) + 1; // ����һ��1~14֮��������
        // �жϵ�������������������ӣ������������������������
        if (isOk(x, y)) {
            if (color.equals("black")) {
                board[x][y] = "��";
            } else if (color.equals("white")) {
                board[x][y] = "��";
            }
        } else {
            computer(color);
        }
        return "x,y";
    }

    public static void main(String[] args) throws Exception {
        Gobang gb = new Gobang();
        gb.initBoard();
        gb.printBoard();
        // �������ڻ�ȡ��������ķ���
        Scanner input = new Scanner(System.in); // ʹ��Scanner���ȡ�û�����
        System.out.println("����Ҫѡ��ʲô��ɫ���壬black��white�������룺");
        String peopleColor = input.next(); // �����û�ѡ�����ӵ���ɫ�������û�������ַ���
        // ����û�ѡ����ǰ��壬��������£��������к������£�
        if (peopleColor.equals("white")) {
            System.out.println("��ѡ����ǰ���");
            computer("black");
            gb.printBoard();
        }
        String inputStr;
        do {
            System.out.println("��������������꣬Ӧ��x,y�ĸ�ʽ��");
            inputStr = input.next();
            // �������鲢��ֵ����x��,y
            String[] posStrArr = inputStr.split(",");
            int x = Integer.parseInt(posStrArr[0]);
            int y = Integer.parseInt(posStrArr[1]);
            // ������������������ӣ���������������
            if (!isOk(x, y)) {
                System.out.println("�˴��������ӣ��뻻λ�ã�");
                continue;
            }
            // ������ָ����Ժ���ַ���ת�����û����������
            int xPos = x;
            int yPos = y;

            // �������������ɫ
            String comColor = null;
            // �����û�ѡ���������ɫ����Ӧ������Ԫ�ظ�ֵ
            if (peopleColor.equals("black")) {
                gb.board[xPos - 1][yPos - 1] = "��";
                comColor = "white";
            } else if (peopleColor.equals("white")) {
                gb.board[xPos - 1][yPos - 1] = "��";
                comColor = "black";
            }
            computer(comColor);
            gb.printBoard();
            // �ж���Ӯ
            if (isWin(xPos - 1, yPos - 1, peopleColor)) {
                System.out.println(peopleColor + "��ʤ��");
                break;
            }
            if (isWin(xPos - 1, yPos - 1, comColor)) {
                System.out.println(comColor + "��ʤ��");
                break;
            }
        } while (inputStr != null);
    }
}
