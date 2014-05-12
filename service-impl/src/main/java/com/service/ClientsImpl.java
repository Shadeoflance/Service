package com.service;

import java.util.ArrayList;
import java.util.List;

public class ClientsImpl extends ClientsApi
{
    private List<Client> Clients = new ArrayList<Client>();

    public Client set(int ID, String name)
    {
        Client t = get(ID);
        if(t != null)
            t.name = name;
        else t = add(name);
        return t;
    }

    public Client add(String name)
    {
        int id = (Clients.isEmpty()) ? 0 : Clients.get(Clients.size() - 1).ID + 1;
        Client t = new Client(name, id);
        Clients.add(t);
        return t;
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

    public Client[] getAll()
    {
        Client[] t = new Client[Clients.size()];
        Clients.toArray(t);
        return t;
    }
}