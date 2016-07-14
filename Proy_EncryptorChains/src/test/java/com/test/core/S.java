package com.test.core;

import java.security.MessageDigest;

public class S
{

	public static void main(String[] args)
	{
		System.out.println(sha256("123"));
	}

	public static String sha256(String base)
	{
		try
		{
//			<dependency>
//		    <groupId>sample</groupId>
//		    <artifactId>com.sample</artifactId>
//		    <version>1.0</version>
//		    <scope>system</scope>
//		    <systemPath>${project.basedir}/src/main/resources/yourJar.jar</systemPath>
//		</dependency>
			MessageDigest digest = MessageDigest.getInstance("SHA-512");
			byte[] hash = digest.digest(base.getBytes("UTF-8"));
			StringBuffer hexString = new StringBuffer();

			for (int i = 0; i < hash.length; i++)
			{
				String hex = Integer.toHexString(0xff & hash[i]);
				if (hex.length() == 1)
					hexString.append('0');
				hexString.append(hex);
			}

			return hexString.toString();
		} catch (Exception ex)
		{
			throw new RuntimeException(ex);
		}
	}

}
