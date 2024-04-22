package com.noivas_eliane.course.config;

import com.noivas_eliane.course.entities.*;
import com.noivas_eliane.course.entities.enums.OrderStatus;
import com.noivas_eliane.course.repositories.*;
import com.noivas_eliane.course.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {


    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Override
    public void run(String... args) throws Exception {

        Category cat1 = new Category(null, "Culinaria");
        Category cat2 = new Category(null, "Alimento");

        Product p1 = new Product(null, "cafeteira", "arno de capsulas", 150.5, "https://magazineluiza.com");
        Product p2 = new Product(null, "Feijão", "grão brilhante", 10.6, "https://zaeli.com");

        categoryRepository.saveAll(Arrays.asList(cat1,cat2));
        productRepository.saveAll(Arrays.asList(p1,p2));

        p1.getCategories().add(cat1);
        p2.getCategories().add(cat2);
        p2.getCategories().add(cat1);
        productRepository.saveAll(Arrays.asList(p1, p2));

        User u1 = new User(null ,"Maria", "maria@gmail.com", "99999999", "and36587cd");
        User u2 = new User(null ,"Jose", "jose@gmail.com", "66666669999", "and36587cd");
        userRepository.saveAll(Arrays.asList(u1, u2));
        Order o1 = new Order(null, Instant.parse("2024-04-17T10:39:45Z"), u2, OrderStatus.PAID);
        Order o2 = new Order(null, Instant.parse("2024-04-18T10:39:45Z"), u1, OrderStatus.CANCELED);
        orderRepository.saveAll(Arrays.asList(o1, o2));

        OrderItem oi1 = new OrderItem(o1,p1,4, p1.getPrice());
        OrderItem oi2 = new OrderItem(o1,p2,2, p2.getPrice());
        orderItemRepository.saveAll(Arrays.asList(oi1, oi2));

        Payment pay1 = new Payment(null,Instant.parse("2024-04-17T11:39:45Z"), o1);
        o1.setPayment(pay1);
        orderRepository.save(o1);
    }
}
