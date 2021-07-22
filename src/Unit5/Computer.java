package Unit5;

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

    void on(int random)
    {
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
                    if (num == random)
                    {
                        limitResources();
                        System.out.println("The computer turned on!");
                        workCycles--;
                        System.out.println("The remaining number of complete work cycles --> " + workCycles);
                    }
                    else
                    {
                        System.out.println("The computer crashed!");
                        System.exit(0);
                    }
                }
            }
            else
            {
                in.next();
                System.out.println("Введите число [0..1]!");
            }
        }while(num < 0 || num > 1);
    }

    void off(int random)
    {
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
                    if (num == random)
                    {
                        limitResources();
                        System.out.println("The computer turned off!");
                        workCycles--;
                        System.out.println("The remaining number of complete work cycles --> " + workCycles);
                    }
                    else
                    {
                        System.out.println("The computer crashed!");
                        System.exit(0);
                    }
                }
            }
            else
            {
                in.next();
                System.out.println("Введите число [0..1]!");
            }
        }while(num < 0 || num > 1);
    }

    void limitResources()
    {
        if (workCycles == 0)
        {
            System.out.println("The computer's resource limit has been exceeded!");
            System.exit(0);
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
