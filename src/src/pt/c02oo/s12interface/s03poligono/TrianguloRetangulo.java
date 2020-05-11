package pt.c02oo.s12interface.s03poligono;

public class TrianguloRetangulo implements Retangular {
   private int altura;
   private int largura;
   
   public TrianguloRetangulo(int altura, int largura) {
       this.altura = altura;
       this.largura = largura;
   }

   public int getAltura() {
       return altura;
   }
   
   public int getLargura() {
       return largura;
   }
   
   public float getArea() {
       return getAltura() * getLargura() / 2;
   }
   
   public boolean sameProportions(Retangular toCompare) {
      return (largura / altura == toCompare.getLargura() / toCompare.getAltura());
   }
}