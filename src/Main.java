public class Main {
    public static void main(String[] args) {
        Wetter s=new Wetter();
        s.print();
       Wetter n=new Wetter(JahresZeiten.WINTER,true);
       n.braucheWinterreifen();
        Wetter e=new Wetter(JahresZeiten.SOMMER,true);
        e.braucheWinterreifen();
    }
}