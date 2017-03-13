package geometrie;
import java.util.*;

class Test {
    public static void main(String[] args) {
        Cercle c = new Cercle(10, new Point(20,20));
        c.setCouleur(new Couleur(255,0,0));
        System.out.println("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>");
        System.out.println("<svg xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\">");
        System.out.println(c.toStringSVG());
        System.out.println("</svg>");
    }
}
