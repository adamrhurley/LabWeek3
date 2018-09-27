public class Message {
        private String  message;
        private String recipient;
        private String sender;

        public String getMessage(){return message;}
        public void setMessage(String message) { this.message = message;}

    @Override
    public String toString() {
        return "Message: " + message;
    }}

