package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
@Test
    public void showdNoProduct () {
    Book book1 = new Book(001,"Лирика",50, "Фет");
    Book book2 = new Book(002, "Пиковая дама", 20,"Пушкин");
    Book book3 = new Book(003, "Идиот", 30,"Достоевский");
    Smartphone smartphone1 = new Smartphone(001,"Ipnone", 100,"USA");
    Smartphone smartphone2 = new Smartphone(002,"Samsung", 150,"China");
    Smartphone smartphone3 = new Smartphone(003,"Honor", 90,"Korea");

    ProductRepository repo = new ProductRepository();
    repo.save(book1);
    repo.save(book2);
    repo.save(book3);
    repo.save(smartphone1);
    repo.save(smartphone2);
    repo.save(smartphone3);

ProductManager manager = new ProductManager(repo);

    Product[] expected = {};
    Product[] actual = manager.searchBy("Nokia");

    assertArrayEquals(expected, actual);


}
    @Test
    public void showdOneBoook () {
        Book book1 = new Book(001,"Лирика",50, "Фет");
        Book book2 = new Book(002, "Пиковая дама", 20,"Пушкин");
        Book book3 = new Book(003, "Идиот", 30,"Достоевский");
        Smartphone smartphone1 = new Smartphone(001,"Ipnone", 100,"USA");
        Smartphone smartphone2 = new Smartphone(002,"Samsung", 150,"China");
        Smartphone smartphone3 = new Smartphone(003,"Honor", 90,"Korea");

        ProductRepository repo = new ProductRepository();
        repo.save(book1);
        repo.save(book2);
        repo.save(book3);
        repo.save(smartphone1);
        repo.save(smartphone2);
        repo.save(smartphone3);

        ProductManager manager = new ProductManager(repo);

        Product[] expected = {book1};
        Product[] actual = manager.searchBy("Фет");

        assertArrayEquals(expected, actual);


    }

    @Test
    public void showdTwoBoook () {
        Book book1 = new Book(001,"Лирика",50, "Фет");
        Book book2 = new Book(002, "Пиковая дама", 20,"Пушкин");
        Book book3 = new Book(003, "Идиот", 30,"Достоевский");
        Book book4 = new Book(004, "Весенняя гроза", 35,"Фет");
        Smartphone smartphone1 = new Smartphone(001,"Ipnone", 100,"USA");
        Smartphone smartphone2 = new Smartphone(002,"Samsung", 150,"China");
        Smartphone smartphone3 = new Smartphone(003,"Honor", 90,"Korea");

        ProductRepository repo = new ProductRepository();
        repo.save(book1);
        repo.save(book2);
        repo.save(book3);
        repo.save(book4);
        repo.save(smartphone1);
        repo.save(smartphone2);
        repo.save(smartphone3);

        ProductManager manager = new ProductManager(repo);

        Product[] expected = {book1,book4};
        Product[] actual = manager.searchBy("Фет");

        assertArrayEquals(expected, actual);


    }

    @Test
    public void showdSmartphone () {
        Book book1 = new Book(001,"Лирика",50, "Фет");
        Book book2 = new Book(002, "Пиковая дама", 20,"Пушкин");
        Book book3 = new Book(003, "Идиот", 30,"Достоевский");
        Smartphone smartphone1 = new Smartphone(001,"Ipnone", 100,"USA");
        Smartphone smartphone2 = new Smartphone(002,"Samsung", 150,"China");
        Smartphone smartphone3 = new Smartphone(003,"Honor", 90,"Korea");

        ProductRepository repo = new ProductRepository();
        repo.save(book1);
        repo.save(book2);
        repo.save(book3);
        repo.save(smartphone1);
        repo.save(smartphone2);
        repo.save(smartphone3);

        ProductManager manager = new ProductManager(repo);

        Product[] expected = {smartphone1};
        Product[] actual = manager.searchBy("USA");

        assertArrayEquals(expected, actual);


    }

    @Test
    public void testAnotherProduct () {

        Book book1 = new Book(001,"Лирика",50, "Фет");
        Book book2 = new Book(002, "Пиковая дама", 20,"Пушкин");
        Book book3 = new Book(003, "Идиот", 30,"Достоевский");
        Book book4 = new Book(003, "Россия", 30,"Гришин");
        Product product1 = new Product(005, "Шорты", 500);
        Smartphone smartphone1 = new Smartphone(001,"Ipnone", 100,"USA");
        Smartphone smartphone2 = new Smartphone(002,"Samsung", 150,"China");
        Smartphone smartphone3 = new Smartphone(003,"Honor", 90,"Korea");
        Smartphone smartphone4 = new Smartphone(005,"Yota", 90,"Россия");

        ProductRepository repo = new ProductRepository();

        repo.save(book1);
        repo.save(book2);
        repo.save(book3);
        repo.save(smartphone1);
        repo.save(smartphone2);
        repo.save(smartphone3);
        repo.save(book4);
        repo.save(smartphone4);
        repo.save(product1);
        ProductManager manager = new ProductManager(repo);

        Product[] expected = {};
        Product[] actual = manager.searchBy("Шорты");

        assertArrayEquals(expected, actual);


    }
}