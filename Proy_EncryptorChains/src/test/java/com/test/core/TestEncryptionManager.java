package com.test.core;

import org.junit.Test;

import com.daloz.encryptorchains.config.TypeHash;
import com.daloz.encryptorchains.core.IEncryptionManager;
import com.daloz.encryptorchains.factory.EncryptionManagerFactory;

public class TestEncryptionManager
{
	@Test
	public void test()
	{
		IEncryptionManager iEM = EncryptionManagerFactory.getEncryptionManager();
		
		System.out.println(iEM.encrypt("123", TypeHash.SHA_256));
	}
}
