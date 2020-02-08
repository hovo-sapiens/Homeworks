package abstraction;

public class Animal implements MakeSound {
    private String name;
    private String voice;
    Animal(String name, String voice){
        this.name = name;
        this.voice = voice;
    }

    @Override
    public String voice() {
        return name + " " + voice;
    }

    @Override
    public String toString() {
        return voice();
    }
}
