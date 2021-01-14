package W2_Ac31_32_41_42;

import java.sql.Timestamp;

import static W2_Ac31_32_41_42.Ultis.convertMoney;

public class Laptop {
    int id=0;
    String name=null;
    String url=null;
    String maker=null;
    String type=null;
    String ram=null;
    String cpu=null;
    long price;
    String card=null, screenResolution=null;
    double screenSize=0;
    int sold=0;
    Timestamp create_time=null;
    Timestamp update_time=null;

    public Laptop(int id, String name, String url, String maker, String type, String ram, String cpu, String ssd, String hdd, long price, String card, String screenResolution, double screenSize, int sold, Timestamp createTime, Timestamp update_time) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.maker = maker;
        this.type = type;
        this.ram = ram;
        this.cpu = cpu;
        this.price = price;
        this.card = card;
        this.screenResolution = screenResolution;
        this.screenSize = screenSize;
        this.sold = sold;
        this.create_time = createTime;
        this.update_time = update_time;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getMaker() {
        return maker;
    }

    public String getType() {
        return type;
    }

    public String getRam() {
        return ram;
    }

    public String getCpu() {
        return cpu;
    }

    @Override
    public String toString() {
        String result="";
        result="Id: "+id+"\nName: "+name+"\nUrl: "+url+"\nMaker: "+maker+"\nType: "+type+"\nRam: "+ram+"\nCpu: "+cpu+"\nPrice: "+convertMoney(price)+"\nCard: "+card+"\nScreen Resolution: "+screenResolution+"\nScreen Size: "+screenSize+"\nSold: "+sold+"\nCreate Time: "+create_time+"\nLast Updated Time: "+update_time+"\n";
        return result;
    }

    public long getPrice() {
        return price;
    }

    public String getCard() {
        return card;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public int getSold() {
        return sold;
    }

    public Timestamp getCreate_time() {
        return create_time;
    }

    public Timestamp getUpdate_time() {
        return update_time;
    }
}
