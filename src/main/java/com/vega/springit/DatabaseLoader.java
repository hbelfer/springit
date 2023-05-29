/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vega.springit;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component; 
/**
 *
 * @author hbelf
 */
@Component
public class DatabaseLoader implements CommandLineRunner{
    @Override
    public void run(String ... args)throws Exception{
        System.out.println("Database Loader");
    }
}
