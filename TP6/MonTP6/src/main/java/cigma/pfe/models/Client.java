package cigma.pfe.models;
import lombok.Getter;

public class Client {
public long id;
public String name;
public Client(long id, String name) {
this.id = id;
this.name = name;
}
public Client() {
}
}
