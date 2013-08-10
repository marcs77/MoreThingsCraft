package com.marcs.mtc.core.helper;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class LocalizationHelper {
	
	public static boolean isXML(String file){
		return file.endsWith(".xml");
	}
	
	public static String getLocaleFromFileName(String file){
		return file.substring(file.lastIndexOf('/')+1, file.lastIndexOf('.'));
	}
	
	public static String getLocalizationString(String key){
		return LanguageRegistry.instance().getStringLocalization(key);
	}
}
