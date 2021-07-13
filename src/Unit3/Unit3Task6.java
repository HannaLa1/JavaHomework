package Unit3;

public class Unit3Task6 {
    public static void main (String args[]){

        int arr[] = new int [6];
        boolean flag = false;

        System.out.println("Массив --> ");

        for (int i = 0; i < 5; i++)
        {
            arr[i] = (int)(Math.random() * 21);
            System.out.print(arr[i] + " ");

            if (arr[i] < arr[i + 1])
            {
                flag = true;
            }
        }

        if (flag)
        {
            System.out.print("\nМассив является строго возрастающей последовательностью!");
        }
        else
        {
            System.out.print("\nМассив не является строго возрастающей последовательностью!");
        }
    }
}
