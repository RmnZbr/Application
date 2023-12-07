package ru.firstApplication.launchApp;

import ru.firstApplication.BodyOfApp.BodyOfApp;
import ru.firstApplication.appMessages.launchMessage.Greeting;

public class Launcher {

    public Launcher() {

        Greeting greeting = new Greeting();
        greeting.displayGreeting();

        BodyOfApp bodyOfApp = new BodyOfApp();
        bodyOfApp.mainBodyOfApp();

    }
}
