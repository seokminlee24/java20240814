package ch06.sol;

public class S15 {
    public static void main(String[] args) {
        MeberService meberService = new MeberService();
        boolean result = meberService.login("hong","12345");
        if (result){
            System.out.println("로그인 되었습니다.");
            meberService.logout("hong");
        }else {
            System.out.println("id 또는 password가 올바르지 않다");
        }
    }
}
class MeberService{

    public boolean login(String id, String paswword) {
        if ("hong".equals(id)&&"12345".equals(paswword)){
            return true;
        }else {
            return false;
        }
    }

    public void logout(String id) {
        System.out.println(STR."\{id}님이 로그아웃 되었습니다.");
    }
}
