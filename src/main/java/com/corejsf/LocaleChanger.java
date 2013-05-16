package com.corejsf;

import java.io.Serializable;
import java.util.Locale;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@SessionScoped
public class LocaleChanger implements Serializable {

	private static final long serialVersionUID = 1L;

	public String changeLocale(String languageLocale) {
		FacesContext context = FacesContext.getCurrentInstance();
		context.getViewRoot().setLocale(new Locale(languageLocale));
		
		return null;
	}
	
}
