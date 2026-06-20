import java.util.Scanner;

public class BabyLion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lionCount = 0;

        while (lionCount < 5) {
            System.out.print("저장할 아기사자 수를 5 이상 입력해주세요: ");
            lionCount = sc.nextInt();

            if (lionCount < 5) {
                System.out.println("[오류] 5 이상 입력해주세요.");
            }
        }

        sc.nextLine();

        String[] lions = new String[lionCount];

        System.out.println("아기사자 이름을 입력해주세요.");
        for (int i = 0; i < lionCount; i++) {
            lions[i] = sc.nextLine();
        }

        System.out.println("아기사자 명단을 최종적으로 출력합니다.");
        for (int i = 0; i < lionCount; i++) {
            System.out.println((i + 1) + ". " + lions[i]);
        }
    }
}