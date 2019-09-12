import java.io.InputStream;
import java.net.Socket

public MyObject {
  public int field;
  MyObject(int field) {
    this.field = field;
  }
}
public MyObject deserialize(Socket sock) {
  try(ObjectInputStream in = new ObjectInputStream(sock.getInputStream())) {
    return (MyObject)in.readObject();
  }
}
