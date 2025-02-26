package com.example.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.adapter.ProductAdapter;
import com.example.myapplication.domain.Product;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        RecyclerView rvProducts = findViewById(R.id.rv_main);
        List<Product> products = List.of(
                new Product(1, "Product 1", "Description 1", "https://cdn.britannica.com/39/226539-050-D21D7721/Portrait-of-a-cat-with-whiskers-visible.jpg"),
                new Product(2, "Product 2", "Description 2", "image2.jpg"),
                new Product(3, "Product 3", "Description 3", "image3.jpg"),
                new Product(4, "Product 4", "Description 4", "image4.jpg"),
                new Product(5, "Product 5", "Description 5", "image5.jpg"),
                new Product(6, "Product 6", "Description 6", "image6.jpg"),
                new Product(7, "Product 7", "Description 7", "image7.jpg"),
                new Product(8, "Product 8", "Description 8", "image8.jpg"),
                new Product(9, "Product 9", "Description 9", "image9.jpg"),
                new Product(10, "Product 10", "Description 10", "image10.jpg"),
                new Product(11, "Product 11", "Description 11", "image11.jpg"),
                new Product(12, "Product 12", "Description 12", "image12.jpg"),
                new Product(13, "Product 13", "Description 13", "image13.jpg"),
                new Product(14, "Product 14", "Description 14", "image14.jpg"),
                new Product(15, "Product 15", "Description 15", "image15.jpg"),
                new Product(16, "Product 16", "Description 16", "image16.jpg"),
                new Product(17, "Product 17", "Description 17", "image17.jpg"),
                new Product(18, "Product 18", "Description 18", "image18.jpg"),
                new Product(19, "Product 19", "Description 19", "image19.jpg"),
                new Product(20, "Product 20", "Description 20", "image20.jpg")
        );
        ProductAdapter productAdapter = new ProductAdapter(products, this);

        rvProducts.setAdapter(productAdapter);
    }
}