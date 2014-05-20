package com.service;

import java.util.ArrayList;
import java.util.List;

public class ClientsImpl extends ClientsApi
{
    private List<Client> Clients = new ArrayList<Client>();

    public void set(int ID, String name)
    {
        Client t = get(ID);
        if(t != null)
            t.name = name;
        else add(name);
    }

    public void add(String name)
    {
        int id = (Clients.isEmpty()) ? 0 : Clients.get(Clients.size() - 1).ID + 1;
        Client t = new Client(name, id);
        Clients.add(t);
    }

    public Client get(int ID)
    {
        Client t = null;
        for(Client i : Clients)
            if(i.ID == ID)
            {
                t = i;
                break;
            }
        return t;
    }
    public Client get(String name)
    {
        Client t = null;
        for(Client i : Clients)
            if(i.name.equals(name))
            {
                t = i;
                break;
            }
        return t;
    }

    public List<Client> getAll()
    {
        return Clients;
    }
}