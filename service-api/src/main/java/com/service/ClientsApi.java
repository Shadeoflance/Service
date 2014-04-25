package com.service;

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
    public abstract Client get(int ID);
    public abstract Client get(String name);
    public abstract Client add(String name);
    public abstract String getAll();
    public abstract Client set(int ID, String name);
}