package com.service;

import com.google.inject.Inject;

import java.util.List;

public class Service
{
    ClientsApi Clients;
    @Inject
    public Service(ClientsApi clients)
    {
        Clients = clients;
    }
    public ClientsApi.Client get(int ID)
    {
        return Clients.get(ID);
    }
    public ClientsApi.Client get(String name)
    {
        return Clients.get(name);
    }
    public void add(String name)
    {
        Clients.add(name);
    }
    public List<ClientsApi.Client> getAll()
    {
        return Clients.getAll();
    }
    public void set(int ID, String name)
    {
        Clients.set(ID, name);
    }
}
