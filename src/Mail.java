import java.util.Scanner;

public class Mail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean isValidChoice = false;
        boolean isValidNum = false;
        boolean isValidIndex = false;
        int row;

        do {
            System.out.print("Nhập số lượng hàng: ");
            row = scanner.nextInt();
            if (row >= 0 && row <= 10) {
                isValidNum = true;
            } else {
                System.out.println("Đâu vao không hợp lệ. Tối thiểu là 0 và tối đa là 10");
            }
        } while (!isValidNum);

        double[][] demoArray = new double[row][row];
        do {
            System.out.println("1. Nhập phần tử");
            System.out.println("2. Ngẫu nhiên");
            System.out.print("Nhập sự lựa chọn: ");
            choice = scanner.nextInt();
            if (choice == 1 || choice == 2) {
                isValidChoice = true;
            } else {
                System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại!");
            }
        } while (!isValidChoice);

        switch (choice) {
            case 1:
                NumberArray.addElement(demoArray);
                break;
            case 2:
                NumberArray.randomElement(demoArray);
                break;
        }
        System.out.println();
        System.out.println("Đây là mảng của bạn: ");
        NumberArray.displayArray(demoArray);

        double totalDiag = NumberArray.sumDiagonal(demoArray);
        System.out.printf("Summarize of diagonal is %f", totalDiag);
        System.out.println();
    }
}
