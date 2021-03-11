package com.gemz.dev;

import com.gemz.dev.model.Ether;
import com.gemz.dev.model.util.EtherUtil;
import com.gemz.dev.model.util.RandomPrivateKeyGenerator;

public class App {

    public static void main(String[] args) {
        Ether ether = new EtherUtil(new RandomPrivateKeyGenerator().getRandomPrivateKey()).getEther();
        System.out.println("Private Key : " + ether.getPrivateKey());
        System.out.println("Public Key  : " + ether.getPublicKey());
        System.out.println("Address     : " + ether.getAddress());
    }

}
