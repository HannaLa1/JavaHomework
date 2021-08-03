package part7.ex2;

public class Action {
    public static void main(String[] args) {
        MenClothes shirtMen = new Shirt();
        WomanClothes shirtWoman = new Shirt();
        MenClothes trousersMen = new Trousers();
        WomanClothes trousersWoman = new Trousers();
        WomanClothes skirtWoman = new Skirt();
        MenClothes tieMen = new Tie();

        Shirt shirt1 = new Shirt(SizeOfClothes.L.getEuroSize(), SizeOfClothes.L.getDescription(),2884, "Жёлтая", shirtMen.clotheMen());
        Shirt shirt2 = new Shirt(SizeOfClothes.XS.getEuroSize(), SizeOfClothes.XS.getDescription(),6575, "Белая", shirtWoman.clotheWoman());
        Trousers trousers1 = new Trousers(SizeOfClothes.S.getEuroSize(), SizeOfClothes.S.getDescription(),4567, "Голубые", trousersMen.clotheMen());
        Trousers trousers2 = new Trousers(SizeOfClothes.M.getEuroSize(), SizeOfClothes.M.getDescription(),9663, "Серые", trousersWoman.clotheWoman());
        Skirt skirt = new Skirt(SizeOfClothes.XXS.getEuroSize(), SizeOfClothes.XXS.getDescription(),1600, "Розовая", skirtWoman.clotheWoman());
        Tie tie = new Tie(SizeOfClothes.S.getEuroSize(), SizeOfClothes.S.getDescription(),767, "Чёрный", tieMen.clotheMen());

        Clothes []arr1 = {shirt1, trousers1, tie};
        Clothes []arr2 = {shirt2, trousers2, skirt};

        Studio studio = new Studio();
        studio.clotheMen(arr1);
        studio.clotheWoman(arr2);
    }
}
