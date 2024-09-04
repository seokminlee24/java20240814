package ch09.sol.p718s04;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button();
        btnOk.setClickListener(()->System.out.println("Ok 버튼을 클릭했습니다."));
        btnOk.click();

        Button btnCancel = new Button();
        btnCancel.setClickListener(()-> System.out.println("Cansel 버튼을 클릭합니다."));
        btnCancel.click();
    }
}
