/**
* @author Bello
*<p>ver 1<p>
* classe BelloFigura 2
* eredita metodi classe <b>Quadrato</b>
*
*
*/

//CALCOLO AREA E RAGGIO DEL QUADRATO

public class Quadrato  {
private float lato;


//COSTRUTTORE
public Quadrato(float lato) {
this.lato = lato;
}
public float getLato() {
return lato;
}

public void setLato(float lato) {
this.lato = lato;
}
/**
*
* @return valore Area
*/
public float Area() {
return lato * lato;
}
/**
*
* @return valore perimetro
*/

public float Perimetro() {
return 4 * lato;
}
/**
*
* @return stampa
*/
//Stampa a video
@Override
public String toString() {
return "lato"+lato;
} /**
*
* CLASSE main
*/
//main
public static void main(String[] args) {
Quadrato bq=new Quadrato(4);
System.out.println(bq.Area());
System.out.println(bq.Perimetro());
System.out.println(bq);
}}