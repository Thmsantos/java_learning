public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Concessionaria carro = new Concessionaria();

        /* carro.ano = 2001;
        carro.modelo = "gol";
        carro.marca = "fiat"; */
        /* System.out.println("Modelo: " + carro.modelo);
        System.out.println("Ano: " + carro.ano);
        System.out.println("Marca: " + carro.marca); */

        carro.setAno(2001);
        carro.setMarca("fiat");
        carro.setModelo("onix");

        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Ano: " + carro.getAno());

    }
}
