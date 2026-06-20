package package2;

import package1.Lion;

public class Step3 {
    public static void main(String[] args) {
        Lion lion = new Lion("이여재", "항공소프트웨어공학", 22);

        System.out.println("아기사자 객체를 생성합니다.");
        lion.printInfo();

        System.out.println();
        System.out.println("Step 3-1. public 필드 접근을 시도합니다.");
        lion.name = "박찬우";
        System.out.println("name 필드 값을 변경합니다.");
        System.out.println("public 필드 접근 성공");
        lion.printInfo();

        System.out.println();
        System.out.println("Step 3-2. default 필드 접근을 시도합니다.");
        //lion.major = "소프트웨어공학과";

        System.out.println();
        System.out.println("Step 3-3. private 필드 접근을 시도합니다.");
        //lion.generation = 15;
    }
}