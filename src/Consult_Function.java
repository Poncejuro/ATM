
public class Consult_Function extends Principal_Functions{
    @Override //se hereda el método para sobreescribir su constructor y generar una  nueva lógica
    public void Transactions(){
        System.out.println("-----------------------------------------------");
        System.out.println("Tu saldo actual es: $" + getBalance());
        System.out.println("-----------------------------------------------");
    }
}
