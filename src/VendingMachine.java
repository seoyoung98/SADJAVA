public class VendingMachine {
    // 필드 field (가지는 것들)
    // 메소드 method (가지는 기능)
    // 생성자 constructor
    public String pushProductButton(int menuId){
        System.out.println(menuId + "를 전달받았습니다.");
        if(menuId == 1){
            return "콜라";
        } else if (menuId == 2){
            return "사이다";
        } else {
            return "환타";
        }
    }

    public static void printVersion(){
        System.out.println("v 1.0");
    }
}
