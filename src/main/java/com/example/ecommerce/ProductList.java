package com.example.ecommerce;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

public class ProductTable {

    TableView<Product> productTable;

    public VBox createTable(){
        TableColumn id = new TableColumn("ID");
        id.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn name = new TableColumn("NAME");
        id.setCellValueFactory(new PropertyValueFactory<>("name"));

        ObservableList<Product> data = FXCollections.observableArrayList();
        data.add(new Product(2,"Iphone", 50000d));
        data.add(new Product(3, "Oneplus nord", 24000d));

        productTable = new TableView<>();
        productTable.setItems(data);
        productTable.getColumns().addAll(id, name);

        VBox vbox = new VBox();
        vbox.getChildren().addAll(productTable);
        return vbox;

    }
}
