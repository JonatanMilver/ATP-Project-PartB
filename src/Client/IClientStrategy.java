package Client;

import java.io.InputStream;
import java.io.OutputStream;

public interface IClientStrategy {
    void clientStrategy(InputStream inFromClient , OutputStream outToServer);
    
}
