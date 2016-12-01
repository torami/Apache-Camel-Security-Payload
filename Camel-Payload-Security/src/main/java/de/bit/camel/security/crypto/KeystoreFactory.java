package de.bit.camel.security.crypto;

import java.io.InputStream;
import java.security.KeyStore;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.io.Resource;

/**
 * Creates a simple keystore:<br/>
 * @author Rami TORKHANI
 */
public class KeystoreFactory implements FactoryBean<KeyStore>, InitializingBean {
    private char[] password;
    private Resource location;
    private KeyStore keystore;

    public void setPassword(String password) {
        this.password = password.toCharArray();
    }

    public void setLocation(Resource location) {
        this.location = location;
    }

    
    public KeyStore getObject() throws Exception {
        return keystore;
    }

    
    public Class<KeyStore> getObjectType() {
        return KeyStore.class;
    }

    
    public boolean isSingleton() {
        return true;
    }
    
    
    public void afterPropertiesSet() throws Exception {
        keystore = KeyStore.getInstance("jceks");
        
        InputStream is = null;
        
        try {
            is = location.getInputStream();
            keystore.load(is, password);
        } finally {
            if (is != null) {
                is.close();
            }
        }
    }
}
