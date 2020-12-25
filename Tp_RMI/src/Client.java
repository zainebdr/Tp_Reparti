import java.rmi.Naming;
import java.util.Scanner;


public class Client {


    public static void main(String[] args) {
        try {
            MyInterface srvc = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");

            System.out.println("saisir votre solde");
            Scanner sc =new Scanner(System.in);
            Double s =sc.nextDouble();
            System.out.println("solde initial : "+srvc.lireSolde(s));
            System.out.println("saisir montant à debiter");
           Double x =sc.nextDouble();
           if ((srvc.debiter(s,x))==-1) {
               System.out.println("montant invalid");
           } else
               {
            System.out.println("montant apres debiter "+srvc.debiter(s,x));}

            System.out.println("saisir le montant à créditer");
            Double y =sc.nextDouble();
            System.out.println("montant apres crediter "+srvc.crediter(srvc.debiter(s,x),y));


        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e.toString());
        }
    }

}