import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements MyInterface {

    public Server() throws RemoteException {}


    public double debiter(double s, double x) {
        if(s>=x)
            return s-=x;
        else
            return -1;
    }
    public double crediter(double s, double x) {
        return s+x ;
    }
    public double lireSolde(double s) {
        return s ;
    }


    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Server server = new Server();

        java.rmi.registry.LocateRegistry.createRegistry(1250);

        Naming.rebind("rmi://127.0.0.1:1250/server", server);
    }
}