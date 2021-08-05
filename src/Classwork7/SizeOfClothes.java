package part7.ex2;
public enum SizeOfClothes {
    XXS(32){
        @Override
        String getDescription(){return "Детский размер";}
    },
    XS(34),
    S(36),
    M(38),
    L(40);

    private final int euroSize;

    String getDescription(){return "Взрослый размер";}

    SizeOfClothes(int euroSize){
        this.euroSize = euroSize;
    }

    public int getEuroSize(){return euroSize;}
}


