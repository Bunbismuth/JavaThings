public class Au33y1xFriend {
    String name;
    static int numberOfFriends;
    Au33y1xFriend(String name){
        this.name = name;
        numberOfFriends++;
    }

    static void displayFriends(){
        System.out.println("Você tem " + numberOfFriends + " número de amigos");
    }
}
