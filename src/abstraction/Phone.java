package abstraction;

public class Phone implements MakePhoto {
    private boolean shuxur = true;
    private phoneOS type;
    private String name;

    Phone(String name, phoneOS type){
        this.type = type;
        this.name = name;
    }

    @Override
    public void takePhoto(Object object) {
        if (shuxur){
            System.out.println(voice());
        }
        System.out.println("Phone took photo");
        System.out.println(object.toString());
    }

    @Override
    public String voice() {
        switch (type){
            case IOS:
                return "Futuristik dzen!";
            case ANDROID:
                return "Androidi dzen";
            default:
                return "Unknown OS";
        }


    }

    enum phoneOS{
        IOS,
        ANDROID
    }
}
