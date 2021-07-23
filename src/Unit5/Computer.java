package Unit5;
import java.util.Random;
import java.util.Scanner;

public class Computer {

    String deviceName;
    String cpu;
    String ram;
    String hdd;
    int workCycles;

    Computer(String deviceName, String cpu, String ram, String hdd, int workCycles)
    {
        this.deviceName = deviceName;
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.workCycles = workCycles;
    }

    boolean on()
    {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int num = 0;

        System.out.println("Введите число -->");
        do
        {
            if (in.hasNextInt())
            {
                num = in.nextInt();

                if (num < 0 || num > 1)
                {
                    System.out.println("Введите число ещё раз[0..1]!");
                }
                else
                {
                    if (num == rand.nextInt(2))
                    {
                        System.out.println("The computer turned on!");
                        workCycles--;
                        System.out.println("The remaining number of complete work cycles --> " + workCycles);
                    }
                    else
                    {
                        limitResources();
                        System.out.println("The computer crashed!");
                        return false;
                    }
                }
            }
            else
            {
                in.next();
                System.out.println("Введите число [0..1]!");
            }
        }while(num < 0 || num > 1);
        return true;
    }

    boolean off()
    {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int num = 0;

        System.out.println("Введите число -->");
        do
        {
            if (in.hasNextInt())
            {
                num = in.nextInt();

                if (num < 0 || num > 1)
                {
                    System.out.println("Введите число ещё раз[0..1]!");
                }
                else
                {
                    if (num == rand.nextInt(2))
                    {
                        System.out.println("The computer turned off!");
                        workCycles--;
                        System.out.println("The remaining number of complete work cycles --> " + workCycles);
                    }
                    else
                    {
                        limitResources();
                        System.out.println("The computer crashed!");
                        return false;
                    }
                }
            }
            else
            {
                in.next();
                System.out.println("Введите число [0..1]!");
            }
        }while(num < 0 || num > 1);
        return true;
    }

    void limitResources()
    {
        if (workCycles == 0)
        {
            System.out.println("The computer's resource limit has been exceeded!");
        }
    }

    @Override
    public String toString() {
        return  "--------------------------------------------------------" +
                "\nDevice Info: " +
                "\nname: " + deviceName +
                "\nCPU: " + cpu +
                "\nRAM: " + ram +
                "\nHDD: " + hdd +
                "\nThe resource of full operation cycles (on/off): " + workCycles + "\n" +
                "--------------------------------------------------------\n";
    }
}
