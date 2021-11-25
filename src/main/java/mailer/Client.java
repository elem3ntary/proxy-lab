package mailer;

import lombok.Getter;
import lombok.Setter;

public class Client {
    private static int lastId = 0;
    @Getter
    private int id;

    @Getter @Setter
    private String name;
    @Getter @Setter
    private int age;
    @Getter @Setter
    private Sex sex;


    public Client(){
        id = ++lastId;
    }


}
