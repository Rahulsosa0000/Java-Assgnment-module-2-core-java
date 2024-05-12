package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class LibraryMS {
    static String password = "";

    public static void main(String[] args) {
      
            System.out.println("Enter the password:");
            Scanner sc = new Scanner(System.in);
            password = sc.nextLine();

            if (password.equals("Rahul")) {
                System.out.println("Login Successful!");
                showMenu();
            } else {
                System.out.println("Invalid Password. Try again.");
            }
        
    }

    public static void showMenu() {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Library", "root", "123456")) {
            System.out.println("Welcome To Library Management System");
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("Main Menu");
                System.out.println("1. Add books");
                System.out.println("2. Delete books");
                System.out.println("3. Search books");
                System.out.println("4. View book list");
                System.out.println("5. Edit book record");
                System.out.println("6. Change Password");
                System.out.println("7. Close Application");
                System.out.println("Enter your choice:");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        addBook(con);
                        break;
                    case 2:
                        deleteBook(con);
                        break;
                    case 3:
                        searchBook(con);
                        break;
                    case 4:
                        viewBookList(con);
                        break;
                    case 5:
                        editBookRecord(con);
                        break;
                    case 6:
                        changePassword();
                        break;
                    case 7:
                        System.out.println("Close Application");
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void addBook(Connection con) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert Category:");
        String category = sc.nextLine();
        System.out.println("Insert Book ID:");
        int id = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Insert Book Name:");
        String name = sc.nextLine();
        System.out.println("Insert Book Author:");
        String author = sc.nextLine();
        System.out.println("Insert Book Quantity:");
        int quantity = sc.nextInt();
        System.out.println("Insert Book Price:");
        int price = sc.nextInt();

        String q = "insert into books (category, Book_id, Book_name, Author, Quantity, Price) values (?, ?, ?, ?, ?, ?)";
        PreparedStatement pt = con.prepareStatement(q); {
            pt.setString(1, category);
            pt.setInt(2, id);
            pt.setString(3, name);
            pt.setString(4, author);
            pt.setInt(5, quantity);
            pt.setInt(6, price);
            pt.executeUpdate();
            System.out.println("Data Inserted Successfully!");
        }
    }

    public static void deleteBook(Connection con) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert Book ID:");
        int id = sc.nextInt();

        String q = "delete from books where book_id = ?";
       PreparedStatement pt = con.prepareStatement(q); {
            pt.setInt(1, id);
            int count = pt.executeUpdate();
            if (count > 0) {
                System.out.println("Data deleted successfully!");
            } else {
                System.out.println("id not found....");
            }
        }
    }

    public static void searchBook(Connection con) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Search Book ID:");
        int id = sc.nextInt();

        String q = "select * from books where Book_id = ?";
      PreparedStatement pt = con.prepareStatement(q); {
            pt.setInt(1, id);
            ResultSet rs = pt.executeQuery(); {
                if (rs.next()) {
                    System.out.println("Category: " + rs.getString("category"));
                    System.out.println("Name: " + rs.getString("Book_name"));
                    System.out.println("Author: " + rs.getString("Author"));
                    System.out.println("Quantity: " + rs.getInt("Quantity"));
                    System.out.println("Price: " + rs.getInt("Price"));
                } else {
                    System.out.println("No book found...");
                }
            }
        }
    }

    public static void viewBookList(Connection con) throws Exception {
        String q = "select  * from books";
        Statement st = con.createStatement(); ResultSet rs = st.executeQuery(q); {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("Book_id"));
                System.out.println("Name: " + rs.getString("Book_name"));
                System.out.println("Author: " + rs.getString("Author"));
                System.out.println("Quantity: " + rs.getInt("Quantity"));
                System.out.println("Price: " + rs.getInt("Price"));
                System.out.println("Category: " + rs.getString("category"));
                System.out.println();
            }
        }
        System.out.println("Data Fetched successfully");
    }

    public static void editBookRecord(Connection con) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert Book ID:");
        int id = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Insert Category:");
        String category = sc.nextLine();
        System.out.println("Insert Book Name:");
        String name = sc.nextLine();
        System.out.println("Insert Book Author:");
        String author = sc.nextLine();
        System.out.println("Insert Book Quantity:");
        int quantity = sc.nextInt();
        System.out.println("Insert Book Price:");
        int price = sc.nextInt();

  String q = "update books set Book_name = ?, Author = ?, Quantity = ?, Price = ?, category = ? where Book_id = ?";
        PreparedStatement pt = con.prepareStatement(q); {
            pt.setString(1, name);
            pt.setString(2, author);
            pt.setInt(3, quantity);
            pt.setInt(4, price);
            pt.setString(5, category);
            pt.setInt(6, id);
            pt.executeUpdate();
            System.out.println("Data Updated Successfully!");
        }
    }

    public static void changePassword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter old password:");
        String oldPassword = sc.nextLine();

        if (oldPassword.equals("Rahul")) {
            System.out.println("Enter new password:");
            password = sc.nextLine();
            System.out.println("Password changed successfully!");
        } else {
            System.out.println("Incorrect old password.");
        }
    }
}
