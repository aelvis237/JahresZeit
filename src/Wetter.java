import java.util.Arrays;

public class Wetter {
    private JahresZeiten jahresZeit;
    private  boolean niederschlag;
    public Wetter(JahresZeiten jahresZeit,boolean niederschlag){
        this.jahresZeit=jahresZeit;
        this.niederschlag=niederschlag;

    }
    public Wetter(){

    }
    public void braucheWinterreifen(){
        System.out.println("brauche ich Winterreife?");
        if((jahresZeit==JahresZeiten.WINTER)&(niederschlag)){
            System.out.println("ja");
        }else {
            System.out.println("nein");
        }

    }
    public static  void print(){
       System.out.println("**************************************************");

    }
}
