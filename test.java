public abstract class Animal{
    private String nom;
    public void setNom(String nom){
        this.nom = nom;
    }
    public getNom(){
        return this.nom;
    }
    public abstract void parler();
}

public interface AnimalInterface{
void parler();
}

public class Chat implements AnimalInterface{
    private String nom;
    public Chat(String s) {
        this.nom = s;
    }

    public void parler() {
        System.out.println("miaou");
    }
}

public class Chat implements AnimalInterface{
    private String nom;
        public Chien(String s) {
            nom = s;
        }
        public void parler() {
            System.out.println("ouah ouah");
        }
}

public class TestAnimal{
        public static void main (String args[]){
            Chien f = new Chien("Fifi");
            Chat g = new Chat("Chloe");
        //AnimalCompagnie a = new AnimalCompagnie("bob");
            f.parler();
            g.parler();
            AnimalInterface [] a = new AnimalInterface [2];
            a[0] = f;
            a[1] = g;
            for(int i=0; i<a.length; i++) {
            a[i].parler();
            }
        }
}