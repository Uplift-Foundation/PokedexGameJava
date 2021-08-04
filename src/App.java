public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        PokedexItem meow = new PokedexItem("red");
        System.out.println(meow.getColor());
        Peony flower = new Peony("pink", "flower shape", "sweet", true, true, true, true, true);
        System.out.println(flower.Photosynthesizes());
    }
}