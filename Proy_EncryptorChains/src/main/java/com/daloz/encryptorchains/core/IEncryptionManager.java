package com.daloz.encryptorchains.core;

import com.daloz.encryptorchains.config.TypeHash;

public interface IEncryptionManager
{
	String encrypt(String string, TypeHash typeHash);
}
