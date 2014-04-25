package com.service;

import com.google.inject.AbstractModule;
public class ServiceModule extends AbstractModule
{
    protected void configure()
    {
        bind(ClientsApi.class).to(ClientsImpl.class);
    }
}
