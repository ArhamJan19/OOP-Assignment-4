package com.example.oopassignment4;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AdminAddTeacherController {
    @FXML
    private TextField TeacherIDTF;
    @FXML
    private TextField NameTF;
    @FXML
    private TextField DepartmentTF;
    @FXML
    private TextField CourseTF;
    @FXML
    private Button AddTeacherButton;

    final String dburl = "jdbc:mysql://localhost/Assignment4?serverTimezone=UTC";
    final String username = "Arham";
    final String password = "zargham100504";

    @FXML
    protected void AddTeacher() {
        String TeacherID = TeacherIDTF.getText();
        String Name = NameTF.getText();
        String Department = DepartmentTF.getText();
        String Course = CourseTF.getText();
        if(TeacherID.isEmpty() || Name.isEmpty() || Department.isEmpty() || Course.isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please Fill Out All Mandatory Fields");
            alert.setTitle("ERROR");
            alert.showAndWait();
            return;
        }
        try {
            Connection connection = DriverManager.getConnection(dburl, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement("Insert into Assignment4.TeacherTable (TeacherID, TeacherName, Department, Course) Values (?, ?, ?, ?)" );
            preparedStatement.setString(1, TeacherID);
            preparedStatement.setString(2, Name);
            preparedStatement.setString(3, Department);
            preparedStatement.setString(4, Course);
            int AddedRows = preparedStatement.executeUpdate();
            if(AddedRows > 0){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText("Teacher Was Successfully Added");
                alert.setTitle("Success");
                alert.showAndWait();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }





}
