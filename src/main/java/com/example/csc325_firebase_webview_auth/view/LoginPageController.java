package com.example.csc325_firebase_webview_auth.view;

import javafx.fxml.FXML;

import java.io.IOException;

public class LoginPageController {

    @FXML
    protected void LoginBtn(){
        try {
            App.setRoot("useraccountinfo.fxml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @FXML

    protected void createaccountbtn(){
        try {
            App.setRoot("signuppage.fxml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    protected void onTitleClick(){
        try {
            App.setRoot("mainmenu.fxml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}


