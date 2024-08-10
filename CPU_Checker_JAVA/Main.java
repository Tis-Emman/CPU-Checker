import java.util.Scanner;

public class Main{

    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Mouse mouse = new Mouse("Razer", 5, 1000, false, true, 4.8);
        Mouse mouse2 = new Mouse("Logitech", 5,  950, true, true, 4.9);
        CPU cpu = new CPU("AMD", "Ryzen 3 3200g", true, 3.6, 3600, 3, 8, 3);
        CPU cpu2 = new CPU("Intel", "Celeron", false, 2.8, 6600, 2, 4, 3);

        CPU.First_Cache cache1 = cpu.new First_Cache(60); //Declare the outerclass then the innerclass then the name of your variable = the variable of your outerclass, then the keyword NEW to instanciate an object then the name of your innerclass()
        CPU.Second_Cache cache2 = cpu.new Second_Cache(120);
        CPU.Third_Cache cache3 = cpu.new Third_Cache(180);

        String dclr1;
        String dclr2;
        String dclr3;
        String dclr4;
        String dclr5;
        String dclr6;
        String dclr7;
        String dclr8;

        dclr1 = "The Manufacturer is: ";
        dclr2 = "The brand is: ";
        dclr3 = "Has an Integrated Graphics card: ";
        dclr4 = "GHz Speed: "; 
        dclr5 = "Generation:";
        dclr6 = "Number of Threads: ";
        dclr7 = "Number of Cores: ";
        dclr8 = "Total Number of Cache: ";
        

        System.out.println("Welcome to the CPU checker! ");
        System.out.println("What CPU do you want to see the specs? ");
        System.out.println("***********************");
        System.out.println("1. AMD ");
        System.out.println("2. Intel");
        int choices = scanner.nextInt();
        switch (choices) {
            case 1:
                System.out.println("What specs do you want to see>");
                System.out.println("*************************");
                System.out.println("1. Manufacturer");
                System.out.println("2. Brand");
                System.out.println("3. Integrated Graphics");
                System.out.println("4. Ghz Speed");
                System.out.println("5. Gen");
                System.out.println("6.Threads");
                System.out.println("7. Cores");
                System.out.println("8. Caches");
                int specs_choices = scanner.nextInt();
                switch (specs_choices) {
                    case 1:
                        System.out.println(dclr1 + cpu.manufacturer);
                        break;
                    case 2:
                        System.out.println(dclr2 + cpu.brand);
                        break;
                    case 3:
                        System.out.println(dclr3 + cpu.integrated_graphics);
                        break;
                    case 4:
                        System.out.println(dclr4 + cpu.Ghz);
                        break;
                    case 5:
                        System.out.println(dclr5 + cpu.gen);
                        break;
                    case 6: 
                        System.out.println(dclr6 + cpu.threads);
                        break;
                    case 7:
                        System.out.println(dclr7 + cpu.cores);
                        break;
                    default:
                        System.out.println("Specs not indicated");
                        break;
                }
                break;  

            case 2:
                System.out.println("What specs do you want to see>");
                System.out.println("*************************");
                System.out.println("1. Manufacturer");
                System.out.println("2. Brand");
                System.out.println("3. Integrated Graphics");
                System.out.println("4. Ghz Speed");
                System.out.println("5. Gen");
                System.out.println("6.Threads");
                System.out.println("7. Cores");
                System.out.println("8. Caches");
                int specs2_choices = scanner.nextInt();
                switch (specs2_choices) {
                    case 1:
                        System.out.println(dclr1 + cpu2.manufacturer);
                        break;
                    case 2:
                        System.out.println(dclr2 + cpu2.brand);
                        break;
                    case 3:
                        System.out.println(dclr3 + cpu2.integrated_graphics);
                        break;
                    case 4:
                        System.out.println(dclr4 + cpu2.Ghz);
                        break;
                    case 5:
                        System.out.println(dclr5 + cpu2.gen);
                        break;
                    case 6: 
                        System.out.println(dclr6 + cpu2.threads);
                        break;
                    case 7:
                        System.out.println(dclr7 + cpu2.cores);
                        break;
                    default:
                        System.out.println("Specs not indicated");
                        break;
                }

            default:
                break;
        }
        }
    }



 