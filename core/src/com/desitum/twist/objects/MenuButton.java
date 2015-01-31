package com.desitum.twist.objects;

/**
 * Created by kody on 1/30/15.
 */
public class MenuButton {

    private String command;
    private String text;

    public MenuButton(String command, String text, int locX, int locY) {
        this.command = command;
        this.text = text;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
