package com.pluralsight.northwindTradersAPI3.dao.interfaces;

import com.pluralsight.northwindTradersAPI3.models.Product;

import java.util.List;

public interface IProductDAO {

    List<Product> getAllProducts();

    Product getProductByID(int productID);
}
