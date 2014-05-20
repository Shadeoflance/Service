package com.service;

import java.util.List;

public abstract class ClientsApi
{
    public class Client
    {
        protected int ID;
        protected String name;

        Client(String name, int ID)
        {
            this.name = name;
            this.ID = ID;
        }

        public String toString()
        {
            return "(" + ID + ") : " + name;
        }
    }

    /**
     * Get Client by ID
     * @param ID ID of the Client
     * @return Client with the specified ID
     */
    public abstract Client get(int ID);

    /**
     * Get Client by name
     * @param name name of the Client
     * @return Client with the specified name
     */
    public abstract Client get(String name);

    /**
     * Add new Client with specified name, ID will be set automatically
     * @param name name of the Client
     */
    public abstract void add(String name);

    /**
     * Get List of all the Clients
     * @return List of Clients
     */
    public abstract List<Client> getAll();

    /**
     * Sets name of the Client with specified ID, if there is no Client with that ID - creates a new one
     * @param ID ID of the Client
     * @param name name of the Client
     */
    public abstract void set(int ID, String name);
}