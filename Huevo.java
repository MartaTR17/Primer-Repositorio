package huevo;

public class Huevo {
    private final String tamaño;

    public Huevo(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Huevo{" + "tamaño = " + tamaño + '}';
    }

    public static void main(String[] args) {
        Huevo huevo = new Huevo("S,M,L,XL");
        Huevo.Clara clara = huevo.new Clara("Blanca");
        Huevo.Yema yema = huevo.new Yema("Amarilla");
        System.out.println(huevo.toString());
        System.out.println(clara.toString());
        System.out.println(yema.toString());
    } 

    private class Clara {
        private final String color;
        
        public Clara(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "Clara{" + "color = " + color + '}';
        }
    }
    private class Yema {
        private final String color;
        
        public Yema(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "Yema{" + "color = " + color + '}';
        } 
    }
}
