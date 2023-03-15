public class Au33xStaticKeyword {
    public static void main(String[] args) {
        // Static = modificador. Uma única cópia de uma varíavel/método é criada e compartilhada
        //          A classe que "é dona" de um membro estático

        // Perceba que sempre que incrementamos uma nova instância da classe, é adicionado 1 ao atributo estático
        Au33y1xFriend friend1 = new Au33y1xFriend("Guilherme");
        Au33y1xFriend friend2 = new Au33y1xFriend("Bob Esponja");
        Au33y1xFriend friend3 = new Au33y1xFriend("Patrick");

        // Podemos acessar os métodos estáticos de uma classe sempre que quisermos
        System.out.println(Au33y1xFriend.numberOfFriends);

        // Podemos acessar os métodos estáticos também pelos objetos que são instanciados
        // porém, é uma má prática e as IDE até mostram erros, sendo não recomendado fazer isso:
        System.out.println(friend1.numberOfFriends);

        // Podemos também criar métodos estáticos, que podem ser acessados mesmo se não instanciarmos um objeto
        Au33y1xFriend.displayFriends();
        
        // Logo, podemos dizer que o modificador static cria uma só cópia de um método ou de uma variável e à compartilha
        // e que para chamar-la, precisamos usar a classe dona.
    }
}
