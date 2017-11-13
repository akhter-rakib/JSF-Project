/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handler;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import model.Product;

/**
 *
 * @author Rakib
 */
@ManagedBean(name = "productMB")
@RequestScoped
public class DataTable {

    List<Product> productList = new ArrayList<>();

    public List<Product> getProductList() {
        productList.add(new Product(1, "Rakib", 2345f));
        productList.add(new Product(2, "khan", 5f));
        productList.add(new Product(3, "shaheb", 345f));
        productList.add(new Product(4, "kasem", 453f));
        return productList;
    }

}
