public class CPU {

    String manufacturer;
    String brand;
    boolean integrated_graphics;
    double Ghz;
    int gen;
    int threads;
    int cores;
    int caches;
     
    CPU(String manufacturer, String brand, boolean integrated_graphics, double Ghz, int gen, int threads, int cores, int caches){
        
        this.manufacturer = manufacturer;
        this.brand = brand;
        this.integrated_graphics = integrated_graphics;
        this.Ghz = Ghz;
        this.threads = threads;
        this.cores = cores;
        this.caches = caches;
    }

    
    public void setBrand(String manufacturer){
        if(manufacturer.equals("Ryzen") || manufacturer.equals("Intel")){
            this.manufacturer = manufacturer;
        } else{
            System.out.println("Not a CPU manufacturer");
        }
    }

    public void setGhz(double Ghz){
        if(Ghz < 6.0){
            this.Ghz = Ghz;
        } else{
            System.out.println("A Modern CPU does not exceed more than 6.0");
        }
    }

    public void setThreads(int threads){
        if(threads == 2 || threads == 4){
            this.threads = threads;
        } else{
            System.out.println("Not an existing CPU Threads");
        }
    }  

    public void setIntegratedGraphics(){
         
    }

    public class First_Cache{

    int a;

        First_Cache(int a){
            this.a = a;
        }
        
    }

    public class Second_Cache{
        int a;
        Second_Cache(int a){
            this.a = a;
        }

    }

    public class Third_Cache{
        int a;
        Third_Cache(int a){
            this.a = a;
        }
    }

}
