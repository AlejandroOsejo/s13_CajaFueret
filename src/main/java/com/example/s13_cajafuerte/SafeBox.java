package com.example.s13_cajafuerte;

public class SafeBox {
    private String password;
    private String content;

    public SafeBox(String password, String content) {
        this.password = password;
        this.content = content;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

