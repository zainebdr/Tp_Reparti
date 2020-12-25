import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote {

    double debiter(double s,double x)throws RemoteException;
    double crediter(double s , double x)throws RemoteException;
    double lireSolde(double s)throws RemoteException;

}