public class Message {
        private String  message;
        private String recipient;
        private String sender;


        public Message(String sender, String recipient, String message){
            setSender(sender);
            setRecipient(recipient);
            setMessage(message);
        }

    private void setMessage(String message) {this.message = message;
    }


    private void setRecipient(String recipient) {this.recipient = recipient;}

    private void setSender(String sender) {this.sender = sender;}



    @Override
    public String toString() {
        //returjning object state directly via attributes
        return "\n\nSender: "+ sender + "\nRecipent: " + recipient +
                "\n" + message;
       // public String getMessage(){return message;}
        //public void setMessage(String message) { this.message = message;}

   // @Override
    //public String toString() {
//        return "Message: " + message;}
}}

