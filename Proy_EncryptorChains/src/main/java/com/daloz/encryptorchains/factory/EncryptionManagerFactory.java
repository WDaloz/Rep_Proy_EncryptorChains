package com.daloz.encryptorchains.factory;

import com.daloz.encryptorchains.core.IEncryptionManager;
import com.daloz.encryptorchains.core.impl.EncryptionManagerImpl;

public abstract class EncryptionManagerFactory
{
	public static IEncryptionManager getEncryptionManager()
	{
		return EncryptionManagerImpl.getInstance();
	}
}
