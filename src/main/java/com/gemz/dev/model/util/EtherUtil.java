package com.gemz.dev.model.util;

import com.gemz.dev.model.Ether;
import org.web3j.crypto.Credentials;

public class EtherUtil {

    private Credentials credentials;
    private Ether ether;

    public EtherUtil(String privateKey) {
        ether = new Ether();
        ether.setPrivateKey(privateKey);
        credentials = Credentials.create(ether.getPrivateKey());
        ether.setPrivateKey(credentials.getEcKeyPair().getPrivateKey().toString(16));
        ether.setPublicKey(credentials.getEcKeyPair().getPublicKey().toString(16));
        ether.setAddress(credentials.getAddress());
    }

    public Ether getEther() {
        return ether;
    }
}
