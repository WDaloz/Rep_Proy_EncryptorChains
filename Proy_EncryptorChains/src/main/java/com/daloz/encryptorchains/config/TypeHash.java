package com.daloz.encryptorchains.config;

public enum TypeHash
{
	SHA_224("SHA-224"), SHA_256("SHA-256"), SHA_384("SHA-384"), SHA_512("SHA-512"), MD2("MD2"), MD4("MD4"), MD5("MD5");

	private String description;

	private TypeHash(String description)
	{
		this.description =  description;
	}
	
	public String getDescription()
	{
		return description;
	}
}
