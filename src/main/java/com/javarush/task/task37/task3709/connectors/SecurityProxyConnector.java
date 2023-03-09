package com.javarush.task.task37.task3709.connectors;

import com.javarush.task.task37.task3709.security.SecurityChecker;
import com.javarush.task.task37.task3709.security.SecurityCheckerImpl;

public class SecurityProxyConnector implements Connector{
    public SimpleConnector simpleConnector;
    public SecurityChecker securityChecker = new SecurityCheckerImpl();

    public SecurityProxyConnector(String str) {
        this.simpleConnector = new SimpleConnector(str);
    }


    @Override
    public void connect() {
        if(securityChecker.performSecurityCheck())
            simpleConnector.connect();
        else
            System.out.println("FATAL ERROR");
    }
}
