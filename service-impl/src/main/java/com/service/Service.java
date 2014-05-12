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
    public ClientsApi.Client get(int ID)
    {
        return Clients.get(ID);
    }
    public ClientsApi.Client get(String name)
    {
        return Clients.get(name);
    }
    public ClientsApi.Client add(String name)
    {
        return Clients.add(name);
    }
    public ClientsApi.Client[] getAll()
    {
        return Clients.getAll();
    }
    public ClientsApi.Client set(int ID, String name)
    {
        return Clients.set(ID, name);
    }
}
