package ch09.sol.s07;

public class Chatting {
    class Chat{
        void start(){}
            void sendMessage(String message){}
    }

    void startChat(String chatId){
        String nickName = chatId;


        Chat chat = new Chat(){
            @Override
            void start() {
                while (true){
                    String inputData = "안녕하세여";
                    String message = "[" + nickName +"] " +inputData;
                    sendMessage(message);
                }
            }
        };
        chat.start();
    }
}
