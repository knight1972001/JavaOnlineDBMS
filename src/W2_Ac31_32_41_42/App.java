package W2_Ac31_32_41_42;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Connection connection;

        System.out.println("-------- MySQL JDBC Connection Demo ------------");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found !!");
            return;
        }
        System.out.println("MySQL JDBC Driver Registered!");
        try {
            String databaseUrl = "jdbc:mysql://localhost:3306/store_cms_plusplus?characterEncoding=utf8";
            String user = "root";
            String password = "190720";
            connection = DriverManager.getConnection(databaseUrl, user, password);
            System.out.println("SQL Connection to database established!");
            //add Menu
            Menu MainMenu = new Menu("Store Management: ");
            Menu subMenu1 = new Menu("Filter by: ");
            MainMenu.add("Show all laptop.");
            MainMenu.add("Filter.");
            MainMenu.add("Count Laptop by Brand");
            MainMenu.add("Total Money Sold of each Brand.");
            MainMenu.add("Exit.");

            subMenu1.add("Find laptop from price");
            subMenu1.add("Find laptop below price");
            subMenu1.add("Find laptop between price");
            subMenu1.add("Find laptop by brand");
            subMenu1.add("Find laptop by screen size");
            subMenu1.add("Find laptop by RAM");
            subMenu1.add("Find laptop by CPU");
            subMenu1.add("Find laptop by type");
            subMenu1.add("Find laptop by VGA");
            subMenu1.add("Back!");

            //RUN
            ConnectDB connected = new ConnectDB(connection);
            int check = 0;
            List<Laptop> laptops = new ArrayList<>();
            List<Counter> counters = new ArrayList<>();
            List<Statistic> statistic = new ArrayList<>();
            do {
                int option = MainMenu.run();
                switch (option) {
                    case 1:
                        laptops = connected.showAllLaptop();
                        if (laptops.isEmpty()) {
                            System.out.println("No Result");
                        } else {
                            for (Laptop laptop : laptops) {
                                System.out.println(laptop.toString());
                            }
                        }
                        laptops.clear();
                        break;
                    case 2:
                        int subCheck = 0;
                        do {
                            int subOption = subMenu1.run();
                            switch (subOption) {
                                case 1:
                                    laptops = connected.findLaptopFromPrice();
                                    if (laptops.isEmpty()) {
                                        System.out.println("No Result");
                                    } else {
                                        for (Laptop laptop : laptops) {
                                            System.out.println(laptop.toString());
                                        }
                                    }
                                    laptops.clear();
                                    break;
                                case 2:
                                    laptops = connected.findLaptopBelowPrice();
                                    if (laptops.isEmpty()) {
                                        System.out.println("No Result");
                                    } else {
                                        for (Laptop laptop : laptops) {
                                            System.out.println(laptop.toString());
                                        }
                                    }
                                    laptops.clear();
                                    break;
                                case 3:
                                    laptops = connected.findLaptopBetweenPrice();
                                    if (laptops.isEmpty()) {
                                        System.out.println("No Result");
                                    } else {
                                        for (Laptop laptop : laptops) {
                                            System.out.println(laptop.toString());
                                        }
                                    }
                                    laptops.clear();
                                    break;
                                case 4:
                                    laptops = connected.findLaptopByBrand();
                                    if (laptops.isEmpty()) {
                                        System.out.println("No Result");
                                    } else {
                                        for (Laptop laptop : laptops) {
                                            System.out.println(laptop.toString());
                                        }
                                    }
                                    laptops.clear();
                                    break;
                                case 5:
                                    laptops = connected.findLaptopByScreenSize();
                                    if (laptops.isEmpty()) {
                                        System.out.println("No Result");
                                    } else {
                                        for (Laptop laptop : laptops) {
                                            System.out.println(laptop.toString());
                                        }
                                    }
                                    laptops.clear();
                                    break;
                                case 6:
                                    laptops = connected.findLaptopByRam();
                                    if (laptops.isEmpty()) {
                                        System.out.println("No Result");
                                    } else {
                                        for (Laptop laptop : laptops) {
                                            System.out.println(laptop.toString());
                                        }
                                    }
                                    laptops.clear();
                                    break;
                                case 7:
                                    laptops = connected.findLaptopByCPU();
                                    if (laptops.isEmpty()) {
                                        System.out.println("No Result");
                                    } else {
                                        for (Laptop laptop : laptops) {
                                            System.out.println(laptop.toString());
                                        }
                                    }
                                    laptops.clear();
                                    break;
                                case 8:
                                    laptops = connected.findLaptopByType();
                                    if (laptops.isEmpty()) {
                                        System.out.println("No Result");
                                    } else {
                                        for (Laptop laptop : laptops) {
                                            System.out.println(laptop.toString());
                                        }
                                    }
                                    laptops.clear();
                                    break;
                                case 9:
                                    laptops = connected.findLaptopByVGA();
                                    if (laptops.isEmpty()) {
                                        System.out.println("No Result");
                                    } else {
                                        for (Laptop laptop : laptops) {
                                            System.out.println(laptop.toString());
                                        }
                                    }
                                    laptops.clear();
                                    break;
                                case 10:
                                    subCheck = 1;
                                    break;
                            }
                        } while (subCheck == 0);
                        break;
                    case 3:
                        counters = connected.showAmountLaptopEachBrand();
                        if (counters.isEmpty()) {
                            System.out.println("No Result");
                        } else {
                            for (Counter counterItem : counters) {
                                System.out.println(counterItem.toString());
                            }
                        }
                        counters.clear();
                        break;
                    case 4:
                        statistic=connected.totalMoneyOfEachBrand();
                        if (statistic.isEmpty()) {
                            System.out.println("No Result");
                        } else {
                            for (Statistic item : statistic) {
                                System.out.println(item.toString());
                            }
                        }
                        statistic.clear();
                        break;
                    case 5:
                        check=1;
                        System.out.println("Good Bye!");
                        break;
                }
            } while (check == 0);
        } catch (SQLException | ParseException e) {
            System.out.println("Connection Failed! Check output console" + e);
            return;
        }
    }
}
