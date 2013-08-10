package com.marcs.mtc.core.handler;

import com.marcs.mtc.core.helper.LocalizationHelper;
import com.marcs.mtc.lib.Localizations;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class LocalizationHandler {
	
	public static void loadLanguages(){
		for(String file : Localizations.localeFiles){
			LanguageRegistry.instance().loadLocalization(file, LocalizationHelper.getLocaleFromFileName(file), LocalizationHelper.isXML(file));
			System.out.println("Localization file loaded: "+ file+" "+LocalizationHelper.getLocaleFromFileName(file));
		}
	}
	
}
