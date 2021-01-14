package W2_Ac31_32_41_42;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static W2_Ac31_32_41_42.Ultis.*;

public class ConnectDB {
    Connection connection;
    Scanner input = new Scanner(System.in);

    public ConnectDB(Connection connection) {
        this.connection = connection;
    }

    public List<Laptop> showAllLaptop() {
        List<Laptop> response = new ArrayList<>();
        try {
            String query = "SELECT * FROM laptop";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String url = rs.getString("url");
                String maker = rs.getString("maker");
                String type = rs.getString("type");
                String ram = rs.getString("ram");
                String cpu = rs.getString("cpu");
                String ssd = rs.getString("ssd");
                String hdd = rs.getString("hdd");
                long price = rs.getLong("price");
                String card = rs.getString("card");
                String screenResolution = rs.getString("screen_resolution");
                double screenSize = rs.getDouble("screen_size");
                int sold = rs.getInt("sold");
                Timestamp createTime = rs.getTimestamp("created_timestamp");
                Timestamp update_time = rs.getTimestamp("last_updated_timestamp");
                Laptop laptop = new Laptop(id, name, url, maker, type, ram, cpu, ssd, hdd, price, card, screenResolution, screenSize, sold, createTime, update_time);
                response.add(laptop);
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
        return response;
    }

    public List<Laptop> findLaptopFromPrice() {
        System.out.print("Input your lowest Price: ");
        double lowestPrice = getDouble();
        List<Laptop> response = new ArrayList<>();
        try {
            String query = "SELECT * FROM laptop WHERE (price) IS NOT NULL AND (price > " + lowestPrice + ") ORDER BY (price) ASC";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String url = rs.getString("url");
                String maker = rs.getString("maker");
                String type = rs.getString("type");
                String ram = rs.getString("ram");
                String cpu = rs.getString("cpu");
                String ssd = rs.getString("ssd");
                String hdd = rs.getString("hdd");
                long price = rs.getLong("price");
                String card = rs.getString("card");
                String screenResolution = rs.getString("screen_resolution");
                double screenSize = rs.getDouble("screen_size");
                int sold = rs.getInt("sold");
                Timestamp createTime = rs.getTimestamp("created_timestamp");
                Timestamp update_time = rs.getTimestamp("last_updated_timestamp");
                Laptop laptop = new Laptop(id, name, url, maker, type, ram, cpu, ssd, hdd, price, card, screenResolution, screenSize, sold, createTime, update_time);
                response.add(laptop);
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
        return response;
    }

    public List<Laptop> findLaptopBelowPrice() {
        System.out.print("Input your highest Price: ");
        double highestPrice = getDouble();
        List<Laptop> response = new ArrayList<>();
        try {
            String query = "SELECT * FROM laptop WHERE (price) IS NOT NULL AND (price < " + highestPrice + ") ORDER BY (price) DESC";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String url = rs.getString("url");
                String maker = rs.getString("maker");
                String type = rs.getString("type");
                String ram = rs.getString("ram");
                String cpu = rs.getString("cpu");
                String ssd = rs.getString("ssd");
                String hdd = rs.getString("hdd");
                long price = rs.getLong("price");
                String card = rs.getString("card");
                String screenResolution = rs.getString("screen_resolution");
                double screenSize = rs.getDouble("screen_size");
                int sold = rs.getInt("sold");
                Timestamp createTime = rs.getTimestamp("created_timestamp");
                Timestamp update_time = rs.getTimestamp("last_updated_timestamp");
                Laptop laptop = new Laptop(id, name, url, maker, type, ram, cpu, ssd, hdd, price, card, screenResolution, screenSize, sold, createTime, update_time);
                response.add(laptop);
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
        return response;
    }

    public List<Laptop> findLaptopBetweenPrice() {
        System.out.print("Input your from Price: ");
        double lowestPrice = getDouble();
        System.out.print("to Price: ");
        double highestPrice = getDouble();
        List<Laptop> response = new ArrayList<>();
        try {
            String query = "SELECT * FROM laptop WHERE (price) IS NOT NULL AND (price > " + lowestPrice + " AND price < " + highestPrice + ") ORDER BY (price) ASC";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String url = rs.getString("url");
                String maker = rs.getString("maker");
                String type = rs.getString("type");
                String ram = rs.getString("ram");
                String cpu = rs.getString("cpu");
                String ssd = rs.getString("ssd");
                String hdd = rs.getString("hdd");
                long price = rs.getLong("price");
                String card = rs.getString("card");
                String screenResolution = rs.getString("screen_resolution");
                double screenSize = rs.getDouble("screen_size");
                int sold = rs.getInt("sold");
                Timestamp createTime = rs.getTimestamp("created_timestamp");
                Timestamp update_time = rs.getTimestamp("last_updated_timestamp");
                Laptop laptop = new Laptop(id, name, url, maker, type, ram, cpu, ssd, hdd, price, card, screenResolution, screenSize, sold, createTime, update_time);
                response.add(laptop);
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
        return response;
    }

    public List<Laptop> findLaptopByBrand() {
        System.out.print("Input brand: ");
        String filterBrand = input.nextLine();
        List<Laptop> response = new ArrayList<>();
        try {
            String query = "SELECT * FROM laptop WHERE (maker) IS NOT NULL AND (maker = \"" + filterBrand + "\") ORDER BY (price) DESC";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String url = rs.getString("url");
                String maker = rs.getString("maker");
                String type = rs.getString("type");
                String ram = rs.getString("ram");
                String cpu = rs.getString("cpu");
                String ssd = rs.getString("ssd");
                String hdd = rs.getString("hdd");
                long price = rs.getLong("price");
                String card = rs.getString("card");
                String screenResolution = rs.getString("screen_resolution");
                double screenSize = rs.getDouble("screen_size");
                int sold = rs.getInt("sold");
                Timestamp createTime = rs.getTimestamp("created_timestamp");
                Timestamp update_time = rs.getTimestamp("last_updated_timestamp");
                Laptop laptop = new Laptop(id, name, url, maker, type, ram, cpu, ssd, hdd, price, card, screenResolution, screenSize, sold, createTime, update_time);
                response.add(laptop);
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
        return response;
    }

    public List<Laptop> findLaptopByScreenSize() {
        System.out.print("Input Screen Size: ");
        double screenSizeFilter = getDouble();
        List<Laptop> response = new ArrayList<>();
        try {
            String query = "SELECT * FROM laptop WHERE (screen_size) IS NOT NULL AND (CAST(screen_size as DECIMAL) = CAST(" + screenSizeFilter + " as DECIMAL)) ORDER BY (price) ASC";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String url = rs.getString("url");
                String maker = rs.getString("maker");
                String type = rs.getString("type");
                String ram = rs.getString("ram");
                String cpu = rs.getString("cpu");
                String ssd = rs.getString("ssd");
                String hdd = rs.getString("hdd");
                long price = rs.getLong("price");
                String card = rs.getString("card");
                String screenResolution = rs.getString("screen_resolution");
                double screenSize = rs.getDouble("screen_size");
                int sold = rs.getInt("sold");
                Timestamp createTime = rs.getTimestamp("created_timestamp");
                Timestamp update_time = rs.getTimestamp("last_updated_timestamp");
                Laptop laptop = new Laptop(id, name, url, maker, type, ram, cpu, ssd, hdd, price, card, screenResolution, screenSize, sold, createTime, update_time);
                response.add(laptop);
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
        return response;
    }

    public List<Laptop> findLaptopByRam() {
        System.out.print("Input RAM capacity: ");
        int ramCapacity = getInt();
        List<Laptop> response = new ArrayList<>();
        try {
            String query = "SELECT * FROM laptop WHERE (ram) IS NOT NULL AND (ram = \"" + ramCapacity + "GB\") ORDER BY (price) ASC";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String url = rs.getString("url");
                String maker = rs.getString("maker");
                String type = rs.getString("type");
                String ram = rs.getString("ram");
                String cpu = rs.getString("cpu");
                String ssd = rs.getString("ssd");
                String hdd = rs.getString("hdd");
                long price = rs.getLong("price");
                String card = rs.getString("card");
                String screenResolution = rs.getString("screen_resolution");
                double screenSize = rs.getDouble("screen_size");
                int sold = rs.getInt("sold");
                Timestamp createTime = rs.getTimestamp("created_timestamp");
                Timestamp update_time = rs.getTimestamp("last_updated_timestamp");
                Laptop laptop = new Laptop(id, name, url, maker, type, ram, cpu, ssd, hdd, price, card, screenResolution, screenSize, sold, createTime, update_time);
                response.add(laptop);
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
        return response;
    }

    public List<Laptop> findLaptopByCPU() {
        System.out.print("Input CPU brand or CPU name: ");
        String cpuFilter=input.nextLine();
        List<Laptop> response = new ArrayList<>();
        try {
            String query = "SELECT * FROM laptop WHERE (cpu) IS NOT NULL AND (cpu LIKE \"%"+cpuFilter+"%\") ORDER BY (price) ASC";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String url = rs.getString("url");
                String maker = rs.getString("maker");
                String type = rs.getString("type");
                String ram = rs.getString("ram");
                String cpu = rs.getString("cpu");
                String ssd = rs.getString("ssd");
                String hdd = rs.getString("hdd");
                long price = rs.getLong("price");
                String card = rs.getString("card");
                String screenResolution = rs.getString("screen_resolution");
                double screenSize = rs.getDouble("screen_size");
                int sold = rs.getInt("sold");
                Timestamp createTime = rs.getTimestamp("created_timestamp");
                Timestamp update_time = rs.getTimestamp("last_updated_timestamp");
                Laptop laptop = new Laptop(id, name, url, maker, type, ram, cpu, ssd, hdd, price, card, screenResolution, screenSize, sold, createTime, update_time);
                response.add(laptop);
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
        return response;
    }

    public List<Laptop> findLaptopByType() {
        System.out.print("Input Type name: ");
        String typeFilter=input.nextLine();
        List<Laptop> response = new ArrayList<>();
        try {
            String query = "SELECT * FROM laptop WHERE (type) IS NOT NULL AND (type LIKE \"%"+typeFilter+"%\") ORDER BY (price) ASC";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String url = rs.getString("url");
                String maker = rs.getString("maker");
                String type = rs.getString("type");
                String ram = rs.getString("ram");
                String cpu = rs.getString("cpu");
                String ssd = rs.getString("ssd");
                String hdd = rs.getString("hdd");
                long price = rs.getLong("price");
                String card = rs.getString("card");
                String screenResolution = rs.getString("screen_resolution");
                double screenSize = rs.getDouble("screen_size");
                int sold = rs.getInt("sold");
                Timestamp createTime = rs.getTimestamp("created_timestamp");
                Timestamp update_time = rs.getTimestamp("last_updated_timestamp");
                Laptop laptop = new Laptop(id, name, url, maker, type, ram, cpu, ssd, hdd, price, card, screenResolution, screenSize, sold, createTime, update_time);
                response.add(laptop);
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
        return response;
    }

    public List<Laptop> findLaptopByVGA() {
        System.out.print("Input VGA brand or VGA name: ");
        String vgaFilter=input.nextLine();
        List<Laptop> response = new ArrayList<>();
        try {
            String query = "SELECT * FROM laptop WHERE (card) IS NOT NULL AND (card LIKE \"%"+vgaFilter+"%\") ORDER BY (price) ASC";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String url = rs.getString("url");
                String maker = rs.getString("maker");
                String type = rs.getString("type");
                String ram = rs.getString("ram");
                String cpu = rs.getString("cpu");
                String ssd = rs.getString("ssd");
                String hdd = rs.getString("hdd");
                long price = rs.getLong("price");
                String card = rs.getString("card");
                String screenResolution = rs.getString("screen_resolution");
                double screenSize = rs.getDouble("screen_size");
                int sold = rs.getInt("sold");
                Timestamp createTime = rs.getTimestamp("created_timestamp");
                Timestamp update_time = rs.getTimestamp("last_updated_timestamp");
                Laptop laptop = new Laptop(id, name, url, maker, type, ram, cpu, ssd, hdd, price, card, screenResolution, screenSize, sold, createTime, update_time);
                response.add(laptop);
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
        return response;
    }

    public List<Counter> showAmountLaptopEachBrand(){
        List<Counter> response = new ArrayList<>();
        try {
            String query = "SELECT COUNT(*) as amount,maker from laptop group by maker ORDER BY (amount) DESC";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                int amount = rs.getInt("amount");
                String maker = rs.getString("maker");
                Counter counter=new Counter(amount, maker);
                response.add(counter);
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
        return response;
    }

    public List<Statistic> totalMoneyOfEachBrand(){
        List<Statistic> response = new ArrayList<>();
        try {
            String query = "SELECT maker, SUM(sold) as totalSold, (SUM(sold)*price) as totalMoney from laptop group by maker ORDER BY (totalMoney) ASC;";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                String maker = rs.getString("maker");
                int totalSold = rs.getInt("totalSold");
                long totalMoney = rs.getLong("totalMoney");
                Statistic statistic=new Statistic(maker, totalSold, totalMoney);
                response.add(statistic);
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
        return response;
    }
}
