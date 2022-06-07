public class Fly {
//Se crea una clase con un método que lance un ArrayIndexOutOfBoundsException()
    String name;

    public Fly(String name) {
        this.name = name;
    }

    public void trowMyException()throws Exception{
        throw new ArrayIndexOutOfBoundsException();

    }
}
