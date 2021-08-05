package Classwork7;

public class Studio {

    public void clotheWoman(Clothes []arr) {

        System.out.println("-------------------------------------------------" +
                "\nИнформация о женской одежде -->");

        for (Clothes clothes : arr) {
            System.out.println("Тип: " + clothes.getType());
            System.out.println("Размер: " + clothes.getSizeOfClothes() + ", " + clothes.getSize());
            System.out.println("Цена: " + clothes.getCost());
            System.out.println("Цвет: " + clothes.getColor());
            System.out.println();
        }
        System.out.println("-------------------------------------------------");
    }

    public void clotheMen(Clothes []arr)
    {
        System.out.println("\n-------------------------------------------------" +
                "\nИнформация о мужской одежде -->");

        for (Clothes clothes : arr) {
            System.out.println("Тип: " + clothes.getType());
            System.out.println("Размер: " + clothes.getSizeOfClothes() + ", " + clothes.getSize());
            System.out.println("Цена: " + clothes.getCost());
            System.out.println("Цвет: " + clothes.getColor());
            System.out.println();
        }
    }
}
