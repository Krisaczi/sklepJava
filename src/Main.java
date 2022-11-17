import sklep.data.ProductsDB;
import sklep.products.types.Products;
import sklep.products.types.TV;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        UsersDB usersDB = new UsersDB();
        ProductsDB productsDB = new ProductsDB();
        Users users = new Users();
        Products products = new Products();


        boolean loop = true;
        System.out.println("1. Zaloguj się");
        System.out.println("3. Zakończ");
        System.out.println("2. Zarejestruj się");
        while (loop) {


            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextLine()) {
                case "1":

                    System.out.println("Podaj login:");
                    String login = scanner.nextLine();
                    System.out.println("Podaj hasło:");
                    String password = scanner.nextLine();

                    if (usersDB.getUsers().containsKey(login)) {
                        while (loop) {
                            System.out.println("1. Lista produktów");
                            System.out.println("2. Dodaj produkt");
                            System.out.println("3. Aktualizacja stanu");
                            System.out.println("4. Lista użytkowników");
                            System.out.println("5. Wyloguj się");


                            switch (scanner.nextInt()) {
                                case 1:
                                    ProductsDB.listProducts(productsDB.getProducts());
                                    System.out.println();
                                    break;
                                case 2:
                                    addProducts(productsDB);
                                    break;
                                case 3:
                                    System.out.println("Pola");
                                    break;
                                case 4:
                                    UsersDB.listUsers(usersDB.getUsers());
                                case 5:
                                    loop = false;
                            }
                        }
                    } else {

                        while (loop) {
                            System.out.println("1. Lista produktów");
                            System.out.println("2. Kup produkt");
                            System.out.println("3. Przejdź do kasy");

                            switch (scanner.nextInt()) {
                                case 1:
                                    ProductsDB.listProducts(productsDB.getProducts());
                                    System.out.println();
                                    break;
                                case 2:
                                    System.out.println("Krzaki");
                                    break;
                                case 3:
                                    System.out.println("Pola");
                                    break;


                            }
                        }
                    }
                    break;


                case "2":

                    System.out.println("Podaj login: ");
                    String loginNew = scanner.nextLine();
                    users.setName(loginNew);
                    System.out.println("Ustaw hasło: ");
                    String passwordNew = scanner.nextLine();
                    users.setPassword(passwordNew);


                   usersDB.addUsers(new Users(loginNew,passwordNew, Users.Role.USER));

                    break;


                    case "3":
                    loop = false;
                    break;
            }

        }

    }

    public static void addProducts(ProductsDB productsDB) {
        Products products = new Products();
        Scanner sc = new Scanner(System.in);
        System.out.println("Jaki produkt chcesz dodać?");
        System.out.println("1. Telewizor");
        System.out.println("2. Telefon");
        System.out.println("3. Monitor");

        String option = sc.nextLine();

        switch (option) {
            case "1":

                TV tv = new TV();
                System.out.println("Podaj markę: ");
                String brand = sc.nextLine();
                tv.setBrand(brand);
                System.out.println("Podaj rozmiar: ");
                int size = Integer.parseInt(sc.nextLine());
                tv.setSize(size);
                System.out.println("Kolor: ");
                String color = sc.nextLine();
                tv.setColor(color);
                System.out.println("Cena: ");
                double price = Double.parseDouble(sc.nextLine());
                tv.setPrice(price);
                System.out.println("Waga tv: ");
                int weight = Integer.parseInt(sc.nextLine());
                tv.setWeight(weight);
                System.out.println("Typ ekranu: ");
                String screen = sc.nextLine();
                tv.setScreenType(screen);
                System.out.println("Podaj ilość: ");
                int quantity = Integer.parseInt(sc.nextLine());
                tv.setInWarehouse(quantity);
                productsDB.addProducts(tv);

                break;
        }
    }
}