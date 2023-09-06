public class Main {
    /*  -Se contemplan que los cajeros solo tienen un pad numérico,
         por lo cual no se hicieron validaciones para inputs alfabéticos y/o especiales
    */
    public static void main(String[] args){
        Principal_Functions message = new Consult_Function(); //  la clase consulta  inicia el programa
        message.setBalance(10_000); //se fija la cantidad de dinero del cajero
        message.operations();  //empieza la interacción
    }
}
