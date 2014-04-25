package com.service;

import com.google.inject.Inject;

public class Service
{
    ClientsApi Clients;
    @Inject
    public Service(ClientsApi clients)
    {
        Clients = clients;
    }
    public String get(int ID)
    {
        return Clients.get(ID).toString();
    }
    public String get(String name)
    {
        return Clients.get(name).toString();
    }
    public String add(String name)
    {
        return Clients.add(name).toString();
    }
    public String getAll()
    {
        return Clients.getAll();
    }
    public String set(int ID, String name)
    {
        return Clients.set(ID, name).toString();
    }
}
