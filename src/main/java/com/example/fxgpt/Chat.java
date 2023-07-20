package com.example.fxgpt;

import javafx.scene.Group;

public class Chat
{
    private Group Root;


    public Group ToFXGroup()
    {
        return this.Root;
    }

    public Chat()
    {
        this.Root = new Group();

    }
}

