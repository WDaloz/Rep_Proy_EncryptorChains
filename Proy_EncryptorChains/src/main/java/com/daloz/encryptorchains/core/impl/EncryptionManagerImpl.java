package com.daloz.encryptorchains.core.impl;

import java.security.MessageDigest;

import org.jasypt.digest.config.DigesterConfig;
import org.jasypt.util.password.ConfigurablePasswordEncryptor;

import com.daloz.encryptorchains.config.TypeHash;
import com.daloz.encryptorchains.core.IEncryptionManager;

public class EncryptionManagerImpl implements IEncryptionManager
{
	static EncryptionManagerImpl instance;

	private EncryptionManagerImpl()
	{

	}

	public static EncryptionManagerImpl getInstance()
	{
		if (instance == null)
		{
			instance = new EncryptionManagerImpl();
		}
		return instance;
	}
	
	@Override
	public String encrypt(String string, TypeHash typeHash)
	{
		ConfigurablePasswordEncryptor configPassEncrypt = new ConfigurablePasswordEncryptor();
		configPassEncrypt.setAlgorithm(typeHash.getDescription());
		configPassEncrypt.setPlainDigest(true);
		
		return configPassEncrypt.encryptPassword(string);
	}

}
