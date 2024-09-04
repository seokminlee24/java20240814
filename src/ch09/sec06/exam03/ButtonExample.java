package ch09.sec06.exam03;

public class ButtonExample {
    public static void main(String[] args) {
        Button bunOk = new Button();

        class OkListener implements Button.ClickListener{
            @Override
            public void onClick() {
                System.out.println("Ok 버튼을 클릭했습니다.");
            }
        }

        bunOk.setClickListener(new OkListener());

        bunOk.click();

        //--------------------------------------------------------

        Button btnCancel = new Button();

        class CancelListener implements Button.ClickListener{
            @Override
            public void onClick() {
                System.out.println("Cansel 버튼 클릭했습니다.");
            }
        }

        btnCancel.setClickListener(new CancelListener());

        btnCancel.click();
    }
}
