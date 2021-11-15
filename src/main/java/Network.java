
import java.util.*;

public class Network {
    private String name;
    private ArrayList<IConnect> devices;
//    private ArrayList<Desktop> devicesDesktop;
//    private ArrayList<Printer> devicesPrinter;

    public Network(String name){
        this.devices = new ArrayList<>();
//        this.devicesDesktop = new ArrayList<Desktop>();
//        this.devicesPrinter = new ArrayList<Printer>();
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int deviceCount(){
        return devices.size();
    }

    public void connect(IConnect device){
        devices.add(device);
    }

    public void disconnectAll(){
        devices.clear();
    }

//    public void connect(Desktop desktop){
//        devicesDesktop.add(desktop);
//    }
//
//    public void connect(Printer printer){
//        devicesPrinter.add(printer);
//    }
//
//    public void disconnectAll(){
//        devicesDesktop.clear();
//        devicesPrinter.clear();
//    }
}