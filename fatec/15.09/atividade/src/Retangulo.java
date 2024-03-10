public class Retangulo {
        int largura;
        int altura;

        public void setAltura(int altura){
            this.altura = altura;
        }

        public void setLargura(int largura){
            this.largura = largura;
        }

        public int Area(){
            System.out.println("Area: " + (altura * largura));
            return largura * altura;
        }
}
